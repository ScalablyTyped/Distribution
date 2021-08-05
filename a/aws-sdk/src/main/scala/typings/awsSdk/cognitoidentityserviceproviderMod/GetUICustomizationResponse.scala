package typings.awsSdk.cognitoidentityserviceproviderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetUICustomizationResponse extends StObject {
  
  /**
    * The UI customization information.
    */
  var UICustomization: UICustomizationType
}
object GetUICustomizationResponse {
  
  inline def apply(UICustomization: UICustomizationType): GetUICustomizationResponse = {
    val __obj = js.Dynamic.literal(UICustomization = UICustomization.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetUICustomizationResponse]
  }
  
  extension [Self <: GetUICustomizationResponse](x: Self) {
    
    inline def setUICustomization(value: UICustomizationType): Self = StObject.set(x, "UICustomization", value.asInstanceOf[js.Any])
  }
}
