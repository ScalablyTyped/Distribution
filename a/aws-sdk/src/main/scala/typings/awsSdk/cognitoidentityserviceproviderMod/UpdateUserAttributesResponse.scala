package typings.awsSdk.cognitoidentityserviceproviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateUserAttributesResponse extends js.Object {
  /**
    * The code delivery details list from the server for the request to update user attributes.
    */
  var CodeDeliveryDetailsList: js.UndefOr[CodeDeliveryDetailsListType] = js.native
}

object UpdateUserAttributesResponse {
  @scala.inline
  def apply(CodeDeliveryDetailsList: CodeDeliveryDetailsListType = null): UpdateUserAttributesResponse = {
    val __obj = js.Dynamic.literal()
    if (CodeDeliveryDetailsList != null) __obj.updateDynamic("CodeDeliveryDetailsList")(CodeDeliveryDetailsList.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateUserAttributesResponse]
  }
}

