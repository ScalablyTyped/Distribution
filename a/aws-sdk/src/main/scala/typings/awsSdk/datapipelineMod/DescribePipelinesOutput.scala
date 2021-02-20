package typings.awsSdk.datapipelineMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribePipelinesOutput extends StObject {
  
  /**
    * An array of descriptions for the specified pipelines.
    */
  var pipelineDescriptionList: PipelineDescriptionList = js.native
}
object DescribePipelinesOutput {
  
  @scala.inline
  def apply(pipelineDescriptionList: PipelineDescriptionList): DescribePipelinesOutput = {
    val __obj = js.Dynamic.literal(pipelineDescriptionList = pipelineDescriptionList.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribePipelinesOutput]
  }
  
  @scala.inline
  implicit class DescribePipelinesOutputMutableBuilder[Self <: DescribePipelinesOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPipelineDescriptionList(value: PipelineDescriptionList): Self = StObject.set(x, "pipelineDescriptionList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPipelineDescriptionListVarargs(value: PipelineDescription*): Self = StObject.set(x, "pipelineDescriptionList", js.Array(value :_*))
  }
}
