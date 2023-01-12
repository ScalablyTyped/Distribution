package typings.chartJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DoughnutAnimationOptions extends StObject {
  
  /**
    *   If true, the chart will animate in with a rotation animation. This property is in the options.animation object.
    * @default true
    */
  var animateRotate: Boolean
  
  /**
    * If true, will animate scaling the chart from the center outwards.
    * @default false
    */
  var animateScale: Boolean
}
object DoughnutAnimationOptions {
  
  inline def apply(animateRotate: Boolean, animateScale: Boolean): DoughnutAnimationOptions = {
    val __obj = js.Dynamic.literal(animateRotate = animateRotate.asInstanceOf[js.Any], animateScale = animateScale.asInstanceOf[js.Any])
    __obj.asInstanceOf[DoughnutAnimationOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DoughnutAnimationOptions] (val x: Self) extends AnyVal {
    
    inline def setAnimateRotate(value: Boolean): Self = StObject.set(x, "animateRotate", value.asInstanceOf[js.Any])
    
    inline def setAnimateScale(value: Boolean): Self = StObject.set(x, "animateScale", value.asInstanceOf[js.Any])
  }
}
