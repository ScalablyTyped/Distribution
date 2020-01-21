package typings.awsSdk.configserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RemediationExceptionResourceKey extends js.Object {
  /**
    * The ID of the resource (for example., sg-xxxxxx).
    */
  var ResourceId: js.UndefOr[StringWithCharLimit1024] = js.native
  /**
    * The type of a resource.
    */
  var ResourceType: js.UndefOr[StringWithCharLimit256] = js.native
}

object RemediationExceptionResourceKey {
  @scala.inline
  def apply(ResourceId: StringWithCharLimit1024 = null, ResourceType: StringWithCharLimit256 = null): RemediationExceptionResourceKey = {
    val __obj = js.Dynamic.literal()
    if (ResourceId != null) __obj.updateDynamic("ResourceId")(ResourceId.asInstanceOf[js.Any])
    if (ResourceType != null) __obj.updateDynamic("ResourceType")(ResourceType.asInstanceOf[js.Any])
    __obj.asInstanceOf[RemediationExceptionResourceKey]
  }
}

