package typings.awsSdk.cognitoidentityserviceproviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateResourceServerRequest extends js.Object {
  /**
    * A unique resource server identifier for the resource server. This could be an HTTPS endpoint where the resource server is located. For example, https://my-weather-api.example.com.
    */
  var Identifier: ResourceServerIdentifierType = js.native
  /**
    * A friendly name for the resource server.
    */
  var Name: ResourceServerNameType = js.native
  /**
    * A list of scopes. Each scope is map, where the keys are name and description.
    */
  var Scopes: js.UndefOr[ResourceServerScopeListType] = js.native
  /**
    * The user pool ID for the user pool.
    */
  var UserPoolId: UserPoolIdType = js.native
}

object CreateResourceServerRequest {
  @scala.inline
  def apply(Identifier: ResourceServerIdentifierType, Name: ResourceServerNameType, UserPoolId: UserPoolIdType): CreateResourceServerRequest = {
    val __obj = js.Dynamic.literal(Identifier = Identifier.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], UserPoolId = UserPoolId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateResourceServerRequest]
  }
  @scala.inline
  implicit class CreateResourceServerRequestOps[Self <: CreateResourceServerRequest] (val x: Self) extends AnyVal {
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
    def setIdentifier(value: ResourceServerIdentifierType): Self = this.set("Identifier", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: ResourceServerNameType): Self = this.set("Name", value.asInstanceOf[js.Any])
    @scala.inline
    def setUserPoolId(value: UserPoolIdType): Self = this.set("UserPoolId", value.asInstanceOf[js.Any])
    @scala.inline
    def setScopesVarargs(value: ResourceServerScopeType*): Self = this.set("Scopes", js.Array(value :_*))
    @scala.inline
    def setScopes(value: ResourceServerScopeListType): Self = this.set("Scopes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScopes: Self = this.set("Scopes", js.undefined)
  }
  
}

