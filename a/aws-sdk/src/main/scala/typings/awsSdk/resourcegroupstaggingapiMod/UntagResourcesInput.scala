package typings.awsSdk.resourcegroupstaggingapiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UntagResourcesInput extends js.Object {
  /**
    * A list of ARNs. An ARN (Amazon Resource Name) uniquely identifies a resource. For more information, see Amazon Resource Names (ARNs) and AWS Service Namespaces in the AWS General Reference.
    */
  var ResourceARNList: typings.awsSdk.resourcegroupstaggingapiMod.ResourceARNList = js.native
  /**
    * A list of the tag keys that you want to remove from the specified resources.
    */
  var TagKeys: TagKeyListForUntag = js.native
}

object UntagResourcesInput {
  @scala.inline
  def apply(ResourceARNList: ResourceARNList, TagKeys: TagKeyListForUntag): UntagResourcesInput = {
    val __obj = js.Dynamic.literal(ResourceARNList = ResourceARNList.asInstanceOf[js.Any], TagKeys = TagKeys.asInstanceOf[js.Any])
    __obj.asInstanceOf[UntagResourcesInput]
  }
}

