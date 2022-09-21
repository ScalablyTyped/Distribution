package typings.typescriptNn5FuAjk.protocolDTsMod.ts.server.protocol

import typings.typescriptNn5FuAjk.typescriptNn5FuAjkStrings.jsxClosingTag
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JsxClosingTagRequest
  extends StObject
     with FileLocationRequest {
  
  @JSName("arguments")
  val arguments_JsxClosingTagRequest: JsxClosingTagRequestArgs
  
  @JSName("command")
  val command_JsxClosingTagRequest: jsxClosingTag
}
object JsxClosingTagRequest {
  
  inline def apply(arguments: JsxClosingTagRequestArgs, seq: Double): JsxClosingTagRequest = {
    val __obj = js.Dynamic.literal(arguments = arguments.asInstanceOf[js.Any], command = "jsxClosingTag", seq = seq.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("request")
    __obj.asInstanceOf[JsxClosingTagRequest]
  }
  
  extension [Self <: JsxClosingTagRequest](x: Self) {
    
    inline def setArguments(value: JsxClosingTagRequestArgs): Self = StObject.set(x, "arguments", value.asInstanceOf[js.Any])
    
    inline def setCommand(value: jsxClosingTag): Self = StObject.set(x, "command", value.asInstanceOf[js.Any])
  }
}
