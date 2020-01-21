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
}

