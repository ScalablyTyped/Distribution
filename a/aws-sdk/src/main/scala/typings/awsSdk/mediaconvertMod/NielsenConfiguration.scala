package typings.awsSdk.mediaconvertMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NielsenConfiguration extends js.Object {
  /**
    * Nielsen has discontinued the use of breakout code functionality. If you must include this property, set the value to zero.
    */
  var BreakoutCode: js.UndefOr[integerMin0Max0] = js.native
  /**
    * Use Distributor ID (DistributorID) to specify the distributor ID that is assigned to your organization by Neilsen.
    */
  var DistributorId: js.UndefOr[string] = js.native
}

object NielsenConfiguration {
  @scala.inline
  def apply(): NielsenConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NielsenConfiguration]
  }
  @scala.inline
  implicit class NielsenConfigurationOps[Self <: NielsenConfiguration] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setBreakoutCode(value: integerMin0Max0): Self = this.set("BreakoutCode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBreakoutCode: Self = this.set("BreakoutCode", js.undefined)
    @scala.inline
    def setDistributorId(value: string): Self = this.set("DistributorId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDistributorId: Self = this.set("DistributorId", js.undefined)
  }
  
}

