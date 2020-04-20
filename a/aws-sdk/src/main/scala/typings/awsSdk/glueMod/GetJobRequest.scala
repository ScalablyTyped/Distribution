package typings.awsSdk.glueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetJobRequest extends js.Object {
  /**
    * The name of the job definition to retrieve.
    */
  var JobName: NameString = js.native
}

object GetJobRequest {
  @scala.inline
  def apply(JobName: NameString): GetJobRequest = {
    val __obj = js.Dynamic.literal(JobName = JobName.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetJobRequest]
  }
}

