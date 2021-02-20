package typings.baseui.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Dismiss extends StObject {
  
  def dismiss(): Unit = js.native
}
object Dismiss {
  
  @scala.inline
  def apply(dismiss: () => Unit): Dismiss = {
    val __obj = js.Dynamic.literal(dismiss = js.Any.fromFunction0(dismiss))
    __obj.asInstanceOf[Dismiss]
  }
  
  @scala.inline
  implicit class DismissMutableBuilder[Self <: Dismiss] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDismiss(value: () => Unit): Self = StObject.set(x, "dismiss", js.Any.fromFunction0(value))
  }
}
