package typings.typescriptNn5FuAjk.protocolDTsMod.ts.server.protocol

import typings.typescriptNn5FuAjk.typescriptNn5FuAjkStrings.documentHighlights
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Get document highlights request; value of command field is
  * "documentHighlights". Return response giving spans that are relevant
  * in the file at a given line and column.
  */
trait DocumentHighlightsRequest
  extends StObject
     with FileLocationRequest {
  
  @JSName("arguments")
  var arguments_DocumentHighlightsRequest: DocumentHighlightsRequestArgs
  
  @JSName("command")
  var command_DocumentHighlightsRequest: documentHighlights
}
object DocumentHighlightsRequest {
  
  inline def apply(arguments: DocumentHighlightsRequestArgs, seq: Double): DocumentHighlightsRequest = {
    val __obj = js.Dynamic.literal(arguments = arguments.asInstanceOf[js.Any], command = "documentHighlights", seq = seq.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("request")
    __obj.asInstanceOf[DocumentHighlightsRequest]
  }
  
  extension [Self <: DocumentHighlightsRequest](x: Self) {
    
    inline def setArguments(value: DocumentHighlightsRequestArgs): Self = StObject.set(x, "arguments", value.asInstanceOf[js.Any])
    
    inline def setCommand(value: documentHighlights): Self = StObject.set(x, "command", value.asInstanceOf[js.Any])
  }
}
