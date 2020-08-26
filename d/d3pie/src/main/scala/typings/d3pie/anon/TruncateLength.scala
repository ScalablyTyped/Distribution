package typings.d3pie.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TruncateLength extends js.Object {
  var enabled: js.UndefOr[Boolean] = js.native
  var truncateLength: js.UndefOr[Double] = js.native
}

object TruncateLength {
  @scala.inline
  def apply(): TruncateLength = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TruncateLength]
  }
  @scala.inline
  implicit class TruncateLengthOps[Self <: TruncateLength] (val x: Self) extends AnyVal {
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
    def setEnabled(value: Boolean): Self = this.set("enabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnabled: Self = this.set("enabled", js.undefined)
    @scala.inline
    def setTruncateLength(value: Double): Self = this.set("truncateLength", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTruncateLength: Self = this.set("truncateLength", js.undefined)
  }
  
}

