package typings.awsSdk.glueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StartMLLabelingSetGenerationTaskRunRequest extends js.Object {
  /**
    * The Amazon Simple Storage Service (Amazon S3) path where you generate the labeling set.
    */
  var OutputS3Path: UriString = js.native
  /**
    * The unique identifier of the machine learning transform.
    */
  var TransformId: HashString = js.native
}

object StartMLLabelingSetGenerationTaskRunRequest {
  @scala.inline
  def apply(OutputS3Path: UriString, TransformId: HashString): StartMLLabelingSetGenerationTaskRunRequest = {
    val __obj = js.Dynamic.literal(OutputS3Path = OutputS3Path.asInstanceOf[js.Any], TransformId = TransformId.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartMLLabelingSetGenerationTaskRunRequest]
  }
}

