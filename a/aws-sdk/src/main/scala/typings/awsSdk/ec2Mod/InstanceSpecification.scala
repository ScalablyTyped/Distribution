package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InstanceSpecification extends js.Object {
  /**
    * Excludes the root volume from being snapshotted.
    */
  var ExcludeBootVolume: js.UndefOr[Boolean] = js.native
  /**
    * The instance to specify which volumes should be snapshotted.
    */
  var InstanceId: js.UndefOr[typings.awsSdk.ec2Mod.InstanceId] = js.native
}

object InstanceSpecification {
  @scala.inline
  def apply(ExcludeBootVolume: js.UndefOr[scala.Boolean] = js.undefined, InstanceId: InstanceId = null): InstanceSpecification = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(ExcludeBootVolume)) __obj.updateDynamic("ExcludeBootVolume")(ExcludeBootVolume.asInstanceOf[js.Any])
    if (InstanceId != null) __obj.updateDynamic("InstanceId")(InstanceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[InstanceSpecification]
  }
}

