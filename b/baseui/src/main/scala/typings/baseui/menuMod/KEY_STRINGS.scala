package typings.baseui.menuMod

import typings.baseui.baseuiStrings.ArrowDown
import typings.baseui.baseuiStrings.ArrowLeft
import typings.baseui.baseuiStrings.ArrowRight
import typings.baseui.baseuiStrings.ArrowUp
import typings.baseui.baseuiStrings.Backspace
import typings.baseui.baseuiStrings.Enter
import typings.baseui.baseuiStrings.Escape
import typings.baseui.baseuiStrings.Space
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KEY_STRINGS extends StObject {
  
  var ArrowDown: typings.baseui.baseuiStrings.ArrowDown
  
  var ArrowLeft: typings.baseui.baseuiStrings.ArrowLeft
  
  var ArrowRight: typings.baseui.baseuiStrings.ArrowRight
  
  var ArrowUp: typings.baseui.baseuiStrings.ArrowUp
  
  var Backspace: typings.baseui.baseuiStrings.Backspace
  
  var Enter: typings.baseui.baseuiStrings.Enter
  
  var Escape: typings.baseui.baseuiStrings.Escape
  
  var Space: typings.baseui.baseuiStrings.Space
}
object KEY_STRINGS {
  
  @JSImport("baseui/menu", "KEY_STRINGS")
  @js.native
  val ^ : KEY_STRINGS = js.native
  
  @scala.inline
  implicit class KEY_STRINGSMutableBuilder[Self <: KEY_STRINGS] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArrowDown(value: ArrowDown): Self = StObject.set(x, "ArrowDown", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArrowLeft(value: ArrowLeft): Self = StObject.set(x, "ArrowLeft", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArrowRight(value: ArrowRight): Self = StObject.set(x, "ArrowRight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArrowUp(value: ArrowUp): Self = StObject.set(x, "ArrowUp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackspace(value: Backspace): Self = StObject.set(x, "Backspace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnter(value: Enter): Self = StObject.set(x, "Enter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEscape(value: Escape): Self = StObject.set(x, "Escape", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpace(value: Space): Self = StObject.set(x, "Space", value.asInstanceOf[js.Any])
  }
}
