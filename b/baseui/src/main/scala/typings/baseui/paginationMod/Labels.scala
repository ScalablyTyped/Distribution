package typings.baseui.paginationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Labels extends js.Object {
  var nextButton: js.UndefOr[String] = js.native
  var preposition: js.UndefOr[String] = js.native
  var prevButton: js.UndefOr[String] = js.native
}

object Labels {
  @scala.inline
  def apply(): Labels = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Labels]
  }
  @scala.inline
  implicit class LabelsOps[Self <: Labels] (val x: Self) extends AnyVal {
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
    def setNextButton(value: String): Self = this.set("nextButton", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextButton: Self = this.set("nextButton", js.undefined)
    @scala.inline
    def setPreposition(value: String): Self = this.set("preposition", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePreposition: Self = this.set("preposition", js.undefined)
    @scala.inline
    def setPrevButton(value: String): Self = this.set("prevButton", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrevButton: Self = this.set("prevButton", js.undefined)
  }
  
}

