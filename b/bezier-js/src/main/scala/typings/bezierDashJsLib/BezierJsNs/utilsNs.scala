package typings
package bezierDashJsLib.BezierJsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("BezierJs.utils")
@js.native
object utilsNs extends js.Object {
  var Cvalues: js.Array[scala.Double] = js.native
  var Tvalues: js.Array[scala.Double] = js.native
  def abcratio(t: scala.Double, n: scala.Double): scala.Double = js.native
  def align(points: js.Array[bezierDashJsLib.BezierJsNs.Point], line: bezierDashJsLib.BezierJsNs.Line): js.Array[bezierDashJsLib.BezierJsNs.Point] = js.native
  def angle(
    o: bezierDashJsLib.BezierJsNs.Point,
    v1: bezierDashJsLib.BezierJsNs.Point,
    v2: bezierDashJsLib.BezierJsNs.Point
  ): scala.Double = js.native
  def approximately(a: scala.Double, b: scala.Double): scala.Boolean = js.native
  def approximately(a: scala.Double, b: scala.Double, precision: scala.Double): scala.Boolean = js.native
  def arcfn(t: scala.Double, derivativeFn: js.Function): scala.Double = js.native
  def bboxoverlap(b1: bezierDashJsLib.BezierJsNs.BBox, b2: bezierDashJsLib.BezierJsNs.BBox): scala.Boolean = js.native
  def between(v: scala.Double, m: scala.Double, M: scala.Double): scala.Boolean = js.native
  def closest(LUT: js.Array[bezierDashJsLib.BezierJsNs.Point], point: bezierDashJsLib.BezierJsNs.Point): bezierDashJsLib.BezierJsNs.Closest = js.native
  def copy(obj: js.Object): js.Any = js.native
  def dist(p1: bezierDashJsLib.BezierJsNs.Point, p2: bezierDashJsLib.BezierJsNs.Point): scala.Double = js.native
  def droots(p: js.Array[scala.Double]): js.Array[scala.Double] = js.native
  def expandbox(bbox: bezierDashJsLib.BezierJsNs.BBox, _bbox: bezierDashJsLib.BezierJsNs.BBox): scala.Unit = js.native
  def findbbox(sections: js.Array[bezierDashJsLib.BezierJsNs.Bezier]): bezierDashJsLib.BezierJsNs.BBox = js.native
  def getccenter(
    p1: bezierDashJsLib.BezierJsNs.Point,
    p2: bezierDashJsLib.BezierJsNs.Point,
    p3: bezierDashJsLib.BezierJsNs.Point
  ): bezierDashJsLib.BezierJsNs.Arc = js.native
  def getminmax(curve: bezierDashJsLib.BezierJsNs.Bezier, d: java.lang.String, list: js.Array[scala.Double]): bezierDashJsLib.BezierJsNs.MinMax = js.native
  def inflections(points: js.Array[bezierDashJsLib.BezierJsNs.Point]): js.Array[scala.Double] = js.native
  def length(derivativeFn: js.Function): scala.Double = js.native
  def lerp(r: scala.Double, v1: bezierDashJsLib.BezierJsNs.Point, v2: bezierDashJsLib.BezierJsNs.Point): bezierDashJsLib.BezierJsNs.Point = js.native
  def lli(v1: bezierDashJsLib.BezierJsNs.Offset, v2: bezierDashJsLib.BezierJsNs.Offset): bezierDashJsLib.BezierJsNs.Point = js.native
  def lli4(
    p1: bezierDashJsLib.BezierJsNs.Point,
    p2: bezierDashJsLib.BezierJsNs.Point,
    p3: bezierDashJsLib.BezierJsNs.Point,
    p4: bezierDashJsLib.BezierJsNs.Point
  ): bezierDashJsLib.BezierJsNs.Point = js.native
  def lli8(
    x1: scala.Double,
    y1: scala.Double,
    x2: scala.Double,
    y2: scala.Double,
    x3: scala.Double,
    y3: scala.Double,
    x4: scala.Double,
    y4: scala.Double
  ): bezierDashJsLib.BezierJsNs.Point = js.native
  def makeline(p1: bezierDashJsLib.BezierJsNs.Point, p2: bezierDashJsLib.BezierJsNs.Point): bezierDashJsLib.BezierJsNs.Bezier = js.native
  def makeshape(forward: bezierDashJsLib.BezierJsNs.Bezier, back: bezierDashJsLib.BezierJsNs.Bezier): bezierDashJsLib.BezierJsNs.Shape = js.native
  def makeshape(
    forward: bezierDashJsLib.BezierJsNs.Bezier,
    back: bezierDashJsLib.BezierJsNs.Bezier,
    curveIntersectionThreshold: scala.Double
  ): bezierDashJsLib.BezierJsNs.Shape = js.native
  def map(v: scala.Double, ds: scala.Double, de: scala.Double, ts: scala.Double, te: scala.Double): scala.Double = js.native
  def pairiteration(c1: bezierDashJsLib.BezierJsNs.Bezier, c2: bezierDashJsLib.BezierJsNs.Bezier): js.Array[java.lang.String] = js.native
  def pairiteration(
    c1: bezierDashJsLib.BezierJsNs.Bezier,
    c2: bezierDashJsLib.BezierJsNs.Bezier,
    curveIntersectionThreshold: scala.Double
  ): js.Array[java.lang.String] = js.native
  def pointToString(p: bezierDashJsLib.BezierJsNs.Point): java.lang.String = js.native
  def pointsToString(points: js.Array[bezierDashJsLib.BezierJsNs.Point]): java.lang.String = js.native
  def projectionratio(t: scala.Double, n: scala.Double): scala.Double = js.native
  def roots(points: js.Array[bezierDashJsLib.BezierJsNs.Point], line: bezierDashJsLib.BezierJsNs.Line): js.Array[scala.Double] = js.native
  def round(v: scala.Double, d: scala.Double): scala.Double = js.native
  def shapeintersections(
    s1: bezierDashJsLib.BezierJsNs.Shape,
    bbox1: bezierDashJsLib.BezierJsNs.BBox,
    s2: bezierDashJsLib.BezierJsNs.Shape,
    bbox2: bezierDashJsLib.BezierJsNs.BBox
  ): js.Array[js.Array[scala.Double | java.lang.String]] = js.native
  def shapeintersections(
    s1: bezierDashJsLib.BezierJsNs.Shape,
    bbox1: bezierDashJsLib.BezierJsNs.BBox,
    s2: bezierDashJsLib.BezierJsNs.Shape,
    bbox2: bezierDashJsLib.BezierJsNs.BBox,
    curveIntersectionThreshold: scala.Double
  ): js.Array[js.Array[scala.Double | java.lang.String]] = js.native
}

