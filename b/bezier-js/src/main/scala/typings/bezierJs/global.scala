package typings.bezierJs

import typings.bezierJs.BezierJs.ABC
import typings.bezierJs.BezierJs.Arc
import typings.bezierJs.BezierJs.BBox
import typings.bezierJs.BezierJs.Closest
import typings.bezierJs.BezierJs.Line
import typings.bezierJs.BezierJs.MinMax
import typings.bezierJs.BezierJs.Offset
import typings.bezierJs.BezierJs.Point
import typings.bezierJs.BezierJs.Shape
import typings.bezierJs.anon.Typeofutils
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobalScope
@js.native
object global extends js.Object {
  
  @js.native
  object BezierJs extends js.Object {
    
    /**
      * Bezier curve constructor. The constructor argument can be one of three things:
      *
      * 1. array/4 of {x:..., y:..., z:...}, z optional
      * 2. numerical array/8 ordered x1,y1,x2,y2,x3,y3,x4,y4
      * 3. numerical array/12 ordered x1,y1,z1,x2,y2,z2,x3,y3,z3,x4,y4,z4
      *
      */
    @js.native
    class Bezier protected ()
      extends typings.bezierJs.BezierJs.Bezier {
      def this(points: js.Array[Double | Point]) = this()
      def this(p1: Point, p2: Point, p3: Point) = this()
      def this(p1: Point, p2: Point, p3: Point, p4: Point) = this()
      def this(x1: Double, y1: Double, x2: Double, y2: Double, x3: Double, y3: Double) = this()
      def this(x1: Double, y1: Double, x2: Double, y2: Double, x3: Double, y3: Double, x4: Double) = this()
      def this(
        x1: Double,
        y1: Double,
        x2: Double,
        y2: Double,
        x3: Double,
        y3: Double,
        x4: js.UndefOr[scala.Nothing],
        y4: Double
      ) = this()
      def this(x1: Double, y1: Double, x2: Double, y2: Double, x3: Double, y3: Double, x4: Double, y4: Double) = this()
    }
    /* static members */
    @js.native
    object Bezier extends js.Object {
      
      def cubicFromPoints(S: Point, B: Point, E: Point): typings.bezierJs.BezierJs.Bezier = js.native
      def cubicFromPoints(S: Point, B: Point, E: Point, t: js.UndefOr[scala.Nothing], d1: Double): typings.bezierJs.BezierJs.Bezier = js.native
      def cubicFromPoints(S: Point, B: Point, E: Point, t: Double): typings.bezierJs.BezierJs.Bezier = js.native
      def cubicFromPoints(S: Point, B: Point, E: Point, t: Double, d1: Double): typings.bezierJs.BezierJs.Bezier = js.native
      
      def fromSVG(svgString: String): typings.bezierJs.BezierJs.Bezier = js.native
      
      def getABC(n: Double, S: Point, B: Point, E: Point, t: Double): ABC = js.native
      
      def getUtils(): Typeofutils = js.native
      
      def quadraticFromPoints(p1: Point, p2: Point, p3: Point): typings.bezierJs.BezierJs.Bezier = js.native
      def quadraticFromPoints(p1: Point, p2: Point, p3: Point, t: Double): typings.bezierJs.BezierJs.Bezier = js.native
    }
    
    @js.native
    class BezierCap ()
      extends typings.bezierJs.BezierJs.BezierCap
    
    /**
      * Poly Bezier
      * @param {[type]} curves [description]
      */
    @js.native
    class PolyBezier protected ()
      extends typings.bezierJs.BezierJs.PolyBezier {
      def this(curves: js.Array[typings.bezierJs.BezierJs.Bezier]) = this()
    }
    
    @js.native
    object utils extends js.Object {
      
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
      
      def findbbox(sections: js.Array[typings.bezierJs.BezierJs.Bezier]): BBox = js.native
      
      def getccenter(p1: Point, p2: Point, p3: Point): Arc = js.native
      
      def getminmax(curve: typings.bezierJs.BezierJs.Bezier, d: String, list: js.Array[Double]): MinMax = js.native
      
      def inflections(points: js.Array[Point]): js.Array[Double] = js.native
      
      def length(derivativeFn: js.Function): Double = js.native
      
      def lerp(r: Double, v1: Point, v2: Point): Point = js.native
      
      def lli(v1: Offset, v2: Offset): Point = js.native
      
      def lli4(p1: Point, p2: Point, p3: Point, p4: Point): Point = js.native
      
      def lli8(x1: Double, y1: Double, x2: Double, y2: Double, x3: Double, y3: Double, x4: Double, y4: Double): Point = js.native
      
      def makeline(p1: Point, p2: Point): typings.bezierJs.BezierJs.Bezier = js.native
      
      def makeshape(forward: typings.bezierJs.BezierJs.Bezier, back: typings.bezierJs.BezierJs.Bezier): Shape = js.native
      def makeshape(
        forward: typings.bezierJs.BezierJs.Bezier,
        back: typings.bezierJs.BezierJs.Bezier,
        curveIntersectionThreshold: Double
      ): Shape = js.native
      
      def map(v: Double, ds: Double, de: Double, ts: Double, te: Double): Double = js.native
      
      def pairiteration(c1: typings.bezierJs.BezierJs.Bezier, c2: typings.bezierJs.BezierJs.Bezier): js.Array[String] = js.native
      def pairiteration(
        c1: typings.bezierJs.BezierJs.Bezier,
        c2: typings.bezierJs.BezierJs.Bezier,
        curveIntersectionThreshold: Double
      ): js.Array[String] = js.native
      
      def pointToString(p: Point): String = js.native
      
      def pointsToString(points: js.Array[Point]): String = js.native
      
      def projectionratio(t: Double, n: Double): Double = js.native
      
      def roots(points: js.Array[Point], line: Line): js.Array[Double] = js.native
      
      def round(v: Double, d: Double): Double = js.native
      
      def shapeintersections(s1: Shape, bbox1: BBox, s2: Shape, bbox2: BBox): js.Array[js.Array[Double | String]] = js.native
      def shapeintersections(s1: Shape, bbox1: BBox, s2: Shape, bbox2: BBox, curveIntersectionThreshold: Double): js.Array[js.Array[Double | String]] = js.native
    }
  }
}
