package typings.awsSdk.cloudfrontMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateFieldLevelEncryptionProfileRequest extends StObject {
  
  /**
    * The request to create a field-level encryption profile.
    */
  var FieldLevelEncryptionProfileConfig: typings.awsSdk.cloudfrontMod.FieldLevelEncryptionProfileConfig
}
object CreateFieldLevelEncryptionProfileRequest {
  
  inline def apply(FieldLevelEncryptionProfileConfig: FieldLevelEncryptionProfileConfig): CreateFieldLevelEncryptionProfileRequest = {
    val __obj = js.Dynamic.literal(FieldLevelEncryptionProfileConfig = FieldLevelEncryptionProfileConfig.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateFieldLevelEncryptionProfileRequest]
  }
  
  extension [Self <: CreateFieldLevelEncryptionProfileRequest](x: Self) {
    
    inline def setFieldLevelEncryptionProfileConfig(value: FieldLevelEncryptionProfileConfig): Self = StObject.set(x, "FieldLevelEncryptionProfileConfig", value.asInstanceOf[js.Any])
  }
}
