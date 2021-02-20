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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DropdownProps extends StObject {
  
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
  implicit class DropdownPropsMutableBuilder[Self <: DropdownProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setError(value: Boolean): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
    
    @scala.inline
    def setGetOptionLabel(value: /* args */ OptionState => ReactNode): Self = StObject.set(x, "getOptionLabel", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetOptionLabelUndefined: Self = StObject.set(x, "getOptionLabel", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setInnerRef(value: Ref[_]): Self = StObject.set(x, "innerRef", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInnerRefFunction1(value: /* instance */ _ | Null => Unit): Self = StObject.set(x, "innerRef", js.Any.fromFunction1(value))
    
    @scala.inline
    def setInnerRefNull: Self = StObject.set(x, "innerRef", null)
    
    @scala.inline
    def setInnerRefUndefined: Self = StObject.set(x, "innerRef", js.undefined)
    
    @scala.inline
    def setIsLoading(value: Boolean): Self = StObject.set(x, "isLoading", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsLoadingUndefined: Self = StObject.set(x, "isLoading", js.undefined)
    
    @scala.inline
    def setKeyboardControlNode(value: Ref[_]): Self = StObject.set(x, "keyboardControlNode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyboardControlNodeFunction1(value: /* instance */ _ | Null => Unit): Self = StObject.set(x, "keyboardControlNode", js.Any.fromFunction1(value))
    
    @scala.inline
    def setKeyboardControlNodeNull: Self = StObject.set(x, "keyboardControlNode", null)
    
    @scala.inline
    def setKeyboardControlNodeUndefined: Self = StObject.set(x, "keyboardControlNode", js.undefined)
    
    @scala.inline
    def setLabelKey(value: String): Self = StObject.set(x, "labelKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelKeyUndefined: Self = StObject.set(x, "labelKey", js.undefined)
    
    @scala.inline
    def setMaxDropdownHeight(value: String): Self = StObject.set(x, "maxDropdownHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxDropdownHeightUndefined: Self = StObject.set(x, "maxDropdownHeight", js.undefined)
    
    @scala.inline
    def setMulti(value: Boolean): Self = StObject.set(x, "multi", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMultiUndefined: Self = StObject.set(x, "multi", js.undefined)
    
    @scala.inline
    def setNoResultsMsg(value: ReactNode): Self = StObject.set(x, "noResultsMsg", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNoResultsMsgUndefined: Self = StObject.set(x, "noResultsMsg", js.undefined)
    
    @scala.inline
    def setOnActiveDescendantChange(value: /* id */ js.UndefOr[String] => Unit): Self = StObject.set(x, "onActiveDescendantChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnActiveDescendantChangeUndefined: Self = StObject.set(x, "onActiveDescendantChange", js.undefined)
    
    @scala.inline
    def setOnItemSelect(value: /* args */ Item => js.Any): Self = StObject.set(x, "onItemSelect", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnItemSelectUndefined: Self = StObject.set(x, "onItemSelect", js.undefined)
    
    @scala.inline
    def setOptions(value: Value): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    
    @scala.inline
    def setOptionsVarargs(value: Option*): Self = StObject.set(x, "options", js.Array(value :_*))
    
    @scala.inline
    def setOverrides(value: DropdownOverrides): Self = StObject.set(x, "overrides", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOverridesUndefined: Self = StObject.set(x, "overrides", js.undefined)
    
    @scala.inline
    def setRequired(value: Boolean): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequiredUndefined: Self = StObject.set(x, "required", js.undefined)
    
    @scala.inline
    def setSearchable(value: Boolean): Self = StObject.set(x, "searchable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSearchableUndefined: Self = StObject.set(x, "searchable", js.undefined)
    
    @scala.inline
    def setSize(value: mini | default_ | compact | large_): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    @scala.inline
    def setType(value: select | search): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    @scala.inline
    def setValue(value: Value): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueKey(value: String): Self = StObject.set(x, "valueKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueKeyUndefined: Self = StObject.set(x, "valueKey", js.undefined)
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    
    @scala.inline
    def setValueVarargs(value: Option*): Self = StObject.set(x, "value", js.Array(value :_*))
    
    @scala.inline
    def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
