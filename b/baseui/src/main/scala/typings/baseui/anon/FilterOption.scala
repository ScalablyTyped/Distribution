package typings.baseui.anon

import typings.baseui.baseuiStrings.any
import typings.baseui.baseuiStrings.label
import typings.baseui.baseuiStrings.start
import typings.baseui.baseuiStrings.value
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FilterOption extends StObject {
  
  var filterOption: js.UndefOr[
    js.Function2[/* option */ typings.baseui.selectMod.Option, /* filterValue */ String, Boolean]
  ] = js.undefined
  
  var ignoreCase: js.UndefOr[Boolean] = js.undefined
  
  var labelKey: js.UndefOr[String] = js.undefined
  
  var matchPos: js.UndefOr[any | start] = js.undefined
  
  var matchProp: js.UndefOr[any | label | value] = js.undefined
  
  var trimFilter: js.UndefOr[Boolean] = js.undefined
  
  var valueKey: js.UndefOr[String] = js.undefined
}
object FilterOption {
  
  @scala.inline
  def apply(): FilterOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FilterOption]
  }
  
  @scala.inline
  implicit class FilterOptionMutableBuilder[Self <: FilterOption] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFilterOption(value: (/* option */ typings.baseui.selectMod.Option, /* filterValue */ String) => Boolean): Self = StObject.set(x, "filterOption", js.Any.fromFunction2(value))
    
    @scala.inline
    def setFilterOptionUndefined: Self = StObject.set(x, "filterOption", js.undefined)
    
    @scala.inline
    def setIgnoreCase(value: Boolean): Self = StObject.set(x, "ignoreCase", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIgnoreCaseUndefined: Self = StObject.set(x, "ignoreCase", js.undefined)
    
    @scala.inline
    def setLabelKey(value: String): Self = StObject.set(x, "labelKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelKeyUndefined: Self = StObject.set(x, "labelKey", js.undefined)
    
    @scala.inline
    def setMatchPos(value: any | start): Self = StObject.set(x, "matchPos", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMatchPosUndefined: Self = StObject.set(x, "matchPos", js.undefined)
    
    @scala.inline
    def setMatchProp(value: any | label | value): Self = StObject.set(x, "matchProp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMatchPropUndefined: Self = StObject.set(x, "matchProp", js.undefined)
    
    @scala.inline
    def setTrimFilter(value: Boolean): Self = StObject.set(x, "trimFilter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrimFilterUndefined: Self = StObject.set(x, "trimFilter", js.undefined)
    
    @scala.inline
    def setValueKey(value: String): Self = StObject.set(x, "valueKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueKeyUndefined: Self = StObject.set(x, "valueKey", js.undefined)
  }
}
