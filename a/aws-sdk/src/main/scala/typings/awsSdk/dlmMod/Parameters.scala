package typings.awsSdk.dlmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Parameters extends js.Object {
  /**
    * When executing an EBS Snapshot Management – Instance policy, execute all CreateSnapshots calls with the excludeBootVolume set to the supplied field. Defaults to false. Only valid for EBS Snapshot Management – Instance policies.
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

