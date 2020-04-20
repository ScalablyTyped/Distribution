package typings.awsSdk.inspectorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateResourceGroupRequest extends js.Object {
  /**
    * A collection of keys and an array of possible values, '[{"key":"key1","values":["Value1","Value2"]},{"key":"Key2","values":["Value3"]}]'. For example,'[{"key":"Name","values":["TestEC2Instance"]}]'.
    */
  var resourceGroupTags: ResourceGroupTags = js.native
}

object CreateResourceGroupRequest {
  @scala.inline
  def apply(resourceGroupTags: ResourceGroupTags): CreateResourceGroupRequest = {
    val __obj = js.Dynamic.literal(resourceGroupTags = resourceGroupTags.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateResourceGroupRequest]
  }
}

