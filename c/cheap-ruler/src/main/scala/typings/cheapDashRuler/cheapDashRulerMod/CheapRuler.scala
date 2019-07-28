package typings.cheapDashRuler.cheapDashRulerMod

import typings.cheapDashRuler.Anon_Index
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cheap-ruler", "CheapRuler")
@js.native
class CheapRuler () extends js.Object {
  def along(line: Line, dist: Double): Point = js.native
  def area(polygon: Polygon): Double = js.native
  def bearing(a: Point, b: Point): Double = js.native
  def bufferBBox(bbox: BBox, buffer: Double): BBox = js.native
  def bufferPoint(p: Point, buffer: Double): BBox = js.native
  def destination(p: Point, dist: Double, bearing: Double): Point = js.native
  def distance(a: Point, b: Point): Double = js.native
  def insideBBox(p: Point, bbox: BBox): Boolean = js.native
  def lineDistance(points: Points): Double = js.native
  def lineSlice(start: Point, stop: Point, line: Line): Line = js.native
  def lineSliceAlong(start: Double, stop: Double, line: Line): Line = js.native
  def offset(p: Point, dx: Double, dy: Double): Point = js.native
  def pointOnLine(line: Line, p: Point): Anon_Index = js.native
}

