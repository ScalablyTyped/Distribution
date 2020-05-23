package typings.bezierJs.BezierJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Poly Bezier
  * @param {[type]} curves [description]
  */
trait PolyBezier extends js.Object {
  var _3d: js.Any
  var curves: js.Array[Bezier]
  var points: js.Array[Point]
  def addCurve(curve: Bezier): Unit
  def bbox(): BBox
  def curve(idx: Double): Bezier
  def length(): Double
  def offset(d: Double): PolyBezier
}

object PolyBezier {
  @scala.inline
  def apply(
    _3d: js.Any,
    addCurve: Bezier => Unit,
    bbox: () => BBox,
    curve: Double => Bezier,
    curves: js.Array[Bezier],
    length: () => Double,
    offset: Double => PolyBezier,
    points: js.Array[Point]
  ): PolyBezier = {
    val __obj = js.Dynamic.literal(_3d = _3d.asInstanceOf[js.Any], addCurve = js.Any.fromFunction1(addCurve), bbox = js.Any.fromFunction0(bbox), curve = js.Any.fromFunction1(curve), curves = curves.asInstanceOf[js.Any], length = js.Any.fromFunction0(length), offset = js.Any.fromFunction1(offset), points = points.asInstanceOf[js.Any])
    __obj.asInstanceOf[PolyBezier]
  }
}

