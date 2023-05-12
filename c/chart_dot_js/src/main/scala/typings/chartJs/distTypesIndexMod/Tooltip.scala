package typings.chartJs.distTypesIndexMod

import typings.chartJs.distTypesBasicMod.AnyObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Tooltip
  extends StObject
     with Plugin[ChartType, AnyObject] {
  
  val positioners: TooltipPositionerMap
}
object Tooltip {
  
  @JSImport("chart.js/dist/types/index", "Tooltip")
  @js.native
  val ^ : Tooltip = js.native
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Tooltip] (val x: Self) extends AnyVal {
    
    inline def setPositioners(value: TooltipPositionerMap): Self = StObject.set(x, "positioners", value.asInstanceOf[js.Any])
  }
}
