package typings.awsSdk.dmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ModifyEndpointResponse extends js.Object {
  /**
    * The modified endpoint.
    */
  var Endpoint: js.UndefOr[typings.awsSdk.dmsMod.Endpoint] = js.native
}

object ModifyEndpointResponse {
  @scala.inline
  def apply(): ModifyEndpointResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ModifyEndpointResponse]
  }
  @scala.inline
  implicit class ModifyEndpointResponseOps[Self <: ModifyEndpointResponse] (val x: Self) extends AnyVal {
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
    def setEndpoint(value: Endpoint): Self = this.set("Endpoint", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEndpoint: Self = this.set("Endpoint", js.undefined)
  }
  
}

