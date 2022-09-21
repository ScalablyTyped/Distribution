package typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.server.protocol

import typings.typescriptNn5FuAjk.Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProvideCallHierarchyOutgoingCallsResponse
  extends StObject
     with Response {
  
  @JSName("body")
  val body_ProvideCallHierarchyOutgoingCallsResponse: Array[CallHierarchyOutgoingCall]
}
object ProvideCallHierarchyOutgoingCallsResponse {
  
  inline def apply(
    body: Array[CallHierarchyOutgoingCall],
    command: String,
    request_seq: Double,
    seq: Double,
    success: Boolean
  ): ProvideCallHierarchyOutgoingCallsResponse = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], command = command.asInstanceOf[js.Any], request_seq = request_seq.asInstanceOf[js.Any], seq = seq.asInstanceOf[js.Any], success = success.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("response")
    __obj.asInstanceOf[ProvideCallHierarchyOutgoingCallsResponse]
  }
  
  extension [Self <: ProvideCallHierarchyOutgoingCallsResponse](x: Self) {
    
    inline def setBody(value: Array[CallHierarchyOutgoingCall]): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
  }
}
