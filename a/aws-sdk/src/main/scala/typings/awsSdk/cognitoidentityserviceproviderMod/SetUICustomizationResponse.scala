package typings.awsSdk.cognitoidentityserviceproviderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SetUICustomizationResponse extends StObject {
  
  /**
    * The UI customization information.
    */
  var UICustomization: UICustomizationType
}
object SetUICustomizationResponse {
  
  inline def apply(UICustomization: UICustomizationType): SetUICustomizationResponse = {
    val __obj = js.Dynamic.literal(UICustomization = UICustomization.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetUICustomizationResponse]
  }
  
  extension [Self <: SetUICustomizationResponse](x: Self) {
    
    inline def setUICustomization(value: UICustomizationType): Self = StObject.set(x, "UICustomization", value.asInstanceOf[js.Any])
  }
}
