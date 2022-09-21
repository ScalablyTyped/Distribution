package typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.server.protocol

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A request to get encoded semantic classifications for a span in the file
  */
trait EncodedSemanticClassificationsRequest
  extends StObject
     with FileRequest {
  
  @JSName("arguments")
  var arguments_EncodedSemanticClassificationsRequest: EncodedSemanticClassificationsRequestArgs
}
object EncodedSemanticClassificationsRequest {
  
  inline def apply(arguments: EncodedSemanticClassificationsRequestArgs, command: String, seq: Double): EncodedSemanticClassificationsRequest = {
    val __obj = js.Dynamic.literal(arguments = arguments.asInstanceOf[js.Any], command = command.asInstanceOf[js.Any], seq = seq.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("request")
    __obj.asInstanceOf[EncodedSemanticClassificationsRequest]
  }
  
  extension [Self <: EncodedSemanticClassificationsRequest](x: Self) {
    
    inline def setArguments(value: EncodedSemanticClassificationsRequestArgs): Self = StObject.set(x, "arguments", value.asInstanceOf[js.Any])
  }
}
