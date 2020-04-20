package typings.awsSdk.personalizeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeBatchInferenceJobRequest extends js.Object {
  /**
    * The ARN of the batch inference job to describe.
    */
  var batchInferenceJobArn: Arn = js.native
}

object DescribeBatchInferenceJobRequest {
  @scala.inline
  def apply(batchInferenceJobArn: Arn): DescribeBatchInferenceJobRequest = {
    val __obj = js.Dynamic.literal(batchInferenceJobArn = batchInferenceJobArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeBatchInferenceJobRequest]
  }
}

