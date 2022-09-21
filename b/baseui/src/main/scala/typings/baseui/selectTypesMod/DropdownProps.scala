package typings.baseui.selectTypesMod

import typings.baseui.anon.Item
import typings.baseui.menuTypesMod.OnItemSelectFn
import typings.react.mod.ReactNode
import typings.react.mod.Ref
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DropdownProps extends StObject {
  
  var error: Boolean
  
  def getOptionLabel(a: typings.baseui.anon.Option): ReactNode
  
  var id: js.UndefOr[String] = js.undefined
  
  var innerRef: Ref[HTMLElement]
  
  var isLoading: Boolean
  
  var keyboardControlNode: js.UndefOr[Ref[HTMLElement]] = js.undefined
  
  var labelKey: String
  
  var maxDropdownHeight: String
  
  var multi: Boolean
  
  var noResultsMsg: js.UndefOr[ReactNode] = js.undefined
  
  var onActiveDescendantChange: js.UndefOr[js.Function1[/* id */ js.UndefOr[String], Any]] = js.undefined
  
  var onItemSelect: OnItemSelectFn
  
  var options: Value
  
  var overrides: js.UndefOr[OverridesDropdown] = js.undefined
  
  var required: Boolean
  
  var searchable: Boolean
  
  var size: Size
  
  var `type`: Type
  
  var value: Value
  
  var valueKey: String
  
  var width: js.UndefOr[Double | Null] = js.undefined
}
object DropdownProps {
  
  inline def apply(
    error: Boolean,
    getOptionLabel: typings.baseui.anon.Option => ReactNode,
    isLoading: Boolean,
    labelKey: String,
    maxDropdownHeight: String,
    multi: Boolean,
    onItemSelect: /* a */ Item => Any,
    options: Value,
    required: Boolean,
    searchable: Boolean,
    size: Size,
    `type`: Type,
    value: Value,
    valueKey: String
  ): DropdownProps = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], getOptionLabel = js.Any.fromFunction1(getOptionLabel), isLoading = isLoading.asInstanceOf[js.Any], labelKey = labelKey.asInstanceOf[js.Any], maxDropdownHeight = maxDropdownHeight.asInstanceOf[js.Any], multi = multi.asInstanceOf[js.Any], onItemSelect = js.Any.fromFunction1(onItemSelect), options = options.asInstanceOf[js.Any], required = required.asInstanceOf[js.Any], searchable = searchable.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any], valueKey = valueKey.asInstanceOf[js.Any], innerRef = null)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DropdownProps]
  }
  
  extension [Self <: DropdownProps](x: Self) {
    
    inline def setError(value: Boolean): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    inline def setGetOptionLabel(value: typings.baseui.anon.Option => ReactNode): Self = StObject.set(x, "getOptionLabel", js.Any.fromFunction1(value))
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setInnerRef(value: Ref[HTMLElement]): Self = StObject.set(x, "innerRef", value.asInstanceOf[js.Any])
    
    inline def setInnerRefFunction1(value: /* instance */ HTMLElement | Null => Unit): Self = StObject.set(x, "innerRef", js.Any.fromFunction1(value))
    
    inline def setInnerRefNull: Self = StObject.set(x, "innerRef", null)
    
    inline def setIsLoading(value: Boolean): Self = StObject.set(x, "isLoading", value.asInstanceOf[js.Any])
    
    inline def setKeyboardControlNode(value: Ref[HTMLElement]): Self = StObject.set(x, "keyboardControlNode", value.asInstanceOf[js.Any])
    
    inline def setKeyboardControlNodeFunction1(value: /* instance */ HTMLElement | Null => Unit): Self = StObject.set(x, "keyboardControlNode", js.Any.fromFunction1(value))
    
    inline def setKeyboardControlNodeNull: Self = StObject.set(x, "keyboardControlNode", null)
    
    inline def setKeyboardControlNodeUndefined: Self = StObject.set(x, "keyboardControlNode", js.undefined)
    
    inline def setLabelKey(value: String): Self = StObject.set(x, "labelKey", value.asInstanceOf[js.Any])
    
    inline def setMaxDropdownHeight(value: String): Self = StObject.set(x, "maxDropdownHeight", value.asInstanceOf[js.Any])
    
    inline def setMulti(value: Boolean): Self = StObject.set(x, "multi", value.asInstanceOf[js.Any])
    
    inline def setNoResultsMsg(value: ReactNode): Self = StObject.set(x, "noResultsMsg", value.asInstanceOf[js.Any])
    
    inline def setNoResultsMsgUndefined: Self = StObject.set(x, "noResultsMsg", js.undefined)
    
    inline def setOnActiveDescendantChange(value: /* id */ js.UndefOr[String] => Any): Self = StObject.set(x, "onActiveDescendantChange", js.Any.fromFunction1(value))
    
    inline def setOnActiveDescendantChangeUndefined: Self = StObject.set(x, "onActiveDescendantChange", js.undefined)
    
    inline def setOnItemSelect(value: /* a */ Item => Any): Self = StObject.set(x, "onItemSelect", js.Any.fromFunction1(value))
    
    inline def setOptions(value: Value): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setOptionsVarargs(value: Option*): Self = StObject.set(x, "options", js.Array(value*))
    
    inline def setOverrides(value: OverridesDropdown): Self = StObject.set(x, "overrides", value.asInstanceOf[js.Any])
    
    inline def setOverridesUndefined: Self = StObject.set(x, "overrides", js.undefined)
    
    inline def setRequired(value: Boolean): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
    
    inline def setSearchable(value: Boolean): Self = StObject.set(x, "searchable", value.asInstanceOf[js.Any])
    
    inline def setSize(value: Size): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setType(value: Type): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setValue(value: Value): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueKey(value: String): Self = StObject.set(x, "valueKey", value.asInstanceOf[js.Any])
    
    inline def setValueVarargs(value: Option*): Self = StObject.set(x, "value", js.Array(value*))
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthNull: Self = StObject.set(x, "width", null)
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
