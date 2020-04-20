package typings.awsSdk.cloudhsmv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TagResourceRequest extends js.Object {
  /**
    * The cluster identifier (ID) for the cluster that you are tagging. To find the cluster ID, use DescribeClusters.
    */
  var ResourceId: typings.awsSdk.cloudhsmv2Mod.ResourceId = js.native
  /**
    * A list of one or more tags.
    */
  var TagList: typings.awsSdk.cloudhsmv2Mod.TagList = js.native
}

object TagResourceRequest {
  @scala.inline
  def apply(ResourceId: ResourceId, TagList: TagList): TagResourceRequest = {
    val __obj = js.Dynamic.literal(ResourceId = ResourceId.asInstanceOf[js.Any], TagList = TagList.asInstanceOf[js.Any])
    __obj.asInstanceOf[TagResourceRequest]
  }
}

