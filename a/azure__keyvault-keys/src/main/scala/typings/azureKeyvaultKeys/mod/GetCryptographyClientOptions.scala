package typings.azureKeyvaultKeys.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetCryptographyClientOptions extends StObject {
  
  /**
    * The version of the key to use for cryptographic operations.
    *
    * When undefined, the latest version of the key will be used.
    */
  var keyVersion: js.UndefOr[String] = js.undefined
}
object GetCryptographyClientOptions {
  
  inline def apply(): GetCryptographyClientOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetCryptographyClientOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetCryptographyClientOptions] (val x: Self) extends AnyVal {
    
    inline def setKeyVersion(value: String): Self = StObject.set(x, "keyVersion", value.asInstanceOf[js.Any])
    
    inline def setKeyVersionUndefined: Self = StObject.set(x, "keyVersion", js.undefined)
  }
}
