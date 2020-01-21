package typings.awsSdk.rekognitionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StartFaceSearchResponse extends js.Object {
  /**
    * The identifier for the search job. Use JobId to identify the job in a subsequent call to GetFaceSearch. 
    */
  var JobId: js.UndefOr[typings.awsSdk.rekognitionMod.JobId] = js.native
}

object StartFaceSearchResponse {
  @scala.inline
  def apply(JobId: JobId = null): StartFaceSearchResponse = {
    val __obj = js.Dynamic.literal()
    if (JobId != null) __obj.updateDynamic("JobId")(JobId.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartFaceSearchResponse]
  }
}

