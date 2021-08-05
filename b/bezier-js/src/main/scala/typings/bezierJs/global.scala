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
      extends StObject
         with typings.bezierJs.BezierJs.Bezier {
      def this(points: js.Array[Double | Point]) = this()
      def this(p1: Point, p2: Point, p3: Point) = this()
      def this(p1: Point, p2: Point, p3: Point, p4: Point) = this()
      def this(x1: Double, y1: Double, x2: Double, y2: Double, x3: Double, y3: Double) = this()
      def this(x1: Double, y1: Double, x2: Double, y2: Double, x3: Double, y3: Double, x4: Double) = this()
      def this(x1: Double, y1: Double, x2: Double, y2: Double, x3: Double, y3: Double, x4: Double, y4: Double) = this()
      def this(x1: Double, y1: Double, x2: Double, y2: Double, x3: Double, y3: Double, x4: Unit, y4: Double) = this()
    }
    object Bezier {
      
      @JSGlobal("BezierJs.Bezier")
      @js.native
      val ^ : js.Any = js.native
      
      /* static member */
      inline def cubicFromPoints(S: Point, B: Point, E: Point): typings.bezierJs.BezierJs.Bezier = (^.asInstanceOf[js.Dynamic].applyDynamic("cubicFromPoints")(S.asInstanceOf[js.Any], B.asInstanceOf[js.Any], E.asInstanceOf[js.Any])).asInstanceOf[typings.bezierJs.BezierJs.Bezier]
      inline def cubicFromPoints(S: Point, B: Point, E: Point, t: Double): typings.bezierJs.BezierJs.Bezier = (^.asInstanceOf[js.Dynamic].applyDynamic("cubicFromPoints")(S.asInstanceOf[js.Any], B.asInstanceOf[js.Any], E.asInstanceOf[js.Any], t.asInstanceOf[js.Any])).asInstanceOf[typings.bezierJs.BezierJs.Bezier]
      inline def cubicFromPoints(S: Point, B: Point, E: Point, t: Double, d1: Double): typings.bezierJs.BezierJs.Bezier = (^.asInstanceOf[js.Dynamic].applyDynamic("cubicFromPoints")(S.asInstanceOf[js.Any], B.asInstanceOf[js.Any], E.asInstanceOf[js.Any], t.asInstanceOf[js.Any], d1.asInstanceOf[js.Any])).asInstanceOf[typings.bezierJs.BezierJs.Bezier]
      inline def cubicFromPoints(S: Point, B: Point, E: Point, t: Unit, d1: Double): typings.bezierJs.BezierJs.Bezier = (^.asInstanceOf[js.Dynamic].applyDynamic("cubicFromPoints")(S.asInstanceOf[js.Any], B.asInstanceOf[js.Any], E.asInstanceOf[js.Any], t.asInstanceOf[js.Any], d1.asInstanceOf[js.Any])).asInstanceOf[typings.bezierJs.BezierJs.Bezier]
      
      /* static member */
      inline def fromSVG(svgString: String): typings.bezierJs.BezierJs.Bezier = ^.asInstanceOf[js.Dynamic].applyDynamic("fromSVG")(svgString.asInstanceOf[js.Any]).asInstanceOf[typings.bezierJs.BezierJs.Bezier]
      
      /* static member */
      inline def getABC(n: Double, S: Point, B: Point, E: Point, t: Double): ABC = (^.asInstanceOf[js.Dynamic].applyDynamic("getABC")(n.asInstanceOf[js.Any], S.asInstanceOf[js.Any], B.asInstanceOf[js.Any], E.asInstanceOf[js.Any], t.asInstanceOf[js.Any])).asInstanceOf[ABC]
      
      /* static member */
      inline def getUtils(): Typeofutils = ^.asInstanceOf[js.Dynamic].applyDynamic("getUtils")().asInstanceOf[Typeofutils]
      
      /* static member */
      inline def quadraticFromPoints(p1: Point, p2: Point, p3: Point): typings.bezierJs.BezierJs.Bezier = (^.asInstanceOf[js.Dynamic].applyDynamic("quadraticFromPoints")(p1.asInstanceOf[js.Any], p2.asInstanceOf[js.Any], p3.asInstanceOf[js.Any])).asInstanceOf[typings.bezierJs.BezierJs.Bezier]
      inline def quadraticFromPoints(p1: Point, p2: Point, p3: Point, t: Double): typings.bezierJs.BezierJs.Bezier = (^.asInstanceOf[js.Dynamic].applyDynamic("quadraticFromPoints")(p1.asInstanceOf[js.Any], p2.asInstanceOf[js.Any], p3.asInstanceOf[js.Any], t.asInstanceOf[js.Any])).asInstanceOf[typings.bezierJs.BezierJs.Bezier]
    }
    
    @JSGlobal("BezierJs.BezierCap")
    @js.native
    class BezierCap ()
      extends StObject
         with typings.bezierJs.BezierJs.BezierCap
    
    /**
      * Poly Bezier
      * @param {[type]} curves [description]
      */
    @JSGlobal("BezierJs.PolyBezier")
    @js.native
    class PolyBezier protected ()
      extends StObject
         with typings.bezierJs.BezierJs.PolyBezier {
      def this(curves: js.Array[typings.bezierJs.BezierJs.Bezier]) = this()
      
      /* private */ /* CompleteClass */
      var _3d: js.Any = js.native
      
      /* CompleteClass */
      override def addCurve(curve: typings.bezierJs.BezierJs.Bezier): Unit = js.native
      
      /* CompleteClass */
      override def bbox(): BBox = js.native
      
      /* CompleteClass */
      override def curve(idx: Double): typings.bezierJs.BezierJs.Bezier = js.native
      
      /* CompleteClass */
      var curves: js.Array[typings.bezierJs.BezierJs.Bezier] = js.native
      
      /* CompleteClass */
      override def length(): Double = js.native
      
      /* CompleteClass */
      override def offset(d: Double): typings.bezierJs.BezierJs.PolyBezier = js.native
      
      /* CompleteClass */
      var points: js.Array[Point] = js.native
    }
    
    object utils {
      
      @JSGlobal("BezierJs.utils")
      @js.native
      val ^ : js.Any = js.native
      
      @JSGlobal("BezierJs.utils.Cvalues")
      @js.native
      def Cvalues: js.Array[Double] = js.native
      inline def Cvalues_=(x: js.Array[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Cvalues")(x.asInstanceOf[js.Any])
      
      @JSGlobal("BezierJs.utils.Tvalues")
      @js.native
      def Tvalues: js.Array[Double] = js.native
      inline def Tvalues_=(x: js.Array[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Tvalues")(x.asInstanceOf[js.Any])
      
      inline def abcratio(t: Double, n: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("abcratio")(t.asInstanceOf[js.Any], n.asInstanceOf[js.Any])).asInstanceOf[Double]
      
      inline def align(points: js.Array[Point], line: Line): js.Array[Point] = (^.asInstanceOf[js.Dynamic].applyDynamic("align")(points.asInstanceOf[js.Any], line.asInstanceOf[js.Any])).asInstanceOf[js.Array[Point]]
      
      inline def angle(o: Point, v1: Point, v2: Point): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("angle")(o.asInstanceOf[js.Any], v1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any])).asInstanceOf[Double]
      
      inline def approximately(a: Double, b: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("approximately")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
      inline def approximately(a: Double, b: Double, precision: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("approximately")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], precision.asInstanceOf[js.Any])).asInstanceOf[Boolean]
      
      inline def arcfn(t: Double, derivativeFn: js.Function): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("arcfn")(t.asInstanceOf[js.Any], derivativeFn.asInstanceOf[js.Any])).asInstanceOf[Double]
      
      inline def bboxoverlap(b1: BBox, b2: BBox): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("bboxoverlap")(b1.asInstanceOf[js.Any], b2.asInstanceOf[js.Any])).asInstanceOf[Boolean]
      
      inline def between(v: Double, m: Double, M: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("between")(v.asInstanceOf[js.Any], m.asInstanceOf[js.Any], M.asInstanceOf[js.Any])).asInstanceOf[Boolean]
      
      inline def closest(LUT: js.Array[Point], point: Point): Closest = (^.asInstanceOf[js.Dynamic].applyDynamic("closest")(LUT.asInstanceOf[js.Any], point.asInstanceOf[js.Any])).asInstanceOf[Closest]
      
      inline def copy(obj: js.Object): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("copy")(obj.asInstanceOf[js.Any]).asInstanceOf[js.Any]
      
      inline def dist(p1: Point, p2: Point): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("dist")(p1.asInstanceOf[js.Any], p2.asInstanceOf[js.Any])).asInstanceOf[Double]
      
      inline def droots(p: js.Array[Double]): js.Array[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("droots")(p.asInstanceOf[js.Any]).asInstanceOf[js.Array[Double]]
      
      inline def expandbox(bbox: BBox, _bbox: BBox): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("expandbox")(bbox.asInstanceOf[js.Any], _bbox.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      inline def findbbox(sections: js.Array[typings.bezierJs.BezierJs.Bezier]): BBox = ^.asInstanceOf[js.Dynamic].applyDynamic("findbbox")(sections.asInstanceOf[js.Any]).asInstanceOf[BBox]
      
      inline def getccenter(p1: Point, p2: Point, p3: Point): Arc = (^.asInstanceOf[js.Dynamic].applyDynamic("getccenter")(p1.asInstanceOf[js.Any], p2.asInstanceOf[js.Any], p3.asInstanceOf[js.Any])).asInstanceOf[Arc]
      
      inline def getminmax(curve: typings.bezierJs.BezierJs.Bezier, d: String, list: js.Array[Double]): MinMax = (^.asInstanceOf[js.Dynamic].applyDynamic("getminmax")(curve.asInstanceOf[js.Any], d.asInstanceOf[js.Any], list.asInstanceOf[js.Any])).asInstanceOf[MinMax]
      
      inline def inflections(points: js.Array[Point]): js.Array[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("inflections")(points.asInstanceOf[js.Any]).asInstanceOf[js.Array[Double]]
      
      inline def length(derivativeFn: js.Function): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("length")(derivativeFn.asInstanceOf[js.Any]).asInstanceOf[Double]
      
      inline def lerp(r: Double, v1: Point, v2: Point): Point = (^.asInstanceOf[js.Dynamic].applyDynamic("lerp")(r.asInstanceOf[js.Any], v1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any])).asInstanceOf[Point]
      
      inline def lli(v1: Offset, v2: Offset): Point = (^.asInstanceOf[js.Dynamic].applyDynamic("lli")(v1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any])).asInstanceOf[Point]
      
      inline def lli4(p1: Point, p2: Point, p3: Point, p4: Point): Point = (^.asInstanceOf[js.Dynamic].applyDynamic("lli4")(p1.asInstanceOf[js.Any], p2.asInstanceOf[js.Any], p3.asInstanceOf[js.Any], p4.asInstanceOf[js.Any])).asInstanceOf[Point]
      
      inline def lli8(x1: Double, y1: Double, x2: Double, y2: Double, x3: Double, y3: Double, x4: Double, y4: Double): Point = (^.asInstanceOf[js.Dynamic].applyDynamic("lli8")(x1.asInstanceOf[js.Any], y1.asInstanceOf[js.Any], x2.asInstanceOf[js.Any], y2.asInstanceOf[js.Any], x3.asInstanceOf[js.Any], y3.asInstanceOf[js.Any], x4.asInstanceOf[js.Any], y4.asInstanceOf[js.Any])).asInstanceOf[Point]
      
      inline def makeline(p1: Point, p2: Point): typings.bezierJs.BezierJs.Bezier = (^.asInstanceOf[js.Dynamic].applyDynamic("makeline")(p1.asInstanceOf[js.Any], p2.asInstanceOf[js.Any])).asInstanceOf[typings.bezierJs.BezierJs.Bezier]
      
      inline def makeshape(forward: typings.bezierJs.BezierJs.Bezier, back: typings.bezierJs.BezierJs.Bezier): Shape = (^.asInstanceOf[js.Dynamic].applyDynamic("makeshape")(forward.asInstanceOf[js.Any], back.asInstanceOf[js.Any])).asInstanceOf[Shape]
      inline def makeshape(
        forward: typings.bezierJs.BezierJs.Bezier,
        back: typings.bezierJs.BezierJs.Bezier,
        curveIntersectionThreshold: Double
      ): Shape = (^.asInstanceOf[js.Dynamic].applyDynamic("makeshape")(forward.asInstanceOf[js.Any], back.asInstanceOf[js.Any], curveIntersectionThreshold.asInstanceOf[js.Any])).asInstanceOf[Shape]
      
      inline def map(v: Double, ds: Double, de: Double, ts: Double, te: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("map")(v.asInstanceOf[js.Any], ds.asInstanceOf[js.Any], de.asInstanceOf[js.Any], ts.asInstanceOf[js.Any], te.asInstanceOf[js.Any])).asInstanceOf[Double]
      
      inline def pairiteration(c1: typings.bezierJs.BezierJs.Bezier, c2: typings.bezierJs.BezierJs.Bezier): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("pairiteration")(c1.asInstanceOf[js.Any], c2.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
      inline def pairiteration(
        c1: typings.bezierJs.BezierJs.Bezier,
        c2: typings.bezierJs.BezierJs.Bezier,
        curveIntersectionThreshold: Double
      ): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("pairiteration")(c1.asInstanceOf[js.Any], c2.asInstanceOf[js.Any], curveIntersectionThreshold.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
      
      inline def pointToString(p: Point): String = ^.asInstanceOf[js.Dynamic].applyDynamic("pointToString")(p.asInstanceOf[js.Any]).asInstanceOf[String]
      
      inline def pointsToString(points: js.Array[Point]): String = ^.asInstanceOf[js.Dynamic].applyDynamic("pointsToString")(points.asInstanceOf[js.Any]).asInstanceOf[String]
      
      inline def projectionratio(t: Double, n: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("projectionratio")(t.asInstanceOf[js.Any], n.asInstanceOf[js.Any])).asInstanceOf[Double]
      
      inline def roots(points: js.Array[Point], line: Line): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("roots")(points.asInstanceOf[js.Any], line.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
      
      inline def round(v: Double, d: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("round")(v.asInstanceOf[js.Any], d.asInstanceOf[js.Any])).asInstanceOf[Double]
      
      inline def shapeintersections(s1: Shape, bbox1: BBox, s2: Shape, bbox2: BBox): js.Array[js.Array[Double | String]] = (^.asInstanceOf[js.Dynamic].applyDynamic("shapeintersections")(s1.asInstanceOf[js.Any], bbox1.asInstanceOf[js.Any], s2.asInstanceOf[js.Any], bbox2.asInstanceOf[js.Any])).asInstanceOf[js.Array[js.Array[Double | String]]]
      inline def shapeintersections(s1: Shape, bbox1: BBox, s2: Shape, bbox2: BBox, curveIntersectionThreshold: Double): js.Array[js.Array[Double | String]] = (^.asInstanceOf[js.Dynamic].applyDynamic("shapeintersections")(s1.asInstanceOf[js.Any], bbox1.asInstanceOf[js.Any], s2.asInstanceOf[js.Any], bbox2.asInstanceOf[js.Any], curveIntersectionThreshold.asInstanceOf[js.Any])).asInstanceOf[js.Array[js.Array[Double | String]]]
    }
  }
}
