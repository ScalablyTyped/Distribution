package typings.chartist.coreTypesMod

import typings.chartist.chartistStrings.gridBackground
import typings.chartist.svgMod.Svg
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GridBackgroundDrawEvent
  extends StObject
     with AxesDrawEvent {
  
  var element: Svg
  
  var group: Svg
  
  var `type`: gridBackground
}
object GridBackgroundDrawEvent {
  
  inline def apply(element: Svg, group: Svg): GridBackgroundDrawEvent = {
    val __obj = js.Dynamic.literal(element = element.asInstanceOf[js.Any], group = group.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("gridBackground")
    __obj.asInstanceOf[GridBackgroundDrawEvent]
  }
  
  extension [Self <: GridBackgroundDrawEvent](x: Self) {
    
    inline def setElement(value: Svg): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
    
    inline def setGroup(value: Svg): Self = StObject.set(x, "group", value.asInstanceOf[js.Any])
    
    inline def setType(value: gridBackground): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
