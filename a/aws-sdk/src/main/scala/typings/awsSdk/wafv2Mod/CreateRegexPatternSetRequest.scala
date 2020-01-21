package typings.awsSdk.wafv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateRegexPatternSetRequest extends js.Object {
  /**
    * A friendly description of the set. You cannot change the description of a set after you create it.
    */
  var Description: js.UndefOr[EntityDescription] = js.native
  /**
    * A friendly name of the set. You cannot change the name after you create the set.
    */
  var Name: EntityName = js.native
  /**
    * Array of regular expression strings. 
    */
  var RegularExpressionList: typings.awsSdk.wafv2Mod.RegularExpressionList = js.native
  /**
    * Specifies whether this is for an AWS CloudFront distribution or for a regional application. A regional application can be an Application Load Balancer (ALB) or an API Gateway stage.  To work with CloudFront, you must also specify the Region US East (N. Virginia) as follows:    CLI - Specify the region when you use the CloudFront scope: --scope=CLOUDFRONT --region=us-east-1.    API and SDKs - For all calls, use the Region endpoint us-east-1.   
    */
  var Scope: typings.awsSdk.wafv2Mod.Scope = js.native
  /**
    * An array of key:value pairs to associate with the resource.
    */
  var Tags: js.UndefOr[TagList] = js.native
}

object CreateRegexPatternSetRequest {
  @scala.inline
  def apply(
    Name: EntityName,
    RegularExpressionList: RegularExpressionList,
    Scope: Scope,
    Description: EntityDescription = null,
    Tags: TagList = null
  ): CreateRegexPatternSetRequest = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any], RegularExpressionList = RegularExpressionList.asInstanceOf[js.Any], Scope = Scope.asInstanceOf[js.Any])
    if (Description != null) __obj.updateDynamic("Description")(Description.asInstanceOf[js.Any])
    if (Tags != null) __obj.updateDynamic("Tags")(Tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateRegexPatternSetRequest]
  }
}

