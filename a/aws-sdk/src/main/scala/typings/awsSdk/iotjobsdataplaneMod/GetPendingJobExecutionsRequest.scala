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
}

