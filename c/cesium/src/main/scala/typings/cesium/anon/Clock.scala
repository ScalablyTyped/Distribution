package typings.cesium.anon

import typings.cesium.mod.TimeIntervalCollection
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Clock extends StObject {
  
  var clock: typings.cesium.mod.Clock
  
  def reloadFunction(params: Any*): Any
  
  def requestImageFunction(params: Any*): Any
  
  var times: TimeIntervalCollection
}
object Clock {
  
  inline def apply(
    clock: typings.cesium.mod.Clock,
    reloadFunction: /* repeated */ Any => Any,
    requestImageFunction: /* repeated */ Any => Any,
    times: TimeIntervalCollection
  ): Clock = {
    val __obj = js.Dynamic.literal(clock = clock.asInstanceOf[js.Any], reloadFunction = js.Any.fromFunction1(reloadFunction), requestImageFunction = js.Any.fromFunction1(requestImageFunction), times = times.asInstanceOf[js.Any])
    __obj.asInstanceOf[Clock]
  }
  
  extension [Self <: Clock](x: Self) {
    
    inline def setClock(value: typings.cesium.mod.Clock): Self = StObject.set(x, "clock", value.asInstanceOf[js.Any])
    
    inline def setReloadFunction(value: /* repeated */ Any => Any): Self = StObject.set(x, "reloadFunction", js.Any.fromFunction1(value))
    
    inline def setRequestImageFunction(value: /* repeated */ Any => Any): Self = StObject.set(x, "requestImageFunction", js.Any.fromFunction1(value))
    
    inline def setTimes(value: TimeIntervalCollection): Self = StObject.set(x, "times", value.asInstanceOf[js.Any])
  }
}
