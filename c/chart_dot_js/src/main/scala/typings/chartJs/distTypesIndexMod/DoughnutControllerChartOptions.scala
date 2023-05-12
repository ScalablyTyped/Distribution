package typings.chartJs.distTypesIndexMod

import typings.chartJs.chartJsBooleans.`false`
import typings.chartJs.chartJsStrings.doughnut
import typings.chartJs.distTypesBasicMod.AnyObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DoughnutControllerChartOptions extends StObject {
  
  var animation: `false` | DoughnutAnimationOptions
  
  /**
    * Sweep to allow arcs to cover.
    * @default 360
    */
  var circumference: Double
  
  /**
    * The portion of the chart that is cut out of the middle. ('50%' - for doughnut, 0 - for pie)
    * String ending with '%' means percentage, number means pixels.
    * @default 50
    */
  var cutout: Scriptable[Double | String, ScriptableContext[doughnut]]
  
  /**
    * Arc offset (in pixels).
    */
  var offset: Double | js.Array[Double]
  
  /**
    * The outer radius of the chart. String ending with '%' means percentage of maximum radius, number means pixels.
    * @default '100%'
    */
  var radius: Scriptable[Double | String, ScriptableContext[doughnut]]
  
  /**
    * Starting angle to draw arcs from.
    * @default 0
    */
  var rotation: Double
  
  /**
    * Spacing between the arcs
    * @default 0
    */
  var spacing: Double
}
object DoughnutControllerChartOptions {
  
  inline def apply(
    animation: `false` | DoughnutAnimationOptions,
    circumference: Double,
    cutout: Scriptable[Double | String, ScriptableContext[doughnut]],
    offset: Double | js.Array[Double],
    radius: Scriptable[Double | String, ScriptableContext[doughnut]],
    rotation: Double,
    spacing: Double
  ): DoughnutControllerChartOptions = {
    val __obj = js.Dynamic.literal(animation = animation.asInstanceOf[js.Any], circumference = circumference.asInstanceOf[js.Any], cutout = cutout.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any], radius = radius.asInstanceOf[js.Any], rotation = rotation.asInstanceOf[js.Any], spacing = spacing.asInstanceOf[js.Any])
    __obj.asInstanceOf[DoughnutControllerChartOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DoughnutControllerChartOptions] (val x: Self) extends AnyVal {
    
    inline def setAnimation(value: `false` | DoughnutAnimationOptions): Self = StObject.set(x, "animation", value.asInstanceOf[js.Any])
    
    inline def setCircumference(value: Double): Self = StObject.set(x, "circumference", value.asInstanceOf[js.Any])
    
    inline def setCutout(value: Scriptable[Double | String, ScriptableContext[doughnut]]): Self = StObject.set(x, "cutout", value.asInstanceOf[js.Any])
    
    inline def setCutoutFunction2(value: (ScriptableContext[doughnut], /* options */ AnyObject) => js.UndefOr[Double | String]): Self = StObject.set(x, "cutout", js.Any.fromFunction2(value))
    
    inline def setOffset(value: Double | js.Array[Double]): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    inline def setOffsetVarargs(value: Double*): Self = StObject.set(x, "offset", js.Array(value*))
    
    inline def setRadius(value: Scriptable[Double | String, ScriptableContext[doughnut]]): Self = StObject.set(x, "radius", value.asInstanceOf[js.Any])
    
    inline def setRadiusFunction2(value: (ScriptableContext[doughnut], /* options */ AnyObject) => js.UndefOr[Double | String]): Self = StObject.set(x, "radius", js.Any.fromFunction2(value))
    
    inline def setRotation(value: Double): Self = StObject.set(x, "rotation", value.asInstanceOf[js.Any])
    
    inline def setSpacing(value: Double): Self = StObject.set(x, "spacing", value.asInstanceOf[js.Any])
  }
}
