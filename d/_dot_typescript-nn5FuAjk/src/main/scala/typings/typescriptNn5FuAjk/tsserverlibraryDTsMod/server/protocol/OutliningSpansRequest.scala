package typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.server.protocol

import typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.server.protocol.CommandTypes.GetOutliningSpans
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
  var command_OutliningSpansRequest: GetOutliningSpans
}
object OutliningSpansRequest {
  
  inline def apply(arguments: FileRequestArgs, command: GetOutliningSpans, seq: Double): OutliningSpansRequest = {
    val __obj = js.Dynamic.literal(arguments = arguments.asInstanceOf[js.Any], command = command.asInstanceOf[js.Any], seq = seq.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("request")
    __obj.asInstanceOf[OutliningSpansRequest]
  }
  
  extension [Self <: OutliningSpansRequest](x: Self) {
    
    inline def setCommand(value: GetOutliningSpans): Self = StObject.set(x, "command", value.asInstanceOf[js.Any])
  }
}
