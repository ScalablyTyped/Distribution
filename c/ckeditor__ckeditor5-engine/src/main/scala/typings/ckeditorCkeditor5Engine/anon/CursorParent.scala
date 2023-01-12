package typings.ckeditorCkeditor5Engine.anon

import typings.ckeditorCkeditor5Engine.srcModelElementMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CursorParent extends StObject {
  
  var cursorParent: default
  
  var position: typings.ckeditorCkeditor5Engine.srcModelPositionMod.default
}
object CursorParent {
  
  inline def apply(cursorParent: default, position: typings.ckeditorCkeditor5Engine.srcModelPositionMod.default): CursorParent = {
    val __obj = js.Dynamic.literal(cursorParent = cursorParent.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any])
    __obj.asInstanceOf[CursorParent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CursorParent] (val x: Self) extends AnyVal {
    
    inline def setCursorParent(value: default): Self = StObject.set(x, "cursorParent", value.asInstanceOf[js.Any])
    
    inline def setPosition(value: typings.ckeditorCkeditor5Engine.srcModelPositionMod.default): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
  }
}
