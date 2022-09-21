package typings.typescriptNn5FuAjk.protocolDTsMod.ts.server.protocol

import typings.typescriptNn5FuAjk.typescriptNn5FuAjkStrings.docCommentTemplate
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Requests a JS Doc comment template for a given position
  */
trait DocCommentTemplateRequest
  extends StObject
     with FileLocationRequest {
  
  @JSName("command")
  var command_DocCommentTemplateRequest: docCommentTemplate
}
object DocCommentTemplateRequest {
  
  inline def apply(arguments: FileLocationRequestArgs, seq: Double): DocCommentTemplateRequest = {
    val __obj = js.Dynamic.literal(arguments = arguments.asInstanceOf[js.Any], command = "docCommentTemplate", seq = seq.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("request")
    __obj.asInstanceOf[DocCommentTemplateRequest]
  }
  
  extension [Self <: DocCommentTemplateRequest](x: Self) {
    
    inline def setCommand(value: docCommentTemplate): Self = StObject.set(x, "command", value.asInstanceOf[js.Any])
  }
}
