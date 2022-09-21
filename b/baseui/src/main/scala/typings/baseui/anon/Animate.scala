package typings.baseui.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Animate extends StObject {
  
  @JSName("$animate")
  var $animate: js.UndefOr[Boolean] = js.undefined
  
  @JSName("$distance")
  var $distance: js.UndefOr[Double] = js.undefined
  
  @JSName("$length")
  var $length: js.UndefOr[Double] = js.undefined
  
  @JSName("$orientation")
  var $orientation: js.UndefOr[typings.baseui.tabsMotionTypesMod.Orientation] = js.undefined
}
object Animate {
  
  inline def apply(): Animate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Animate]
  }
  
  extension [Self <: Animate](x: Self) {
    
    inline def set$animate(value: Boolean): Self = StObject.set(x, "$animate", value.asInstanceOf[js.Any])
    
    inline def set$animateUndefined: Self = StObject.set(x, "$animate", js.undefined)
    
    inline def set$distance(value: Double): Self = StObject.set(x, "$distance", value.asInstanceOf[js.Any])
    
    inline def set$distanceUndefined: Self = StObject.set(x, "$distance", js.undefined)
    
    inline def set$length(value: Double): Self = StObject.set(x, "$length", value.asInstanceOf[js.Any])
    
    inline def set$lengthUndefined: Self = StObject.set(x, "$length", js.undefined)
    
    inline def set$orientation(value: typings.baseui.tabsMotionTypesMod.Orientation): Self = StObject.set(x, "$orientation", value.asInstanceOf[js.Any])
    
    inline def set$orientationUndefined: Self = StObject.set(x, "$orientation", js.undefined)
  }
}
