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
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait STATE_CHANGE_TYPE extends StObject {
  
  var change: change_ = js.native
  
  var mouseLeave: typings.baseui.baseuiStrings.mouseLeave = js.native
  
  var mouseOver: typings.baseui.baseuiStrings.mouseOver = js.native
  
  var moveDown: typings.baseui.baseuiStrings.moveDown = js.native
  
  var moveLeft: typings.baseui.baseuiStrings.moveLeft = js.native
  
  var moveRight: typings.baseui.baseuiStrings.moveRight = js.native
  
  var moveUp: typings.baseui.baseuiStrings.moveUp = js.native
}
object STATE_CHANGE_TYPE {
  
  @JSImport("baseui/datepicker", "STATE_CHANGE_TYPE")
  @js.native
  val ^ : STATE_CHANGE_TYPE = js.native
  
  @scala.inline
  implicit class STATE_CHANGE_TYPEMutableBuilder[Self <: STATE_CHANGE_TYPE] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChange(value: change_): Self = StObject.set(x, "change", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMouseLeave(value: mouseLeave): Self = StObject.set(x, "mouseLeave", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMouseOver(value: mouseOver): Self = StObject.set(x, "mouseOver", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMoveDown(value: moveDown): Self = StObject.set(x, "moveDown", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMoveLeft(value: moveLeft): Self = StObject.set(x, "moveLeft", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMoveRight(value: moveRight): Self = StObject.set(x, "moveRight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMoveUp(value: moveUp): Self = StObject.set(x, "moveUp", value.asInstanceOf[js.Any])
  }
}
