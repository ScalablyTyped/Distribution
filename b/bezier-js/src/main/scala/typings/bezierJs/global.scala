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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object BezierJs {
    
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
    object Bezier {
      
      /* static member */
      @JSGlobal("BezierJs.Bezier.cubicFromPoints")
      @js.native
      def cubicFromPoints(S: Point, B: Point, E: Point): typings.bezierJs.BezierJs.Bezier = js.native
      @JSGlobal("BezierJs.Bezier.cubicFromPoints")
      @js.native
      def cubicFromPoints(S: Point, B: Point, E: Point, t: js.UndefOr[scala.Nothing], d1: Double): typings.bezierJs.BezierJs.Bezier = js.native
      @JSGlobal("BezierJs.Bezier.cubicFromPoints")
      @js.native
      def cubicFromPoints(S: Point, B: Point, E: Point, t: Double): typings.bezierJs.BezierJs.Bezier = js.native
      @JSGlobal("BezierJs.Bezier.cubicFromPoints")
      @js.native
      def cubicFromPoints(S: Point, B: Point, E: Point, t: Double, d1: Double): typings.bezierJs.BezierJs.Bezier = js.native
      
      /* static member */
      @JSGlobal("BezierJs.Bezier.fromSVG")
      @js.native
      def fromSVG(svgString: String): typings.bezierJs.BezierJs.Bezier = js.native
      
      /* static member */
      @JSGlobal("BezierJs.Bezier.getABC")
      @js.native
      def getABC(n: Double, S: Point, B: Point, E: Point, t: Double): ABC = js.native
      
      /* static member */
      @JSGlobal("BezierJs.Bezier.getUtils")
      @js.native
      def getUtils(): Typeofutils = js.native
      
      /* static member */
      @JSGlobal("BezierJs.Bezier.quadraticFromPoints")
      @js.native
      def quadraticFromPoints(p1: Point, p2: Point, p3: Point): typings.bezierJs.BezierJs.Bezier = js.native
      @JSGlobal("BezierJs.Bezier.quadraticFromPoints")
      @js.native
      def quadraticFromPoints(p1: Point, p2: Point, p3: Point, t: Double): typings.bezierJs.BezierJs.Bezier = js.native
    }
    
    @JSGlobal("BezierJs.BezierCap")
    @js.native
    class BezierCap ()
      extends typings.bezierJs.BezierJs.BezierCap
    
    /**
      * Poly Bezier
      * @param {[type]} curves [description]
      */
    @JSGlobal("BezierJs.PolyBezier")
    @js.native
    class PolyBezier protected ()
      extends typings.bezierJs.BezierJs.PolyBezier {
      def this(curves: js.Array[typings.bezierJs.BezierJs.Bezier]) = this()
    }
    
    object utils {
      
      @JSGlobal("BezierJs.utils")
      @js.native
      val ^ : js.Any = js.native
      
      @JSGlobal("BezierJs.utils.Cvalues")
      @js.native
      def Cvalues: js.Array[Double] = js.native
      @scala.inline
      def Cvalues_=(x: js.Array[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Cvalues")(x.asInstanceOf[js.Any])
      
      @JSGlobal("BezierJs.utils.Tvalues")
      @js.native
      def Tvalues: js.Array[Double] = js.native
      @scala.inline
      def Tvalues_=(x: js.Array[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Tvalues")(x.asInstanceOf[js.Any])
      
      @JSGlobal("BezierJs.utils.abcratio")
      @js.native
      def abcratio(t: Double, n: Double): Double = js.native
      
      @JSGlobal("BezierJs.utils.align")
      @js.native
      def align(points: js.Array[Point], line: Line): js.Array[Point] = js.native
      
      @JSGlobal("BezierJs.utils.angle")
      @js.native
      def angle(o: Point, v1: Point, v2: Point): Double = js.native
      
      @JSGlobal("BezierJs.utils.approximately")
      @js.native
      def approximately(a: Double, b: Double): Boolean = js.native
      @JSGlobal("BezierJs.utils.approximately")
      @js.native
      def approximately(a: Double, b: Double, precision: Double): Boolean = js.native
      
      @JSGlobal("BezierJs.utils.arcfn")
      @js.native
      def arcfn(t: Double, derivativeFn: js.Function): Double = js.native
      
      @JSGlobal("BezierJs.utils.bboxoverlap")
      @js.native
      def bboxoverlap(b1: BBox, b2: BBox): Boolean = js.native
      
      @JSGlobal("BezierJs.utils.between")
      @js.native
      def between(v: Double, m: Double, M: Double): Boolean = js.native
      
      @JSGlobal("BezierJs.utils.closest")
      @js.native
      def closest(LUT: js.Array[Point], point: Point): Closest = js.native
      
      @JSGlobal("BezierJs.utils.copy")
      @js.native
      def copy(obj: js.Object): js.Any = js.native
      
      @JSGlobal("BezierJs.utils.dist")
      @js.native
      def dist(p1: Point, p2: Point): Double = js.native
      
      @JSGlobal("BezierJs.utils.droots")
      @js.native
      def droots(p: js.Array[Double]): js.Array[Double] = js.native
      
      @JSGlobal("BezierJs.utils.expandbox")
      @js.native
      def expandbox(bbox: BBox, _bbox: BBox): Unit = js.native
      
      @JSGlobal("BezierJs.utils.findbbox")
      @js.native
      def findbbox(sections: js.Array[typings.bezierJs.BezierJs.Bezier]): BBox = js.native
      
      @JSGlobal("BezierJs.utils.getccenter")
      @js.native
      def getccenter(p1: Point, p2: Point, p3: Point): Arc = js.native
      
      @JSGlobal("BezierJs.utils.getminmax")
      @js.native
      def getminmax(curve: typings.bezierJs.BezierJs.Bezier, d: String, list: js.Array[Double]): MinMax = js.native
      
      @JSGlobal("BezierJs.utils.inflections")
      @js.native
      def inflections(points: js.Array[Point]): js.Array[Double] = js.native
      
      @JSGlobal("BezierJs.utils.length")
      @js.native
      def length(derivativeFn: js.Function): Double = js.native
      
      @JSGlobal("BezierJs.utils.lerp")
      @js.native
      def lerp(r: Double, v1: Point, v2: Point): Point = js.native
      
      @JSGlobal("BezierJs.utils.lli")
      @js.native
      def lli(v1: Offset, v2: Offset): Point = js.native
      
      @JSGlobal("BezierJs.utils.lli4")
      @js.native
      def lli4(p1: Point, p2: Point, p3: Point, p4: Point): Point = js.native
      
      @JSGlobal("BezierJs.utils.lli8")
      @js.native
      def lli8(x1: Double, y1: Double, x2: Double, y2: Double, x3: Double, y3: Double, x4: Double, y4: Double): Point = js.native
      
      @JSGlobal("BezierJs.utils.makeline")
      @js.native
      def makeline(p1: Point, p2: Point): typings.bezierJs.BezierJs.Bezier = js.native
      
      @JSGlobal("BezierJs.utils.makeshape")
      @js.native
      def makeshape(forward: typings.bezierJs.BezierJs.Bezier, back: typings.bezierJs.BezierJs.Bezier): Shape = js.native
      @JSGlobal("BezierJs.utils.makeshape")
      @js.native
      def makeshape(
        forward: typings.bezierJs.BezierJs.Bezier,
        back: typings.bezierJs.BezierJs.Bezier,
        curveIntersectionThreshold: Double
      ): Shape = js.native
      
      @JSGlobal("BezierJs.utils.map")
      @js.native
      def map(v: Double, ds: Double, de: Double, ts: Double, te: Double): Double = js.native
      
      @JSGlobal("BezierJs.utils.pairiteration")
      @js.native
      def pairiteration(c1: typings.bezierJs.BezierJs.Bezier, c2: typings.bezierJs.BezierJs.Bezier): js.Array[String] = js.native
      @JSGlobal("BezierJs.utils.pairiteration")
      @js.native
      def pairiteration(
        c1: typings.bezierJs.BezierJs.Bezier,
        c2: typings.bezierJs.BezierJs.Bezier,
        curveIntersectionThreshold: Double
      ): js.Array[String] = js.native
      
      @JSGlobal("BezierJs.utils.pointToString")
      @js.native
      def pointToString(p: Point): String = js.native
      
      @JSGlobal("BezierJs.utils.pointsToString")
      @js.native
      def pointsToString(points: js.Array[Point]): String = js.native
      
      @JSGlobal("BezierJs.utils.projectionratio")
      @js.native
      def projectionratio(t: Double, n: Double): Double = js.native
      
      @JSGlobal("BezierJs.utils.roots")
      @js.native
      def roots(points: js.Array[Point], line: Line): js.Array[Double] = js.native
      
      @JSGlobal("BezierJs.utils.round")
      @js.native
      def round(v: Double, d: Double): Double = js.native
      
      @JSGlobal("BezierJs.utils.shapeintersections")
      @js.native
      def shapeintersections(s1: Shape, bbox1: BBox, s2: Shape, bbox2: BBox): js.Array[js.Array[Double | String]] = js.native
      @JSGlobal("BezierJs.utils.shapeintersections")
      @js.native
      def shapeintersections(s1: Shape, bbox1: BBox, s2: Shape, bbox2: BBox, curveIntersectionThreshold: Double): js.Array[js.Array[Double | String]] = js.native
    }
  }
}
