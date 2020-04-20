package typings.awsSdk.cloudfrontMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetFieldLevelEncryptionRequest extends js.Object {
  /**
    * Request the ID for the field-level encryption configuration information.
    */
  var Id: String = js.native
}

object GetFieldLevelEncryptionRequest {
  @scala.inline
  def apply(Id: String): GetFieldLevelEncryptionRequest = {
    val __obj = js.Dynamic.literal(Id = Id.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetFieldLevelEncryptionRequest]
  }
}

