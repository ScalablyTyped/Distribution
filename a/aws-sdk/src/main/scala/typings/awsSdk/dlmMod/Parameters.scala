package typings.awsSdk.dlmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Parameters extends js.Object {
  /**
    * [EBS Snapshot Management – Instance policies only] Indicates whether to exclude the root volume from snapshots created using CreateSnapshots. The default is false.
    */
  var ExcludeBootVolume: js.UndefOr[typings.awsSdk.dlmMod.ExcludeBootVolume] = js.native
}

object Parameters {
  @scala.inline
  def apply(ExcludeBootVolume: js.UndefOr[Boolean] = js.undefined): Parameters = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(ExcludeBootVolume)) __obj.updateDynamic("ExcludeBootVolume")(ExcludeBootVolume.asInstanceOf[js.Any])
    __obj.asInstanceOf[Parameters]
  }
}

