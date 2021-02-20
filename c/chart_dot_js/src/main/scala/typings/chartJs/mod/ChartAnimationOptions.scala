package typings.chartJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChartAnimationOptions extends StObject {
  
  var animateRotate: js.UndefOr[Boolean] = js.native
  
  var animateScale: js.UndefOr[Boolean] = js.native
  
  var duration: js.UndefOr[Double] = js.native
  
  var easing: js.UndefOr[Easing] = js.native
  
  var onComplete: js.UndefOr[js.Function1[/* chart */ js.Any, Unit]] = js.native
  
  var onProgress: js.UndefOr[js.Function1[/* chart */ js.Any, Unit]] = js.native
}
object ChartAnimationOptions {
  
  @scala.inline
  def apply(): ChartAnimationOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChartAnimationOptions]
  }
  
  @scala.inline
  implicit class ChartAnimationOptionsMutableBuilder[Self <: ChartAnimationOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAnimateRotate(value: Boolean): Self = StObject.set(x, "animateRotate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnimateRotateUndefined: Self = StObject.set(x, "animateRotate", js.undefined)
    
    @scala.inline
    def setAnimateScale(value: Boolean): Self = StObject.set(x, "animateScale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnimateScaleUndefined: Self = StObject.set(x, "animateScale", js.undefined)
    
    @scala.inline
    def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
    
    @scala.inline
    def setEasing(value: Easing): Self = StObject.set(x, "easing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEasingUndefined: Self = StObject.set(x, "easing", js.undefined)
    
    @scala.inline
    def setOnComplete(value: /* chart */ js.Any => Unit): Self = StObject.set(x, "onComplete", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnCompleteUndefined: Self = StObject.set(x, "onComplete", js.undefined)
    
    @scala.inline
    def setOnProgress(value: /* chart */ js.Any => Unit): Self = StObject.set(x, "onProgress", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnProgressUndefined: Self = StObject.set(x, "onProgress", js.undefined)
  }
}
