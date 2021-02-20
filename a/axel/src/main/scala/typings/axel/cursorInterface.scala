package typings.axel

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait cursorInterface extends StObject {
  
  def off(): Unit = js.native
  
  def on(): Unit = js.native
  
  def reset(): Unit = js.native
  
  def restore(): Unit = js.native
}
object cursorInterface {
  
  @scala.inline
  def apply(off: () => Unit, on: () => Unit, reset: () => Unit, restore: () => Unit): cursorInterface = {
    val __obj = js.Dynamic.literal(off = js.Any.fromFunction0(off), on = js.Any.fromFunction0(on), reset = js.Any.fromFunction0(reset), restore = js.Any.fromFunction0(restore))
    __obj.asInstanceOf[cursorInterface]
  }
  
  @scala.inline
  implicit class cursorInterfaceMutableBuilder[Self <: cursorInterface] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOff(value: () => Unit): Self = StObject.set(x, "off", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOn(value: () => Unit): Self = StObject.set(x, "on", js.Any.fromFunction0(value))
    
    @scala.inline
    def setReset(value: () => Unit): Self = StObject.set(x, "reset", js.Any.fromFunction0(value))
    
    @scala.inline
    def setRestore(value: () => Unit): Self = StObject.set(x, "restore", js.Any.fromFunction0(value))
  }
}
