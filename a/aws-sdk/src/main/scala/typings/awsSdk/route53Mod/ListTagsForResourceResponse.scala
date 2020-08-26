package typings.awsSdk.route53Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListTagsForResourceResponse extends js.Object {
  /**
    * A ResourceTagSet containing tags associated with the specified resource.
    */
  var ResourceTagSet: typings.awsSdk.route53Mod.ResourceTagSet = js.native
}

object ListTagsForResourceResponse {
  @scala.inline
  def apply(ResourceTagSet: ResourceTagSet): ListTagsForResourceResponse = {
    val __obj = js.Dynamic.literal(ResourceTagSet = ResourceTagSet.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListTagsForResourceResponse]
  }
  @scala.inline
  implicit class ListTagsForResourceResponseOps[Self <: ListTagsForResourceResponse] (val x: Self) extends AnyVal {
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
    def setResourceTagSet(value: ResourceTagSet): Self = this.set("ResourceTagSet", value.asInstanceOf[js.Any])
  }
  
}

