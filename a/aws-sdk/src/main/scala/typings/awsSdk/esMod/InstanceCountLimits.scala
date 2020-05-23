package typings.awsSdk.esMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InstanceCountLimits extends js.Object {
  var MaximumInstanceCount: js.UndefOr[typings.awsSdk.esMod.MaximumInstanceCount] = js.native
  var MinimumInstanceCount: js.UndefOr[typings.awsSdk.esMod.MinimumInstanceCount] = js.native
}

object InstanceCountLimits {
  @scala.inline
  def apply(
    MaximumInstanceCount: js.UndefOr[MaximumInstanceCount] = js.undefined,
    MinimumInstanceCount: js.UndefOr[MinimumInstanceCount] = js.undefined
  ): InstanceCountLimits = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(MaximumInstanceCount)) __obj.updateDynamic("MaximumInstanceCount")(MaximumInstanceCount.get.asInstanceOf[js.Any])
    if (!js.isUndefined(MinimumInstanceCount)) __obj.updateDynamic("MinimumInstanceCount")(MinimumInstanceCount.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[InstanceCountLimits]
  }
}

