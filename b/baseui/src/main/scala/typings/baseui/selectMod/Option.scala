package typings.baseui.selectMod

import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Option
  extends /* key */ StringDictionary[js.Any] {
  val __optgroup: js.UndefOr[String] = js.native
  val clearableValue: js.UndefOr[Boolean] = js.native
  val disabled: js.UndefOr[Boolean] = js.native
  val id: js.UndefOr[String | Double] = js.native
  val isCreatable: js.UndefOr[Boolean] = js.native
  val label: js.UndefOr[ReactNode] = js.native
}

object Option {
  @scala.inline
  def apply(): Option = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Option]
  }
  @scala.inline
  implicit class OptionOps[Self <: Option] (val x: Self) extends AnyVal {
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
    def set__optgroup(value: String): Self = this.set("__optgroup", value.asInstanceOf[js.Any])
    @scala.inline
    def delete__optgroup: Self = this.set("__optgroup", js.undefined)
    @scala.inline
    def setClearableValue(value: Boolean): Self = this.set("clearableValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClearableValue: Self = this.set("clearableValue", js.undefined)
    @scala.inline
    def setDisabled(value: Boolean): Self = this.set("disabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisabled: Self = this.set("disabled", js.undefined)
    @scala.inline
    def setId(value: String | Double): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setIsCreatable(value: Boolean): Self = this.set("isCreatable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsCreatable: Self = this.set("isCreatable", js.undefined)
    @scala.inline
    def setLabel(value: ReactNode): Self = this.set("label", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabel: Self = this.set("label", js.undefined)
  }
  
}

