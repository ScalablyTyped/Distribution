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
  def apply(MaximumInstanceCount: Int | scala.Double = null, MinimumInstanceCount: Int | scala.Double = null): InstanceCountLimits = {
    val __obj = js.Dynamic.literal()
    if (MaximumInstanceCount != null) __obj.updateDynamic("MaximumInstanceCount")(MaximumInstanceCount.asInstanceOf[js.Any])
    if (MinimumInstanceCount != null) __obj.updateDynamic("MinimumInstanceCount")(MinimumInstanceCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[InstanceCountLimits]
  }
}

