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
  
  @scala.inline
  def apply(UICustomization: UICustomizationType): SetUICustomizationResponse = {
    val __obj = js.Dynamic.literal(UICustomization = UICustomization.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetUICustomizationResponse]
  }
  
  @scala.inline
  implicit class SetUICustomizationResponseMutableBuilder[Self <: SetUICustomizationResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setUICustomization(value: UICustomizationType): Self = StObject.set(x, "UICustomization", value.asInstanceOf[js.Any])
  }
}
