package typings.ckeditor.CKEDITOR.htmlParser

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ruleOptions extends js.Object {
  var applyToAll: js.UndefOr[Boolean] = js.native
  var excludeNestedEditable: js.UndefOr[Boolean] = js.native
}

object ruleOptions {
  @scala.inline
  def apply(): ruleOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ruleOptions]
  }
  @scala.inline
  implicit class ruleOptionsOps[Self <: ruleOptions] (val x: Self) extends AnyVal {
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
    def setApplyToAll(value: Boolean): Self = this.set("applyToAll", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteApplyToAll: Self = this.set("applyToAll", js.undefined)
    @scala.inline
    def setExcludeNestedEditable(value: Boolean): Self = this.set("excludeNestedEditable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExcludeNestedEditable: Self = this.set("excludeNestedEditable", js.undefined)
  }
  
}

