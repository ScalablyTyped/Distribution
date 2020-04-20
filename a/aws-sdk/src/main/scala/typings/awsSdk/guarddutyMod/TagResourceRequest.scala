package typings.awsSdk.guarddutyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TagResourceRequest extends js.Object {
  /**
    * The Amazon Resource Name (ARN) for the GuardDuty resource to apply a tag to.
    */
  var ResourceArn: GuardDutyArn = js.native
  /**
    * The tags to be added to a resource.
    */
  var Tags: TagMap = js.native
}

object TagResourceRequest {
  @scala.inline
  def apply(ResourceArn: GuardDutyArn, Tags: TagMap): TagResourceRequest = {
    val __obj = js.Dynamic.literal(ResourceArn = ResourceArn.asInstanceOf[js.Any], Tags = Tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[TagResourceRequest]
  }
}

