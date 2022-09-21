package typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.server.protocol

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Arguments for CompileOnSaveEmitFileRequest
  */
trait CompileOnSaveEmitFileRequestArgs
  extends StObject
     with FileRequestArgs {
  
  /**
    * if true - then file should be recompiled even if it does not have any changes.
    */
  var forced: js.UndefOr[Boolean] = js.undefined
  
  var includeLinePosition: js.UndefOr[Boolean] = js.undefined
  
  /** if true - return response as object with emitSkipped and diagnostics */
  var richResponse: js.UndefOr[Boolean] = js.undefined
}
object CompileOnSaveEmitFileRequestArgs {
  
  inline def apply(file: String): CompileOnSaveEmitFileRequestArgs = {
    val __obj = js.Dynamic.literal(file = file.asInstanceOf[js.Any])
    __obj.asInstanceOf[CompileOnSaveEmitFileRequestArgs]
  }
  
  extension [Self <: CompileOnSaveEmitFileRequestArgs](x: Self) {
    
    inline def setForced(value: Boolean): Self = StObject.set(x, "forced", value.asInstanceOf[js.Any])
    
    inline def setForcedUndefined: Self = StObject.set(x, "forced", js.undefined)
    
    inline def setIncludeLinePosition(value: Boolean): Self = StObject.set(x, "includeLinePosition", value.asInstanceOf[js.Any])
    
    inline def setIncludeLinePositionUndefined: Self = StObject.set(x, "includeLinePosition", js.undefined)
    
    inline def setRichResponse(value: Boolean): Self = StObject.set(x, "richResponse", value.asInstanceOf[js.Any])
    
    inline def setRichResponseUndefined: Self = StObject.set(x, "richResponse", js.undefined)
  }
}
