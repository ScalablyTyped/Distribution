package typings.chartJs.distChunksHelpersDotcoreMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Tooltip
  extends StObject
     with Plugin[ChartType, AnyObject] {
  
  val positioners: TooltipPositionerMap
}
object Tooltip {
  
  inline def apply(id: String, positioners: TooltipPositionerMap): Tooltip = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], positioners = positioners.asInstanceOf[js.Any])
    __obj.asInstanceOf[Tooltip]
  }
  
  extension [Self <: Tooltip](x: Self) {
    
    inline def setPositioners(value: TooltipPositionerMap): Self = StObject.set(x, "positioners", value.asInstanceOf[js.Any])
  }
}
