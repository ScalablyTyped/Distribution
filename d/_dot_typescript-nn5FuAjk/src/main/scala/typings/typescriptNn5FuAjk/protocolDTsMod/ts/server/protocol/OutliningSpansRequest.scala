package typings.typescriptNn5FuAjk.protocolDTsMod.ts.server.protocol

import typings.typescriptNn5FuAjk.typescriptNn5FuAjkStrings.getOutliningSpans
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Request to obtain outlining spans in file.
  */
trait OutliningSpansRequest
  extends StObject
     with FileRequest {
  
  @JSName("command")
  var command_OutliningSpansRequest: getOutliningSpans
}
object OutliningSpansRequest {
  
  inline def apply(arguments: FileRequestArgs, seq: Double): OutliningSpansRequest = {
    val __obj = js.Dynamic.literal(arguments = arguments.asInstanceOf[js.Any], command = "getOutliningSpans", seq = seq.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("request")
    __obj.asInstanceOf[OutliningSpansRequest]
  }
  
  extension [Self <: OutliningSpansRequest](x: Self) {
    
    inline def setCommand(value: getOutliningSpans): Self = StObject.set(x, "command", value.asInstanceOf[js.Any])
  }
}
