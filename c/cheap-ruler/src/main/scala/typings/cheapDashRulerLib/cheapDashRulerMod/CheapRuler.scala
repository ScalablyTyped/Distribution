package typings
package cheapDashRulerLib.cheapDashRulerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cheap-ruler", "CheapRuler")
@js.native
class CheapRuler () extends js.Object {
  def along(line: Line, dist: scala.Double): Point = js.native
  def area(polygon: Polygon): scala.Double = js.native
  def bearing(a: Point, b: Point): scala.Double = js.native
  def bufferBBox(bbox: BBox, buffer: scala.Double): BBox = js.native
  def bufferPoint(p: Point, buffer: scala.Double): BBox = js.native
  def destination(p: Point, dist: scala.Double, bearing: scala.Double): Point = js.native
  def distance(a: Point, b: Point): scala.Double = js.native
  def insideBBox(p: Point, bbox: BBox): scala.Boolean = js.native
  def lineDistance(points: Points): scala.Double = js.native
  def lineSlice(start: Point, stop: Point, line: Line): Line = js.native
  def lineSliceAlong(start: scala.Double, stop: scala.Double, line: Line): Line = js.native
  def offset(p: Point, dx: scala.Double, dy: scala.Double): Point = js.native
  def pointOnLine(line: Line, p: Point): cheapDashRulerLib.Anon_Index = js.native
}

