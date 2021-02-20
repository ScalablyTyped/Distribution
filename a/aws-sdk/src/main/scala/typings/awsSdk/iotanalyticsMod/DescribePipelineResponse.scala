package typings.awsSdk.iotanalyticsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribePipelineResponse extends StObject {
  
  /**
    * A Pipeline object that contains information about the pipeline.
    */
  var pipeline: js.UndefOr[Pipeline] = js.native
}
object DescribePipelineResponse {
  
  @scala.inline
  def apply(): DescribePipelineResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribePipelineResponse]
  }
  
  @scala.inline
  implicit class DescribePipelineResponseMutableBuilder[Self <: DescribePipelineResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPipeline(value: Pipeline): Self = StObject.set(x, "pipeline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPipelineUndefined: Self = StObject.set(x, "pipeline", js.undefined)
  }
}
