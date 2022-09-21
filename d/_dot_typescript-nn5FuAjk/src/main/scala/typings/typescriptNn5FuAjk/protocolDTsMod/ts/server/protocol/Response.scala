package typings.typescriptNn5FuAjk.protocolDTsMod.ts.server.protocol

import typings.typescriptNn5FuAjk.typescriptNn5FuAjkStrings.response
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Response by server to client request message.
  */
trait Response
  extends StObject
     with Message {
  
  /**
    * Contains message body if success === true.
    */
  var body: js.UndefOr[Any] = js.undefined
  
  /**
    * The command requested.
    */
  var command: String
  
  /**
    * If success === false, this should always be provided.
    * Otherwise, may (or may not) contain a success message.
    */
  var message: js.UndefOr[String] = js.undefined
  
  /**
    * Contains extra information that plugin can include to be passed on
    */
  var metadata: js.UndefOr[Any] = js.undefined
  
  /**
    * Exposes information about the performance of this request-response pair.
    */
  var performanceData: js.UndefOr[PerformanceData] = js.undefined
  
  /**
    * Sequence number of the request message.
    */
  var request_seq: Double
  
  /**
    * Outcome of the request.
    */
  var success: Boolean
  
  @JSName("type")
  var type_Response: response
}
object Response {
  
  inline def apply(command: String, request_seq: Double, seq: Double, success: Boolean): Response = {
    val __obj = js.Dynamic.literal(command = command.asInstanceOf[js.Any], request_seq = request_seq.asInstanceOf[js.Any], seq = seq.asInstanceOf[js.Any], success = success.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("response")
    __obj.asInstanceOf[Response]
  }
  
  extension [Self <: Response](x: Self) {
    
    inline def setBody(value: Any): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    inline def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
    
    inline def setCommand(value: String): Self = StObject.set(x, "command", value.asInstanceOf[js.Any])
    
    inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    
    inline def setMetadata(value: Any): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    inline def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
    
    inline def setPerformanceData(value: PerformanceData): Self = StObject.set(x, "performanceData", value.asInstanceOf[js.Any])
    
    inline def setPerformanceDataUndefined: Self = StObject.set(x, "performanceData", js.undefined)
    
    inline def setRequest_seq(value: Double): Self = StObject.set(x, "request_seq", value.asInstanceOf[js.Any])
    
    inline def setSuccess(value: Boolean): Self = StObject.set(x, "success", value.asInstanceOf[js.Any])
    
    inline def setType(value: response): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
