package typings.chartJs.mod

import typings.chartJs.distChunksHelpersDotcoreMod.Point1
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ArcProps
  extends StObject
     with Point1 {
  
  var circumference: Double
  
  var endAngle: Double
  
  var innerRadius: Double
  
  var outerRadius: Double
  
  var startAngle: Double
}
object ArcProps {
  
  inline def apply(
    circumference: Double,
    endAngle: Double,
    innerRadius: Double,
    outerRadius: Double,
    startAngle: Double,
    x: Double,
    y: Double
  ): ArcProps = {
    val __obj = js.Dynamic.literal(circumference = circumference.asInstanceOf[js.Any], endAngle = endAngle.asInstanceOf[js.Any], innerRadius = innerRadius.asInstanceOf[js.Any], outerRadius = outerRadius.asInstanceOf[js.Any], startAngle = startAngle.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArcProps]
  }
  
  extension [Self <: ArcProps](x: Self) {
    
    inline def setCircumference(value: Double): Self = StObject.set(x, "circumference", value.asInstanceOf[js.Any])
    
    inline def setEndAngle(value: Double): Self = StObject.set(x, "endAngle", value.asInstanceOf[js.Any])
    
    inline def setInnerRadius(value: Double): Self = StObject.set(x, "innerRadius", value.asInstanceOf[js.Any])
    
    inline def setOuterRadius(value: Double): Self = StObject.set(x, "outerRadius", value.asInstanceOf[js.Any])
    
    inline def setStartAngle(value: Double): Self = StObject.set(x, "startAngle", value.asInstanceOf[js.Any])
  }
}
