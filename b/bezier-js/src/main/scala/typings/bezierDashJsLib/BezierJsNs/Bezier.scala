package typings
package bezierDashJsLib.BezierJsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * Bezier curve constructor. The constructor argument can be one of three things:
     *
     * 1. array/4 of {x:..., y:..., z:...}, z optional
     * 2. numerical array/8 ordered x1,y1,x2,y2,x3,y3,x4,y4
     * 3. numerical array/12 ordered x1,y1,z1,x2,y2,z2,x3,y3,z3,x4,y4,z4
     *
     */
@JSGlobal("BezierJs.Bezier")
@js.native
class Bezier protected () extends js.Object {
  def this(points: js.Array[scala.Double | Point]) = this()
  def this(p1: Point, p2: Point, p3: Point) = this()
  def this(p1: Point, p2: Point, p3: Point, p4: Point) = this()
  def this(x1: scala.Double, y1: scala.Double, x2: scala.Double, y2: scala.Double, x3: scala.Double, y3: scala.Double) = this()
  def this(x1: scala.Double, y1: scala.Double, x2: scala.Double, y2: scala.Double, x3: scala.Double, y3: scala.Double, x4: scala.Double) = this()
  def this(x1: scala.Double, y1: scala.Double, x2: scala.Double, y2: scala.Double, x3: scala.Double, y3: scala.Double, x4: scala.Double, y4: scala.Double) = this()
  var _3d: scala.Boolean = js.native
  var _linear: js.Any = js.native
  var _lut: js.Array[Point] = js.native
  var _t1: scala.Double = js.native
  var _t2: scala.Double = js.native
  var clockwise: scala.Boolean = js.native
  var dimlen: scala.Double = js.native
  var dims: js.Array[java.lang.String] = js.native
  var dpoints: js.Array[js.Array[Point]] = js.native
  var order: scala.Double = js.native
  var points: js.Array[Point] = js.native
  /* private */ def __normal(t: js.Any): js.Any = js.native
  /* private */ def __normal2(t: js.Any): js.Any = js.native
  /* private */ def __normal3(t: js.Any): js.Any = js.native
  /* private */ def _error(pc: js.Any, np1: js.Any, s: js.Any, e: js.Any): js.Any = js.native
  /* private */ def _iterate(errorThreshold: js.Any, circles: js.Any): js.Any = js.native
  def arcs(): js.Array[Arc] = js.native
  def arcs(errorThreshold: scala.Double): js.Array[Arc] = js.native
  def bbox(): BBox = js.native
  def compute(t: scala.Double): Point = js.native
  def computedirection(): scala.Unit = js.native
  def curveintersects(c1: js.Array[Bezier], c2: js.Array[Bezier]): js.Array[java.lang.String] = js.native
  def curveintersects(c1: js.Array[Bezier], c2: js.Array[Bezier], curveIntersectionThreshold: scala.Double): js.Array[java.lang.String] = js.native
  def derivative(t: scala.Double): Point = js.native
  def extrema(): Inflection = js.native
  def get(t: scala.Double): Point = js.native
  def getLUT(): js.Array[Point] = js.native
  def getLUT(steps: scala.Double): js.Array[Point] = js.native
  def getUtils(): bezierDashJsLib.Anon_Lli8 = js.native
  def hull(t: scala.Double): js.Array[Point] = js.native
  def inflections(): js.Array[scala.Double] = js.native
  def intersects(curve: Bezier): js.Array[java.lang.String] | js.Array[scala.Double] = js.native
  def intersects(curve: Bezier, curveIntersectionThreshold: scala.Double): js.Array[java.lang.String] | js.Array[scala.Double] = js.native
  def intersects(curve: Line): js.Array[java.lang.String] | js.Array[scala.Double] = js.native
  def length(): scala.Double = js.native
  def lineIntersects(line: Line): js.Array[scala.Double] = js.native
  def normal(t: scala.Double): Point = js.native
  def offset(t: scala.Double): Offset | js.Array[Bezier] = js.native
  def offset(t: scala.Double, d: scala.Double): Offset | js.Array[Bezier] = js.native
  def on(point: Point, error: scala.Double): scala.Double = js.native
  def outline(d1: scala.Double): PolyBezier = js.native
  def outline(d1: scala.Double, d2: scala.Double): PolyBezier = js.native
  def outline(d1: scala.Double, d2: scala.Double, d3: scala.Double): PolyBezier = js.native
  def outline(d1: scala.Double, d2: scala.Double, d3: scala.Double, d4: scala.Double): PolyBezier = js.native
  def outlineshapes(d1: scala.Double, d2: scala.Double): js.Array[Shape] = js.native
  def outlineshapes(d1: scala.Double, d2: scala.Double, curveIntersectionThreshold: scala.Double): js.Array[Shape] = js.native
  def overlaps(curve: Bezier): scala.Boolean = js.native
  def point(idx: scala.Double): Point = js.native
  def project(point: Point): Projection = js.native
  def raise(): Bezier = js.native
  def reduce(): js.Array[Bezier] = js.native
  def scale(d: js.Function): Bezier = js.native
  def scale(d: scala.Double): Bezier = js.native
  def selfintersects(): js.Array[java.lang.String] = js.native
  def selfintersects(curveIntersectionThreshold: scala.Double): js.Array[java.lang.String] = js.native
  def simple(): scala.Boolean = js.native
  def split(t1: scala.Double): Split = js.native
  def split(t1: scala.Double, t2: scala.Double): Bezier = js.native
  def toSVG(): java.lang.String = js.native
  def update(): scala.Unit = js.native
}

