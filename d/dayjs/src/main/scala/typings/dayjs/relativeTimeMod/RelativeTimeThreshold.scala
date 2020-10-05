package typings.dayjs.relativeTimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RelativeTimeThreshold extends js.Object {
  var d: js.UndefOr[String] = js.native
  var l: String = js.native
  var r: js.UndefOr[Double] = js.native
}

object RelativeTimeThreshold {
  @scala.inline
  def apply(l: String): RelativeTimeThreshold = {
    val __obj = js.Dynamic.literal(l = l.asInstanceOf[js.Any])
    __obj.asInstanceOf[RelativeTimeThreshold]
  }
  @scala.inline
  implicit class RelativeTimeThresholdOps[Self <: RelativeTimeThreshold] (val x: Self) extends AnyVal {
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
    def setL(value: String): Self = this.set("l", value.asInstanceOf[js.Any])
    @scala.inline
    def setD(value: String): Self = this.set("d", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteD: Self = this.set("d", js.undefined)
    @scala.inline
    def setR(value: Double): Self = this.set("r", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteR: Self = this.set("r", js.undefined)
  }
  
}

