package typings.cheapRuler.mod

import typings.cheapRuler.anon.Index
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CheapRuler extends js.Object {
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
  def pointOnLine(line: Line, p: Point): Index = js.native
}

object CheapRuler {
  @scala.inline
  def apply(
    along: (Line, Double) => Point,
    area: Polygon => Double,
    bearing: (Point, Point) => Double,
    bufferBBox: (BBox, Double) => BBox,
    bufferPoint: (Point, Double) => BBox,
    destination: (Point, Double, Double) => Point,
    distance: (Point, Point) => Double,
    insideBBox: (Point, BBox) => Boolean,
    lineDistance: Points => Double,
    lineSlice: (Point, Point, Line) => Line,
    lineSliceAlong: (Double, Double, Line) => Line,
    offset: (Point, Double, Double) => Point,
    pointOnLine: (Line, Point) => Index
  ): CheapRuler = {
    val __obj = js.Dynamic.literal(along = js.Any.fromFunction2(along), area = js.Any.fromFunction1(area), bearing = js.Any.fromFunction2(bearing), bufferBBox = js.Any.fromFunction2(bufferBBox), bufferPoint = js.Any.fromFunction2(bufferPoint), destination = js.Any.fromFunction3(destination), distance = js.Any.fromFunction2(distance), insideBBox = js.Any.fromFunction2(insideBBox), lineDistance = js.Any.fromFunction1(lineDistance), lineSlice = js.Any.fromFunction3(lineSlice), lineSliceAlong = js.Any.fromFunction3(lineSliceAlong), offset = js.Any.fromFunction3(offset), pointOnLine = js.Any.fromFunction2(pointOnLine))
    __obj.asInstanceOf[CheapRuler]
  }
  @scala.inline
  implicit class CheapRulerOps[Self <: CheapRuler] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAlong(value: (Line, Double) => Point): Self = this.set("along", js.Any.fromFunction2(value))
    @scala.inline
    def setArea(value: Polygon => Double): Self = this.set("area", js.Any.fromFunction1(value))
    @scala.inline
    def setBearing(value: (Point, Point) => Double): Self = this.set("bearing", js.Any.fromFunction2(value))
    @scala.inline
    def setBufferBBox(value: (BBox, Double) => BBox): Self = this.set("bufferBBox", js.Any.fromFunction2(value))
    @scala.inline
    def setBufferPoint(value: (Point, Double) => BBox): Self = this.set("bufferPoint", js.Any.fromFunction2(value))
    @scala.inline
    def setDestination(value: (Point, Double, Double) => Point): Self = this.set("destination", js.Any.fromFunction3(value))
    @scala.inline
    def setDistance(value: (Point, Point) => Double): Self = this.set("distance", js.Any.fromFunction2(value))
    @scala.inline
    def setInsideBBox(value: (Point, BBox) => Boolean): Self = this.set("insideBBox", js.Any.fromFunction2(value))
    @scala.inline
    def setLineDistance(value: Points => Double): Self = this.set("lineDistance", js.Any.fromFunction1(value))
    @scala.inline
    def setLineSlice(value: (Point, Point, Line) => Line): Self = this.set("lineSlice", js.Any.fromFunction3(value))
    @scala.inline
    def setLineSliceAlong(value: (Double, Double, Line) => Line): Self = this.set("lineSliceAlong", js.Any.fromFunction3(value))
    @scala.inline
    def setOffset(value: (Point, Double, Double) => Point): Self = this.set("offset", js.Any.fromFunction3(value))
    @scala.inline
    def setPointOnLine(value: (Line, Point) => Index): Self = this.set("pointOnLine", js.Any.fromFunction2(value))
  }
  
}

