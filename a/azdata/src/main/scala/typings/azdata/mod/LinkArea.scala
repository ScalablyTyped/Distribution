package typings.azdata.mod

import typings.vscode.mod.AccessibilityInformation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LinkArea extends StObject {
  
  /*
    * Accessibility information used when screen reader interacts with this link.
    * Generally, a link has no need to set the `role` of the accessibilityInformation;
    * but it is exposed for situations that may require it.
    */
  var accessibilityInformation: js.UndefOr[AccessibilityInformation] = js.undefined
  
  /**
    * The text that is visible to the user
    */
  var text: String
  
  /**
    * The URL that is navigated to when the link is clicked
    */
  var url: String
}
object LinkArea {
  
  inline def apply(text: String, url: String): LinkArea = {
    val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[LinkArea]
  }
  
  extension [Self <: LinkArea](x: Self) {
    
    inline def setAccessibilityInformation(value: AccessibilityInformation): Self = StObject.set(x, "accessibilityInformation", value.asInstanceOf[js.Any])
    
    inline def setAccessibilityInformationUndefined: Self = StObject.set(x, "accessibilityInformation", js.undefined)
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
