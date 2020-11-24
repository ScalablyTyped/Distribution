package typings.awsSdkClientPinpointBrowser.typesSegmentDemographicsMod

import typings.awsSdkClientPinpointBrowser.typesSetDimensionMod.SetDimension
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SegmentDemographics extends js.Object {
  
  /**
    * The app version criteria for the segment.
    */
  var AppVersion: js.UndefOr[SetDimension] = js.native
  
  /**
    * The channel criteria for the segment.
    */
  var Channel: js.UndefOr[SetDimension] = js.native
  
  /**
    * The device type criteria for the segment.
    */
  var DeviceType: js.UndefOr[SetDimension] = js.native
  
  /**
    * The device make criteria for the segment.
    */
  var Make: js.UndefOr[SetDimension] = js.native
  
  /**
    * The device model criteria for the segment.
    */
  var Model: js.UndefOr[SetDimension] = js.native
  
  /**
    * The device platform criteria for the segment.
    */
  var Platform: js.UndefOr[SetDimension] = js.native
}
object SegmentDemographics {
  
  @scala.inline
  def apply(): SegmentDemographics = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SegmentDemographics]
  }
  
  @scala.inline
  implicit class SegmentDemographicsOps[Self <: SegmentDemographics] (val x: Self) extends AnyVal {
    
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
    def setAppVersion(value: SetDimension): Self = this.set("AppVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAppVersion: Self = this.set("AppVersion", js.undefined)
    
    @scala.inline
    def setChannel(value: SetDimension): Self = this.set("Channel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChannel: Self = this.set("Channel", js.undefined)
    
    @scala.inline
    def setDeviceType(value: SetDimension): Self = this.set("DeviceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeviceType: Self = this.set("DeviceType", js.undefined)
    
    @scala.inline
    def setMake(value: SetDimension): Self = this.set("Make", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMake: Self = this.set("Make", js.undefined)
    
    @scala.inline
    def setModel(value: SetDimension): Self = this.set("Model", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteModel: Self = this.set("Model", js.undefined)
    
    @scala.inline
    def setPlatform(value: SetDimension): Self = this.set("Platform", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePlatform: Self = this.set("Platform", js.undefined)
  }
}
