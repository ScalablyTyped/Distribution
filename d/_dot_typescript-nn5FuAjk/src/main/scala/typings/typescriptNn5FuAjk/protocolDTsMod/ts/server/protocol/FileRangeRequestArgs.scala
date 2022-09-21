package typings.typescriptNn5FuAjk.protocolDTsMod.ts.server.protocol

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FileRangeRequestArgs
  extends StObject
     with FileRequestArgs
     with FileLocationOrRangeRequestArgs {
  
  /**
    * The line number for the request (1-based).
    */
  var endLine: Double
  
  /**
    * The character offset (on the line) for the request (1-based).
    */
  var endOffset: Double
  
  /**
    * The line number for the request (1-based).
    */
  var startLine: Double
  
  /**
    * The character offset (on the line) for the request (1-based).
    */
  var startOffset: Double
}
object FileRangeRequestArgs {
  
  inline def apply(endLine: Double, endOffset: Double, file: String, startLine: Double, startOffset: Double): FileRangeRequestArgs = {
    val __obj = js.Dynamic.literal(endLine = endLine.asInstanceOf[js.Any], endOffset = endOffset.asInstanceOf[js.Any], file = file.asInstanceOf[js.Any], startLine = startLine.asInstanceOf[js.Any], startOffset = startOffset.asInstanceOf[js.Any])
    __obj.asInstanceOf[FileRangeRequestArgs]
  }
  
  extension [Self <: FileRangeRequestArgs](x: Self) {
    
    inline def setEndLine(value: Double): Self = StObject.set(x, "endLine", value.asInstanceOf[js.Any])
    
    inline def setEndOffset(value: Double): Self = StObject.set(x, "endOffset", value.asInstanceOf[js.Any])
    
    inline def setStartLine(value: Double): Self = StObject.set(x, "startLine", value.asInstanceOf[js.Any])
    
    inline def setStartOffset(value: Double): Self = StObject.set(x, "startOffset", value.asInstanceOf[js.Any])
  }
}
