package typings.azdata.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DropDownProperties extends ComponentProperties {
  var editable: js.UndefOr[Boolean] = js.native
  var fireOnTextChange: js.UndefOr[Boolean] = js.native
  var required: js.UndefOr[Boolean] = js.native
  var value: js.UndefOr[String | CategoryValue] = js.native
  var values: js.UndefOr[js.Array[CategoryValue | String]] = js.native
}

object DropDownProperties {
  @scala.inline
  def apply(): DropDownProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DropDownProperties]
  }
  @scala.inline
  implicit class DropDownPropertiesOps[Self <: DropDownProperties] (val x: Self) extends AnyVal {
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
    def setEditable(value: Boolean): Self = this.set("editable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEditable: Self = this.set("editable", js.undefined)
    @scala.inline
    def setFireOnTextChange(value: Boolean): Self = this.set("fireOnTextChange", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFireOnTextChange: Self = this.set("fireOnTextChange", js.undefined)
    @scala.inline
    def setRequired(value: Boolean): Self = this.set("required", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRequired: Self = this.set("required", js.undefined)
    @scala.inline
    def setValue(value: String | CategoryValue): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
    @scala.inline
    def setValuesVarargs(value: (CategoryValue | String)*): Self = this.set("values", js.Array(value :_*))
    @scala.inline
    def setValues(value: js.Array[CategoryValue | String]): Self = this.set("values", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValues: Self = this.set("values", js.undefined)
  }
  
}

