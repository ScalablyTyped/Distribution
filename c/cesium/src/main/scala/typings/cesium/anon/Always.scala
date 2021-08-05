package typings.cesium.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Always extends StObject {
  
  def always(e: js.Any, t: js.Any): js.Any
  
  def otherwise(e: js.Any): js.Any
  
  def spread(t: js.Any): js.Any
  
  def `then`(e: js.Any): js.Any
  
  def `yield`(e: js.Any): js.Any
}
object Always {
  
  inline def apply(
    always: (js.Any, js.Any) => js.Any,
    otherwise: js.Any => js.Any,
    spread: js.Any => js.Any,
    `then`: js.Any => js.Any,
    `yield`: js.Any => js.Any
  ): Always = {
    val __obj = js.Dynamic.literal(always = js.Any.fromFunction2(always), otherwise = js.Any.fromFunction1(otherwise), spread = js.Any.fromFunction1(spread))
    __obj.updateDynamic("then")(js.Any.fromFunction1(`then`))
    __obj.updateDynamic("yield")(js.Any.fromFunction1(`yield`))
    __obj.asInstanceOf[Always]
  }
  
  extension [Self <: Always](x: Self) {
    
    inline def setAlways(value: (js.Any, js.Any) => js.Any): Self = StObject.set(x, "always", js.Any.fromFunction2(value))
    
    inline def setOtherwise(value: js.Any => js.Any): Self = StObject.set(x, "otherwise", js.Any.fromFunction1(value))
    
    inline def setSpread(value: js.Any => js.Any): Self = StObject.set(x, "spread", js.Any.fromFunction1(value))
    
    inline def setThen(value: js.Any => js.Any): Self = StObject.set(x, "then", js.Any.fromFunction1(value))
    
    inline def setYield(value: js.Any => js.Any): Self = StObject.set(x, "yield", js.Any.fromFunction1(value))
  }
}
