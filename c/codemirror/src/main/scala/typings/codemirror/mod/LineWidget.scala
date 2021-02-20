package typings.codemirror.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LineWidget extends StObject {
  
  /** Call this if you made some change to the widget's DOM node that might affect its height.
    It'll force CodeMirror to update the height of the line that contains the widget. */
  def changed(): Unit = js.native
  
  /** Removes the widget. */
  def clear(): Unit = js.native
}
object LineWidget {
  
  @scala.inline
  def apply(changed: () => Unit, clear: () => Unit): LineWidget = {
    val __obj = js.Dynamic.literal(changed = js.Any.fromFunction0(changed), clear = js.Any.fromFunction0(clear))
    __obj.asInstanceOf[LineWidget]
  }
  
  @scala.inline
  implicit class LineWidgetMutableBuilder[Self <: LineWidget] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChanged(value: () => Unit): Self = StObject.set(x, "changed", js.Any.fromFunction0(value))
    
    @scala.inline
    def setClear(value: () => Unit): Self = StObject.set(x, "clear", js.Any.fromFunction0(value))
  }
}
