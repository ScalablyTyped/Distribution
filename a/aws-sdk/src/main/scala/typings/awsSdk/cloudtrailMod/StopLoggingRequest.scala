package typings.awsSdk.cloudtrailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StopLoggingRequest extends js.Object {
  /**
    * Specifies the name or the CloudTrail ARN of the trail for which CloudTrail will stop logging AWS API calls. The format of a trail ARN is:  arn:aws:cloudtrail:us-east-2:123456789012:trail/MyTrail 
    */
  var Name: String = js.native
}

object StopLoggingRequest {
  @scala.inline
  def apply(Name: String): StopLoggingRequest = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[StopLoggingRequest]
  }
  @scala.inline
  implicit class StopLoggingRequestOps[Self <: StopLoggingRequest] (val x: Self) extends AnyVal {
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
    def setName(value: String): Self = this.set("Name", value.asInstanceOf[js.Any])
  }
  
}

