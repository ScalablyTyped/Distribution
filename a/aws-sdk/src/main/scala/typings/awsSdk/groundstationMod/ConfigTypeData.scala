package typings.awsSdk.groundstationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConfigTypeData extends StObject {
  
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
  implicit class ConfigTypeDataMutableBuilder[Self <: ConfigTypeData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAntennaDownlinkConfig(value: AntennaDownlinkConfig): Self = StObject.set(x, "antennaDownlinkConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAntennaDownlinkConfigUndefined: Self = StObject.set(x, "antennaDownlinkConfig", js.undefined)
    
    @scala.inline
    def setAntennaDownlinkDemodDecodeConfig(value: AntennaDownlinkDemodDecodeConfig): Self = StObject.set(x, "antennaDownlinkDemodDecodeConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAntennaDownlinkDemodDecodeConfigUndefined: Self = StObject.set(x, "antennaDownlinkDemodDecodeConfig", js.undefined)
    
    @scala.inline
    def setAntennaUplinkConfig(value: AntennaUplinkConfig): Self = StObject.set(x, "antennaUplinkConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAntennaUplinkConfigUndefined: Self = StObject.set(x, "antennaUplinkConfig", js.undefined)
    
    @scala.inline
    def setDataflowEndpointConfig(value: DataflowEndpointConfig): Self = StObject.set(x, "dataflowEndpointConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataflowEndpointConfigUndefined: Self = StObject.set(x, "dataflowEndpointConfig", js.undefined)
    
    @scala.inline
    def setTrackingConfig(value: TrackingConfig): Self = StObject.set(x, "trackingConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrackingConfigUndefined: Self = StObject.set(x, "trackingConfig", js.undefined)
    
    @scala.inline
    def setUplinkEchoConfig(value: UplinkEchoConfig): Self = StObject.set(x, "uplinkEchoConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUplinkEchoConfigUndefined: Self = StObject.set(x, "uplinkEchoConfig", js.undefined)
  }
}
