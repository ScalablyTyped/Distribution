package typings.bezierJs

import typings.bezierJs.BezierJs.ABC
import typings.bezierJs.BezierJs.Bezier
import typings.bezierJs.BezierJs.Point
import typings.bezierJs.anon.Typeofutils
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * Bezier curve constructor. The constructor argument can be one of three things:
    *
    * 1. array/4 of {x:..., y:..., z:...}, z optional
    * 2. numerical array/8 ordered x1,y1,x2,y2,x3,y3,x4,y4
    * 3. numerical array/12 ordered x1,y1,z1,x2,y2,z2,x3,y3,z3,x4,y4,z4
    *
    */
  @JSImport("bezier-js", JSImport.Namespace)
  @js.native
  class ^ protected ()
    extends StObject
       with Bezier {
    def this(points: js.Array[Double | Point]) = this()
    def this(p1: Point, p2: Point, p3: Point) = this()
    def this(p1: Point, p2: Point, p3: Point, p4: Point) = this()
    def this(x1: Double, y1: Double, x2: Double, y2: Double, x3: Double, y3: Double) = this()
    def this(x1: Double, y1: Double, x2: Double, y2: Double, x3: Double, y3: Double, x4: Double) = this()
    def this(x1: Double, y1: Double, x2: Double, y2: Double, x3: Double, y3: Double, x4: Double, y4: Double) = this()
    def this(x1: Double, y1: Double, x2: Double, y2: Double, x3: Double, y3: Double, x4: Unit, y4: Double) = this()
  }
  @JSImport("bezier-js", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @scala.inline
  def cubicFromPoints(S: Point, B: Point, E: Point): Bezier = (^.asInstanceOf[js.Dynamic].applyDynamic("cubicFromPoints")(S.asInstanceOf[js.Any], B.asInstanceOf[js.Any], E.asInstanceOf[js.Any])).asInstanceOf[Bezier]
  @scala.inline
  def cubicFromPoints(S: Point, B: Point, E: Point, t: Double): Bezier = (^.asInstanceOf[js.Dynamic].applyDynamic("cubicFromPoints")(S.asInstanceOf[js.Any], B.asInstanceOf[js.Any], E.asInstanceOf[js.Any], t.asInstanceOf[js.Any])).asInstanceOf[Bezier]
  @scala.inline
  def cubicFromPoints(S: Point, B: Point, E: Point, t: Double, d1: Double): Bezier = (^.asInstanceOf[js.Dynamic].applyDynamic("cubicFromPoints")(S.asInstanceOf[js.Any], B.asInstanceOf[js.Any], E.asInstanceOf[js.Any], t.asInstanceOf[js.Any], d1.asInstanceOf[js.Any])).asInstanceOf[Bezier]
  @scala.inline
  def cubicFromPoints(S: Point, B: Point, E: Point, t: Unit, d1: Double): Bezier = (^.asInstanceOf[js.Dynamic].applyDynamic("cubicFromPoints")(S.asInstanceOf[js.Any], B.asInstanceOf[js.Any], E.asInstanceOf[js.Any], t.asInstanceOf[js.Any], d1.asInstanceOf[js.Any])).asInstanceOf[Bezier]
  
  /* static member */
  @scala.inline
  def fromSVG(svgString: String): Bezier = ^.asInstanceOf[js.Dynamic].applyDynamic("fromSVG")(svgString.asInstanceOf[js.Any]).asInstanceOf[Bezier]
  
  /* static member */
  @scala.inline
  def getABC(n: Double, S: Point, B: Point, E: Point, t: Double): ABC = (^.asInstanceOf[js.Dynamic].applyDynamic("getABC")(n.asInstanceOf[js.Any], S.asInstanceOf[js.Any], B.asInstanceOf[js.Any], E.asInstanceOf[js.Any], t.asInstanceOf[js.Any])).asInstanceOf[ABC]
  
  /* static member */
  @scala.inline
  def getUtils(): Typeofutils = ^.asInstanceOf[js.Dynamic].applyDynamic("getUtils")().asInstanceOf[Typeofutils]
  
  /* static member */
  @scala.inline
  def quadraticFromPoints(p1: Point, p2: Point, p3: Point): Bezier = (^.asInstanceOf[js.Dynamic].applyDynamic("quadraticFromPoints")(p1.asInstanceOf[js.Any], p2.asInstanceOf[js.Any], p3.asInstanceOf[js.Any])).asInstanceOf[Bezier]
  @scala.inline
  def quadraticFromPoints(p1: Point, p2: Point, p3: Point, t: Double): Bezier = (^.asInstanceOf[js.Dynamic].applyDynamic("quadraticFromPoints")(p1.asInstanceOf[js.Any], p2.asInstanceOf[js.Any], p3.asInstanceOf[js.Any], t.asInstanceOf[js.Any])).asInstanceOf[Bezier]
}
