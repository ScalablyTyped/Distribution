package typings.codemirror.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Token extends StObject {
  
  /** The character at which the token ends. */
  var end: Double
  
  /** The character(on the given line) at which the token starts. */
  var start: Double
  
  /** The mode's state at the end of this token. */
  var state: js.Any
  
  /** The token's string. */
  var string: String
  
  /** The token type the mode assigned to the token, such as "keyword" or "comment" (may also be null). */
  var `type`: String | Null
}
object Token {
  
  @scala.inline
  def apply(end: Double, start: Double, state: js.Any, string: String): Token = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], string = string.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(null)
    __obj.asInstanceOf[Token]
  }
  
  @scala.inline
  implicit class TokenMutableBuilder[Self <: Token] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnd(value: Double): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStart(value: Double): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setState(value: js.Any): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setString(value: String): Self = StObject.set(x, "string", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeNull: Self = StObject.set(x, "type", null)
  }
}
