package typings.awsSdk.cognitoidentityserviceproviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AddCustomAttributesRequest extends js.Object {
  /**
    * An array of custom attributes, such as Mutable and Name.
    */
  var CustomAttributes: CustomAttributesListType = js.native
  /**
    * The user pool ID for the user pool where you want to add custom attributes.
    */
  var UserPoolId: UserPoolIdType = js.native
}

object AddCustomAttributesRequest {
  @scala.inline
  def apply(CustomAttributes: CustomAttributesListType, UserPoolId: UserPoolIdType): AddCustomAttributesRequest = {
    val __obj = js.Dynamic.literal(CustomAttributes = CustomAttributes.asInstanceOf[js.Any], UserPoolId = UserPoolId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddCustomAttributesRequest]
  }
  @scala.inline
  implicit class AddCustomAttributesRequestOps[Self <: AddCustomAttributesRequest] (val x: Self) extends AnyVal {
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
    def setCustomAttributesVarargs(value: SchemaAttributeType*): Self = this.set("CustomAttributes", js.Array(value :_*))
    @scala.inline
    def setCustomAttributes(value: CustomAttributesListType): Self = this.set("CustomAttributes", value.asInstanceOf[js.Any])
    @scala.inline
    def setUserPoolId(value: UserPoolIdType): Self = this.set("UserPoolId", value.asInstanceOf[js.Any])
  }
  
}

