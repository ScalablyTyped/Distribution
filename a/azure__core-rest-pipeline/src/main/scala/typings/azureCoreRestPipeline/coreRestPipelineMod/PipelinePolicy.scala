package typings.azureCoreRestPipeline.coreRestPipelineMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PipelinePolicy extends StObject {
  
  /**
    * The policy name. Must be a unique string in the pipeline.
    */
  var name: String
  
  /**
    * The main method to implement that manipulates a request/response.
    * @param request - The request being performed.
    * @param next - The next policy in the pipeline. Must be called to continue the pipeline.
    */
  def sendRequest(request: PipelineRequest, next: SendRequest): js.Promise[PipelineResponse]
}
object PipelinePolicy {
  
  inline def apply(name: String, sendRequest: (PipelineRequest, SendRequest) => js.Promise[PipelineResponse]): PipelinePolicy = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], sendRequest = js.Any.fromFunction2(sendRequest))
    __obj.asInstanceOf[PipelinePolicy]
  }
  
  extension [Self <: PipelinePolicy](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setSendRequest(value: (PipelineRequest, SendRequest) => js.Promise[PipelineResponse]): Self = StObject.set(x, "sendRequest", js.Any.fromFunction2(value))
  }
}
