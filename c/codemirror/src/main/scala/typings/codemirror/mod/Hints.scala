package typings.codemirror.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Hints extends StObject {
  
  var from: Position
  
  var list: js.Array[Hint | String]
  
  var to: Position
}
object Hints {
  
  @scala.inline
  def apply(from: Position, list: js.Array[Hint | String], to: Position): Hints = {
    val __obj = js.Dynamic.literal(from = from.asInstanceOf[js.Any], list = list.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any])
    __obj.asInstanceOf[Hints]
  }
  
  @scala.inline
  implicit class HintsMutableBuilder[Self <: Hints] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFrom(value: Position): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setList(value: js.Array[Hint | String]): Self = StObject.set(x, "list", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setListVarargs(value: (Hint | String)*): Self = StObject.set(x, "list", js.Array(value :_*))
    
    @scala.inline
    def setTo(value: Position): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
  }
}
