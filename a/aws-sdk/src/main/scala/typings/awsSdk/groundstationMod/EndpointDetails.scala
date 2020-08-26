package typings.awsSdk.groundstationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EndpointDetails extends js.Object {
  /**
    * A dataflow endpoint.
    */
  var endpoint: js.UndefOr[DataflowEndpoint] = js.native
  /**
    * Endpoint security details.
    */
  var securityDetails: js.UndefOr[SecurityDetails] = js.native
}

object EndpointDetails {
  @scala.inline
  def apply(): EndpointDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EndpointDetails]
  }
  @scala.inline
  implicit class EndpointDetailsOps[Self <: EndpointDetails] (val x: Self) extends AnyVal {
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
    def setEndpoint(value: DataflowEndpoint): Self = this.set("endpoint", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEndpoint: Self = this.set("endpoint", js.undefined)
    @scala.inline
    def setSecurityDetails(value: SecurityDetails): Self = this.set("securityDetails", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSecurityDetails: Self = this.set("securityDetails", js.undefined)
  }
  
}

