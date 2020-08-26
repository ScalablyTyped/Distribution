package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ModifySpotFleetRequestResponse extends js.Object {
  /**
    * Is true if the request succeeds, and an error otherwise.
    */
  var Return: js.UndefOr[Boolean] = js.native
}

object ModifySpotFleetRequestResponse {
  @scala.inline
  def apply(): ModifySpotFleetRequestResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ModifySpotFleetRequestResponse]
  }
  @scala.inline
  implicit class ModifySpotFleetRequestResponseOps[Self <: ModifySpotFleetRequestResponse] (val x: Self) extends AnyVal {
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
    def setReturn(value: Boolean): Self = this.set("Return", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReturn: Self = this.set("Return", js.undefined)
  }
  
}

