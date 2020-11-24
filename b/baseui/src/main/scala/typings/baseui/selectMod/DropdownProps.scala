package typings.baseui.selectMod

import typings.baseui.anon.Item
import typings.baseui.anon.OptionState
import typings.baseui.baseuiStrings.compact
import typings.baseui.baseuiStrings.default_
import typings.baseui.baseuiStrings.large_
import typings.baseui.baseuiStrings.mini
import typings.baseui.baseuiStrings.search
import typings.baseui.baseuiStrings.select
import typings.baseui.menuMod.OnItemSelect
import typings.react.mod.ReactNode
import typings.react.mod.Ref
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DropdownProps extends js.Object {
  
  var error: js.UndefOr[Boolean] = js.native
  
  var getOptionLabel: js.UndefOr[js.Function1[/* args */ OptionState, ReactNode]] = js.native
  
  var id: js.UndefOr[String] = js.native
  
  var innerRef: js.UndefOr[Ref[_]] = js.native
  
  var isLoading: js.UndefOr[Boolean] = js.native
  
  var keyboardControlNode: js.UndefOr[Ref[_]] = js.native
  
  var labelKey: js.UndefOr[String] = js.native
  
  var maxDropdownHeight: js.UndefOr[String] = js.native
  
  var multi: js.UndefOr[Boolean] = js.native
  
  var noResultsMsg: js.UndefOr[ReactNode] = js.native
  
  var onActiveDescendantChange: js.UndefOr[js.Function1[/* id */ js.UndefOr[String], Unit]] = js.native
  
  var onItemSelect: js.UndefOr[OnItemSelect] = js.native
  
  var options: js.UndefOr[Value] = js.native
  
  var overrides: js.UndefOr[DropdownOverrides] = js.native
  
  var required: js.UndefOr[Boolean] = js.native
  
  var searchable: js.UndefOr[Boolean] = js.native
  
  var size: js.UndefOr[mini | default_ | compact | large_] = js.native
  
  var `type`: js.UndefOr[select | search] = js.native
  
  var value: js.UndefOr[Value] = js.native
  
  var valueKey: js.UndefOr[String] = js.native
  
  var width: js.UndefOr[Double] = js.native
}
object DropdownProps {
  
  @scala.inline
  def apply(): DropdownProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DropdownProps]
  }
  
  @scala.inline
  implicit class DropdownPropsOps[Self <: DropdownProps] (val x: Self) extends AnyVal {
    
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
    def setError(value: Boolean): Self = this.set("error", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteError: Self = this.set("error", js.undefined)
    
    @scala.inline
    def setGetOptionLabel(value: /* args */ OptionState => ReactNode): Self = this.set("getOptionLabel", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteGetOptionLabel: Self = this.set("getOptionLabel", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    
    @scala.inline
    def setInnerRefFunction1(value: /* instance */ _ | Null => Unit): Self = this.set("innerRef", js.Any.fromFunction1(value))
    
    @scala.inline
    def setInnerRef(value: Ref[_]): Self = this.set("innerRef", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInnerRef: Self = this.set("innerRef", js.undefined)
    
    @scala.inline
    def setInnerRefNull: Self = this.set("innerRef", null)
    
    @scala.inline
    def setIsLoading(value: Boolean): Self = this.set("isLoading", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsLoading: Self = this.set("isLoading", js.undefined)
    
    @scala.inline
    def setKeyboardControlNodeFunction1(value: /* instance */ _ | Null => Unit): Self = this.set("keyboardControlNode", js.Any.fromFunction1(value))
    
    @scala.inline
    def setKeyboardControlNode(value: Ref[_]): Self = this.set("keyboardControlNode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKeyboardControlNode: Self = this.set("keyboardControlNode", js.undefined)
    
    @scala.inline
    def setKeyboardControlNodeNull: Self = this.set("keyboardControlNode", null)
    
    @scala.inline
    def setLabelKey(value: String): Self = this.set("labelKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabelKey: Self = this.set("labelKey", js.undefined)
    
    @scala.inline
    def setMaxDropdownHeight(value: String): Self = this.set("maxDropdownHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxDropdownHeight: Self = this.set("maxDropdownHeight", js.undefined)
    
    @scala.inline
    def setMulti(value: Boolean): Self = this.set("multi", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMulti: Self = this.set("multi", js.undefined)
    
    @scala.inline
    def setNoResultsMsg(value: ReactNode): Self = this.set("noResultsMsg", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNoResultsMsg: Self = this.set("noResultsMsg", js.undefined)
    
    @scala.inline
    def setOnActiveDescendantChange(value: /* id */ js.UndefOr[String] => Unit): Self = this.set("onActiveDescendantChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnActiveDescendantChange: Self = this.set("onActiveDescendantChange", js.undefined)
    
    @scala.inline
    def setOnItemSelect(value: /* args */ Item => js.Any): Self = this.set("onItemSelect", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnItemSelect: Self = this.set("onItemSelect", js.undefined)
    
    @scala.inline
    def setOptionsVarargs(value: Option*): Self = this.set("options", js.Array(value :_*))
    
    @scala.inline
    def setOptions(value: Value): Self = this.set("options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOptions: Self = this.set("options", js.undefined)
    
    @scala.inline
    def setOverrides(value: DropdownOverrides): Self = this.set("overrides", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOverrides: Self = this.set("overrides", js.undefined)
    
    @scala.inline
    def setRequired(value: Boolean): Self = this.set("required", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRequired: Self = this.set("required", js.undefined)
    
    @scala.inline
    def setSearchable(value: Boolean): Self = this.set("searchable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSearchable: Self = this.set("searchable", js.undefined)
    
    @scala.inline
    def setSize(value: mini | default_ | compact | large_): Self = this.set("size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
    
    @scala.inline
    def setType(value: select | search): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    
    @scala.inline
    def setValueVarargs(value: Option*): Self = this.set("value", js.Array(value :_*))
    
    @scala.inline
    def setValue(value: Value): Self = this.set("value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
    
    @scala.inline
    def setValueKey(value: String): Self = this.set("valueKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValueKey: Self = this.set("valueKey", js.undefined)
    
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
}
