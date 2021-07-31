package typings.css.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParserError extends StObject {
  
  var column: js.UndefOr[Double] = js.undefined
  
  /** The value of options.source if passed to css.parse. Otherwise undefined. */
  var filename: js.UndefOr[String] = js.undefined
  
  var line: js.UndefOr[Double] = js.undefined
  
  /** The full error message with the source position. */
  var message: js.UndefOr[String] = js.undefined
  
  /** The error message without position. */
  var reason: js.UndefOr[String] = js.undefined
  
  /** The portion of code that couldn't be parsed. */
  var source: js.UndefOr[String] = js.undefined
}
object ParserError {
  
  @scala.inline
  def apply(): ParserError = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParserError]
  }
  
  @scala.inline
  implicit class ParserErrorMutableBuilder[Self <: ParserError] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColumn(value: Double): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColumnUndefined: Self = StObject.set(x, "column", js.undefined)
    
    @scala.inline
    def setFilename(value: String): Self = StObject.set(x, "filename", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilenameUndefined: Self = StObject.set(x, "filename", js.undefined)
    
    @scala.inline
    def setLine(value: Double): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLineUndefined: Self = StObject.set(x, "line", js.undefined)
    
    @scala.inline
    def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    
    @scala.inline
    def setReason(value: String): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReasonUndefined: Self = StObject.set(x, "reason", js.undefined)
    
    @scala.inline
    def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
  }
}
