package typings.awsSdk.cognitoidentityMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LookupDeveloperIdentityInput extends js.Object {
  /**
    * A unique ID used by your backend authentication process to identify a user. Typically, a developer identity provider would issue many developer user identifiers, in keeping with the number of users.
    */
  var DeveloperUserIdentifier: js.UndefOr[typings.awsSdk.cognitoidentityMod.DeveloperUserIdentifier] = js.native
  /**
    * A unique identifier in the format REGION:GUID.
    */
  var IdentityId: js.UndefOr[typings.awsSdk.cognitoidentityMod.IdentityId] = js.native
  /**
    * An identity pool ID in the format REGION:GUID.
    */
  var IdentityPoolId: typings.awsSdk.cognitoidentityMod.IdentityPoolId = js.native
  /**
    * The maximum number of identities to return.
    */
  var MaxResults: js.UndefOr[QueryLimit] = js.native
  /**
    * A pagination token. The first call you make will have NextToken set to null. After that the service will return NextToken values as needed. For example, let's say you make a request with MaxResults set to 10, and there are 20 matches in the database. The service will return a pagination token as a part of the response. This token can be used to call the API again and get results starting from the 11th match.
    */
  var NextToken: js.UndefOr[PaginationKey] = js.native
}

object LookupDeveloperIdentityInput {
  @scala.inline
  def apply(IdentityPoolId: IdentityPoolId): LookupDeveloperIdentityInput = {
    val __obj = js.Dynamic.literal(IdentityPoolId = IdentityPoolId.asInstanceOf[js.Any])
    __obj.asInstanceOf[LookupDeveloperIdentityInput]
  }
  @scala.inline
  implicit class LookupDeveloperIdentityInputOps[Self <: LookupDeveloperIdentityInput] (val x: Self) extends AnyVal {
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
    def setIdentityPoolId(value: IdentityPoolId): Self = this.set("IdentityPoolId", value.asInstanceOf[js.Any])
    @scala.inline
    def setDeveloperUserIdentifier(value: DeveloperUserIdentifier): Self = this.set("DeveloperUserIdentifier", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeveloperUserIdentifier: Self = this.set("DeveloperUserIdentifier", js.undefined)
    @scala.inline
    def setIdentityId(value: IdentityId): Self = this.set("IdentityId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIdentityId: Self = this.set("IdentityId", js.undefined)
    @scala.inline
    def setMaxResults(value: QueryLimit): Self = this.set("MaxResults", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxResults: Self = this.set("MaxResults", js.undefined)
    @scala.inline
    def setNextToken(value: PaginationKey): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
  }
  
}

