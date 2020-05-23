package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InstanceCount extends js.Object {
  /**
    * The number of listed Reserved Instances in the state specified by the state.
    */
  var InstanceCount: js.UndefOr[Integer] = js.native
  /**
    * The states of the listed Reserved Instances.
    */
  var State: js.UndefOr[ListingState] = js.native
}

object InstanceCount {
  @scala.inline
  def apply(InstanceCount: js.UndefOr[Integer] = js.undefined, State: ListingState = null): InstanceCount = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(InstanceCount)) __obj.updateDynamic("InstanceCount")(InstanceCount.get.asInstanceOf[js.Any])
    if (State != null) __obj.updateDynamic("State")(State.asInstanceOf[js.Any])
    __obj.asInstanceOf[InstanceCount]
  }
}

