package typings.awsSdk.configserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResourceCount extends js.Object {
  /**
    * The number of resources.
    */
  var count: js.UndefOr[Long] = js.native
  /**
    * The resource type (for example, "AWS::EC2::Instance").
    */
  var resourceType: js.UndefOr[ResourceType] = js.native
}

object ResourceCount {
  @scala.inline
  def apply(count: js.UndefOr[Long] = js.undefined, resourceType: ResourceType = null): ResourceCount = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(count)) __obj.updateDynamic("count")(count.get.asInstanceOf[js.Any])
    if (resourceType != null) __obj.updateDynamic("resourceType")(resourceType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResourceCount]
  }
}

