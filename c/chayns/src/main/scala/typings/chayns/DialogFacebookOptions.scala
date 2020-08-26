package typings.chayns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DialogFacebookOptions extends js.Object {
  var button: js.UndefOr[js.Array[DialogFacebookButton]] = js.native
  var message: js.UndefOr[String] = js.native
  var multiselect: js.UndefOr[Double] = js.native
  var preSelected: js.Array[Double] = js.native
  var quickfind: js.UndefOr[Double] = js.native
  var title: String = js.native
}

object DialogFacebookOptions {
  @scala.inline
  def apply(preSelected: js.Array[Double], title: String): DialogFacebookOptions = {
    val __obj = js.Dynamic.literal(preSelected = preSelected.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[DialogFacebookOptions]
  }
  @scala.inline
  implicit class DialogFacebookOptionsOps[Self <: DialogFacebookOptions] (val x: Self) extends AnyVal {
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
    def setPreSelectedVarargs(value: Double*): Self = this.set("preSelected", js.Array(value :_*))
    @scala.inline
    def setPreSelected(value: js.Array[Double]): Self = this.set("preSelected", value.asInstanceOf[js.Any])
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def setButtonVarargs(value: DialogFacebookButton*): Self = this.set("button", js.Array(value :_*))
    @scala.inline
    def setButton(value: js.Array[DialogFacebookButton]): Self = this.set("button", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteButton: Self = this.set("button", js.undefined)
    @scala.inline
    def setMessage(value: String): Self = this.set("message", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMessage: Self = this.set("message", js.undefined)
    @scala.inline
    def setMultiselect(value: Double): Self = this.set("multiselect", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMultiselect: Self = this.set("multiselect", js.undefined)
    @scala.inline
    def setQuickfind(value: Double): Self = this.set("quickfind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQuickfind: Self = this.set("quickfind", js.undefined)
  }
  
}

