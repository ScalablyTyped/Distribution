package typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.server.protocol

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A request to retrieve compiler options diagnostics for a project
  */
trait CompilerOptionsDiagnosticsRequest
  extends StObject
     with Request {
  
  @JSName("arguments")
  var arguments_CompilerOptionsDiagnosticsRequest: CompilerOptionsDiagnosticsRequestArgs
}
object CompilerOptionsDiagnosticsRequest {
  
  inline def apply(arguments: CompilerOptionsDiagnosticsRequestArgs, command: String, seq: Double): CompilerOptionsDiagnosticsRequest = {
    val __obj = js.Dynamic.literal(arguments = arguments.asInstanceOf[js.Any], command = command.asInstanceOf[js.Any], seq = seq.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("request")
    __obj.asInstanceOf[CompilerOptionsDiagnosticsRequest]
  }
  
  extension [Self <: CompilerOptionsDiagnosticsRequest](x: Self) {
    
    inline def setArguments(value: CompilerOptionsDiagnosticsRequestArgs): Self = StObject.set(x, "arguments", value.asInstanceOf[js.Any])
  }
}
