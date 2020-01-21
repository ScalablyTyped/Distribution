package typings.awsSdk.translateMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StopTextTranslationJobRequest extends js.Object {
  /**
    * The job ID of the job to be stopped.
    */
  var JobId: typings.awsSdk.translateMod.JobId = js.native
}

object StopTextTranslationJobRequest {
  @scala.inline
  def apply(JobId: JobId): StopTextTranslationJobRequest = {
    val __obj = js.Dynamic.literal(JobId = JobId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[StopTextTranslationJobRequest]
  }
}

