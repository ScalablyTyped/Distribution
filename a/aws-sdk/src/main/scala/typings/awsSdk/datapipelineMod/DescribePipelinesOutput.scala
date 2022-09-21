package typings.awsSdk.datapipelineMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribePipelinesOutput extends StObject {
  
  /**
    * An array of descriptions for the specified pipelines.
    */
  var pipelineDescriptionList: PipelineDescriptionList
}
object DescribePipelinesOutput {
  
  inline def apply(pipelineDescriptionList: PipelineDescriptionList): DescribePipelinesOutput = {
    val __obj = js.Dynamic.literal(pipelineDescriptionList = pipelineDescriptionList.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribePipelinesOutput]
  }
  
  extension [Self <: DescribePipelinesOutput](x: Self) {
    
    inline def setPipelineDescriptionList(value: PipelineDescriptionList): Self = StObject.set(x, "pipelineDescriptionList", value.asInstanceOf[js.Any])
    
    inline def setPipelineDescriptionListVarargs(value: PipelineDescription*): Self = StObject.set(x, "pipelineDescriptionList", js.Array(value*))
  }
}
