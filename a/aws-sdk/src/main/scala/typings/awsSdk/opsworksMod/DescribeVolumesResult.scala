package typings.awsSdk.opsworksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeVolumesResult extends js.Object {
  /**
    * An array of volume IDs.
    */
  var Volumes: js.UndefOr[typings.awsSdk.opsworksMod.Volumes] = js.native
}

object DescribeVolumesResult {
  @scala.inline
  def apply(Volumes: Volumes = null): DescribeVolumesResult = {
    val __obj = js.Dynamic.literal()
    if (Volumes != null) __obj.updateDynamic("Volumes")(Volumes.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeVolumesResult]
  }
}

