package typings.chartJs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AngleLinescolor extends StObject {
  
  @JSName("angleLines.color")
  var angleLinesDotcolor: String
  
  @JSName("pointLabels.color")
  var pointLabelsDotcolor: String
  
  @JSName("ticks.color")
  var ticksDotcolor: String
}
object AngleLinescolor {
  
  inline def apply(angleLinesDotcolor: String, pointLabelsDotcolor: String, ticksDotcolor: String): AngleLinescolor = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("angleLines.color")(angleLinesDotcolor.asInstanceOf[js.Any])
    __obj.updateDynamic("pointLabels.color")(pointLabelsDotcolor.asInstanceOf[js.Any])
    __obj.updateDynamic("ticks.color")(ticksDotcolor.asInstanceOf[js.Any])
    __obj.asInstanceOf[AngleLinescolor]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AngleLinescolor] (val x: Self) extends AnyVal {
    
    inline def setAngleLinesDotcolor(value: String): Self = StObject.set(x, "angleLines.color", value.asInstanceOf[js.Any])
    
    inline def setPointLabelsDotcolor(value: String): Self = StObject.set(x, "pointLabels.color", value.asInstanceOf[js.Any])
    
    inline def setTicksDotcolor(value: String): Self = StObject.set(x, "ticks.color", value.asInstanceOf[js.Any])
  }
}
