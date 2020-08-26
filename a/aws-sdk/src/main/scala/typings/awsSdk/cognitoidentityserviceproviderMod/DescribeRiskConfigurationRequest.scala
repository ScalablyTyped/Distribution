package typings.awsSdk.cognitoidentityserviceproviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeRiskConfigurationRequest extends js.Object {
  /**
    * The app client ID.
    */
  var ClientId: js.UndefOr[ClientIdType] = js.native
  /**
    * The user pool ID.
    */
  var UserPoolId: UserPoolIdType = js.native
}

object DescribeRiskConfigurationRequest {
  @scala.inline
  def apply(UserPoolId: UserPoolIdType): DescribeRiskConfigurationRequest = {
    val __obj = js.Dynamic.literal(UserPoolId = UserPoolId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeRiskConfigurationRequest]
  }
  @scala.inline
  implicit class DescribeRiskConfigurationRequestOps[Self <: DescribeRiskConfigurationRequest] (val x: Self) extends AnyVal {
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
    def setUserPoolId(value: UserPoolIdType): Self = this.set("UserPoolId", value.asInstanceOf[js.Any])
    @scala.inline
    def setClientId(value: ClientIdType): Self = this.set("ClientId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClientId: Self = this.set("ClientId", js.undefined)
  }
  
}

