package typings.awsSdk.configserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResourceKey extends js.Object {
  /**
    * The ID of the resource (for example., sg-xxxxxx). 
    */
  var resourceId: ResourceId = js.native
  /**
    * The resource type.
    */
  var resourceType: ResourceType = js.native
}

object ResourceKey {
  @scala.inline
  def apply(resourceId: ResourceId, resourceType: ResourceType): ResourceKey = {
    val __obj = js.Dynamic.literal(resourceId = resourceId.asInstanceOf[js.Any], resourceType = resourceType.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ResourceKey]
  }
}

