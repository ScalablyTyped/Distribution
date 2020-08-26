package typings.canvasGauges.CanvasGauges

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RadialGaugeOptions extends GenericOptions {
  var animationTarget: js.UndefOr[String] = js.native
  var colorNeedleCircleInner: js.UndefOr[String] = js.native
  var colorNeedleCircleInnerEnd: js.UndefOr[String] = js.native
  var colorNeedleCircleOuter: js.UndefOr[String] = js.native
  var colorNeedleCircleOuterEnd: js.UndefOr[String] = js.native
  var needleCircleInner: js.UndefOr[Boolean] = js.native
  var needleCircleOuter: js.UndefOr[Boolean] = js.native
  var needleCircleSize: js.UndefOr[Double] = js.native
  var startAngle: js.UndefOr[Double] = js.native
  var ticksAngle: js.UndefOr[Double] = js.native
  var useMinPath: js.UndefOr[Boolean] = js.native
}

object RadialGaugeOptions {
  @scala.inline
  def apply(renderTo: RenderTarget): RadialGaugeOptions = {
    val __obj = js.Dynamic.literal(renderTo = renderTo.asInstanceOf[js.Any])
    __obj.asInstanceOf[RadialGaugeOptions]
  }
  @scala.inline
  implicit class RadialGaugeOptionsOps[Self <: RadialGaugeOptions] (val x: Self) extends AnyVal {
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
    def setAnimationTarget(value: String): Self = this.set("animationTarget", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAnimationTarget: Self = this.set("animationTarget", js.undefined)
    @scala.inline
    def setColorNeedleCircleInner(value: String): Self = this.set("colorNeedleCircleInner", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColorNeedleCircleInner: Self = this.set("colorNeedleCircleInner", js.undefined)
    @scala.inline
    def setColorNeedleCircleInnerEnd(value: String): Self = this.set("colorNeedleCircleInnerEnd", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColorNeedleCircleInnerEnd: Self = this.set("colorNeedleCircleInnerEnd", js.undefined)
    @scala.inline
    def setColorNeedleCircleOuter(value: String): Self = this.set("colorNeedleCircleOuter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColorNeedleCircleOuter: Self = this.set("colorNeedleCircleOuter", js.undefined)
    @scala.inline
    def setColorNeedleCircleOuterEnd(value: String): Self = this.set("colorNeedleCircleOuterEnd", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColorNeedleCircleOuterEnd: Self = this.set("colorNeedleCircleOuterEnd", js.undefined)
    @scala.inline
    def setNeedleCircleInner(value: Boolean): Self = this.set("needleCircleInner", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNeedleCircleInner: Self = this.set("needleCircleInner", js.undefined)
    @scala.inline
    def setNeedleCircleOuter(value: Boolean): Self = this.set("needleCircleOuter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNeedleCircleOuter: Self = this.set("needleCircleOuter", js.undefined)
    @scala.inline
    def setNeedleCircleSize(value: Double): Self = this.set("needleCircleSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNeedleCircleSize: Self = this.set("needleCircleSize", js.undefined)
    @scala.inline
    def setStartAngle(value: Double): Self = this.set("startAngle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStartAngle: Self = this.set("startAngle", js.undefined)
    @scala.inline
    def setTicksAngle(value: Double): Self = this.set("ticksAngle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTicksAngle: Self = this.set("ticksAngle", js.undefined)
    @scala.inline
    def setUseMinPath(value: Boolean): Self = this.set("useMinPath", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUseMinPath: Self = this.set("useMinPath", js.undefined)
  }
  
}

