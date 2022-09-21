package typings.typescriptNn5FuAjk.protocolDTsMod.ts.server.protocol

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Arguments for format messages.
  */
trait FormatRequestArgs
  extends StObject
     with FileLocationRequestArgs {
  
  /**
    * Last line of range for which to format text in file.
    */
  var endLine: Double
  
  /**
    * Character offset on last line of range for which to format text in file.
    */
  var endOffset: Double
  
  /**
    * Format options to be used.
    */
  var options: js.UndefOr[FormatCodeSettings] = js.undefined
}
object FormatRequestArgs {
  
  inline def apply(endLine: Double, endOffset: Double, file: String, line: Double, offset: Double): FormatRequestArgs = {
    val __obj = js.Dynamic.literal(endLine = endLine.asInstanceOf[js.Any], endOffset = endOffset.asInstanceOf[js.Any], file = file.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any])
    __obj.asInstanceOf[FormatRequestArgs]
  }
  
  extension [Self <: FormatRequestArgs](x: Self) {
    
    inline def setEndLine(value: Double): Self = StObject.set(x, "endLine", value.asInstanceOf[js.Any])
    
    inline def setEndOffset(value: Double): Self = StObject.set(x, "endOffset", value.asInstanceOf[js.Any])
    
    inline def setOptions(value: FormatCodeSettings): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
  }
}
