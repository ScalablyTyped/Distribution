package typings.awsSdk.resourcegroupstaggingapiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TagResourcesInput extends js.Object {
  /**
    * A list of ARNs. An ARN (Amazon Resource Name) uniquely identifies a resource. You can specify a minimum of 1 and a maximum of 20 ARNs (resources) to tag. An ARN can be set to a maximum of 1600 characters. For more information, see Amazon Resource Names (ARNs) and AWS Service Namespaces in the AWS General Reference.
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

