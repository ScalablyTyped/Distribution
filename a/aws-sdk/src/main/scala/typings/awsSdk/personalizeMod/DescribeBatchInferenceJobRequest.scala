package typings.awsSdk.personalizeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  
  @scala.inline
  implicit class DescribeBatchInferenceJobRequestOps[Self <: DescribeBatchInferenceJobRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setBatchInferenceJobArn(value: Arn): Self = this.set("batchInferenceJobArn", value.asInstanceOf[js.Any])
  }
}
