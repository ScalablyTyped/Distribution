package typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.server.protocol

import typings.typescriptNn5FuAjk.Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PrepareCallHierarchyResponse
  extends StObject
     with Response {
  
  @JSName("body")
  val body_PrepareCallHierarchyResponse: CallHierarchyItem | Array[CallHierarchyItem]
}
object PrepareCallHierarchyResponse {
  
  inline def apply(
    body: CallHierarchyItem | Array[CallHierarchyItem],
    command: String,
    request_seq: Double,
    seq: Double,
    success: Boolean
  ): PrepareCallHierarchyResponse = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], command = command.asInstanceOf[js.Any], request_seq = request_seq.asInstanceOf[js.Any], seq = seq.asInstanceOf[js.Any], success = success.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("response")
    __obj.asInstanceOf[PrepareCallHierarchyResponse]
  }
  
  extension [Self <: PrepareCallHierarchyResponse](x: Self) {
    
    inline def setBody(value: CallHierarchyItem | Array[CallHierarchyItem]): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
  }
}
