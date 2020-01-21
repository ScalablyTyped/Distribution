package typings.awsSdk.route53Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResourceTagSet extends js.Object {
  /**
    * The ID for the specified resource.
    */
  var ResourceId: js.UndefOr[TagResourceId] = js.native
  /**
    * The type of the resource.   The resource type for health checks is healthcheck.   The resource type for hosted zones is hostedzone.  
    */
  var ResourceType: js.UndefOr[TagResourceType] = js.native
  /**
    * The tags associated with the specified resource.
    */
  var Tags: js.UndefOr[TagList] = js.native
}

object ResourceTagSet {
  @scala.inline
  def apply(ResourceId: TagResourceId = null, ResourceType: TagResourceType = null, Tags: TagList = null): ResourceTagSet = {
    val __obj = js.Dynamic.literal()
    if (ResourceId != null) __obj.updateDynamic("ResourceId")(ResourceId.asInstanceOf[js.Any])
    if (ResourceType != null) __obj.updateDynamic("ResourceType")(ResourceType.asInstanceOf[js.Any])
    if (Tags != null) __obj.updateDynamic("Tags")(Tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResourceTagSet]
  }
}

