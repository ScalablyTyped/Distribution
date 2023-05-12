package typings.chartJs

import typings.chartJs.anon.Source
import typings.chartJs.anon.Start
import typings.chartJs.anon.Target
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distPluginsPluginDotfillerFillerDotsegmentMod {
  
  @JSImport("chart.js/dist/plugins/plugin.filler/filler.segment", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def findSegmentEnd(start: Any, end: Any, points: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("_findSegmentEnd")(start.asInstanceOf[js.Any], end.asInstanceOf[js.Any], points.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def getBounds(property: Any, first: Any, last: Any, loop: Any): Start = (^.asInstanceOf[js.Dynamic].applyDynamic("_getBounds")(property.asInstanceOf[js.Any], first.asInstanceOf[js.Any], last.asInstanceOf[js.Any], loop.asInstanceOf[js.Any])).asInstanceOf[Start]
  
  inline def pointsFromSegments(boundary: Any, line: Any): js.Array[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("_pointsFromSegments")(boundary.asInstanceOf[js.Any], line.asInstanceOf[js.Any])).asInstanceOf[js.Array[Any]]
  
  inline def segments(line: Any, target: Any, property: Any): js.Array[Source | Target] = (^.asInstanceOf[js.Dynamic].applyDynamic("_segments")(line.asInstanceOf[js.Any], target.asInstanceOf[js.Any], property.asInstanceOf[js.Any])).asInstanceOf[js.Array[Source | Target]]
}
