package typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.server.protocol

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SpanOfEnclosingCommentRequestArgs
  extends StObject
     with FileLocationRequestArgs {
  
  /**
    * Requires that the enclosing span be a multi-line comment, or else the request returns undefined.
    */
  var onlyMultiLine: Boolean
}
object SpanOfEnclosingCommentRequestArgs {
  
  inline def apply(file: String, line: Double, offset: Double, onlyMultiLine: Boolean): SpanOfEnclosingCommentRequestArgs = {
    val __obj = js.Dynamic.literal(file = file.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any], onlyMultiLine = onlyMultiLine.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpanOfEnclosingCommentRequestArgs]
  }
  
  extension [Self <: SpanOfEnclosingCommentRequestArgs](x: Self) {
    
    inline def setOnlyMultiLine(value: Boolean): Self = StObject.set(x, "onlyMultiLine", value.asInstanceOf[js.Any])
  }
}
