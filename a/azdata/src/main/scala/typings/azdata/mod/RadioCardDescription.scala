package typings.azdata.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RadioCardDescription extends StObject {
  
  /**
    * Whether to show the link icon.
    */
  var displayLinkCodicon: js.UndefOr[Boolean] = js.undefined
  
  /**
    * CSS styles for the link icon.
    */
  var linkCodiconStyles: js.UndefOr[CssStyles] = js.undefined
  
  /**
    * The link's display text.
    */
  var linkDisplayValue: js.UndefOr[String] = js.undefined
  
  /**
    * CSS styles for the link.
    */
  var linkStyles: js.UndefOr[CssStyles] = js.undefined
  
  /**
    * CSS styles for the text.
    */
  var textStyles: js.UndefOr[CssStyles] = js.undefined
  
  /**
    * The text to be displayed.
    */
  var textValue: String
}
object RadioCardDescription {
  
  inline def apply(textValue: String): RadioCardDescription = {
    val __obj = js.Dynamic.literal(textValue = textValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[RadioCardDescription]
  }
  
  extension [Self <: RadioCardDescription](x: Self) {
    
    inline def setDisplayLinkCodicon(value: Boolean): Self = StObject.set(x, "displayLinkCodicon", value.asInstanceOf[js.Any])
    
    inline def setDisplayLinkCodiconUndefined: Self = StObject.set(x, "displayLinkCodicon", js.undefined)
    
    inline def setLinkCodiconStyles(value: CssStyles): Self = StObject.set(x, "linkCodiconStyles", value.asInstanceOf[js.Any])
    
    inline def setLinkCodiconStylesUndefined: Self = StObject.set(x, "linkCodiconStyles", js.undefined)
    
    inline def setLinkDisplayValue(value: String): Self = StObject.set(x, "linkDisplayValue", value.asInstanceOf[js.Any])
    
    inline def setLinkDisplayValueUndefined: Self = StObject.set(x, "linkDisplayValue", js.undefined)
    
    inline def setLinkStyles(value: CssStyles): Self = StObject.set(x, "linkStyles", value.asInstanceOf[js.Any])
    
    inline def setLinkStylesUndefined: Self = StObject.set(x, "linkStyles", js.undefined)
    
    inline def setTextStyles(value: CssStyles): Self = StObject.set(x, "textStyles", value.asInstanceOf[js.Any])
    
    inline def setTextStylesUndefined: Self = StObject.set(x, "textStyles", js.undefined)
    
    inline def setTextValue(value: String): Self = StObject.set(x, "textValue", value.asInstanceOf[js.Any])
  }
}
