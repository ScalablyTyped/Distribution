package typings.awsSdk.directconnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeTagsResponse extends js.Object {
  /**
    * Information about the tags.
    */
  var resourceTags: js.UndefOr[ResourceTagList] = js.native
}

object DescribeTagsResponse {
  @scala.inline
  def apply(): DescribeTagsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeTagsResponse]
  }
  @scala.inline
  implicit class DescribeTagsResponseOps[Self <: DescribeTagsResponse] (val x: Self) extends AnyVal {
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
    def setResourceTagsVarargs(value: ResourceTag*): Self = this.set("resourceTags", js.Array(value :_*))
    @scala.inline
    def setResourceTags(value: ResourceTagList): Self = this.set("resourceTags", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResourceTags: Self = this.set("resourceTags", js.undefined)
  }
  
}

