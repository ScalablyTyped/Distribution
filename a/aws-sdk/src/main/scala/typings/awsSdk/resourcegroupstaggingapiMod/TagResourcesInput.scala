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
}

