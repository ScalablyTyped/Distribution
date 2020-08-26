package typings.bizcharts.anon

import typings.bizcharts.mod.GeomAdjustType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DodgeBy extends js.Object {
  var dodgeBy: js.UndefOr[String] = js.native
  var marginRatio: js.UndefOr[Double] = js.native
  var `type`: js.UndefOr[GeomAdjustType] = js.native
}

object DodgeBy {
  @scala.inline
  def apply(): DodgeBy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DodgeBy]
  }
  @scala.inline
  implicit class DodgeByOps[Self <: DodgeBy] (val x: Self) extends AnyVal {
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
    def setDodgeBy(value: String): Self = this.set("dodgeBy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDodgeBy: Self = this.set("dodgeBy", js.undefined)
    @scala.inline
    def setMarginRatio(value: Double): Self = this.set("marginRatio", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMarginRatio: Self = this.set("marginRatio", js.undefined)
    @scala.inline
    def setType(value: GeomAdjustType): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
  
}

