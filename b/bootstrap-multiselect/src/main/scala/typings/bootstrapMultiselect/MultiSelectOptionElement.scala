package typings.bootstrapMultiselect

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MultiSelectOptionElement extends js.Object {
  var attributes: js.UndefOr[StringDictionary[js.Any]] = js.native
  var children: js.UndefOr[js.Array[MultiSelectOptionElement]] = js.native
  var disabled: js.UndefOr[Boolean] = js.native
  var label: String = js.native
  var selected: js.UndefOr[Boolean] = js.native
  var title: js.UndefOr[String] = js.native
  var value: js.UndefOr[String | Double] = js.native
}

object MultiSelectOptionElement {
  @scala.inline
  def apply(label: String): MultiSelectOptionElement = {
    val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[MultiSelectOptionElement]
  }
  @scala.inline
  implicit class MultiSelectOptionElementOps[Self <: MultiSelectOptionElement] (val x: Self) extends AnyVal {
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
    def setLabel(value: String): Self = this.set("label", value.asInstanceOf[js.Any])
    @scala.inline
    def setAttributes(value: StringDictionary[js.Any]): Self = this.set("attributes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAttributes: Self = this.set("attributes", js.undefined)
    @scala.inline
    def setChildrenVarargs(value: MultiSelectOptionElement*): Self = this.set("children", js.Array(value :_*))
    @scala.inline
    def setChildren(value: js.Array[MultiSelectOptionElement]): Self = this.set("children", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChildren: Self = this.set("children", js.undefined)
    @scala.inline
    def setDisabled(value: Boolean): Self = this.set("disabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisabled: Self = this.set("disabled", js.undefined)
    @scala.inline
    def setSelected(value: Boolean): Self = this.set("selected", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelected: Self = this.set("selected", js.undefined)
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
    @scala.inline
    def setValue(value: String | Double): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
  
}

