package typings.baseui

import typings.baseui.anon.PartialdefaultProps
import typings.baseui.anon.Readonlyxstringanyidstrin
import typings.baseui.baseuiStrings.any
import typings.baseui.baseuiStrings.label
import typings.baseui.baseuiStrings.start
import typings.baseui.baseuiStrings.value
import typings.baseui.selectTypesMod.Option
import typings.baseui.selectTypesMod.Value
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object selectUtilsDefaultFilterOptionsMod {
  
  @JSImport("baseui/select/utils/default-filter-options", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(options: Value, filterValue: String): js.Array[Readonlyxstringanyidstrin] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(options.asInstanceOf[js.Any], filterValue.asInstanceOf[js.Any])).asInstanceOf[js.Array[Readonlyxstringanyidstrin]]
  inline def default(options: Value, filterValue: String, excludeOptions: Null, newProps: PartialdefaultProps): js.Array[Readonlyxstringanyidstrin] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(options.asInstanceOf[js.Any], filterValue.asInstanceOf[js.Any], excludeOptions.asInstanceOf[js.Any], newProps.asInstanceOf[js.Any])).asInstanceOf[js.Array[Readonlyxstringanyidstrin]]
  inline def default(options: Value, filterValue: String, excludeOptions: Unit, newProps: PartialdefaultProps): js.Array[Readonlyxstringanyidstrin] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(options.asInstanceOf[js.Any], filterValue.asInstanceOf[js.Any], excludeOptions.asInstanceOf[js.Any], newProps.asInstanceOf[js.Any])).asInstanceOf[js.Array[Readonlyxstringanyidstrin]]
  inline def default(options: Value, filterValue: String, excludeOptions: Value): js.Array[Readonlyxstringanyidstrin] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(options.asInstanceOf[js.Any], filterValue.asInstanceOf[js.Any], excludeOptions.asInstanceOf[js.Any])).asInstanceOf[js.Array[Readonlyxstringanyidstrin]]
  inline def default(options: Value, filterValue: String, excludeOptions: Value, newProps: PartialdefaultProps): js.Array[Readonlyxstringanyidstrin] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(options.asInstanceOf[js.Any], filterValue.asInstanceOf[js.Any], excludeOptions.asInstanceOf[js.Any], newProps.asInstanceOf[js.Any])).asInstanceOf[js.Array[Readonlyxstringanyidstrin]]
  
  trait defaultProps extends StObject {
    
    var filterOption: js.UndefOr[(js.Function2[/* option */ Option, /* filterValue */ String, Boolean]) | Null] = js.undefined
    
    var ignoreCase: Boolean
    
    var labelKey: String
    
    var matchPos: any | start
    
    var matchProp: any | label | value
    
    var trimFilter: Boolean
    
    var valueKey: String
  }
  object defaultProps {
    
    inline def apply(
      ignoreCase: Boolean,
      labelKey: String,
      matchPos: any | start,
      matchProp: any | label | value,
      trimFilter: Boolean,
      valueKey: String
    ): defaultProps = {
      val __obj = js.Dynamic.literal(ignoreCase = ignoreCase.asInstanceOf[js.Any], labelKey = labelKey.asInstanceOf[js.Any], matchPos = matchPos.asInstanceOf[js.Any], matchProp = matchProp.asInstanceOf[js.Any], trimFilter = trimFilter.asInstanceOf[js.Any], valueKey = valueKey.asInstanceOf[js.Any])
      __obj.asInstanceOf[defaultProps]
    }
    
    extension [Self <: defaultProps](x: Self) {
      
      inline def setFilterOption(value: (/* option */ Option, /* filterValue */ String) => Boolean): Self = StObject.set(x, "filterOption", js.Any.fromFunction2(value))
      
      inline def setFilterOptionNull: Self = StObject.set(x, "filterOption", null)
      
      inline def setFilterOptionUndefined: Self = StObject.set(x, "filterOption", js.undefined)
      
      inline def setIgnoreCase(value: Boolean): Self = StObject.set(x, "ignoreCase", value.asInstanceOf[js.Any])
      
      inline def setLabelKey(value: String): Self = StObject.set(x, "labelKey", value.asInstanceOf[js.Any])
      
      inline def setMatchPos(value: any | start): Self = StObject.set(x, "matchPos", value.asInstanceOf[js.Any])
      
      inline def setMatchProp(value: any | label | value): Self = StObject.set(x, "matchProp", value.asInstanceOf[js.Any])
      
      inline def setTrimFilter(value: Boolean): Self = StObject.set(x, "trimFilter", value.asInstanceOf[js.Any])
      
      inline def setValueKey(value: String): Self = StObject.set(x, "valueKey", value.asInstanceOf[js.Any])
    }
  }
}
