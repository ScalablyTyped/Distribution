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
  def pointOnLine(line: Line, p: Point): cheapDashRulerLib.Anon_T
}

