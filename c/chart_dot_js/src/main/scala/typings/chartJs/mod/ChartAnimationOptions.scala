package typings.chartJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChartAnimationOptions extends StObject {
  
  var animateRotate: js.UndefOr[Boolean] = js.undefined
  
  var animateScale: js.UndefOr[Boolean] = js.undefined
  
  var duration: js.UndefOr[Double] = js.undefined
  
  var easing: js.UndefOr[Easing] = js.undefined
  
  var onComplete: js.UndefOr[js.Function1[/* chart */ js.Any, Unit]] = js.undefined
  
  var onProgress: js.UndefOr[js.Function1[/* chart */ js.Any, Unit]] = js.undefined
}
object ChartAnimationOptions {
  
  inline def apply(): ChartAnimationOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChartAnimationOptions]
  }
  
  extension [Self <: ChartAnimationOptions](x: Self) {
    
    inline def setAnimateRotate(value: Boolean): Self = StObject.set(x, "animateRotate", value.asInstanceOf[js.Any])
    
    inline def setAnimateRotateUndefined: Self = StObject.set(x, "animateRotate", js.undefined)
    
    inline def setAnimateScale(value: Boolean): Self = StObject.set(x, "animateScale", value.asInstanceOf[js.Any])
    
    inline def setAnimateScaleUndefined: Self = StObject.set(x, "animateScale", js.undefined)
    
    inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    inline def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
    
    inline def setEasing(value: Easing): Self = StObject.set(x, "easing", value.asInstanceOf[js.Any])
    
    inline def setEasingUndefined: Self = StObject.set(x, "easing", js.undefined)
    
    inline def setOnComplete(value: /* chart */ js.Any => Unit): Self = StObject.set(x, "onComplete", js.Any.fromFunction1(value))
    
    inline def setOnCompleteUndefined: Self = StObject.set(x, "onComplete", js.undefined)
    
    inline def setOnProgress(value: /* chart */ js.Any => Unit): Self = StObject.set(x, "onProgress", js.Any.fromFunction1(value))
    
    inline def setOnProgressUndefined: Self = StObject.set(x, "onProgress", js.undefined)
  }
}
