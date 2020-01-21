package typings.awsSdk.codestarnotificationsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TagResourceRequest extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the notification rule to tag.
    */
  var Arn: NotificationRuleArn = js.native
  /**
    * The list of tags to associate with the resource. Tag key names cannot start with "aws".
    */
  var Tags: typings.awsSdk.codestarnotificationsMod.Tags = js.native
}

object TagResourceRequest {
  @scala.inline
  def apply(Arn: NotificationRuleArn, Tags: Tags): TagResourceRequest = {
    val __obj = js.Dynamic.literal(Arn = Arn.asInstanceOf[js.Any], Tags = Tags.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[TagResourceRequest]
  }
}

