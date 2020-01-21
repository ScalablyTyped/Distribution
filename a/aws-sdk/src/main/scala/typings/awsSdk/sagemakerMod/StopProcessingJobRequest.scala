package typings.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StopProcessingJobRequest extends js.Object {
  /**
    * The name of the processing job to stop.
    */
  var ProcessingJobName: typings.awsSdk.sagemakerMod.ProcessingJobName = js.native
}

object StopProcessingJobRequest {
  @scala.inline
  def apply(ProcessingJobName: ProcessingJobName): StopProcessingJobRequest = {
    val __obj = js.Dynamic.literal(ProcessingJobName = ProcessingJobName.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[StopProcessingJobRequest]
  }
}

