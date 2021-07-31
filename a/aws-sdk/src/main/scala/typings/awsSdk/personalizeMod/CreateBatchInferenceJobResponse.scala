package typings.awsSdk.personalizeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateBatchInferenceJobResponse extends StObject {
  
  /**
    * The ARN of the batch inference job.
    */
  var batchInferenceJobArn: js.UndefOr[Arn] = js.undefined
}
object CreateBatchInferenceJobResponse {
  
  @scala.inline
  def apply(): CreateBatchInferenceJobResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateBatchInferenceJobResponse]
  }
  
  @scala.inline
  implicit class CreateBatchInferenceJobResponseMutableBuilder[Self <: CreateBatchInferenceJobResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBatchInferenceJobArn(value: Arn): Self = StObject.set(x, "batchInferenceJobArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBatchInferenceJobArnUndefined: Self = StObject.set(x, "batchInferenceJobArn", js.undefined)
  }
}
