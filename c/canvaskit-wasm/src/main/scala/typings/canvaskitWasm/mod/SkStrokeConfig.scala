package typings.canvaskitWasm.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SkStrokeConfig extends js.Object {
  var cap: js.UndefOr[SkStrokeCap] = js.native
  var join: js.UndefOr[SkStrokeJoin] = js.native
  var miter_limit: js.UndefOr[Double] = js.native
  var precision: js.UndefOr[Double] = js.native
  var width: js.UndefOr[Double] = js.native
}

object SkStrokeConfig {
  @scala.inline
  def apply(): SkStrokeConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SkStrokeConfig]
  }
  @scala.inline
  implicit class SkStrokeConfigOps[Self <: SkStrokeConfig] (val x: Self) extends AnyVal {
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
    def setCap(value: SkStrokeCap): Self = this.set("cap", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCap: Self = this.set("cap", js.undefined)
    @scala.inline
    def setJoin(value: SkStrokeJoin): Self = this.set("join", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteJoin: Self = this.set("join", js.undefined)
    @scala.inline
    def setMiter_limit(value: Double): Self = this.set("miter_limit", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMiter_limit: Self = this.set("miter_limit", js.undefined)
    @scala.inline
    def setPrecision(value: Double): Self = this.set("precision", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrecision: Self = this.set("precision", js.undefined)
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
  
}

