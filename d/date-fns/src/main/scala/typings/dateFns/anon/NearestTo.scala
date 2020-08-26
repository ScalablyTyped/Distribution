package typings.dateFns.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NearestTo extends js.Object {
  var nearestTo: js.UndefOr[Double] = js.native
}

object NearestTo {
  @scala.inline
  def apply(): NearestTo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NearestTo]
  }
  @scala.inline
  implicit class NearestToOps[Self <: NearestTo] (val x: Self) extends AnyVal {
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
    def setNearestTo(value: Double): Self = this.set("nearestTo", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNearestTo: Self = this.set("nearestTo", js.undefined)
  }
  
}

