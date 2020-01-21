package typings.awsSdk.storagegatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListVolumeInitiatorsOutput extends js.Object {
  /**
    * The host names and port numbers of all iSCSI initiators that are connected to the gateway.
    */
  var Initiators: js.UndefOr[typings.awsSdk.storagegatewayMod.Initiators] = js.native
}

object ListVolumeInitiatorsOutput {
  @scala.inline
  def apply(Initiators: Initiators = null): ListVolumeInitiatorsOutput = {
    val __obj = js.Dynamic.literal()
    if (Initiators != null) __obj.updateDynamic("Initiators")(Initiators.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListVolumeInitiatorsOutput]
  }
}

