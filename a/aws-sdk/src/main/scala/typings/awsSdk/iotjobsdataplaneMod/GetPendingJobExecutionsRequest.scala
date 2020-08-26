package typings.awsSdk.iotjobsdataplaneMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetPendingJobExecutionsRequest extends js.Object {
  /**
    * The name of the thing that is executing the job.
    */
  var thingName: ThingName = js.native
}

object GetPendingJobExecutionsRequest {
  @scala.inline
  def apply(thingName: ThingName): GetPendingJobExecutionsRequest = {
    val __obj = js.Dynamic.literal(thingName = thingName.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetPendingJobExecutionsRequest]
  }
  @scala.inline
  implicit class GetPendingJobExecutionsRequestOps[Self <: GetPendingJobExecutionsRequest] (val x: Self) extends AnyVal {
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
    def setThingName(value: ThingName): Self = this.set("thingName", value.asInstanceOf[js.Any])
  }
  
}

