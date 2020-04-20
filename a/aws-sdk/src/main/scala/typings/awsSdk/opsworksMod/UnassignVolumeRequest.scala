package typings.awsSdk.opsworksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UnassignVolumeRequest extends js.Object {
  /**
    * The volume ID.
    */
  var VolumeId: String = js.native
}

object UnassignVolumeRequest {
  @scala.inline
  def apply(VolumeId: String): UnassignVolumeRequest = {
    val __obj = js.Dynamic.literal(VolumeId = VolumeId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnassignVolumeRequest]
  }
}

