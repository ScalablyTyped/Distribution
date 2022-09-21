package typings.typescriptNn5FuAjk.protocolDTsMod.ts.server.protocol

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Arguments for CompilerOptionsDiagnosticsRequest request.
  */
trait CompilerOptionsDiagnosticsRequestArgs extends StObject {
  
  /**
    * Name of the project to retrieve compiler options diagnostics.
    */
  var projectFileName: String
}
object CompilerOptionsDiagnosticsRequestArgs {
  
  inline def apply(projectFileName: String): CompilerOptionsDiagnosticsRequestArgs = {
    val __obj = js.Dynamic.literal(projectFileName = projectFileName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CompilerOptionsDiagnosticsRequestArgs]
  }
  
  extension [Self <: CompilerOptionsDiagnosticsRequestArgs](x: Self) {
    
    inline def setProjectFileName(value: String): Self = StObject.set(x, "projectFileName", value.asInstanceOf[js.Any])
  }
}
