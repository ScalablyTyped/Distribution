package typings.awsSdkClientPinpointBrowser.typesSegmentDemographicsMod

import typings.awsSdkClientPinpointBrowser.typesSetDimensionMod.UnmarshalledSetDimension
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UnmarshalledSegmentDemographics extends SegmentDemographics {
  
  /**
    * The app version criteria for the segment.
    */
  @JSName("AppVersion")
  var AppVersion_UnmarshalledSegmentDemographics: js.UndefOr[UnmarshalledSetDimension] = js.native
  
  /**
    * The channel criteria for the segment.
    */
  @JSName("Channel")
  var Channel_UnmarshalledSegmentDemographics: js.UndefOr[UnmarshalledSetDimension] = js.native
  
  /**
    * The device type criteria for the segment.
    */
  @JSName("DeviceType")
  var DeviceType_UnmarshalledSegmentDemographics: js.UndefOr[UnmarshalledSetDimension] = js.native
  
  /**
    * The device make criteria for the segment.
    */
  @JSName("Make")
  var Make_UnmarshalledSegmentDemographics: js.UndefOr[UnmarshalledSetDimension] = js.native
  
  /**
    * The device model criteria for the segment.
    */
  @JSName("Model")
  var Model_UnmarshalledSegmentDemographics: js.UndefOr[UnmarshalledSetDimension] = js.native
  
  /**
    * The device platform criteria for the segment.
    */
  @JSName("Platform")
  var Platform_UnmarshalledSegmentDemographics: js.UndefOr[UnmarshalledSetDimension] = js.native
}
object UnmarshalledSegmentDemographics {
  
  @scala.inline
  def apply(): UnmarshalledSegmentDemographics = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UnmarshalledSegmentDemographics]
  }
  
  @scala.inline
  implicit class UnmarshalledSegmentDemographicsOps[Self <: UnmarshalledSegmentDemographics] (val x: Self) extends AnyVal {
    
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
    def setAppVersion(value: UnmarshalledSetDimension): Self = this.set("AppVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAppVersion: Self = this.set("AppVersion", js.undefined)
    
    @scala.inline
    def setChannel(value: UnmarshalledSetDimension): Self = this.set("Channel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChannel: Self = this.set("Channel", js.undefined)
    
    @scala.inline
    def setDeviceType(value: UnmarshalledSetDimension): Self = this.set("DeviceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeviceType: Self = this.set("DeviceType", js.undefined)
    
    @scala.inline
    def setMake(value: UnmarshalledSetDimension): Self = this.set("Make", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMake: Self = this.set("Make", js.undefined)
    
    @scala.inline
    def setModel(value: UnmarshalledSetDimension): Self = this.set("Model", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteModel: Self = this.set("Model", js.undefined)
    
    @scala.inline
    def setPlatform(value: UnmarshalledSetDimension): Self = this.set("Platform", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePlatform: Self = this.set("Platform", js.undefined)
  }
}
