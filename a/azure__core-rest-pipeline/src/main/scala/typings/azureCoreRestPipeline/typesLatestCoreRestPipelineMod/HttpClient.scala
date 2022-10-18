package typings.azureCoreRestPipeline.typesLatestCoreRestPipelineMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HttpClient extends StObject {
  
  /**
    * The method that makes the request and returns a response.
    */
  def sendRequest(request: PipelineRequest): js.Promise[PipelineResponse]
  /**
    * The method that makes the request and returns a response.
    */
  @JSName("sendRequest")
  var sendRequest_Original: SendRequest
}
object HttpClient {
  
  inline def apply(sendRequest: /* request */ PipelineRequest => js.Promise[PipelineResponse]): HttpClient = {
    val __obj = js.Dynamic.literal(sendRequest = js.Any.fromFunction1(sendRequest))
    __obj.asInstanceOf[HttpClient]
  }
  
  extension [Self <: HttpClient](x: Self) {
    
    inline def setSendRequest(value: /* request */ PipelineRequest => js.Promise[PipelineResponse]): Self = StObject.set(x, "sendRequest", js.Any.fromFunction1(value))
  }
}
