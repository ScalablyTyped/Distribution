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
  def apply(): UpdateUserAttributesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateUserAttributesResponse]
  }
  @scala.inline
  implicit class UpdateUserAttributesResponseOps[Self <: UpdateUserAttributesResponse] (val x: Self) extends AnyVal {
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
    def setCodeDeliveryDetailsListVarargs(value: CodeDeliveryDetailsType*): Self = this.set("CodeDeliveryDetailsList", js.Array(value :_*))
    @scala.inline
    def setCodeDeliveryDetailsList(value: CodeDeliveryDetailsListType): Self = this.set("CodeDeliveryDetailsList", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCodeDeliveryDetailsList: Self = this.set("CodeDeliveryDetailsList", js.undefined)
  }
  
}

