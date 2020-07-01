package typings.awsSdk.worklinkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TagResourceRequest extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the fleet.
    */
  var ResourceArn: FleetArn = js.native
  /**
    * The tags to add to the resource. A tag is a key-value pair.
    */
  var Tags: TagMap = js.native
}

object TagResourceRequest {
  @scala.inline
  def apply(ResourceArn: FleetArn, Tags: TagMap): TagResourceRequest = {
    val __obj = js.Dynamic.literal(ResourceArn = ResourceArn.asInstanceOf[js.Any], Tags = Tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[TagResourceRequest]
  }
}

