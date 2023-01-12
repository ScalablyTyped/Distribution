package typings.baseui.anon

import typings.baseui.baseuiStrings.any
import typings.baseui.baseuiStrings.label
import typings.baseui.baseuiStrings.start
import typings.baseui.baseuiStrings.value
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<{filterOption (option : std.Readonly<{[x: string] : any,   id :string | number | undefined,   label :react.react.ReactNode | undefined,   disabled :boolean | undefined,   clearableValue :boolean | undefined,   isCreatable :boolean | undefined,   __optgroup :string | undefined}>, filterValue : string): boolean,   ignoreCase :boolean,   labelKey :string,   matchPos :'start' | 'any',   matchProp :'label' | 'value' | 'any',   trimFilter :boolean,   valueKey :string}> */
trait PartialfilterOptionoption extends StObject {
  
  var filterOption: js.UndefOr[
    js.Function2[/* option */ Readonlyxstringanyidstrin, /* filterValue */ String, Boolean]
  ] = js.undefined
  
  var ignoreCase: js.UndefOr[Boolean] = js.undefined
  
  var labelKey: js.UndefOr[String] = js.undefined
  
  var matchPos: js.UndefOr[start | any] = js.undefined
  
  var matchProp: js.UndefOr[label | value | any] = js.undefined
  
  var trimFilter: js.UndefOr[Boolean] = js.undefined
  
  var valueKey: js.UndefOr[String] = js.undefined
}
object PartialfilterOptionoption {
  
  inline def apply(): PartialfilterOptionoption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialfilterOptionoption]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PartialfilterOptionoption] (val x: Self) extends AnyVal {
    
    inline def setFilterOption(value: (/* option */ Readonlyxstringanyidstrin, /* filterValue */ String) => Boolean): Self = StObject.set(x, "filterOption", js.Any.fromFunction2(value))
    
    inline def setFilterOptionUndefined: Self = StObject.set(x, "filterOption", js.undefined)
    
    inline def setIgnoreCase(value: Boolean): Self = StObject.set(x, "ignoreCase", value.asInstanceOf[js.Any])
    
    inline def setIgnoreCaseUndefined: Self = StObject.set(x, "ignoreCase", js.undefined)
    
    inline def setLabelKey(value: String): Self = StObject.set(x, "labelKey", value.asInstanceOf[js.Any])
    
    inline def setLabelKeyUndefined: Self = StObject.set(x, "labelKey", js.undefined)
    
    inline def setMatchPos(value: start | any): Self = StObject.set(x, "matchPos", value.asInstanceOf[js.Any])
    
    inline def setMatchPosUndefined: Self = StObject.set(x, "matchPos", js.undefined)
    
    inline def setMatchProp(value: label | value | any): Self = StObject.set(x, "matchProp", value.asInstanceOf[js.Any])
    
    inline def setMatchPropUndefined: Self = StObject.set(x, "matchProp", js.undefined)
    
    inline def setTrimFilter(value: Boolean): Self = StObject.set(x, "trimFilter", value.asInstanceOf[js.Any])
    
    inline def setTrimFilterUndefined: Self = StObject.set(x, "trimFilter", js.undefined)
    
    inline def setValueKey(value: String): Self = StObject.set(x, "valueKey", value.asInstanceOf[js.Any])
    
    inline def setValueKeyUndefined: Self = StObject.set(x, "valueKey", js.undefined)
  }
}
