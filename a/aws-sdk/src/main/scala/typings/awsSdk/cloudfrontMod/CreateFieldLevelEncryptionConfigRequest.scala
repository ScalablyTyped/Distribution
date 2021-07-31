package typings.awsSdk.cloudfrontMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateFieldLevelEncryptionConfigRequest extends StObject {
  
  /**
    * The request to create a new field-level encryption configuration.
    */
  var FieldLevelEncryptionConfig: typings.awsSdk.cloudfrontMod.FieldLevelEncryptionConfig
}
object CreateFieldLevelEncryptionConfigRequest {
  
  @scala.inline
  def apply(FieldLevelEncryptionConfig: FieldLevelEncryptionConfig): CreateFieldLevelEncryptionConfigRequest = {
    val __obj = js.Dynamic.literal(FieldLevelEncryptionConfig = FieldLevelEncryptionConfig.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateFieldLevelEncryptionConfigRequest]
  }
  
  @scala.inline
  implicit class CreateFieldLevelEncryptionConfigRequestMutableBuilder[Self <: CreateFieldLevelEncryptionConfigRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFieldLevelEncryptionConfig(value: FieldLevelEncryptionConfig): Self = StObject.set(x, "FieldLevelEncryptionConfig", value.asInstanceOf[js.Any])
  }
}
