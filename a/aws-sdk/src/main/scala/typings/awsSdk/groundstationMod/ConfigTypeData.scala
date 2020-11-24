package typings.awsSdk.groundstationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConfigTypeData extends js.Object {
  
  /**
    * Information about how AWS Ground Station should configure an antenna for downlink during a contact.
    */
  var antennaDownlinkConfig: js.UndefOr[AntennaDownlinkConfig] = js.native
  
  /**
    * Information about how AWS Ground Station should conﬁgure an antenna for downlink demod decode during a contact.
    */
  var antennaDownlinkDemodDecodeConfig: js.UndefOr[AntennaDownlinkDemodDecodeConfig] = js.native
  
  /**
    * Information about how AWS Ground Station should conﬁgure an antenna for uplink during a contact.
    */
  var antennaUplinkConfig: js.UndefOr[AntennaUplinkConfig] = js.native
  
  /**
    * Information about the dataflow endpoint Config.
    */
  var dataflowEndpointConfig: js.UndefOr[DataflowEndpointConfig] = js.native
  
  /**
    * Object that determines whether tracking should be used during a contact executed with this Config in the mission profile. 
    */
  var trackingConfig: js.UndefOr[TrackingConfig] = js.native
  
  /**
    * Information about an uplink echo Config. Parameters from the AntennaUplinkConfig, corresponding to the specified AntennaUplinkConfigArn, are used when this UplinkEchoConfig is used in a contact.
    */
  var uplinkEchoConfig: js.UndefOr[UplinkEchoConfig] = js.native
}
object ConfigTypeData {
  
  @scala.inline
  def apply(): ConfigTypeData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConfigTypeData]
  }
  
  @scala.inline
  implicit class ConfigTypeDataOps[Self <: ConfigTypeData] (val x: Self) extends AnyVal {
    
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
    def setAntennaDownlinkConfig(value: AntennaDownlinkConfig): Self = this.set("antennaDownlinkConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAntennaDownlinkConfig: Self = this.set("antennaDownlinkConfig", js.undefined)
    
    @scala.inline
    def setAntennaDownlinkDemodDecodeConfig(value: AntennaDownlinkDemodDecodeConfig): Self = this.set("antennaDownlinkDemodDecodeConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAntennaDownlinkDemodDecodeConfig: Self = this.set("antennaDownlinkDemodDecodeConfig", js.undefined)
    
    @scala.inline
    def setAntennaUplinkConfig(value: AntennaUplinkConfig): Self = this.set("antennaUplinkConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAntennaUplinkConfig: Self = this.set("antennaUplinkConfig", js.undefined)
    
    @scala.inline
    def setDataflowEndpointConfig(value: DataflowEndpointConfig): Self = this.set("dataflowEndpointConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDataflowEndpointConfig: Self = this.set("dataflowEndpointConfig", js.undefined)
    
    @scala.inline
    def setTrackingConfig(value: TrackingConfig): Self = this.set("trackingConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTrackingConfig: Self = this.set("trackingConfig", js.undefined)
    
    @scala.inline
    def setUplinkEchoConfig(value: UplinkEchoConfig): Self = this.set("uplinkEchoConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUplinkEchoConfig: Self = this.set("uplinkEchoConfig", js.undefined)
  }
}
