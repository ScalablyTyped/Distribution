package typings.awsSdk.codedeployMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TagResourceInput extends js.Object {
  /**
    *  The ARN of a resource, such as a CodeDeploy application or deployment group. 
    */
  var ResourceArn: Arn = js.native
  /**
    *  A list of tags that TagResource associates with a resource. The resource is identified by the ResourceArn input parameter. 
    */
  var Tags: TagList = js.native
}

object TagResourceInput {
  @scala.inline
  def apply(ResourceArn: Arn, Tags: TagList): TagResourceInput = {
    val __obj = js.Dynamic.literal(ResourceArn = ResourceArn.asInstanceOf[js.Any], Tags = Tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[TagResourceInput]
  }
  @scala.inline
  implicit class TagResourceInputOps[Self <: TagResourceInput] (val x: Self) extends AnyVal {
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
    def setResourceArn(value: Arn): Self = this.set("ResourceArn", value.asInstanceOf[js.Any])
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = this.set("Tags", js.Array(value :_*))
    @scala.inline
    def setTags(value: TagList): Self = this.set("Tags", value.asInstanceOf[js.Any])
  }
  
}

