package typings.codemirror.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Position extends StObject {
  
  var ch: Double
  
  var line: Double
  
  var sticky: js.UndefOr[String] = js.undefined
}
object Position {
  
  @scala.inline
  def apply(ch: Double, line: Double): Position = {
    val __obj = js.Dynamic.literal(ch = ch.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any])
    __obj.asInstanceOf[Position]
  }
  
  @scala.inline
  implicit class PositionMutableBuilder[Self <: Position] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCh(value: Double): Self = StObject.set(x, "ch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLine(value: Double): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSticky(value: String): Self = StObject.set(x, "sticky", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStickyUndefined: Self = StObject.set(x, "sticky", js.undefined)
  }
}
