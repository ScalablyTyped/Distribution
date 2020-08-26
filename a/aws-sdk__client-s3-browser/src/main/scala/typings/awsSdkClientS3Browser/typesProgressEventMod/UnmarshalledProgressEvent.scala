package typings.awsSdkClientS3Browser.typesProgressEventMod

import typings.awsSdkClientS3Browser.typesProgressMod.UnmarshalledProgress
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UnmarshalledProgressEvent extends ProgressEvent {
  /**
    * <p>The Progress event details.</p>
    */
  @JSName("Details")
  var Details_UnmarshalledProgressEvent: js.UndefOr[UnmarshalledProgress] = js.native
}

object UnmarshalledProgressEvent {
  @scala.inline
  def apply(): UnmarshalledProgressEvent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UnmarshalledProgressEvent]
  }
  @scala.inline
  implicit class UnmarshalledProgressEventOps[Self <: UnmarshalledProgressEvent] (val x: Self) extends AnyVal {
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
    def setDetails(value: UnmarshalledProgress): Self = this.set("Details", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDetails: Self = this.set("Details", js.undefined)
  }
  
}