/**
     * Bezier curve constructor. The constructor argument can be one of three things:
     *
     * 1. array/4 of {x:..., y:..., z:...}, z optional
     * 2. numerical array/8 ordered x1,y1,x2,y2,x3,y3,x4,y4
     * 3. numerical array/12 ordered x1,y1,z1,x2,y2,z2,x3,y3,z3,x4,y4,z4
     *
     */
@JSGlobal("BezierJs.Bezier")
@js.native
object Bezier extends js.Object {
  def cubicFromPoints(
    S: bezierDashJsLib.BezierJsNs.Point,
    B: bezierDashJsLib.BezierJsNs.Point,
    E: bezierDashJsLib.BezierJsNs.Point
  ): bezierDashJsLib.BezierJsNs.Bezier = js.native
  def cubicFromPoints(
    S: bezierDashJsLib.BezierJsNs.Point,
    B: bezierDashJsLib.BezierJsNs.Point,
    E: bezierDashJsLib.BezierJsNs.Point,
    t: scala.Double
  ): bezierDashJsLib.BezierJsNs.Bezier = js.native
  def cubicFromPoints(
    S: bezierDashJsLib.BezierJsNs.Point,
    B: bezierDashJsLib.BezierJsNs.Point,
    E: bezierDashJsLib.BezierJsNs.Point,
    t: scala.Double,
    d1: scala.Double
  ): bezierDashJsLib.BezierJsNs.Bezier = js.native
  def fromSVG(svgString: java.lang.String): bezierDashJsLib.BezierJsNs.Bezier = js.native
  def getABC(
    n: scala.Double,
    S: bezierDashJsLib.BezierJsNs.Point,
    B: bezierDashJsLib.BezierJsNs.Point,
    E: bezierDashJsLib.BezierJsNs.Point,
    t: scala.Double
  ): bezierDashJsLib.BezierJsNs.ABC = js.native
  def getUtils(): bezierDashJsLib.Anon_Lli8 = js.native
  def quadraticFromPoints(
    p1: bezierDashJsLib.BezierJsNs.Point,
    p2: bezierDashJsLib.BezierJsNs.Point,
    p3: bezierDashJsLib.BezierJsNs.Point
  ): bezierDashJsLib.BezierJsNs.Bezier = js.native
  def quadraticFromPoints(
    p1: bezierDashJsLib.BezierJsNs.Point,
    p2: bezierDashJsLib.BezierJsNs.Point,
    p3: bezierDashJsLib.BezierJsNs.Point,
    t: scala.Double
  ): bezierDashJsLib.BezierJsNs.Bezier = js.native
}

