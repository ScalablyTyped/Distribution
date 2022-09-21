package typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.server.protocol

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SemanticDiagnosticsSyncRequestArgs
  extends StObject
     with FileRequestArgs {
  
  var includeLinePosition: js.UndefOr[Boolean] = js.undefined
}
object SemanticDiagnosticsSyncRequestArgs {
  
  inline def apply(file: String): SemanticDiagnosticsSyncRequestArgs = {
    val __obj = js.Dynamic.literal(file = file.asInstanceOf[js.Any])
    __obj.asInstanceOf[SemanticDiagnosticsSyncRequestArgs]
  }
  
  extension [Self <: SemanticDiagnosticsSyncRequestArgs](x: Self) {
    
    inline def setIncludeLinePosition(value: Boolean): Self = StObject.set(x, "includeLinePosition", value.asInstanceOf[js.Any])
    
    inline def setIncludeLinePositionUndefined: Self = StObject.set(x, "includeLinePosition", js.undefined)
  }
}
