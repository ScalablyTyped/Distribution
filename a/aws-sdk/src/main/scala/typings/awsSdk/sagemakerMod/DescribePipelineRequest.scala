package typings.awsSdk.sagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribePipelineRequest extends StObject {
  
  /**
    * The name of the pipeline to describe.
    */
  var PipelineName: typings.awsSdk.sagemakerMod.PipelineName
}
object DescribePipelineRequest {
  
  inline def apply(PipelineName: PipelineName): DescribePipelineRequest = {
    val __obj = js.Dynamic.literal(PipelineName = PipelineName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribePipelineRequest]
  }
  
  extension [Self <: DescribePipelineRequest](x: Self) {
    
    inline def setPipelineName(value: PipelineName): Self = StObject.set(x, "PipelineName", value.asInstanceOf[js.Any])
  }
}
