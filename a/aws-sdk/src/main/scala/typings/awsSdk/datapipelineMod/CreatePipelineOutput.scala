package typings.awsSdk.datapipelineMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreatePipelineOutput extends StObject {
  
  /**
    * The ID that AWS Data Pipeline assigns the newly created pipeline. For example, df-06372391ZG65EXAMPLE.
    */
  var pipelineId: id = js.native
}
object CreatePipelineOutput {
  
  @scala.inline
  def apply(pipelineId: id): CreatePipelineOutput = {
    val __obj = js.Dynamic.literal(pipelineId = pipelineId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreatePipelineOutput]
  }
  
  @scala.inline
  implicit class CreatePipelineOutputMutableBuilder[Self <: CreatePipelineOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPipelineId(value: id): Self = StObject.set(x, "pipelineId", value.asInstanceOf[js.Any])
  }
}
