package typings.awsSdk.cloudfrontMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetFieldLevelEncryptionProfileConfigResult extends StObject {
  
  /**
    * The current version of the field-level encryption profile configuration result. For example: E2QWRUHAPOMQZL.
    */
  var ETag: js.UndefOr[String] = js.undefined
  
  /**
    * Return the field-level encryption profile configuration information.
    */
  var FieldLevelEncryptionProfileConfig: js.UndefOr[typings.awsSdk.cloudfrontMod.FieldLevelEncryptionProfileConfig] = js.undefined
}
object GetFieldLevelEncryptionProfileConfigResult {
  
  inline def apply(): GetFieldLevelEncryptionProfileConfigResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetFieldLevelEncryptionProfileConfigResult]
  }
  
  extension [Self <: GetFieldLevelEncryptionProfileConfigResult](x: Self) {
    
    inline def setETag(value: String): Self = StObject.set(x, "ETag", value.asInstanceOf[js.Any])
    
    inline def setETagUndefined: Self = StObject.set(x, "ETag", js.undefined)
    
    inline def setFieldLevelEncryptionProfileConfig(value: FieldLevelEncryptionProfileConfig): Self = StObject.set(x, "FieldLevelEncryptionProfileConfig", value.asInstanceOf[js.Any])
    
    inline def setFieldLevelEncryptionProfileConfigUndefined: Self = StObject.set(x, "FieldLevelEncryptionProfileConfig", js.undefined)
  }
}
