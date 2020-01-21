package typings.awsSdk.smsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GenerateChangeSetResponse extends js.Object {
  /**
    * Location of the Amazon S3 object.
    */
  var s3Location: js.UndefOr[S3Location] = js.native
}

object GenerateChangeSetResponse {
  @scala.inline
  def apply(s3Location: S3Location = null): GenerateChangeSetResponse = {
    val __obj = js.Dynamic.literal()
    if (s3Location != null) __obj.updateDynamic("s3Location")(s3Location.asInstanceOf[js.Any])
    __obj.asInstanceOf[GenerateChangeSetResponse]
  }
}

