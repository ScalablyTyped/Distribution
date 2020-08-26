package typings.bemCn.anon

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<bem-cn.bem-cn.BemSettings> */
@js.native
trait PartialBemSettings extends js.Object {
  var classMap: js.UndefOr[Record[String, String]] = js.native
  var el: js.UndefOr[String] = js.native
  var mod: js.UndefOr[String] = js.native
  var modValue: js.UndefOr[String] = js.native
  var ns: js.UndefOr[String] = js.native
}

object PartialBemSettings {
  @scala.inline
  def apply(): PartialBemSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialBemSettings]
  }
  @scala.inline
  implicit class PartialBemSettingsOps[Self <: PartialBemSettings] (val x: Self) extends AnyVal {
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
    def setClassMap(value: Record[String, String]): Self = this.set("classMap", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClassMap: Self = this.set("classMap", js.undefined)
    @scala.inline
    def setEl(value: String): Self = this.set("el", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEl: Self = this.set("el", js.undefined)
    @scala.inline
    def setMod(value: String): Self = this.set("mod", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMod: Self = this.set("mod", js.undefined)
    @scala.inline
    def setModValue(value: String): Self = this.set("modValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteModValue: Self = this.set("modValue", js.undefined)
    @scala.inline
    def setNs(value: String): Self = this.set("ns", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNs: Self = this.set("ns", js.undefined)
  }
  
}

