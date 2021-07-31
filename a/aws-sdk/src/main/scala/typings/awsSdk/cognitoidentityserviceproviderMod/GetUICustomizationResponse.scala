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
  
  @scala.inline
  def apply(UICustomization: UICustomizationType): GetUICustomizationResponse = {
    val __obj = js.Dynamic.literal(UICustomization = UICustomization.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetUICustomizationResponse]
  }
  
  @scala.inline
  implicit class GetUICustomizationResponseMutableBuilder[Self <: GetUICustomizationResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setUICustomization(value: UICustomizationType): Self = StObject.set(x, "UICustomization", value.asInstanceOf[js.Any])
  }
}
