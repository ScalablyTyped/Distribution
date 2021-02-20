package typings.awsSdk.iotanalyticsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribePipelineRequest extends StObject {
  
  /**
    * The name of the pipeline whose information is retrieved.
    */
  var pipelineName: PipelineName = js.native
}
object DescribePipelineRequest {
  
  @scala.inline
  def apply(pipelineName: PipelineName): DescribePipelineRequest = {
    val __obj = js.Dynamic.literal(pipelineName = pipelineName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribePipelineRequest]
  }
  
  @scala.inline
  implicit class DescribePipelineRequestMutableBuilder[Self <: DescribePipelineRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPipelineName(value: PipelineName): Self = StObject.set(x, "pipelineName", value.asInstanceOf[js.Any])
  }
}
