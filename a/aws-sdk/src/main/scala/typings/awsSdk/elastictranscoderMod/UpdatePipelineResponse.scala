package typings.awsSdk.elastictranscoderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdatePipelineResponse extends StObject {
  
  /**
    * The pipeline updated by this UpdatePipelineResponse call.
    */
  var Pipeline: js.UndefOr[typings.awsSdk.elastictranscoderMod.Pipeline] = js.undefined
  
  /**
    * Elastic Transcoder returns a warning if the resources used by your pipeline are not in the same region as the pipeline. Using resources in the same region, such as your Amazon S3 buckets, Amazon SNS notification topics, and AWS KMS key, reduces processing time and prevents cross-regional charges.
    */
  var Warnings: js.UndefOr[typings.awsSdk.elastictranscoderMod.Warnings] = js.undefined
}
object UpdatePipelineResponse {
  
  @scala.inline
  def apply(): UpdatePipelineResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdatePipelineResponse]
  }
  
  @scala.inline
  implicit class UpdatePipelineResponseMutableBuilder[Self <: UpdatePipelineResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPipeline(value: Pipeline): Self = StObject.set(x, "Pipeline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPipelineUndefined: Self = StObject.set(x, "Pipeline", js.undefined)
    
    @scala.inline
    def setWarnings(value: Warnings): Self = StObject.set(x, "Warnings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWarningsUndefined: Self = StObject.set(x, "Warnings", js.undefined)
    
    @scala.inline
    def setWarningsVarargs(value: Warning*): Self = StObject.set(x, "Warnings", js.Array(value :_*))
  }
}
