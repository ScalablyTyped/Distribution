package typings.chartJs.anon

import typings.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Readonly<chart.js.chart.js.Animations> */
trait ReadonlyAnimations extends StObject {
  
  val _animateOptions: Any
  
  val _chart: Any
  
  val _createAnimations: Any
  
  val _properties: Map[Any, Any]
  
  def configure(config: Any): Unit
  
  def update(target: js.Object, values: js.Object): js.UndefOr[Boolean]
}
object ReadonlyAnimations {
  
  inline def apply(
    _animateOptions: Any,
    _chart: Any,
    _createAnimations: Any,
    _properties: Map[Any, Any],
    configure: Any => Unit,
    update: (js.Object, js.Object) => js.UndefOr[Boolean]
  ): ReadonlyAnimations = {
    val __obj = js.Dynamic.literal(_animateOptions = _animateOptions.asInstanceOf[js.Any], _chart = _chart.asInstanceOf[js.Any], _createAnimations = _createAnimations.asInstanceOf[js.Any], _properties = _properties.asInstanceOf[js.Any], configure = js.Any.fromFunction1(configure), update = js.Any.fromFunction2(update))
    __obj.asInstanceOf[ReadonlyAnimations]
  }
  
  extension [Self <: ReadonlyAnimations](x: Self) {
    
    inline def setConfigure(value: Any => Unit): Self = StObject.set(x, "configure", js.Any.fromFunction1(value))
    
    inline def setUpdate(value: (js.Object, js.Object) => js.UndefOr[Boolean]): Self = StObject.set(x, "update", js.Any.fromFunction2(value))
    
    inline def set_animateOptions(value: Any): Self = StObject.set(x, "_animateOptions", value.asInstanceOf[js.Any])
    
    inline def set_chart(value: Any): Self = StObject.set(x, "_chart", value.asInstanceOf[js.Any])
    
    inline def set_createAnimations(value: Any): Self = StObject.set(x, "_createAnimations", value.asInstanceOf[js.Any])
    
    inline def set_properties(value: Map[Any, Any]): Self = StObject.set(x, "_properties", value.asInstanceOf[js.Any])
  }
}
