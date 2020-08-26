package typings.awsSdk.wafv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateWebACLRequest extends js.Object {
  /**
    * The action to perform if none of the Rules contained in the WebACL match. 
    */
  var DefaultAction: typings.awsSdk.wafv2Mod.DefaultAction = js.native
  /**
    * A description of the Web ACL that helps with identification. You cannot change the description of a Web ACL after you create it.
    */
  var Description: js.UndefOr[EntityDescription] = js.native
  /**
    * The name of the Web ACL. You cannot change the name of a Web ACL after you create it.
    */
  var Name: EntityName = js.native
  /**
    * The Rule statements used to identify the web requests that you want to allow, block, or count. Each rule includes one top-level statement that AWS WAF uses to identify matching web requests, and parameters that govern how AWS WAF handles them. 
    */
  var Rules: js.UndefOr[typings.awsSdk.wafv2Mod.Rules] = js.native
  /**
    * Specifies whether this is for an AWS CloudFront distribution or for a regional application. A regional application can be an Application Load Balancer (ALB) or an API Gateway stage.  To work with CloudFront, you must also specify the Region US East (N. Virginia) as follows:    CLI - Specify the Region when you use the CloudFront scope: --scope=CLOUDFRONT --region=us-east-1.    API and SDKs - For all calls, use the Region endpoint us-east-1.   
    */
  var Scope: typings.awsSdk.wafv2Mod.Scope = js.native
  /**
    * An array of key:value pairs to associate with the resource.
    */
  var Tags: js.UndefOr[TagList] = js.native
  /**
    * Defines and enables Amazon CloudWatch metrics and web request sample collection. 
    */
  var VisibilityConfig: typings.awsSdk.wafv2Mod.VisibilityConfig = js.native
}

object CreateWebACLRequest {
  @scala.inline
  def apply(DefaultAction: DefaultAction, Name: EntityName, Scope: Scope, VisibilityConfig: VisibilityConfig): CreateWebACLRequest = {
    val __obj = js.Dynamic.literal(DefaultAction = DefaultAction.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Scope = Scope.asInstanceOf[js.Any], VisibilityConfig = VisibilityConfig.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateWebACLRequest]
  }
  @scala.inline
  implicit class CreateWebACLRequestOps[Self <: CreateWebACLRequest] (val x: Self) extends AnyVal {
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
    def setDefaultAction(value: DefaultAction): Self = this.set("DefaultAction", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: EntityName): Self = this.set("Name", value.asInstanceOf[js.Any])
    @scala.inline
    def setScope(value: Scope): Self = this.set("Scope", value.asInstanceOf[js.Any])
    @scala.inline
    def setVisibilityConfig(value: VisibilityConfig): Self = this.set("VisibilityConfig", value.asInstanceOf[js.Any])
    @scala.inline
    def setDescription(value: EntityDescription): Self = this.set("Description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("Description", js.undefined)
    @scala.inline
    def setRulesVarargs(value: Rule*): Self = this.set("Rules", js.Array(value :_*))
    @scala.inline
    def setRules(value: Rules): Self = this.set("Rules", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRules: Self = this.set("Rules", js.undefined)
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = this.set("Tags", js.Array(value :_*))
    @scala.inline
    def setTags(value: TagList): Self = this.set("Tags", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTags: Self = this.set("Tags", js.undefined)
  }
  
}

