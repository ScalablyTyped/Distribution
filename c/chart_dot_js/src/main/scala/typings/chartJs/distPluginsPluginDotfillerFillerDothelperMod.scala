package typings.chartJs

import typings.chartJs.anon.X
import typings.chartJs.distCoreCoreDotcontrollerMod.default
import typings.chartJs.distElementsMod.LineElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distPluginsPluginDotfillerFillerDothelperMod {
  
  @JSImport("chart.js/dist/plugins/plugin.filler/filler.helper", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createBoundaryLine(boundary: js.Array[PointElement], line: LineElement): LineElement | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("_createBoundaryLine")(boundary.asInstanceOf[js.Any], line.asInstanceOf[js.Any])).asInstanceOf[LineElement | Null]
  inline def createBoundaryLine(boundary: X, line: LineElement): LineElement | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("_createBoundaryLine")(boundary.asInstanceOf[js.Any], line.asInstanceOf[js.Any])).asInstanceOf[LineElement | Null]
  
  inline def shouldApplyFill(source: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("_shouldApplyFill")(source.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  type Chart = default
  
  type PointElement = typings.chartJs.distElementsElementDotpointMod.default
  
  type Scale = typings.chartJs.distCoreCoreDotscaleMod.default
}
