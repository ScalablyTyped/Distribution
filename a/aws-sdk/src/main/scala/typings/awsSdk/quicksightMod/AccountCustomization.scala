package typings.awsSdk.quicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AccountCustomization extends StObject {
  
  /**
    * The default email customization template.
    */
  var DefaultEmailCustomizationTemplate: js.UndefOr[Arn] = js.undefined
  
  /**
    * The default theme for this Amazon QuickSight subscription.
    */
  var DefaultTheme: js.UndefOr[Arn] = js.undefined
}
object AccountCustomization {
  
  inline def apply(): AccountCustomization = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AccountCustomization]
  }
  
  extension [Self <: AccountCustomization](x: Self) {
    
    inline def setDefaultEmailCustomizationTemplate(value: Arn): Self = StObject.set(x, "DefaultEmailCustomizationTemplate", value.asInstanceOf[js.Any])
    
    inline def setDefaultEmailCustomizationTemplateUndefined: Self = StObject.set(x, "DefaultEmailCustomizationTemplate", js.undefined)
    
    inline def setDefaultTheme(value: Arn): Self = StObject.set(x, "DefaultTheme", value.asInstanceOf[js.Any])
    
    inline def setDefaultThemeUndefined: Self = StObject.set(x, "DefaultTheme", js.undefined)
  }
}
