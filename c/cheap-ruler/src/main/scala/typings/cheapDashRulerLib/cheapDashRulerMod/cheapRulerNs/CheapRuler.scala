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
    along: js.Function2[Line, scala.Double, Point],
    area: js.Function1[Polygon, scala.Double],
    bearing: js.Function2[Point, Point, scala.Double],
    bufferBBox: js.Function2[BBox, scala.Double, BBox],
    bufferPoint: js.Function2[Point, scala.Double, BBox],
    destination: js.Function3[Point, scala.Double, scala.Double, Point],
    distance: js.Function2[Point, Point, scala.Double],
    insideBBox: js.Function2[Point, BBox, scala.Boolean],
    lineDistance: js.Function1[Points, scala.Double],
    lineSlice: js.Function3[Point, Point, Line, Line],
    lineSliceAlong: js.Function3[scala.Double, scala.Double, Line, Line],
    offset: js.Function3[Point, scala.Double, scala.Double, Point],
    pointOnLine: js.Function2[Line, Point, cheapDashRulerLib.Anon_Index]
  ): CheapRuler = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("along")(along)
    __obj.updateDynamic("area")(area)
    __obj.updateDynamic("bearing")(bearing)
    __obj.updateDynamic("bufferBBox")(bufferBBox)
    __obj.updateDynamic("bufferPoint")(bufferPoint)
    __obj.updateDynamic("destination")(destination)
    __obj.updateDynamic("distance")(distance)
    __obj.updateDynamic("insideBBox")(insideBBox)
    __obj.updateDynamic("lineDistance")(lineDistance)
    __obj.updateDynamic("lineSlice")(lineSlice)
    __obj.updateDynamic("lineSliceAlong")(lineSliceAlong)
    __obj.updateDynamic("offset")(offset)
    __obj.updateDynamic("pointOnLine")(pointOnLine)
    __obj.asInstanceOf[CheapRuler]
  }
}

