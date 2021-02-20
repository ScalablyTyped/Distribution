package typings.awsSdk.personalizeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeBatchInferenceJobRequest extends StObject {
  
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
  implicit class DescribeBatchInferenceJobRequestMutableBuilder[Self <: DescribeBatchInferenceJobRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBatchInferenceJobArn(value: Arn): Self = StObject.set(x, "batchInferenceJobArn", value.asInstanceOf[js.Any])
  }
}
