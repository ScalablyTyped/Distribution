package typings.chartJs.mod

import typings.chartJs.chartJsBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PolarAreaControllerChartOptions extends StObject {
  
  var animation: `false` | PolarAreaAnimationOptions
  
  /**
    * Starting angle to draw arcs for the first item in a dataset. In degrees, 0 is at top.
    * @default 0
    */
  var startAngle: Double
}
object PolarAreaControllerChartOptions {
  
  inline def apply(animation: `false` | PolarAreaAnimationOptions, startAngle: Double): PolarAreaControllerChartOptions = {
    val __obj = js.Dynamic.literal(animation = animation.asInstanceOf[js.Any], startAngle = startAngle.asInstanceOf[js.Any])
    __obj.asInstanceOf[PolarAreaControllerChartOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PolarAreaControllerChartOptions] (val x: Self) extends AnyVal {
    
    inline def setAnimation(value: `false` | PolarAreaAnimationOptions): Self = StObject.set(x, "animation", value.asInstanceOf[js.Any])
    
    inline def setStartAngle(value: Double): Self = StObject.set(x, "startAngle", value.asInstanceOf[js.Any])
  }
}
