package typings.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateProcessingJobResponse extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the processing job.
    */
  var ProcessingJobArn: typings.awsSdk.sagemakerMod.ProcessingJobArn = js.native
}

object CreateProcessingJobResponse {
  @scala.inline
  def apply(ProcessingJobArn: ProcessingJobArn): CreateProcessingJobResponse = {
    val __obj = js.Dynamic.literal(ProcessingJobArn = ProcessingJobArn.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[CreateProcessingJobResponse]
  }
}

