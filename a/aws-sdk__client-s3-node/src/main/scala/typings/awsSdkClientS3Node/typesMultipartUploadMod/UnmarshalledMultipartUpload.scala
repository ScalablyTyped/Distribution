package typings.awsSdkClientS3Node.typesMultipartUploadMod

import typings.awsSdkClientS3Node.typesInitiatorMod.UnmarshalledInitiator
import typings.awsSdkClientS3Node.typesOwnerMod.UnmarshalledOwner
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UnmarshalledMultipartUpload extends MultipartUpload {
  /**
    * <p>Date and time at which the multipart upload was initiated.</p>
    */
  @JSName("Initiated")
  var Initiated_UnmarshalledMultipartUpload: js.UndefOr[Date] = js.native
  /**
    * <p>Identifies who initiated the multipart upload.</p>
    */
  @JSName("Initiator")
  var Initiator_UnmarshalledMultipartUpload: js.UndefOr[UnmarshalledInitiator] = js.native
  /**
    * _Owner shape
    */
  @JSName("Owner")
  var Owner_UnmarshalledMultipartUpload: js.UndefOr[UnmarshalledOwner] = js.native
}

object UnmarshalledMultipartUpload {
  @scala.inline
  def apply(): UnmarshalledMultipartUpload = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UnmarshalledMultipartUpload]
  }
  @scala.inline
  implicit class UnmarshalledMultipartUploadOps[Self <: UnmarshalledMultipartUpload] (val x: Self) extends AnyVal {
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
    def setInitiated(value: Date): Self = this.set("Initiated", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInitiated: Self = this.set("Initiated", js.undefined)
    @scala.inline
    def setInitiator(value: UnmarshalledInitiator): Self = this.set("Initiator", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInitiator: Self = this.set("Initiator", js.undefined)
    @scala.inline
    def setOwner(value: UnmarshalledOwner): Self = this.set("Owner", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOwner: Self = this.set("Owner", js.undefined)
  }
  
}

