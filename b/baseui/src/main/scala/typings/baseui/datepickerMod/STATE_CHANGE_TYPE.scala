package typings.baseui.datepickerMod

import typings.baseui.baseuiStrings.change_
import typings.baseui.baseuiStrings.mouseLeave
import typings.baseui.baseuiStrings.mouseOver
import typings.baseui.baseuiStrings.moveDown
import typings.baseui.baseuiStrings.moveLeft
import typings.baseui.baseuiStrings.moveRight
import typings.baseui.baseuiStrings.moveUp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait STATE_CHANGE_TYPE extends StObject {
  
  var change: change_
  
  var mouseLeave: typings.baseui.baseuiStrings.mouseLeave
  
  var mouseOver: typings.baseui.baseuiStrings.mouseOver
  
  var moveDown: typings.baseui.baseuiStrings.moveDown
  
  var moveLeft: typings.baseui.baseuiStrings.moveLeft
  
  var moveRight: typings.baseui.baseuiStrings.moveRight
  
  var moveUp: typings.baseui.baseuiStrings.moveUp
}
object STATE_CHANGE_TYPE {
  
  @JSImport("baseui/datepicker", "STATE_CHANGE_TYPE")
  @js.native
  val ^ : STATE_CHANGE_TYPE = js.native
  
  extension [Self <: STATE_CHANGE_TYPE](x: Self) {
    
    inline def setChange(value: change_): Self = StObject.set(x, "change", value.asInstanceOf[js.Any])
    
    inline def setMouseLeave(value: mouseLeave): Self = StObject.set(x, "mouseLeave", value.asInstanceOf[js.Any])
    
    inline def setMouseOver(value: mouseOver): Self = StObject.set(x, "mouseOver", value.asInstanceOf[js.Any])
    
    inline def setMoveDown(value: moveDown): Self = StObject.set(x, "moveDown", value.asInstanceOf[js.Any])
    
    inline def setMoveLeft(value: moveLeft): Self = StObject.set(x, "moveLeft", value.asInstanceOf[js.Any])
    
    inline def setMoveRight(value: moveRight): Self = StObject.set(x, "moveRight", value.asInstanceOf[js.Any])
    
    inline def setMoveUp(value: moveUp): Self = StObject.set(x, "moveUp", value.asInstanceOf[js.Any])
  }
}
