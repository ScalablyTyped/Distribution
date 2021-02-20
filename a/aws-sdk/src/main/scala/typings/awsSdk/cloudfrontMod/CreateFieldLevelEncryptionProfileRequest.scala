package typings.awsSdk.cloudfrontMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateFieldLevelEncryptionProfileRequest extends StObject {
  
  /**
    * The request to create a field-level encryption profile.
    */
  var FieldLevelEncryptionProfileConfig: typings.awsSdk.cloudfrontMod.FieldLevelEncryptionProfileConfig = js.native
}
object CreateFieldLevelEncryptionProfileRequest {
  
  @scala.inline
  def apply(FieldLevelEncryptionProfileConfig: FieldLevelEncryptionProfileConfig): CreateFieldLevelEncryptionProfileRequest = {
    val __obj = js.Dynamic.literal(FieldLevelEncryptionProfileConfig = FieldLevelEncryptionProfileConfig.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateFieldLevelEncryptionProfileRequest]
  }
  
  @scala.inline
  implicit class CreateFieldLevelEncryptionProfileRequestMutableBuilder[Self <: CreateFieldLevelEncryptionProfileRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFieldLevelEncryptionProfileConfig(value: FieldLevelEncryptionProfileConfig): Self = StObject.set(x, "FieldLevelEncryptionProfileConfig", value.asInstanceOf[js.Any])
  }
}
