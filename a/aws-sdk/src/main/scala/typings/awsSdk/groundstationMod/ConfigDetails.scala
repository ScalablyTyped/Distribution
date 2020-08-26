package typings.awsSdk.groundstationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConfigDetails extends js.Object {
  /**
    * Details for antenna demod decode Config in a contact.
    */
  var antennaDemodDecodeDetails: js.UndefOr[AntennaDemodDecodeDetails] = js.native
  var endpointDetails: js.UndefOr[EndpointDetails] = js.native
}

object ConfigDetails {
  @scala.inline
  def apply(): ConfigDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConfigDetails]
  }
  @scala.inline
  implicit class ConfigDetailsOps[Self <: ConfigDetails] (val x: Self) extends AnyVal {
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
    def setAntennaDemodDecodeDetails(value: AntennaDemodDecodeDetails): Self = this.set("antennaDemodDecodeDetails", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAntennaDemodDecodeDetails: Self = this.set("antennaDemodDecodeDetails", js.undefined)
    @scala.inline
    def setEndpointDetails(value: EndpointDetails): Self = this.set("endpointDetails", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEndpointDetails: Self = this.set("endpointDetails", js.undefined)
  }
  
}

