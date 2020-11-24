package typings.awsSdk.cognitoidentityserviceproviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SetUICustomizationResponse extends js.Object {
  
  /**
    * The UI customization information.
    */
  var UICustomization: UICustomizationType = js.native
}
object SetUICustomizationResponse {
  
  @scala.inline
  def apply(UICustomization: UICustomizationType): SetUICustomizationResponse = {
    val __obj = js.Dynamic.literal(UICustomization = UICustomization.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetUICustomizationResponse]
  }
  
  @scala.inline
  implicit class SetUICustomizationResponseOps[Self <: SetUICustomizationResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setUICustomization(value: UICustomizationType): Self = this.set("UICustomization", value.asInstanceOf[js.Any])
  }
}
