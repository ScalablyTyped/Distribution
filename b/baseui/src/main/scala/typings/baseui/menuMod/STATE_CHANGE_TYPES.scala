package typings.baseui.menuMod

import typings.baseui.baseuiStrings.character
import typings.baseui.baseuiStrings.click
import typings.baseui.baseuiStrings.enter_
import typings.baseui.baseuiStrings.focus
import typings.baseui.baseuiStrings.mouseEnter
import typings.baseui.baseuiStrings.moveDown
import typings.baseui.baseuiStrings.moveUp
import typings.baseui.baseuiStrings.reset
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait STATE_CHANGE_TYPES extends StObject {
  
  var character: typings.baseui.baseuiStrings.character
  
  var click: typings.baseui.baseuiStrings.click
  
  var enter: enter_
  
  var focus: typings.baseui.baseuiStrings.focus
  
  var mouseEnter: typings.baseui.baseuiStrings.mouseEnter
  
  var moveDown: typings.baseui.baseuiStrings.moveDown
  
  var moveUp: typings.baseui.baseuiStrings.moveUp
  
  var reset: typings.baseui.baseuiStrings.reset
}
object STATE_CHANGE_TYPES {
  
  @JSImport("baseui/menu", "STATE_CHANGE_TYPES")
  @js.native
  val ^ : STATE_CHANGE_TYPES = js.native
  
  @scala.inline
  implicit class STATE_CHANGE_TYPESMutableBuilder[Self <: STATE_CHANGE_TYPES] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCharacter(value: character): Self = StObject.set(x, "character", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClick(value: click): Self = StObject.set(x, "click", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnter(value: enter_): Self = StObject.set(x, "enter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFocus(value: focus): Self = StObject.set(x, "focus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMouseEnter(value: mouseEnter): Self = StObject.set(x, "mouseEnter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMoveDown(value: moveDown): Self = StObject.set(x, "moveDown", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMoveUp(value: moveUp): Self = StObject.set(x, "moveUp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReset(value: reset): Self = StObject.set(x, "reset", value.asInstanceOf[js.Any])
  }
}
