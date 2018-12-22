package typings
package bezierDashJsLib.bezierDashJsMod

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
class namespaced protected ()
  extends bezierDashJsLib.BezierJsNs.Bezier {
  def this(points: js.Array[scala.Double | bezierDashJsLib.BezierJsNs.Point]) = this()
  def this(p1: bezierDashJsLib.BezierJsNs.Point, p2: bezierDashJsLib.BezierJsNs.Point, p3: bezierDashJsLib.BezierJsNs.Point) = this()
  def this(p1: bezierDashJsLib.BezierJsNs.Point, p2: bezierDashJsLib.BezierJsNs.Point, p3: bezierDashJsLib.BezierJsNs.Point, p4: bezierDashJsLib.BezierJsNs.Point) = this()
  def this(x1: scala.Double, y1: scala.Double, x2: scala.Double, y2: scala.Double, x3: scala.Double, y3: scala.Double) = this()
  def this(x1: scala.Double, y1: scala.Double, x2: scala.Double, y2: scala.Double, x3: scala.Double, y3: scala.Double, x4: scala.Double) = this()
  def this(x1: scala.Double, y1: scala.Double, x2: scala.Double, y2: scala.Double, x3: scala.Double, y3: scala.Double, x4: scala.Double, y4: scala.Double) = this()
}

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
object namespaced extends js.Object {
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

