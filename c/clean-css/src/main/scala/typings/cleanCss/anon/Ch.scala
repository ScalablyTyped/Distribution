package typings.cleanCss.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Ch extends js.Object {
  /**
    * Controls treating `ch` as a supported unit; defaults to `true`
    */
  var ch: js.UndefOr[Boolean] = js.native
  /**
    * Controls treating `in` as a supported unit; defaults to `true`
    */
  var in: js.UndefOr[Boolean] = js.native
  /**
    * Controls treating `pc` as a supported unit; defaults to `true`
    */
  var pc: js.UndefOr[Boolean] = js.native
  /**
    * Controls treating `pt` as a supported unit; defaults to `true`
    */
  var pt: js.UndefOr[Boolean] = js.native
  /**
    * Controls treating `rem` as a supported unit; defaults to `true`
    */
  var rem: js.UndefOr[Boolean] = js.native
  /**
    * Controls treating `vh` as a supported unit; defaults to `true`
    */
  var vh: js.UndefOr[Boolean] = js.native
  /**
    * Controls treating `vm` as a supported unit; defaults to `true`
    */
  var vm: js.UndefOr[Boolean] = js.native
  /**
    * Controls treating `vmax` as a supported unit; defaults to `true`
    */
  var vmax: js.UndefOr[Boolean] = js.native
  /**
    * Controls treating `vmin` as a supported unit; defaults to `true`
    */
  var vmin: js.UndefOr[Boolean] = js.native
}

object Ch {
  @scala.inline
  def apply(): Ch = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Ch]
  }
  @scala.inline
  implicit class ChOps[Self <: Ch] (val x: Self) extends AnyVal {
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
    def setCh(value: Boolean): Self = this.set("ch", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCh: Self = this.set("ch", js.undefined)
    @scala.inline
    def setIn(value: Boolean): Self = this.set("in", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIn: Self = this.set("in", js.undefined)
    @scala.inline
    def setPc(value: Boolean): Self = this.set("pc", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePc: Self = this.set("pc", js.undefined)
    @scala.inline
    def setPt(value: Boolean): Self = this.set("pt", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePt: Self = this.set("pt", js.undefined)
    @scala.inline
    def setRem(value: Boolean): Self = this.set("rem", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRem: Self = this.set("rem", js.undefined)
    @scala.inline
    def setVh(value: Boolean): Self = this.set("vh", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVh: Self = this.set("vh", js.undefined)
    @scala.inline
    def setVm(value: Boolean): Self = this.set("vm", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVm: Self = this.set("vm", js.undefined)
    @scala.inline
    def setVmax(value: Boolean): Self = this.set("vmax", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVmax: Self = this.set("vmax", js.undefined)
    @scala.inline
    def setVmin(value: Boolean): Self = this.set("vmin", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVmin: Self = this.set("vmin", js.undefined)
  }
  
}

