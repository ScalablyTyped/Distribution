package typings.awsSdk.mediaconvertMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetJobRequest extends js.Object {
  /**
    * the job ID of the job.
    */
  var Id: string = js.native
}

object GetJobRequest {
  @scala.inline
  def apply(Id: string): GetJobRequest = {
    val __obj = js.Dynamic.literal(Id = Id.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetJobRequest]
  }
}

