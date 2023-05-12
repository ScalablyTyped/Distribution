package typings.baseui.anon

import typings.baseui.phoneInputTypesMod.mapIsoToLabel
import typings.react.mod.ReactElement
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined baseui.baseui/phone-input/types.CountrySelectDropdownProps & {  $forwardedRef :react.react.Ref<std.HTMLElement> | (a : null | std.HTMLElement): unknown} & react.react.RefAttributes<std.HTMLElement> */
trait CountrySelectDropdownProp extends StObject {
  
  @JSName("$country")
  var $country: typings.baseui.phoneInputTypesMod.Country
  
  @JSName("$forwardedRef")
  var $forwardedRef: typings.react.mod.Ref[HTMLElement] | (js.Function1[/* a */ Null | HTMLElement, Any])
  
  @JSName("$mapIsoToLabel")
  var $mapIsoToLabel: js.UndefOr[mapIsoToLabel] = js.undefined
  
  @JSName("$maxDropdownHeight")
  var $maxDropdownHeight: String
  
  @JSName("$noResultsMsg")
  var $noResultsMsg: String
  
  @JSName("$overrides")
  var $overrides: CountrySelectContainer
  
  var children: js.Array[ReactElement]
  
  var key: js.UndefOr[typings.react.mod.Key | Null] = js.undefined
  
  /**
    * Allows getting a ref to the component instance.
    * Once the component unmounts, React will set `ref.current` to `null` (or call the ref with `null` if you passed a callback ref).
    * @see https://react.dev/learn/referencing-values-with-refs#refs-and-the-dom
    */
  var ref: js.UndefOr[typings.react.mod.Ref[HTMLElement]] = js.undefined
}
object CountrySelectDropdownProp {
  
  inline def apply(
    $country: typings.baseui.phoneInputTypesMod.Country,
    $maxDropdownHeight: String,
    $noResultsMsg: String,
    $overrides: CountrySelectContainer,
    children: js.Array[ReactElement]
  ): CountrySelectDropdownProp = {
    val __obj = js.Dynamic.literal($country = $country.asInstanceOf[js.Any], $maxDropdownHeight = $maxDropdownHeight.asInstanceOf[js.Any], $noResultsMsg = $noResultsMsg.asInstanceOf[js.Any], $overrides = $overrides.asInstanceOf[js.Any], children = children.asInstanceOf[js.Any], $forwardedRef = null)
    __obj.asInstanceOf[CountrySelectDropdownProp]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CountrySelectDropdownProp] (val x: Self) extends AnyVal {
    
    inline def set$country(value: typings.baseui.phoneInputTypesMod.Country): Self = StObject.set(x, "$country", value.asInstanceOf[js.Any])
    
    inline def set$forwardedRef(value: typings.react.mod.Ref[HTMLElement] | (js.Function1[/* a */ Null | HTMLElement, Any])): Self = StObject.set(x, "$forwardedRef", value.asInstanceOf[js.Any])
    
    inline def set$forwardedRefFunction1(value: HTMLElement | Null => Any | Unit): Self = StObject.set(x, "$forwardedRef", js.Any.fromFunction1(value))
    
    inline def set$forwardedRefNull: Self = StObject.set(x, "$forwardedRef", null)
    
    inline def set$mapIsoToLabel(value: /* iso */ String => String): Self = StObject.set(x, "$mapIsoToLabel", js.Any.fromFunction1(value))
    
    inline def set$mapIsoToLabelUndefined: Self = StObject.set(x, "$mapIsoToLabel", js.undefined)
    
    inline def set$maxDropdownHeight(value: String): Self = StObject.set(x, "$maxDropdownHeight", value.asInstanceOf[js.Any])
    
    inline def set$noResultsMsg(value: String): Self = StObject.set(x, "$noResultsMsg", value.asInstanceOf[js.Any])
    
    inline def set$overrides(value: CountrySelectContainer): Self = StObject.set(x, "$overrides", value.asInstanceOf[js.Any])
    
    inline def setChildren(value: js.Array[ReactElement]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenVarargs(value: ReactElement*): Self = StObject.set(x, "children", js.Array(value*))
    
    inline def setKey(value: typings.react.mod.Key): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setKeyNull: Self = StObject.set(x, "key", null)
    
    inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    inline def setRef(value: typings.react.mod.Ref[HTMLElement]): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
    
    inline def setRefFunction1(value: /* instance */ HTMLElement | Null => Unit): Self = StObject.set(x, "ref", js.Any.fromFunction1(value))
    
    inline def setRefNull: Self = StObject.set(x, "ref", null)
    
    inline def setRefUndefined: Self = StObject.set(x, "ref", js.undefined)
  }
}
