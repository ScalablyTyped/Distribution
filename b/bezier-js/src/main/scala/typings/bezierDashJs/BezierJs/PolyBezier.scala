package typings.bezierDashJs.BezierJs

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
  def addCurve(curve: Bezier): Unit = js.native
  def bbox(): BBox = js.native
  def curve(idx: Double): Bezier = js.native
  def length(): Double = js.native
  def offset(d: Double): PolyBezier = js.native
}

