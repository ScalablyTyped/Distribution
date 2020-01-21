package typings.awsSdk.redshiftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateHsmConfigurationResult extends js.Object {
  var HsmConfiguration: js.UndefOr[typings.awsSdk.redshiftMod.HsmConfiguration] = js.native
}

object CreateHsmConfigurationResult {
  @scala.inline
  def apply(HsmConfiguration: HsmConfiguration = null): CreateHsmConfigurationResult = {
    val __obj = js.Dynamic.literal()
    if (HsmConfiguration != null) __obj.updateDynamic("HsmConfiguration")(HsmConfiguration.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateHsmConfigurationResult]
  }
}

