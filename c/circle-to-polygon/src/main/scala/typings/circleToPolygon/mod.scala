package typings.circleToPolygon

import typings.geojson.mod.Polygon
import typings.geojson.mod.Position
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("circle-to-polygon", JSImport.Namespace)
@js.native
object mod extends js.Object {
  def apply(center: Position, radius: Double): Polygon = js.native
  def apply(center: Position, radius: Double, numberOfSegments: Double): Polygon = js.native
}

