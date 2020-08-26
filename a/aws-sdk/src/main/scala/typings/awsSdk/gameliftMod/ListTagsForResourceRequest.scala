package typings.awsSdk.gameliftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListTagsForResourceRequest extends js.Object {
  /**
    *  The Amazon Resource Name (ARN) that is assigned to and uniquely identifies the GameLift resource that you want to retrieve tags for. GameLift resource ARNs are included in the data object for the resource, which can be retrieved by calling a List or Describe action for the resource type. 
    */
  var ResourceARN: AmazonResourceName = js.native
}

object ListTagsForResourceRequest {
  @scala.inline
  def apply(ResourceARN: AmazonResourceName): ListTagsForResourceRequest = {
    val __obj = js.Dynamic.literal(ResourceARN = ResourceARN.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListTagsForResourceRequest]
  }
  @scala.inline
  implicit class ListTagsForResourceRequestOps[Self <: ListTagsForResourceRequest] (val x: Self) extends AnyVal {
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
    def setResourceARN(value: AmazonResourceName): Self = this.set("ResourceARN", value.asInstanceOf[js.Any])
  }
  
}

