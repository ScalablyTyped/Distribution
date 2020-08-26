package typings.bezierJs.BezierJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Poly Bezier
  * @param {[type]} curves [description]
  */
@js.native
trait PolyBezier extends js.Object {
  var _3d: js.Any = js.native
  var curves: js.Array[Bezier] = js.native
  var points: js.Array[Point] = js.native
  def addCurve(curve: Bezier): Unit = js.native
  def bbox(): BBox = js.native
  def curve(idx: Double): Bezier = js.native
  def length(): Double = js.native
  def offset(d: Double): PolyBezier = js.native
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
  @scala.inline
  implicit class PolyBezierOps[Self <: PolyBezier] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def set_3d(value: js.Any): Self = this.set("_3d", value.asInstanceOf[js.Any])
    @scala.inline
    def setAddCurve(value: Bezier => Unit): Self = this.set("addCurve", js.Any.fromFunction1(value))
    @scala.inline
    def setBbox(value: () => BBox): Self = this.set("bbox", js.Any.fromFunction0(value))
    @scala.inline
    def setCurve(value: Double => Bezier): Self = this.set("curve", js.Any.fromFunction1(value))
    @scala.inline
    def setCurvesVarargs(value: Bezier*): Self = this.set("curves", js.Array(value :_*))
    @scala.inline
    def setCurves(value: js.Array[Bezier]): Self = this.set("curves", value.asInstanceOf[js.Any])
    @scala.inline
    def setLength(value: () => Double): Self = this.set("length", js.Any.fromFunction0(value))
    @scala.inline
    def setOffset(value: Double => PolyBezier): Self = this.set("offset", js.Any.fromFunction1(value))
    @scala.inline
    def setPointsVarargs(value: Point*): Self = this.set("points", js.Array(value :_*))
    @scala.inline
    def setPoints(value: js.Array[Point]): Self = this.set("points", value.asInstanceOf[js.Any])
  }
  
}

