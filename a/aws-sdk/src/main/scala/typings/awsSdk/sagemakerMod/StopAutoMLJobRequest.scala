package typings.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StopAutoMLJobRequest extends js.Object {
  /**
    * The name of the object you are requesting.
    */
  var AutoMLJobName: typings.awsSdk.sagemakerMod.AutoMLJobName = js.native
}

object StopAutoMLJobRequest {
  @scala.inline
  def apply(AutoMLJobName: AutoMLJobName): StopAutoMLJobRequest = {
    val __obj = js.Dynamic.literal(AutoMLJobName = AutoMLJobName.asInstanceOf[js.Any])
    __obj.asInstanceOf[StopAutoMLJobRequest]
  }
  @scala.inline
  implicit class StopAutoMLJobRequestOps[Self <: StopAutoMLJobRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAutoMLJobName(value: AutoMLJobName): Self = this.set("AutoMLJobName", value.asInstanceOf[js.Any])
  }
  
}

