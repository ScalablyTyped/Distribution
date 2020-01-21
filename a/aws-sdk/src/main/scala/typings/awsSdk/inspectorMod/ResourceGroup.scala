package typings.awsSdk.inspectorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResourceGroup extends js.Object {
  /**
    * The ARN of the resource group.
    */
  var arn: Arn = js.native
  /**
    * The time at which resource group is created.
    */
  var createdAt: Timestamp = js.native
  /**
    * The tags (key and value pairs) of the resource group. This data type property is used in the CreateResourceGroup action.
    */
  var tags: ResourceGroupTags = js.native
}

object ResourceGroup {
  @scala.inline
  def apply(arn: Arn, createdAt: Timestamp, tags: ResourceGroupTags): ResourceGroup = {
    val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any], createdAt = createdAt.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ResourceGroup]
  }
}

