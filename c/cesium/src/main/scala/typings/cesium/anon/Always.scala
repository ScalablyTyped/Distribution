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
  
  @scala.inline
  def apply(
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
  
  @scala.inline
  implicit class AlwaysMutableBuilder[Self <: Always] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAlways(value: (js.Any, js.Any) => js.Any): Self = StObject.set(x, "always", js.Any.fromFunction2(value))
    
    @scala.inline
    def setOtherwise(value: js.Any => js.Any): Self = StObject.set(x, "otherwise", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSpread(value: js.Any => js.Any): Self = StObject.set(x, "spread", js.Any.fromFunction1(value))
    
    @scala.inline
    def setThen(value: js.Any => js.Any): Self = StObject.set(x, "then", js.Any.fromFunction1(value))
    
    @scala.inline
    def setYield(value: js.Any => js.Any): Self = StObject.set(x, "yield", js.Any.fromFunction1(value))
  }
}
