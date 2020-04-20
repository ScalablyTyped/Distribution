package typings.awsSdk.emrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ScalingConstraints extends js.Object {
  /**
    * The upper boundary of EC2 instances in an instance group beyond which scaling activities are not allowed to grow. Scale-out activities will not add instances beyond this boundary.
    */
  var MaxCapacity: Integer = js.native
  /**
    * The lower boundary of EC2 instances in an instance group below which scaling activities are not allowed to shrink. Scale-in activities will not terminate instances below this boundary.
    */
  var MinCapacity: Integer = js.native
}

object ScalingConstraints {
  @scala.inline
  def apply(MaxCapacity: Integer, MinCapacity: Integer): ScalingConstraints = {
    val __obj = js.Dynamic.literal(MaxCapacity = MaxCapacity.asInstanceOf[js.Any], MinCapacity = MinCapacity.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScalingConstraints]
  }
}

