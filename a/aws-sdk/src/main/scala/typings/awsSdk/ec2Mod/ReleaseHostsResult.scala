package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReleaseHostsResult extends js.Object {
  /**
    * The IDs of the Dedicated Hosts that were successfully released.
    */
  var Successful: js.UndefOr[ResponseHostIdList] = js.native
  /**
    * The IDs of the Dedicated Hosts that could not be released, including an error message.
    */
  var Unsuccessful: js.UndefOr[UnsuccessfulItemList] = js.native
}

object ReleaseHostsResult {
  @scala.inline
  def apply(): ReleaseHostsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReleaseHostsResult]
  }
  @scala.inline
  implicit class ReleaseHostsResultOps[Self <: ReleaseHostsResult] (val x: Self) extends AnyVal {
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
    def setSuccessfulVarargs(value: String*): Self = this.set("Successful", js.Array(value :_*))
    @scala.inline
    def setSuccessful(value: ResponseHostIdList): Self = this.set("Successful", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSuccessful: Self = this.set("Successful", js.undefined)
    @scala.inline
    def setUnsuccessfulVarargs(value: UnsuccessfulItem*): Self = this.set("Unsuccessful", js.Array(value :_*))
    @scala.inline
    def setUnsuccessful(value: UnsuccessfulItemList): Self = this.set("Unsuccessful", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUnsuccessful: Self = this.set("Unsuccessful", js.undefined)
  }
  
}

