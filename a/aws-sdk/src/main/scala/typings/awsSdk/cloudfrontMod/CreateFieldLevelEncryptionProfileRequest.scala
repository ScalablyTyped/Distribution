package typings.awsSdk.cloudfrontMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateFieldLevelEncryptionProfileRequest extends js.Object {
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
}

