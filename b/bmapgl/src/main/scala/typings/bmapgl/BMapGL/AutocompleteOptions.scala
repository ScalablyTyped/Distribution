package typings.bmapgl.BMapGL

import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AutocompleteOptions extends StObject {
  
  var input: js.UndefOr[String | HTMLElement] = js.native
  
  var location: js.UndefOr[String | Map | Point] = js.native
  
  var onSearchComplete: js.UndefOr[js.Function1[/* result */ AutocompleteResult, Unit]] = js.native
  
  var types: js.UndefOr[js.Array[String]] = js.native
}
object AutocompleteOptions {
  
  @scala.inline
  def apply(): AutocompleteOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AutocompleteOptions]
  }
  
  @scala.inline
  implicit class AutocompleteOptionsMutableBuilder[Self <: AutocompleteOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInput(value: String | HTMLElement): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputUndefined: Self = StObject.set(x, "input", js.undefined)
    
    @scala.inline
    def setLocation(value: String | Map | Point): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
    
    @scala.inline
    def setOnSearchComplete(value: /* result */ AutocompleteResult => Unit): Self = StObject.set(x, "onSearchComplete", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnSearchCompleteUndefined: Self = StObject.set(x, "onSearchComplete", js.undefined)
    
    @scala.inline
    def setTypes(value: js.Array[String]): Self = StObject.set(x, "types", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypesUndefined: Self = StObject.set(x, "types", js.undefined)
    
    @scala.inline
    def setTypesVarargs(value: String*): Self = StObject.set(x, "types", js.Array(value :_*))
  }
}
