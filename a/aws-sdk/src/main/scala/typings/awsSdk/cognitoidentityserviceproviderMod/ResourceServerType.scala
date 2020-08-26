package typings.awsSdk.cognitoidentityserviceproviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResourceServerType extends js.Object {
  /**
    * The identifier for the resource server.
    */
  var Identifier: js.UndefOr[ResourceServerIdentifierType] = js.native
  /**
    * The name of the resource server.
    */
  var Name: js.UndefOr[ResourceServerNameType] = js.native
  /**
    * A list of scopes that are defined for the resource server.
    */
  var Scopes: js.UndefOr[ResourceServerScopeListType] = js.native
  /**
    * The user pool ID for the user pool that hosts the resource server.
    */
  var UserPoolId: js.UndefOr[UserPoolIdType] = js.native
}

object ResourceServerType {
  @scala.inline
  def apply(): ResourceServerType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResourceServerType]
  }
  @scala.inline
  implicit class ResourceServerTypeOps[Self <: ResourceServerType] (val x: Self) extends AnyVal {
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
    def deleteIdentifier: Self = this.set("Identifier", js.undefined)
    @scala.inline
    def setName(value: ResourceServerNameType): Self = this.set("Name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("Name", js.undefined)
    @scala.inline
    def setScopesVarargs(value: ResourceServerScopeType*): Self = this.set("Scopes", js.Array(value :_*))
    @scala.inline
    def setScopes(value: ResourceServerScopeListType): Self = this.set("Scopes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScopes: Self = this.set("Scopes", js.undefined)
    @scala.inline
    def setUserPoolId(value: UserPoolIdType): Self = this.set("UserPoolId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUserPoolId: Self = this.set("UserPoolId", js.undefined)
  }
  
}

