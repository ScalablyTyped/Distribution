package typings.awsSdk.xrayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetEncryptionConfigResult extends StObject {
  
  /**
    * The encryption configuration document.
    */
  var EncryptionConfig: js.UndefOr[typings.awsSdk.xrayMod.EncryptionConfig] = js.undefined
}
object GetEncryptionConfigResult {
  
  inline def apply(): GetEncryptionConfigResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetEncryptionConfigResult]
  }
  
  extension [Self <: GetEncryptionConfigResult](x: Self) {
    
    inline def setEncryptionConfig(value: EncryptionConfig): Self = StObject.set(x, "EncryptionConfig", value.asInstanceOf[js.Any])
    
    inline def setEncryptionConfigUndefined: Self = StObject.set(x, "EncryptionConfig", js.undefined)
  }
}
