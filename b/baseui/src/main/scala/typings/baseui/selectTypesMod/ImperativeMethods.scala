package typings.baseui.selectTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ImperativeMethods extends StObject {
  
  def blur(): Unit
  
  def focus(): Unit
  
  def setDropdownOpen(a: Boolean): Any
  
  def setInputBlur(): Unit
  
  def setInputFocus(): Unit
  
  def setInputValue(a: String): Unit
}
object ImperativeMethods {
  
  inline def apply(
    blur: () => Unit,
    focus: () => Unit,
    setDropdownOpen: Boolean => Any,
    setInputBlur: () => Unit,
    setInputFocus: () => Unit,
    setInputValue: String => Unit
  ): ImperativeMethods = {
    val __obj = js.Dynamic.literal(blur = js.Any.fromFunction0(blur), focus = js.Any.fromFunction0(focus), setDropdownOpen = js.Any.fromFunction1(setDropdownOpen), setInputBlur = js.Any.fromFunction0(setInputBlur), setInputFocus = js.Any.fromFunction0(setInputFocus), setInputValue = js.Any.fromFunction1(setInputValue))
    __obj.asInstanceOf[ImperativeMethods]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ImperativeMethods] (val x: Self) extends AnyVal {
    
    inline def setBlur(value: () => Unit): Self = StObject.set(x, "blur", js.Any.fromFunction0(value))
    
    inline def setFocus(value: () => Unit): Self = StObject.set(x, "focus", js.Any.fromFunction0(value))
    
    inline def setSetDropdownOpen(value: Boolean => Any): Self = StObject.set(x, "setDropdownOpen", js.Any.fromFunction1(value))
    
    inline def setSetInputBlur(value: () => Unit): Self = StObject.set(x, "setInputBlur", js.Any.fromFunction0(value))
    
    inline def setSetInputFocus(value: () => Unit): Self = StObject.set(x, "setInputFocus", js.Any.fromFunction0(value))
    
    inline def setSetInputValue(value: String => Unit): Self = StObject.set(x, "setInputValue", js.Any.fromFunction1(value))
  }
}
