package typings.circleToPolygon

import typings.geojson.mod.Polygon
import typings.geojson.mod.Position
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(center: Position, radius: Double): Polygon = (^.asInstanceOf[js.Dynamic].apply(center.asInstanceOf[js.Any], radius.asInstanceOf[js.Any])).asInstanceOf[Polygon]
  inline def apply(center: Position, radius: Double, numberOfSegments: Double): Polygon = (^.asInstanceOf[js.Dynamic].apply(center.asInstanceOf[js.Any], radius.asInstanceOf[js.Any], numberOfSegments.asInstanceOf[js.Any])).asInstanceOf[Polygon]
  
  @JSImport("circle-to-polygon", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
