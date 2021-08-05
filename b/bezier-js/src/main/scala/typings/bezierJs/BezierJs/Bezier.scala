package typings.bezierJs.BezierJs

import typings.bezierJs.anon.Typeofutils
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Bezier curve constructor. The constructor argument can be one of three things:
  *
  * 1. array/4 of {x:..., y:..., z:...}, z optional
  * 2. numerical array/8 ordered x1,y1,x2,y2,x3,y3,x4,y4
  * 3. numerical array/12 ordered x1,y1,z1,x2,y2,z2,x3,y3,z3,x4,y4,z4
  *
  */
@js.native
trait Bezier extends StObject {
  
  var _3d: Boolean = js.native
  
  /* private */ def __normal(t: js.Any): js.Any = js.native
  
  /* private */ def __normal2(t: js.Any): js.Any = js.native
  
  /* private */ def __normal3(t: js.Any): js.Any = js.native
  
  /* private */ def _error(pc: js.Any, np1: js.Any, s: js.Any, e: js.Any): js.Any = js.native
  
  /* private */ def _iterate(errorThreshold: js.Any, circles: js.Any): js.Any = js.native
  
  /* private */ var _linear: js.Any = js.native
  
  var _lut: js.Array[Point] = js.native
  
  var _t1: Double = js.native
  
  var _t2: Double = js.native
  
  def arcs(): js.Array[Arc] = js.native
  def arcs(errorThreshold: Double): js.Array[Arc] = js.native
  
  def bbox(): BBox = js.native
  
  var clockwise: Boolean = js.native
  
  def compute(t: Double): Point = js.native
  
  def computedirection(): Unit = js.native
  
  def curveintersects(c1: js.Array[Bezier], c2: js.Array[Bezier]): js.Array[String] = js.native
  def curveintersects(c1: js.Array[Bezier], c2: js.Array[Bezier], curveIntersectionThreshold: Double): js.Array[String] = js.native
  
  def derivative(t: Double): Point = js.native
  
  var dimlen: Double = js.native
  
  var dims: js.Array[String] = js.native
  
  var dpoints: js.Array[js.Array[Point]] = js.native
  
  def extrema(): Inflection = js.native
  
  def get(t: Double): Point = js.native
  
  def getLUT(): js.Array[Point] = js.native
  def getLUT(steps: Double): js.Array[Point] = js.native
  
  def getUtils(): Typeofutils = js.native
  
  def hull(t: Double): js.Array[Point] = js.native
  
  def inflections(): js.Array[Double] = js.native
  
  def intersects(curve: Bezier): js.Array[Double | String] = js.native
  def intersects(curve: Bezier, curveIntersectionThreshold: Double): js.Array[Double | String] = js.native
  def intersects(curve: Line): js.Array[Double | String] = js.native
  
  def length(): Double = js.native
  
  def lineIntersects(line: Line): js.Array[Double] = js.native
  
  def normal(t: Double): Point = js.native
  
  def offset(t: Double): Offset | js.Array[Bezier] = js.native
  def offset(t: Double, d: Double): Offset | js.Array[Bezier] = js.native
  
  def on(point: Point, error: Double): Double = js.native
  
  var order: Double = js.native
  
  def outline(d1: Double): PolyBezier = js.native
  def outline(d1: Double, d2: Double): PolyBezier = js.native
  def outline(d1: Double, d2: Double, d3: Double): PolyBezier = js.native
  def outline(d1: Double, d2: Double, d3: Double, d4: Double): PolyBezier = js.native
  def outline(d1: Double, d2: Double, d3: Unit, d4: Double): PolyBezier = js.native
  def outline(d1: Double, d2: Unit, d3: Double): PolyBezier = js.native
  def outline(d1: Double, d2: Unit, d3: Double, d4: Double): PolyBezier = js.native
  def outline(d1: Double, d2: Unit, d3: Unit, d4: Double): PolyBezier = js.native
  
  def outlineshapes(d1: Double, d2: Double): js.Array[Shape] = js.native
  def outlineshapes(d1: Double, d2: Double, curveIntersectionThreshold: Double): js.Array[Shape] = js.native
  
  def overlaps(curve: Bezier): Boolean = js.native
  
  def point(idx: Double): Point = js.native
  
  var points: js.Array[Point] = js.native
  
  def project(point: Point): Projection = js.native
  
  def raise(): Bezier = js.native
  
  def reduce(): js.Array[Bezier] = js.native
  
  def scale(d: js.Function): Bezier = js.native
  def scale(d: Double): Bezier = js.native
  
  def selfintersects(): js.Array[String] = js.native
  def selfintersects(curveIntersectionThreshold: Double): js.Array[String] = js.native
  
  def simple(): Boolean = js.native
  
  def split(t1: Double): Split = js.native
  def split(t1: Double, t2: Double): Bezier = js.native
  
  def toSVG(): String = js.native
  
  def update(): Unit = js.native
}
