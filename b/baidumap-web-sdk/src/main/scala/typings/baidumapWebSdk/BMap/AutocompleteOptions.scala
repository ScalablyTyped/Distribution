package typings.baidumapWebSdk.BMap

import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AutocompleteOptions extends StObject {
  
  var input: js.UndefOr[String | HTMLElement] = js.undefined
  
  var location: js.UndefOr[String | Map | Point] = js.undefined
  
  var onSearchComplete: js.UndefOr[js.Function1[/* result */ AutocompleteResult, Unit]] = js.undefined
  
  var types: js.UndefOr[js.Array[String]] = js.undefined
}
object AutocompleteOptions {
  
  inline def apply(): AutocompleteOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AutocompleteOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AutocompleteOptions] (val x: Self) extends AnyVal {
    
    inline def setInput(value: String | HTMLElement): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
    
    inline def setInputUndefined: Self = StObject.set(x, "input", js.undefined)
    
    inline def setLocation(value: String | Map | Point): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    inline def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
    
    inline def setOnSearchComplete(value: /* result */ AutocompleteResult => Unit): Self = StObject.set(x, "onSearchComplete", js.Any.fromFunction1(value))
    
    inline def setOnSearchCompleteUndefined: Self = StObject.set(x, "onSearchComplete", js.undefined)
    
    inline def setTypes(value: js.Array[String]): Self = StObject.set(x, "types", value.asInstanceOf[js.Any])
    
    inline def setTypesUndefined: Self = StObject.set(x, "types", js.undefined)
    
    inline def setTypesVarargs(value: String*): Self = StObject.set(x, "types", js.Array(value*))
  }
}
