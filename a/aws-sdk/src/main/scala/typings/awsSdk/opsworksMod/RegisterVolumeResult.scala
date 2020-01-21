package typings.awsSdk.opsworksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RegisterVolumeResult extends js.Object {
  /**
    * The volume ID.
    */
  var VolumeId: js.UndefOr[String] = js.native
}

object RegisterVolumeResult {
  @scala.inline
  def apply(VolumeId: String = null): RegisterVolumeResult = {
    val __obj = js.Dynamic.literal()
    if (VolumeId != null) __obj.updateDynamic("VolumeId")(VolumeId.asInstanceOf[js.Any])
    __obj.asInstanceOf[RegisterVolumeResult]
  }
}

