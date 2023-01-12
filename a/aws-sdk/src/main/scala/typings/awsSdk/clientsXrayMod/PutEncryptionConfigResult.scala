package typings.awsSdk.clientsXrayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PutEncryptionConfigResult extends StObject {
  
  /**
    * The new encryption configuration.
    */
  var EncryptionConfig: js.UndefOr[typings.awsSdk.clientsXrayMod.EncryptionConfig] = js.undefined
}
object PutEncryptionConfigResult {
  
  inline def apply(): PutEncryptionConfigResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PutEncryptionConfigResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PutEncryptionConfigResult] (val x: Self) extends AnyVal {
    
    inline def setEncryptionConfig(value: EncryptionConfig): Self = StObject.set(x, "EncryptionConfig", value.asInstanceOf[js.Any])
    
    inline def setEncryptionConfigUndefined: Self = StObject.set(x, "EncryptionConfig", js.undefined)
  }
}
