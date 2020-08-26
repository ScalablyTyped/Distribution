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
  def apply(): CreateHsmConfigurationResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateHsmConfigurationResult]
  }
  @scala.inline
  implicit class CreateHsmConfigurationResultOps[Self <: CreateHsmConfigurationResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setHsmConfiguration(value: HsmConfiguration): Self = this.set("HsmConfiguration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHsmConfiguration: Self = this.set("HsmConfiguration", js.undefined)
  }
  
}

