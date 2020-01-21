package typings.cheapRuler

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cheap-ruler", JSImport.Namespace)
@js.native
object mod extends js.Object {
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
    def pointOnLine(line: Line, p: Point): AnonIndex = js.native
  }
  
  def apply(lat: Double): CheapRuler = js.native
  def apply(lat: Double, units: String): CheapRuler = js.native
  def fromTile(y: Double, z: Double): CheapRuler = js.native
  def fromTile(y: Double, z: Double, units: String): CheapRuler = js.native
  @js.native
  object units extends js.Object {
    var feet: Double = js.native
    var inches: Double = js.native
    var kilometers: Double = js.native
    var meters: Double = js.native
    var metres: Double = js.native
    var miles: Double = js.native
    var nauticalmiles: Double = js.native
    var yards: Double = js.native
  }
  
  type BBox = js.Tuple4[Double, Double, Double, Double]
  type Line = js.Array[Point]
  type Point = js.Tuple2[Double, Double]
  type Points = js.Array[Point]
  type Polygon = js.Array[js.Array[Point]]
}

