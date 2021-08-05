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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DropdownProps extends StObject {
  
  var error: js.UndefOr[Boolean] = js.undefined
  
  var getOptionLabel: js.UndefOr[js.Function1[/* args */ OptionState, ReactNode]] = js.undefined
  
  var id: js.UndefOr[String] = js.undefined
  
  var innerRef: js.UndefOr[Ref[js.Any]] = js.undefined
  
  var isLoading: js.UndefOr[Boolean] = js.undefined
  
  var keyboardControlNode: js.UndefOr[Ref[js.Any]] = js.undefined
  
  var labelKey: js.UndefOr[String] = js.undefined
  
  var maxDropdownHeight: js.UndefOr[String] = js.undefined
  
  var multi: js.UndefOr[Boolean] = js.undefined
  
  var noResultsMsg: js.UndefOr[ReactNode] = js.undefined
  
  var onActiveDescendantChange: js.UndefOr[js.Function1[/* id */ js.UndefOr[String], Unit]] = js.undefined
  
  var onItemSelect: js.UndefOr[OnItemSelect] = js.undefined
  
  var options: js.UndefOr[Value] = js.undefined
  
  var overrides: js.UndefOr[DropdownOverrides] = js.undefined
  
  var required: js.UndefOr[Boolean] = js.undefined
  
  var searchable: js.UndefOr[Boolean] = js.undefined
  
  var size: js.UndefOr[mini | default_ | compact | large_] = js.undefined
  
  var `type`: js.UndefOr[select | search] = js.undefined
  
  var value: js.UndefOr[Value] = js.undefined
  
  var valueKey: js.UndefOr[String] = js.undefined
  
  var width: js.UndefOr[Double] = js.undefined
}
object DropdownProps {
  
  inline def apply(): DropdownProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DropdownProps]
  }
  
  extension [Self <: DropdownProps](x: Self) {
    
    inline def setError(value: Boolean): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
    
    inline def setGetOptionLabel(value: /* args */ OptionState => ReactNode): Self = StObject.set(x, "getOptionLabel", js.Any.fromFunction1(value))
    
    inline def setGetOptionLabelUndefined: Self = StObject.set(x, "getOptionLabel", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setInnerRef(value: Ref[js.Any]): Self = StObject.set(x, "innerRef", value.asInstanceOf[js.Any])
    
    inline def setInnerRefFunction1(value: /* instance */ js.Any | Null => Unit): Self = StObject.set(x, "innerRef", js.Any.fromFunction1(value))
    
    inline def setInnerRefNull: Self = StObject.set(x, "innerRef", null)
    
    inline def setInnerRefUndefined: Self = StObject.set(x, "innerRef", js.undefined)
    
    inline def setIsLoading(value: Boolean): Self = StObject.set(x, "isLoading", value.asInstanceOf[js.Any])
    
    inline def setIsLoadingUndefined: Self = StObject.set(x, "isLoading", js.undefined)
    
    inline def setKeyboardControlNode(value: Ref[js.Any]): Self = StObject.set(x, "keyboardControlNode", value.asInstanceOf[js.Any])
    
    inline def setKeyboardControlNodeFunction1(value: /* instance */ js.Any | Null => Unit): Self = StObject.set(x, "keyboardControlNode", js.Any.fromFunction1(value))
    
    inline def setKeyboardControlNodeNull: Self = StObject.set(x, "keyboardControlNode", null)
    
    inline def setKeyboardControlNodeUndefined: Self = StObject.set(x, "keyboardControlNode", js.undefined)
    
    inline def setLabelKey(value: String): Self = StObject.set(x, "labelKey", value.asInstanceOf[js.Any])
    
    inline def setLabelKeyUndefined: Self = StObject.set(x, "labelKey", js.undefined)
    
    inline def setMaxDropdownHeight(value: String): Self = StObject.set(x, "maxDropdownHeight", value.asInstanceOf[js.Any])
    
    inline def setMaxDropdownHeightUndefined: Self = StObject.set(x, "maxDropdownHeight", js.undefined)
    
    inline def setMulti(value: Boolean): Self = StObject.set(x, "multi", value.asInstanceOf[js.Any])
    
    inline def setMultiUndefined: Self = StObject.set(x, "multi", js.undefined)
    
    inline def setNoResultsMsg(value: ReactNode): Self = StObject.set(x, "noResultsMsg", value.asInstanceOf[js.Any])
    
    inline def setNoResultsMsgUndefined: Self = StObject.set(x, "noResultsMsg", js.undefined)
    
    inline def setOnActiveDescendantChange(value: /* id */ js.UndefOr[String] => Unit): Self = StObject.set(x, "onActiveDescendantChange", js.Any.fromFunction1(value))
    
    inline def setOnActiveDescendantChangeUndefined: Self = StObject.set(x, "onActiveDescendantChange", js.undefined)
    
    inline def setOnItemSelect(value: /* args */ Item => js.Any): Self = StObject.set(x, "onItemSelect", js.Any.fromFunction1(value))
    
    inline def setOnItemSelectUndefined: Self = StObject.set(x, "onItemSelect", js.undefined)
    
    inline def setOptions(value: Value): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    
    inline def setOptionsVarargs(value: Option*): Self = StObject.set(x, "options", js.Array(value :_*))
    
    inline def setOverrides(value: DropdownOverrides): Self = StObject.set(x, "overrides", value.asInstanceOf[js.Any])
    
    inline def setOverridesUndefined: Self = StObject.set(x, "overrides", js.undefined)
    
    inline def setRequired(value: Boolean): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
    
    inline def setRequiredUndefined: Self = StObject.set(x, "required", js.undefined)
    
    inline def setSearchable(value: Boolean): Self = StObject.set(x, "searchable", value.asInstanceOf[js.Any])
    
    inline def setSearchableUndefined: Self = StObject.set(x, "searchable", js.undefined)
    
    inline def setSize(value: mini | default_ | compact | large_): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    inline def setType(value: select | search): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setValue(value: Value): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueKey(value: String): Self = StObject.set(x, "valueKey", value.asInstanceOf[js.Any])
    
    inline def setValueKeyUndefined: Self = StObject.set(x, "valueKey", js.undefined)
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    
    inline def setValueVarargs(value: Option*): Self = StObject.set(x, "value", js.Array(value :_*))
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
