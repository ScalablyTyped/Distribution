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
}

