package typings
package bezierDashJsLib.BezierJsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Poly Bezier
  * @param {[type]} curves [description]
  */
@JSGlobal("BezierJs.PolyBezier")
@js.native
class PolyBezier protected () extends js.Object {
  def this(curves: js.Array[Bezier]) = this()
  var _3d: js.Any = js.native
  var curves: js.Array[Bezier] = js.native
  var points: js.Array[Point] = js.native
  def addCurve(curve: Bezier): scala.Unit = js.native
  def bbox(): BBox = js.native
  def curve(idx: scala.Double): Bezier = js.native
  def length(): scala.Double = js.native
  def offset(d: scala.Double): PolyBezier = js.native
}

