package typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.server.protocol

import typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.server.protocol.CommandTypes.DocCommentTemplate
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
  var command_DocCommentTemplateRequest: DocCommentTemplate
}
object DocCommentTemplateRequest {
  
  inline def apply(arguments: FileLocationRequestArgs, command: DocCommentTemplate, seq: Double): DocCommentTemplateRequest = {
    val __obj = js.Dynamic.literal(arguments = arguments.asInstanceOf[js.Any], command = command.asInstanceOf[js.Any], seq = seq.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("request")
    __obj.asInstanceOf[DocCommentTemplateRequest]
  }
  
  extension [Self <: DocCommentTemplateRequest](x: Self) {
    
    inline def setCommand(value: DocCommentTemplate): Self = StObject.set(x, "command", value.asInstanceOf[js.Any])
  }
}
