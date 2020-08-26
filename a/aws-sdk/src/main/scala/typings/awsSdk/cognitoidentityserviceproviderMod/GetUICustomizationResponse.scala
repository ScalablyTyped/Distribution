package typings.awsSdk.cognitoidentityserviceproviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetUICustomizationResponse extends js.Object {
  /**
    * The UI customization information.
    */
  var UICustomization: UICustomizationType = js.native
}

object GetUICustomizationResponse {
  @scala.inline
  def apply(UICustomization: UICustomizationType): GetUICustomizationResponse = {
    val __obj = js.Dynamic.literal(UICustomization = UICustomization.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetUICustomizationResponse]
  }
  @scala.inline
  implicit class GetUICustomizationResponseOps[Self <: GetUICustomizationResponse] (val x: Self) extends AnyVal {
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

