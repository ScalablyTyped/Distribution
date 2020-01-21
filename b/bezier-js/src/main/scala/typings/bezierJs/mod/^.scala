package typings.bezierJs.mod

import typings.bezierJs.BezierJs.ABC
import typings.bezierJs.BezierJs.Bezier
import typings.bezierJs.BezierJs.Point
import typings.bezierJs.Typeofutils
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
@JSImport("bezier-js", JSImport.Namespace)
@js.native
class ^ protected () extends Bezier {
  def this(points: js.Array[Double | Point]) = this()
  def this(p1: Point, p2: Point, p3: Point) = this()
  def this(p1: Point, p2: Point, p3: Point, p4: Point) = this()
  def this(x1: Double, y1: Double, x2: Double, y2: Double, x3: Double, y3: Double) = this()
  def this(x1: Double, y1: Double, x2: Double, y2: Double, x3: Double, y3: Double, x4: Double) = this()
  def this(x1: Double, y1: Double, x2: Double, y2: Double, x3: Double, y3: Double, x4: Double, y4: Double) = this()
}

@JSImport("bezier-js", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def cubicFromPoints(S: Point, B: Point, E: Point): Bezier = js.native
  def cubicFromPoints(S: Point, B: Point, E: Point, t: Double): Bezier = js.native
  def cubicFromPoints(S: Point, B: Point, E: Point, t: Double, d1: Double): Bezier = js.native
  def fromSVG(svgString: String): Bezier = js.native
  def getABC(n: Double, S: Point, B: Point, E: Point, t: Double): ABC = js.native
  def getUtils(): Typeofutils = js.native
  def quadraticFromPoints(p1: Point, p2: Point, p3: Point): Bezier = js.native
  def quadraticFromPoints(p1: Point, p2: Point, p3: Point, t: Double): Bezier = js.native
}

