package typings.baseui.anon

import typings.baseui.baseuiStrings.character
import typings.baseui.baseuiStrings.click
import typings.baseui.baseuiStrings.enter_
import typings.baseui.baseuiStrings.focus
import typings.baseui.baseuiStrings.mouseEnter
import typings.baseui.baseuiStrings.mouseLeave
import typings.baseui.baseuiStrings.moveDown
import typings.baseui.baseuiStrings.moveUp
import typings.baseui.baseuiStrings.reset
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Character extends StObject {
  
  val character: typings.baseui.baseuiStrings.character
  
  val click: typings.baseui.baseuiStrings.click
  
  val enter: enter_
  
  val focus: typings.baseui.baseuiStrings.focus
  
  val mouseEnter: typings.baseui.baseuiStrings.mouseEnter
  
  val mouseLeave: typings.baseui.baseuiStrings.mouseLeave
  
  val moveDown: typings.baseui.baseuiStrings.moveDown
  
  val moveUp: typings.baseui.baseuiStrings.moveUp
  
  val reset: typings.baseui.baseuiStrings.reset
}
object Character {
  
  inline def apply(): Character = {
    val __obj = js.Dynamic.literal(character = "character", click = "click", enter = "enter", focus = "focus", mouseEnter = "mouseEnter", mouseLeave = "mouseLeave", moveDown = "moveDown", moveUp = "moveUp", reset = "reset")
    __obj.asInstanceOf[Character]
  }
  
  extension [Self <: Character](x: Self) {
    
    inline def setCharacter(value: character): Self = StObject.set(x, "character", value.asInstanceOf[js.Any])
    
    inline def setClick(value: click): Self = StObject.set(x, "click", value.asInstanceOf[js.Any])
    
    inline def setEnter(value: enter_): Self = StObject.set(x, "enter", value.asInstanceOf[js.Any])
    
    inline def setFocus(value: focus): Self = StObject.set(x, "focus", value.asInstanceOf[js.Any])
    
    inline def setMouseEnter(value: mouseEnter): Self = StObject.set(x, "mouseEnter", value.asInstanceOf[js.Any])
    
    inline def setMouseLeave(value: mouseLeave): Self = StObject.set(x, "mouseLeave", value.asInstanceOf[js.Any])
    
    inline def setMoveDown(value: moveDown): Self = StObject.set(x, "moveDown", value.asInstanceOf[js.Any])
    
    inline def setMoveUp(value: moveUp): Self = StObject.set(x, "moveUp", value.asInstanceOf[js.Any])
    
    inline def setReset(value: reset): Self = StObject.set(x, "reset", value.asInstanceOf[js.Any])
  }
}
