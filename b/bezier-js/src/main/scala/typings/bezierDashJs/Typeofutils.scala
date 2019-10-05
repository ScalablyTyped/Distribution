package typings.bezierDashJs

import typings.bezierDashJs.BezierJs.Arc
import typings.bezierDashJs.BezierJs.BBox
import typings.bezierDashJs.BezierJs.Bezier
import typings.bezierDashJs.BezierJs.Closest
import typings.bezierDashJs.BezierJs.Line
import typings.bezierDashJs.BezierJs.MinMax
import typings.bezierDashJs.BezierJs.Offset
import typings.bezierDashJs.BezierJs.Point
import typings.bezierDashJs.BezierJs.Shape
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Typeofutils extends js.Object {
  var Cvalues: js.Array[Double] = js.native
  var Tvalues: js.Array[Double] = js.native
  def abcratio(t: Double, n: Double): Double = js.native
  def align(points: js.Array[Point], line: Line): js.Array[Point] = js.native
  def angle(o: Point, v1: Point, v2: Point): Double = js.native
  def approximately(a: Double, b: Double): Boolean = js.native
  def approximately(a: Double, b: Double, precision: Double): Boolean = js.native
  def arcfn(t: Double, derivativeFn: js.Function): Double = js.native
  def bboxoverlap(b1: BBox, b2: BBox): Boolean = js.native
  def between(v: Double, m: Double, M: Double): Boolean = js.native
  def closest(LUT: js.Array[Point], point: Point): Closest = js.native
  def copy(obj: js.Object): js.Any = js.native
  def dist(p1: Point, p2: Point): Double = js.native
  def droots(p: js.Array[Double]): js.Array[Double] = js.native
  def expandbox(bbox: BBox, _bbox: BBox): Unit = js.native
  def findbbox(sections: js.Array[Bezier]): BBox = js.native
  def getccenter(p1: Point, p2: Point, p3: Point): Arc = js.native
  def getminmax(curve: Bezier, d: String, list: js.Array[Double]): MinMax = js.native
  def inflections(points: js.Array[Point]): js.Array[Double] = js.native
  def length(derivativeFn: js.Function): Double = js.native
  def lerp(r: Double, v1: Point, v2: Point): Point = js.native
  def lli(v1: Offset, v2: Offset): Point = js.native
  def lli4(p1: Point, p2: Point, p3: Point, p4: Point): Point = js.native
  def lli8(x1: Double, y1: Double, x2: Double, y2: Double, x3: Double, y3: Double, x4: Double, y4: Double): Point = js.native
  def makeline(p1: Point, p2: Point): Bezier = js.native
  def makeshape(forward: Bezier, back: Bezier): Shape = js.native
  def makeshape(forward: Bezier, back: Bezier, curveIntersectionThreshold: Double): Shape = js.native
  def map(v: Double, ds: Double, de: Double, ts: Double, te: Double): Double = js.native
  def pairiteration(c1: Bezier, c2: Bezier): js.Array[String] = js.native
  def pairiteration(c1: Bezier, c2: Bezier, curveIntersectionThreshold: Double): js.Array[String] = js.native
  def pointToString(p: Point): String = js.native
  def pointsToString(points: js.Array[Point]): String = js.native
  def projectionratio(t: Double, n: Double): Double = js.native
  def roots(points: js.Array[Point], line: Line): js.Array[Double] = js.native
  def round(v: Double, d: Double): Double = js.native
  def shapeintersections(s1: Shape, bbox1: BBox, s2: Shape, bbox2: BBox): js.Array[js.Array[Double | String]] = js.native
  def shapeintersections(s1: Shape, bbox1: BBox, s2: Shape, bbox2: BBox, curveIntersectionThreshold: Double): js.Array[js.Array[Double | String]] = js.native
}

