package typings.awsSdk.cloudfrontMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetFieldLevelEncryptionProfileConfigRequest extends js.Object {
  /**
    * Get the ID for the field-level encryption profile configuration information.
    */
  var Id: String = js.native
}

object GetFieldLevelEncryptionProfileConfigRequest {
  @scala.inline
  def apply(Id: String): GetFieldLevelEncryptionProfileConfigRequest = {
    val __obj = js.Dynamic.literal(Id = Id.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetFieldLevelEncryptionProfileConfigRequest]
  }
}

