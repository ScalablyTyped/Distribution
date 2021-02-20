package typings.awsSdk.codepipelineMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetPipelineStateInput extends StObject {
  
  /**
    * The name of the pipeline about which you want to get information.
    */
  var name: PipelineName = js.native
}
object GetPipelineStateInput {
  
  @scala.inline
  def apply(name: PipelineName): GetPipelineStateInput = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetPipelineStateInput]
  }
  
  @scala.inline
  implicit class GetPipelineStateInputMutableBuilder[Self <: GetPipelineStateInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: PipelineName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
