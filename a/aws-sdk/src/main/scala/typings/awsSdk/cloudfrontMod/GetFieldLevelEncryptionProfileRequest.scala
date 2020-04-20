package typings.awsSdk.cloudfrontMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetFieldLevelEncryptionProfileRequest extends js.Object {
  /**
    * Get the ID for the field-level encryption profile information.
    */
  var Id: String = js.native
}

object GetFieldLevelEncryptionProfileRequest {
  @scala.inline
  def apply(Id: String): GetFieldLevelEncryptionProfileRequest = {
    val __obj = js.Dynamic.literal(Id = Id.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetFieldLevelEncryptionProfileRequest]
  }
}

