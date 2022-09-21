package typings.typescriptNn5FuAjk.protocolDTsMod.ts.server.protocol

import typings.typescriptNn5FuAjk.Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Definition response message.  Gives text range for definition.
  */
trait DefinitionResponse
  extends StObject
     with Response {
  
  @JSName("body")
  var body_DefinitionResponse: js.UndefOr[Array[DefinitionInfo]] = js.undefined
}
object DefinitionResponse {
  
  inline def apply(command: String, request_seq: Double, seq: Double, success: Boolean): DefinitionResponse = {
    val __obj = js.Dynamic.literal(command = command.asInstanceOf[js.Any], request_seq = request_seq.asInstanceOf[js.Any], seq = seq.asInstanceOf[js.Any], success = success.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("response")
    __obj.asInstanceOf[DefinitionResponse]
  }
  
  extension [Self <: DefinitionResponse](x: Self) {
    
    inline def setBody(value: Array[DefinitionInfo]): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    inline def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
  }
}
