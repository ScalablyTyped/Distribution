package typings.awsSdk.networkmanagerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateGlobalNetworkResponse extends js.Object {
  /**
    * Information about the global network object.
    */
  var GlobalNetwork: js.UndefOr[typings.awsSdk.networkmanagerMod.GlobalNetwork] = js.native
}

object CreateGlobalNetworkResponse {
  @scala.inline
  def apply(): CreateGlobalNetworkResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateGlobalNetworkResponse]
  }
  @scala.inline
  implicit class CreateGlobalNetworkResponseOps[Self <: CreateGlobalNetworkResponse] (val x: Self) extends AnyVal {
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
    def setGlobalNetwork(value: GlobalNetwork): Self = this.set("GlobalNetwork", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGlobalNetwork: Self = this.set("GlobalNetwork", js.undefined)
  }
  
}

