package typings.awsSdk.resourcegroupstaggingapiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TagResourcesInput extends js.Object {
  /**
    * A list of ARNs. An ARN (Amazon Resource Name) uniquely identifies a resource. For more information, see Amazon Resource Names (ARNs) and AWS Service Namespaces in the AWS General Reference.
    */
  var ResourceARNList: typings.awsSdk.resourcegroupstaggingapiMod.ResourceARNList = js.native
  /**
    * The tags that you want to add to the specified resources. A tag consists of a key and a value that you define.
    */
  var Tags: TagMap = js.native
}

object TagResourcesInput {
  @scala.inline
  def apply(ResourceARNList: ResourceARNList, Tags: TagMap): TagResourcesInput = {
    val __obj = js.Dynamic.literal(ResourceARNList = ResourceARNList.asInstanceOf[js.Any], Tags = Tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[TagResourcesInput]
  }
  @scala.inline
  implicit class TagResourcesInputOps[Self <: TagResourcesInput] (val x: Self) extends AnyVal {
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
    def setResourceARNListVarargs(value: ResourceARN*): Self = this.set("ResourceARNList", js.Array(value :_*))
    @scala.inline
    def setResourceARNList(value: ResourceARNList): Self = this.set("ResourceARNList", value.asInstanceOf[js.Any])
    @scala.inline
    def setTags(value: TagMap): Self = this.set("Tags", value.asInstanceOf[js.Any])
  }
  
}

