package typings.awsSdk.s3controlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetJobTaggingResult extends js.Object {
  /**
    * The set of tags associated with the Amazon S3 Batch Operations job.
    */
  var Tags: js.UndefOr[S3TagSet] = js.native
}

object GetJobTaggingResult {
  @scala.inline
  def apply(Tags: S3TagSet = null): GetJobTaggingResult = {
    val __obj = js.Dynamic.literal()
    if (Tags != null) __obj.updateDynamic("Tags")(Tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetJobTaggingResult]
  }
}

