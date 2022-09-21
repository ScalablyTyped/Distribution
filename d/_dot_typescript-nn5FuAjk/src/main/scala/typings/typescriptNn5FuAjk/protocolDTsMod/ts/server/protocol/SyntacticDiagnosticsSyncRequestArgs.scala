package typings.typescriptNn5FuAjk.protocolDTsMod.ts.server.protocol

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SyntacticDiagnosticsSyncRequestArgs
  extends StObject
     with FileRequestArgs {
  
  var includeLinePosition: js.UndefOr[Boolean] = js.undefined
}
object SyntacticDiagnosticsSyncRequestArgs {
  
  inline def apply(file: String): SyntacticDiagnosticsSyncRequestArgs = {
    val __obj = js.Dynamic.literal(file = file.asInstanceOf[js.Any])
    __obj.asInstanceOf[SyntacticDiagnosticsSyncRequestArgs]
  }
  
  extension [Self <: SyntacticDiagnosticsSyncRequestArgs](x: Self) {
    
    inline def setIncludeLinePosition(value: Boolean): Self = StObject.set(x, "includeLinePosition", value.asInstanceOf[js.Any])
    
    inline def setIncludeLinePositionUndefined: Self = StObject.set(x, "includeLinePosition", js.undefined)
  }
}
