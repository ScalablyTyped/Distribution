package typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.server.protocol

import typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.server.protocol.CommandTypes.JsxClosingTag
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JsxClosingTagRequest
  extends StObject
     with FileLocationRequest {
  
  @JSName("arguments")
  val arguments_JsxClosingTagRequest: JsxClosingTagRequestArgs
  
  @JSName("command")
  val command_JsxClosingTagRequest: JsxClosingTag
}
object JsxClosingTagRequest {
  
  inline def apply(arguments: JsxClosingTagRequestArgs, command: JsxClosingTag, seq: Double): JsxClosingTagRequest = {
    val __obj = js.Dynamic.literal(arguments = arguments.asInstanceOf[js.Any], command = command.asInstanceOf[js.Any], seq = seq.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("request")
    __obj.asInstanceOf[JsxClosingTagRequest]
  }
  
  extension [Self <: JsxClosingTagRequest](x: Self) {
    
    inline def setArguments(value: JsxClosingTagRequestArgs): Self = StObject.set(x, "arguments", value.asInstanceOf[js.Any])
    
    inline def setCommand(value: JsxClosingTag): Self = StObject.set(x, "command", value.asInstanceOf[js.Any])
  }
}
