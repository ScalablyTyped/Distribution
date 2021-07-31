package typings.awsSdk.codepipelineMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StartPipelineExecutionInput extends StObject {
  
  /**
    * The system-generated unique ID used to identify a unique execution request.
    */
  var clientRequestToken: js.UndefOr[ClientRequestToken] = js.undefined
  
  /**
    * The name of the pipeline to start.
    */
  var name: PipelineName
}
object StartPipelineExecutionInput {
  
  @scala.inline
  def apply(name: PipelineName): StartPipelineExecutionInput = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartPipelineExecutionInput]
  }
  
  @scala.inline
  implicit class StartPipelineExecutionInputMutableBuilder[Self <: StartPipelineExecutionInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClientRequestToken(value: ClientRequestToken): Self = StObject.set(x, "clientRequestToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientRequestTokenUndefined: Self = StObject.set(x, "clientRequestToken", js.undefined)
    
    @scala.inline
    def setName(value: PipelineName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
