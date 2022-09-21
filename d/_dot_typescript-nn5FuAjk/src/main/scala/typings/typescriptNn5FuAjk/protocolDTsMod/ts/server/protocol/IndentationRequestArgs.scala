package typings.typescriptNn5FuAjk.protocolDTsMod.ts.server.protocol

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Arguments for IndentationRequest request.
  */
trait IndentationRequestArgs
  extends StObject
     with FileLocationRequestArgs {
  
  /**
    * An optional set of settings to be used when computing indentation.
    * If argument is omitted - then it will use settings for file that were previously set via 'configure' request or global settings.
    */
  var options: js.UndefOr[EditorSettings] = js.undefined
}
object IndentationRequestArgs {
  
  inline def apply(file: String, line: Double, offset: Double): IndentationRequestArgs = {
    val __obj = js.Dynamic.literal(file = file.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any])
    __obj.asInstanceOf[IndentationRequestArgs]
  }
  
  extension [Self <: IndentationRequestArgs](x: Self) {
    
    inline def setOptions(value: EditorSettings): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
  }
}
