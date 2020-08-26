package typings.awsSdk.wafv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateRegexPatternSetRequest extends js.Object {
  /**
    * A description of the set that helps with identification. You cannot change the description of a set after you create it.
    */
  var Description: js.UndefOr[EntityDescription] = js.native
  /**
    * A unique identifier for the set. This ID is returned in the responses to create and list commands. You provide it to operations like update and delete.
    */
  var Id: EntityId = js.native
  /**
    * A token used for optimistic locking. AWS WAF returns a token to your get and list requests, to mark the state of the entity at the time of the request. To make changes to the entity associated with the token, you provide the token to operations like update and delete. AWS WAF uses the token to ensure that no changes have been made to the entity since you last retrieved it. If a change has been made, the update fails with a WAFOptimisticLockException. If this happens, perform another get, and use the new token returned by that operation. 
    */
  var LockToken: typings.awsSdk.wafv2Mod.LockToken = js.native
  /**
    * The name of the set. You cannot change the name after you create the set.
    */
  var Name: EntityName = js.native
  /**
    * 
    */
  var RegularExpressionList: typings.awsSdk.wafv2Mod.RegularExpressionList = js.native
  /**
    * Specifies whether this is for an AWS CloudFront distribution or for a regional application. A regional application can be an Application Load Balancer (ALB) or an API Gateway stage.  To work with CloudFront, you must also specify the Region US East (N. Virginia) as follows:    CLI - Specify the Region when you use the CloudFront scope: --scope=CLOUDFRONT --region=us-east-1.    API and SDKs - For all calls, use the Region endpoint us-east-1.   
    */
  var Scope: typings.awsSdk.wafv2Mod.Scope = js.native
}

object UpdateRegexPatternSetRequest {
  @scala.inline
  def apply(
    Id: EntityId,
    LockToken: LockToken,
    Name: EntityName,
    RegularExpressionList: RegularExpressionList,
    Scope: Scope
  ): UpdateRegexPatternSetRequest = {
    val __obj = js.Dynamic.literal(Id = Id.asInstanceOf[js.Any], LockToken = LockToken.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], RegularExpressionList = RegularExpressionList.asInstanceOf[js.Any], Scope = Scope.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateRegexPatternSetRequest]
  }
  @scala.inline
  implicit class UpdateRegexPatternSetRequestOps[Self <: UpdateRegexPatternSetRequest] (val x: Self) extends AnyVal {
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
    def setId(value: EntityId): Self = this.set("Id", value.asInstanceOf[js.Any])
    @scala.inline
    def setLockToken(value: LockToken): Self = this.set("LockToken", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: EntityName): Self = this.set("Name", value.asInstanceOf[js.Any])
    @scala.inline
    def setRegularExpressionListVarargs(value: Regex*): Self = this.set("RegularExpressionList", js.Array(value :_*))
    @scala.inline
    def setRegularExpressionList(value: RegularExpressionList): Self = this.set("RegularExpressionList", value.asInstanceOf[js.Any])
    @scala.inline
    def setScope(value: Scope): Self = this.set("Scope", value.asInstanceOf[js.Any])
    @scala.inline
    def setDescription(value: EntityDescription): Self = this.set("Description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("Description", js.undefined)
  }
  
}

