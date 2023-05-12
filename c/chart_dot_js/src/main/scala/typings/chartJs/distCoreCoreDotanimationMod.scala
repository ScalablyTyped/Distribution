package typings.chartJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCoreCoreDotanimationMod {
  
  @JSImport("chart.js/dist/core/core.animation", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with Animation {
    def this(cfg: Any, target: Any, prop: Any, to: Any) = this()
    
    /* CompleteClass */
    var _active: Boolean = js.native
    
    /* CompleteClass */
    var _duration: Double = js.native
    
    /* CompleteClass */
    var _easing: Any = js.native
    
    /* CompleteClass */
    var _fn: Any = js.native
    
    /* CompleteClass */
    var _from: Any = js.native
    
    /* CompleteClass */
    var _loop: Boolean = js.native
    
    /* CompleteClass */
    override def _notify(resolved: Any): Unit = js.native
    
    /* CompleteClass */
    var _promises: js.Array[Any] = js.native
    
    /* CompleteClass */
    var _prop: Any = js.native
    
    /* CompleteClass */
    var _start: Double = js.native
    
    /* CompleteClass */
    var _target: Any = js.native
    
    /* CompleteClass */
    var _to: Any = js.native
    
    /* CompleteClass */
    var _total: Double = js.native
    
    /* CompleteClass */
    override def active(): Boolean = js.native
    
    /* CompleteClass */
    override def cancel(): Unit = js.native
    
    /* CompleteClass */
    override def tick(date: Any): Unit = js.native
    
    /* CompleteClass */
    override def update(cfg: Any, to: Any, date: Any): Unit = js.native
  }
  
  trait Animation extends StObject {
    
    var _active: Boolean
    
    var _duration: Double
    
    var _easing: Any
    
    var _fn: Any
    
    var _from: Any
    
    var _loop: Boolean
    
    def _notify(resolved: Any): Unit
    
    var _promises: js.Array[Any]
    
    var _prop: Any
    
    var _start: Double
    
    var _target: Any
    
    var _to: Any
    
    var _total: Double
    
    def active(): Boolean
    
    def cancel(): Unit
    
    def tick(date: Any): Unit
    
    def update(cfg: Any, to: Any, date: Any): Unit
  }
  object Animation {
    
    inline def apply(
      _active: Boolean,
      _duration: Double,
      _easing: Any,
      _fn: Any,
      _from: Any,
      _loop: Boolean,
      _notify: Any => Unit,
      _promises: js.Array[Any],
      _prop: Any,
      _start: Double,
      _target: Any,
      _to: Any,
      _total: Double,
      active: () => Boolean,
      cancel: () => Unit,
      tick: Any => Unit,
      update: (Any, Any, Any) => Unit
    ): Animation = {
      val __obj = js.Dynamic.literal(_active = _active.asInstanceOf[js.Any], _duration = _duration.asInstanceOf[js.Any], _easing = _easing.asInstanceOf[js.Any], _fn = _fn.asInstanceOf[js.Any], _from = _from.asInstanceOf[js.Any], _loop = _loop.asInstanceOf[js.Any], _notify = js.Any.fromFunction1(_notify), _promises = _promises.asInstanceOf[js.Any], _prop = _prop.asInstanceOf[js.Any], _start = _start.asInstanceOf[js.Any], _target = _target.asInstanceOf[js.Any], _to = _to.asInstanceOf[js.Any], _total = _total.asInstanceOf[js.Any], active = js.Any.fromFunction0(active), cancel = js.Any.fromFunction0(cancel), tick = js.Any.fromFunction1(tick), update = js.Any.fromFunction3(update))
      __obj.asInstanceOf[Animation]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Animation] (val x: Self) extends AnyVal {
      
      inline def setActive(value: () => Boolean): Self = StObject.set(x, "active", js.Any.fromFunction0(value))
      
      inline def setCancel(value: () => Unit): Self = StObject.set(x, "cancel", js.Any.fromFunction0(value))
      
      inline def setTick(value: Any => Unit): Self = StObject.set(x, "tick", js.Any.fromFunction1(value))
      
      inline def setUpdate(value: (Any, Any, Any) => Unit): Self = StObject.set(x, "update", js.Any.fromFunction3(value))
      
      inline def set_active(value: Boolean): Self = StObject.set(x, "_active", value.asInstanceOf[js.Any])
      
      inline def set_duration(value: Double): Self = StObject.set(x, "_duration", value.asInstanceOf[js.Any])
      
      inline def set_easing(value: Any): Self = StObject.set(x, "_easing", value.asInstanceOf[js.Any])
      
      inline def set_fn(value: Any): Self = StObject.set(x, "_fn", value.asInstanceOf[js.Any])
      
      inline def set_from(value: Any): Self = StObject.set(x, "_from", value.asInstanceOf[js.Any])
      
      inline def set_loop(value: Boolean): Self = StObject.set(x, "_loop", value.asInstanceOf[js.Any])
      
      inline def set_notify(value: Any => Unit): Self = StObject.set(x, "_notify", js.Any.fromFunction1(value))
      
      inline def set_promises(value: js.Array[Any]): Self = StObject.set(x, "_promises", value.asInstanceOf[js.Any])
      
      inline def set_promisesVarargs(value: Any*): Self = StObject.set(x, "_promises", js.Array(value*))
      
      inline def set_prop(value: Any): Self = StObject.set(x, "_prop", value.asInstanceOf[js.Any])
      
      inline def set_start(value: Double): Self = StObject.set(x, "_start", value.asInstanceOf[js.Any])
      
      inline def set_target(value: Any): Self = StObject.set(x, "_target", value.asInstanceOf[js.Any])
      
      inline def set_to(value: Any): Self = StObject.set(x, "_to", value.asInstanceOf[js.Any])
      
      inline def set_total(value: Double): Self = StObject.set(x, "_total", value.asInstanceOf[js.Any])
    }
  }
}
