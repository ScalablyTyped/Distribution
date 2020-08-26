package typings.awsSdk.sesv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PutAccountSuppressionAttributesRequest extends js.Object {
  /**
    * A list that contains the reasons that email addresses will be automatically added to the suppression list for your account. This list can contain any or all of the following:    COMPLAINT – Amazon SES adds an email address to the suppression list for your account when a message sent to that address results in a complaint.    BOUNCE – Amazon SES adds an email address to the suppression list for your account when a message sent to that address results in a hard bounce.  
    */
  var SuppressedReasons: js.UndefOr[SuppressionListReasons] = js.native
}

object PutAccountSuppressionAttributesRequest {
  @scala.inline
  def apply(): PutAccountSuppressionAttributesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PutAccountSuppressionAttributesRequest]
  }
  @scala.inline
  implicit class PutAccountSuppressionAttributesRequestOps[Self <: PutAccountSuppressionAttributesRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setSuppressedReasonsVarargs(value: SuppressionListReason*): Self = this.set("SuppressedReasons", js.Array(value :_*))
    @scala.inline
    def setSuppressedReasons(value: SuppressionListReasons): Self = this.set("SuppressedReasons", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSuppressedReasons: Self = this.set("SuppressedReasons", js.undefined)
  }
  
}

