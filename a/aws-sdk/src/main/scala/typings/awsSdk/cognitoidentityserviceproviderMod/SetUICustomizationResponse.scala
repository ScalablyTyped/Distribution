package typings.awsSdk.cognitoidentityserviceproviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
}

