package typings
package cheapDashRulerLib.cheapDashRulerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cheap-ruler", "CheapRuler")
@js.native
class CheapRuler ()
  extends cheapDashRulerLib.cheapDashRulerMod.cheapRulerNs.CheapRuler {
  /* CompleteClass */
  override def along(line: cheapDashRulerLib.cheapDashRulerMod.cheapRulerNs.Line, dist: scala.Double): cheapDashRulerLib.cheapDashRulerMod.cheapRulerNs.Point = js.native
  /* CompleteClass */
  override def area(polygon: cheapDashRulerLib.cheapDashRulerMod.cheapRulerNs.Polygon): scala.Double = js.native
  /* CompleteClass */
  override def bearing(
    a: cheapDashRulerLib.cheapDashRulerMod.cheapRulerNs.Point,
    b: cheapDashRulerLib.cheapDashRulerMod.cheapRulerNs.Point
  ): scala.Double = js.native
  /* CompleteClass */
  override def bufferBBox(bbox: cheapDashRulerLib.cheapDashRulerMod.cheapRulerNs.BBox, buffer: scala.Double): cheapDashRulerLib.cheapDashRulerMod.cheapRulerNs.BBox = js.native
  /* CompleteClass */
  override def bufferPoint(p: cheapDashRulerLib.cheapDashRulerMod.cheapRulerNs.Point, buffer: scala.Double): cheapDashRulerLib.cheapDashRulerMod.cheapRulerNs.BBox = js.native
  /* CompleteClass */
  override def destination(
    p: cheapDashRulerLib.cheapDashRulerMod.cheapRulerNs.Point,
    dist: scala.Double,
    bearing: scala.Double
  ): cheapDashRulerLib.cheapDashRulerMod.cheapRulerNs.Point = js.native
  /* CompleteClass */
  override def distance(
    a: cheapDashRulerLib.cheapDashRulerMod.cheapRulerNs.Point,
    b: cheapDashRulerLib.cheapDashRulerMod.cheapRulerNs.Point
  ): scala.Double = js.native
  /* CompleteClass */
  override def insideBBox(
    p: cheapDashRulerLib.cheapDashRulerMod.cheapRulerNs.Point,
    bbox: cheapDashRulerLib.cheapDashRulerMod.cheapRulerNs.BBox
  ): scala.Boolean = js.native
  /* CompleteClass */
  override def lineDistance(points: cheapDashRulerLib.cheapDashRulerMod.cheapRulerNs.Points): scala.Double = js.native
  /* CompleteClass */
  override def lineSlice(
    start: cheapDashRulerLib.cheapDashRulerMod.cheapRulerNs.Point,
    stop: cheapDashRulerLib.cheapDashRulerMod.cheapRulerNs.Point,
    line: cheapDashRulerLib.cheapDashRulerMod.cheapRulerNs.Line
  ): cheapDashRulerLib.cheapDashRulerMod.cheapRulerNs.Line = js.native
  /* CompleteClass */
  override def lineSliceAlong(
    start: scala.Double,
    stop: scala.Double,
    line: cheapDashRulerLib.cheapDashRulerMod.cheapRulerNs.Line
  ): cheapDashRulerLib.cheapDashRulerMod.cheapRulerNs.Line = js.native
  /* CompleteClass */
  override def offset(p: cheapDashRulerLib.cheapDashRulerMod.cheapRulerNs.Point, dx: scala.Double, dy: scala.Double): cheapDashRulerLib.cheapDashRulerMod.cheapRulerNs.Point = js.native
  /* CompleteClass */
  override def pointOnLine(
    line: cheapDashRulerLib.cheapDashRulerMod.cheapRulerNs.Line,
    p: cheapDashRulerLib.cheapDashRulerMod.cheapRulerNs.Point
  ): cheapDashRulerLib.Anon_T = js.native
}

