package typings.awsSdk.cloudhsmv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteHsmResponse extends js.Object {
  /**
    * The identifier (ID) of the HSM that was deleted.
    */
  var HsmId: js.UndefOr[typings.awsSdk.cloudhsmv2Mod.HsmId] = js.native
}

object DeleteHsmResponse {
  @scala.inline
  def apply(HsmId: HsmId = null): DeleteHsmResponse = {
    val __obj = js.Dynamic.literal()
    if (HsmId != null) __obj.updateDynamic("HsmId")(HsmId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteHsmResponse]
  }
}

