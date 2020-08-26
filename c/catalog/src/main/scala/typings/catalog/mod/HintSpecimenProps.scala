package typings.catalog.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HintSpecimenProps extends js.Object {
  var directive: js.UndefOr[Boolean] = js.native
  var important: js.UndefOr[Boolean] = js.native
  var neutral: js.UndefOr[Boolean] = js.native
  var warning: js.UndefOr[Boolean] = js.native
}

object HintSpecimenProps {
  @scala.inline
  def apply(): HintSpecimenProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HintSpecimenProps]
  }
  @scala.inline
  implicit class HintSpecimenPropsOps[Self <: HintSpecimenProps] (val x: Self) extends AnyVal {
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
    def setDirective(value: Boolean): Self = this.set("directive", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDirective: Self = this.set("directive", js.undefined)
    @scala.inline
    def setImportant(value: Boolean): Self = this.set("important", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteImportant: Self = this.set("important", js.undefined)
    @scala.inline
    def setNeutral(value: Boolean): Self = this.set("neutral", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNeutral: Self = this.set("neutral", js.undefined)
    @scala.inline
    def setWarning(value: Boolean): Self = this.set("warning", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWarning: Self = this.set("warning", js.undefined)
  }
  
}

