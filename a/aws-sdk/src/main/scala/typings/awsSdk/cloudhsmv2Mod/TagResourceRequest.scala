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
  @scala.inline
  implicit class TagResourceRequestOps[Self <: TagResourceRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setResourceId(value: ResourceId): Self = this.set("ResourceId", value.asInstanceOf[js.Any])
    @scala.inline
    def setTagListVarargs(value: Tag*): Self = this.set("TagList", js.Array(value :_*))
    @scala.inline
    def setTagList(value: TagList): Self = this.set("TagList", value.asInstanceOf[js.Any])
  }
  
}

