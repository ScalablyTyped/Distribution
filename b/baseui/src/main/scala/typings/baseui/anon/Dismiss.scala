package typings.baseui.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Dismiss extends StObject {
  
  def dismiss(): Unit
}
object Dismiss {
  
  inline def apply(dismiss: () => Unit): Dismiss = {
    val __obj = js.Dynamic.literal(dismiss = js.Any.fromFunction0(dismiss))
    __obj.asInstanceOf[Dismiss]
  }
  
  extension [Self <: Dismiss](x: Self) {
    
    inline def setDismiss(value: () => Unit): Self = StObject.set(x, "dismiss", js.Any.fromFunction0(value))
  }
}
