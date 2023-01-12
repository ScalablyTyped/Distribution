package typings.codemirrorView.mod

import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SpecialCharConfig extends StObject {
  
  /**
    Regular expression that can be used to add characters to the
    default set of characters to highlight.
    */
  var addSpecialChars: js.UndefOr[js.RegExp | Null] = js.undefined
  
  /**
    An optional function that renders the placeholder elements.
    
    The `description` argument will be text that clarifies what the
    character is, which should be provided to screen readers (for
    example with the
    [`aria-label`](https://www.w3.org/TR/wai-aria/#aria-label)
    attribute) and optionally shown to the user in other ways (such
    as the
    [`title`](https://developer.mozilla.org/en-US/docs/Web/HTML/Global_attributes/title)
    attribute).
    
    The given placeholder string is a suggestion for how to display
    the character visually.
    */
  var render: js.UndefOr[
    (js.Function3[
      /* code */ Double, 
      /* description */ String | Null, 
      /* placeholder */ String, 
      HTMLElement
    ]) | Null
  ] = js.undefined
  
  /**
    Regular expression that matches the special characters to
    highlight. Must have its 'g'/global flag set.
    */
  var specialChars: js.UndefOr[js.RegExp] = js.undefined
}
object SpecialCharConfig {
  
  inline def apply(): SpecialCharConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SpecialCharConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SpecialCharConfig] (val x: Self) extends AnyVal {
    
    inline def setAddSpecialChars(value: js.RegExp): Self = StObject.set(x, "addSpecialChars", value.asInstanceOf[js.Any])
    
    inline def setAddSpecialCharsNull: Self = StObject.set(x, "addSpecialChars", null)
    
    inline def setAddSpecialCharsUndefined: Self = StObject.set(x, "addSpecialChars", js.undefined)
    
    inline def setRender(
      value: (/* code */ Double, /* description */ String | Null, /* placeholder */ String) => HTMLElement
    ): Self = StObject.set(x, "render", js.Any.fromFunction3(value))
    
    inline def setRenderNull: Self = StObject.set(x, "render", null)
    
    inline def setRenderUndefined: Self = StObject.set(x, "render", js.undefined)
    
    inline def setSpecialChars(value: js.RegExp): Self = StObject.set(x, "specialChars", value.asInstanceOf[js.Any])
    
    inline def setSpecialCharsUndefined: Self = StObject.set(x, "specialChars", js.undefined)
  }
}
