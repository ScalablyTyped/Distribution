package typings.chartJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// NOTE: This model is generic with a bunch of optional properties to represent all types of chart models.
// Each chart type defines their own unique model structure so some of these optional properties
// might always have values depending on the chart type.
@js.native
trait Model extends js.Object {
  var backgroundColor: String = js.native
  var base: Double = js.native
  var borderAlign: js.UndefOr[BorderAlignment] = js.native
  var borderColor: String = js.native
  var borderWidth: js.UndefOr[Double] = js.native
  var circumference: js.UndefOr[Double] = js.native
  var controlPointNextX: Double = js.native
  var controlPointNextY: Double = js.native
  var controlPointPreviousX: Double = js.native
  var controlPointPreviousY: Double = js.native
  var endAngle: js.UndefOr[Double] = js.native
  var head: Double = js.native
  var hitRadius: Double = js.native
  var innerRadius: js.UndefOr[Double] = js.native
  var outerRadius: js.UndefOr[Double] = js.native
  var pointStyle: String = js.native
  var radius: String = js.native
  var skip: js.UndefOr[Boolean] = js.native
  var startAngle: js.UndefOr[Double] = js.native
  var steppedLine: js.UndefOr[scala.Nothing] = js.native
  var tension: Double = js.native
  var x: Double = js.native
  var y: Double = js.native
}

object Model {
  @scala.inline
  def apply(
    backgroundColor: String,
    base: Double,
    borderColor: String,
    controlPointNextX: Double,
    controlPointNextY: Double,
    controlPointPreviousX: Double,
    controlPointPreviousY: Double,
    head: Double,
    hitRadius: Double,
    pointStyle: String,
    radius: String,
    tension: Double,
    x: Double,
    y: Double
  ): Model = {
    val __obj = js.Dynamic.literal(backgroundColor = backgroundColor.asInstanceOf[js.Any], base = base.asInstanceOf[js.Any], borderColor = borderColor.asInstanceOf[js.Any], controlPointNextX = controlPointNextX.asInstanceOf[js.Any], controlPointNextY = controlPointNextY.asInstanceOf[js.Any], controlPointPreviousX = controlPointPreviousX.asInstanceOf[js.Any], controlPointPreviousY = controlPointPreviousY.asInstanceOf[js.Any], head = head.asInstanceOf[js.Any], hitRadius = hitRadius.asInstanceOf[js.Any], pointStyle = pointStyle.asInstanceOf[js.Any], radius = radius.asInstanceOf[js.Any], tension = tension.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[Model]
  }
  @scala.inline
  implicit class ModelOps[Self <: Model] (val x: Self) extends AnyVal {
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
    def setBackgroundColor(value: String): Self = this.set("backgroundColor", value.asInstanceOf[js.Any])
    @scala.inline
    def setBase(value: Double): Self = this.set("base", value.asInstanceOf[js.Any])
    @scala.inline
    def setBorderColor(value: String): Self = this.set("borderColor", value.asInstanceOf[js.Any])
    @scala.inline
    def setControlPointNextX(value: Double): Self = this.set("controlPointNextX", value.asInstanceOf[js.Any])
    @scala.inline
    def setControlPointNextY(value: Double): Self = this.set("controlPointNextY", value.asInstanceOf[js.Any])
    @scala.inline
    def setControlPointPreviousX(value: Double): Self = this.set("controlPointPreviousX", value.asInstanceOf[js.Any])
    @scala.inline
    def setControlPointPreviousY(value: Double): Self = this.set("controlPointPreviousY", value.asInstanceOf[js.Any])
    @scala.inline
    def setHead(value: Double): Self = this.set("head", value.asInstanceOf[js.Any])
    @scala.inline
    def setHitRadius(value: Double): Self = this.set("hitRadius", value.asInstanceOf[js.Any])
    @scala.inline
    def setPointStyle(value: String): Self = this.set("pointStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def setRadius(value: String): Self = this.set("radius", value.asInstanceOf[js.Any])
    @scala.inline
    def setTension(value: Double): Self = this.set("tension", value.asInstanceOf[js.Any])
    @scala.inline
    def setX(value: Double): Self = this.set("x", value.asInstanceOf[js.Any])
    @scala.inline
    def setY(value: Double): Self = this.set("y", value.asInstanceOf[js.Any])
    @scala.inline
    def setBorderAlign(value: BorderAlignment): Self = this.set("borderAlign", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBorderAlign: Self = this.set("borderAlign", js.undefined)
    @scala.inline
    def setBorderWidth(value: Double): Self = this.set("borderWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBorderWidth: Self = this.set("borderWidth", js.undefined)
    @scala.inline
    def setCircumference(value: Double): Self = this.set("circumference", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCircumference: Self = this.set("circumference", js.undefined)
    @scala.inline
    def setEndAngle(value: Double): Self = this.set("endAngle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEndAngle: Self = this.set("endAngle", js.undefined)
    @scala.inline
    def setInnerRadius(value: Double): Self = this.set("innerRadius", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInnerRadius: Self = this.set("innerRadius", js.undefined)
    @scala.inline
    def setOuterRadius(value: Double): Self = this.set("outerRadius", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOuterRadius: Self = this.set("outerRadius", js.undefined)
    @scala.inline
    def setSkip(value: Boolean): Self = this.set("skip", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSkip: Self = this.set("skip", js.undefined)
    @scala.inline
    def setStartAngle(value: Double): Self = this.set("startAngle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStartAngle: Self = this.set("startAngle", js.undefined)
  }
  
}

