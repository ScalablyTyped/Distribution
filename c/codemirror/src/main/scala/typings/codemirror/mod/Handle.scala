package typings.codemirror.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** The Handle used to interact with the autocomplete dialog box.*/
@js.native
trait Handle extends StObject {
  
  def close(): Unit = js.native
  
  var data: js.Any = js.native
  
  var length: Double = js.native
  
  def menuSize(): Double = js.native
  
  def moveFocus(n: Double, avoidWrap: Boolean): Unit = js.native
  
  def pick(): Unit = js.native
  
  def setFocus(n: Double): Unit = js.native
}
object Handle {
  
  @scala.inline
  def apply(
    close: () => Unit,
    data: js.Any,
    length: Double,
    menuSize: () => Double,
    moveFocus: (Double, Boolean) => Unit,
    pick: () => Unit,
    setFocus: Double => Unit
  ): Handle = {
    val __obj = js.Dynamic.literal(close = js.Any.fromFunction0(close), data = data.asInstanceOf[js.Any], length = length.asInstanceOf[js.Any], menuSize = js.Any.fromFunction0(menuSize), moveFocus = js.Any.fromFunction2(moveFocus), pick = js.Any.fromFunction0(pick), setFocus = js.Any.fromFunction1(setFocus))
    __obj.asInstanceOf[Handle]
  }
  
  @scala.inline
  implicit class HandleMutableBuilder[Self <: Handle] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClose(value: () => Unit): Self = StObject.set(x, "close", js.Any.fromFunction0(value))
    
    @scala.inline
    def setData(value: js.Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMenuSize(value: () => Double): Self = StObject.set(x, "menuSize", js.Any.fromFunction0(value))
    
    @scala.inline
    def setMoveFocus(value: (Double, Boolean) => Unit): Self = StObject.set(x, "moveFocus", js.Any.fromFunction2(value))
    
    @scala.inline
    def setPick(value: () => Unit): Self = StObject.set(x, "pick", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSetFocus(value: Double => Unit): Self = StObject.set(x, "setFocus", js.Any.fromFunction1(value))
  }
}
