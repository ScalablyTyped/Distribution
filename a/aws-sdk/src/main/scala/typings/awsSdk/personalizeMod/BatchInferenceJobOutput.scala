package typings.awsSdk.personalizeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BatchInferenceJobOutput extends js.Object {
  /**
    * Information on the Amazon S3 bucket in which the batch inference job's output is stored.
    */
  var s3DataDestination: S3DataConfig = js.native
}

object BatchInferenceJobOutput {
  @scala.inline
  def apply(s3DataDestination: S3DataConfig): BatchInferenceJobOutput = {
    val __obj = js.Dynamic.literal(s3DataDestination = s3DataDestination.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchInferenceJobOutput]
  }
}

