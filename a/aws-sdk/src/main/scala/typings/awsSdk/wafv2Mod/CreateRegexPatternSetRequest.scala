package typings.awsSdk.wafv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateRegexPatternSetRequest extends js.Object {
  /**
    * A description of the set that helps with identification. You cannot change the description of a set after you create it.
    */
  var Description: js.UndefOr[EntityDescription] = js.native
  /**
    * The name of the set. You cannot change the name after you create the set.
    */
  var Name: EntityName = js.native
  /**
    * Array of regular expression strings. 
    */
  var RegularExpressionList: typings.awsSdk.wafv2Mod.RegularExpressionList = js.native
  /**
    * Specifies whether this is for an AWS CloudFront distribution or for a regional application. A regional application can be an Application Load Balancer (ALB) or an API Gateway stage.  To work with CloudFront, you must also specify the Region US East (N. Virginia) as follows:    CLI - Specify the Region when you use the CloudFront scope: --scope=CLOUDFRONT --region=us-east-1.    API and SDKs - For all calls, use the Region endpoint us-east-1.   
    */
  var Scope: typings.awsSdk.wafv2Mod.Scope = js.native
  /**
    * An array of key:value pairs to associate with the resource.
    */
  var Tags: js.UndefOr[TagList] = js.native
}

object CreateRegexPatternSetRequest {
  @scala.inline
  def apply(Name: EntityName, RegularExpressionList: RegularExpressionList, Scope: Scope): CreateRegexPatternSetRequest = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any], RegularExpressionList = RegularExpressionList.asInstanceOf[js.Any], Scope = Scope.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateRegexPatternSetRequest]
  }
  @scala.inline
  implicit class CreateRegexPatternSetRequestOps[Self <: CreateRegexPatternSetRequest] (val x: Self) extends AnyVal {
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
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = this.set("Tags", js.Array(value :_*))
    @scala.inline
    def setTags(value: TagList): Self = this.set("Tags", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTags: Self = this.set("Tags", js.undefined)
  }
  
}

