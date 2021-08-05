package typings.awsSdk.quicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AccountCustomization extends StObject {
  
  /**
    * The default theme for this QuickSight subscription.
    */
  var DefaultTheme: js.UndefOr[Arn] = js.undefined
}
object AccountCustomization {
  
  inline def apply(): AccountCustomization = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AccountCustomization]
  }
  
  extension [Self <: AccountCustomization](x: Self) {
    
    inline def setDefaultTheme(value: Arn): Self = StObject.set(x, "DefaultTheme", value.asInstanceOf[js.Any])
    
    inline def setDefaultThemeUndefined: Self = StObject.set(x, "DefaultTheme", js.undefined)
  }
}
