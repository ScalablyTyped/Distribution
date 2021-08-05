package typings.chartJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* static member */
object scaleService {
  
  @JSImport("chart.js", "scaleService")
  @js.native
  val ^ : js.Any = js.native
  
  inline def updateScaleDefaults(`type`: ScaleType, updates: ChartScales): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("updateScaleDefaults")(`type`.asInstanceOf[js.Any], updates.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
