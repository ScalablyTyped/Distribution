package typings.chartJs.distChunksHelpersDotcoreMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Animation extends StObject {
  
  val _to: Any
  
  def active(): Boolean
  
  def cancel(): Unit
  
  def tick(date: Double): Unit
  
  def update(cfg: AnyObject, to: Any, date: Double): Unit
}
object Animation {
  
  inline def apply(
    _to: Any,
    active: () => Boolean,
    cancel: () => Unit,
    tick: Double => Unit,
    update: (AnyObject, Any, Double) => Unit
  ): Animation = {
    val __obj = js.Dynamic.literal(_to = _to.asInstanceOf[js.Any], active = js.Any.fromFunction0(active), cancel = js.Any.fromFunction0(cancel), tick = js.Any.fromFunction1(tick), update = js.Any.fromFunction3(update))
    __obj.asInstanceOf[Animation]
  }
  
  extension [Self <: Animation](x: Self) {
    
    inline def setActive(value: () => Boolean): Self = StObject.set(x, "active", js.Any.fromFunction0(value))
    
    inline def setCancel(value: () => Unit): Self = StObject.set(x, "cancel", js.Any.fromFunction0(value))
    
    inline def setTick(value: Double => Unit): Self = StObject.set(x, "tick", js.Any.fromFunction1(value))
    
    inline def setUpdate(value: (AnyObject, Any, Double) => Unit): Self = StObject.set(x, "update", js.Any.fromFunction3(value))
    
    inline def set_to(value: Any): Self = StObject.set(x, "_to", value.asInstanceOf[js.Any])
  }
}
