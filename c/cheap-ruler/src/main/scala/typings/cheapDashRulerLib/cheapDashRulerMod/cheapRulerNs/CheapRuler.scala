package typings
package cheapDashRulerLib.cheapDashRulerMod.cheapRulerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CheapRuler extends js.Object {
  def along(line: Line, dist: scala.Double): Point
  def area(polygon: Polygon): scala.Double
  def bearing(a: Point, b: Point): scala.Double
  def bufferBBox(bbox: BBox, buffer: scala.Double): BBox
  def bufferPoint(p: Point, buffer: scala.Double): BBox
  def destination(p: Point, dist: scala.Double, bearing: scala.Double): Point
  def distance(a: Point, b: Point): scala.Double
  def insideBBox(p: Point, bbox: BBox): scala.Boolean
  def lineDistance(points: Points): scala.Double
  def lineSlice(start: Point, stop: Point, line: Line): Line
  def lineSliceAlong(start: scala.Double, stop: scala.Double, line: Line): Line
  def offset(p: Point, dx: scala.Double, dy: scala.Double): Point
  def pointOnLine(line: Line, p: Point): cheapDashRulerLib.Anon_Index
}

object CheapRuler {
  @scala.inline
  def apply(
    along: (Line, scala.Double) => Point,
    area: Polygon => scala.Double,
    bearing: (Point, Point) => scala.Double,
    bufferBBox: (BBox, scala.Double) => BBox,
    bufferPoint: (Point, scala.Double) => BBox,
    destination: (Point, scala.Double, scala.Double) => Point,
    distance: (Point, Point) => scala.Double,
    insideBBox: (Point, BBox) => scala.Boolean,
    lineDistance: Points => scala.Double,
    lineSlice: (Point, Point, Line) => Line,
    lineSliceAlong: (scala.Double, scala.Double, Line) => Line,
    offset: (Point, scala.Double, scala.Double) => Point,
    pointOnLine: (Line, Point) => cheapDashRulerLib.Anon_Index
  ): CheapRuler = {
    val __obj = js.Dynamic.literal(along = js.Any.fromFunction2(along), area = js.Any.fromFunction1(area), bearing = js.Any.fromFunction2(bearing), bufferBBox = js.Any.fromFunction2(bufferBBox), bufferPoint = js.Any.fromFunction2(bufferPoint), destination = js.Any.fromFunction3(destination), distance = js.Any.fromFunction2(distance), insideBBox = js.Any.fromFunction2(insideBBox), lineDistance = js.Any.fromFunction1(lineDistance), lineSlice = js.Any.fromFunction3(lineSlice), lineSliceAlong = js.Any.fromFunction3(lineSliceAlong), offset = js.Any.fromFunction3(offset), pointOnLine = js.Any.fromFunction2(pointOnLine))
  
    __obj.asInstanceOf[CheapRuler]
  }
}

