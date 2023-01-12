package typings.azureKeyvaultKeys.mod

import typings.azureCoreClient.mod.OperationOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReleaseKeyOptions
  extends StObject
     with OperationOptions {
  
  /** The {@link KeyExportEncryptionAlgorithm} to for protecting the exported key material. */
  var algorithm: js.UndefOr[KeyExportEncryptionAlgorithm] = js.undefined
  
  /** A client provided nonce for freshness. */
  var nonce: js.UndefOr[String] = js.undefined
  
  /**
    * The version of the key to release. Defaults to the latest version of the key if omitted.
    */
  var version: js.UndefOr[String] = js.undefined
}
object ReleaseKeyOptions {
  
  inline def apply(): ReleaseKeyOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReleaseKeyOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ReleaseKeyOptions] (val x: Self) extends AnyVal {
    
    inline def setAlgorithm(value: KeyExportEncryptionAlgorithm): Self = StObject.set(x, "algorithm", value.asInstanceOf[js.Any])
    
    inline def setAlgorithmUndefined: Self = StObject.set(x, "algorithm", js.undefined)
    
    inline def setNonce(value: String): Self = StObject.set(x, "nonce", value.asInstanceOf[js.Any])
    
    inline def setNonceUndefined: Self = StObject.set(x, "nonce", js.undefined)
    
    inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
  }
}
