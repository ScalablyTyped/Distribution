package typings.awsSdk.pinpointMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SegmentDemographics extends StObject {
  
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
  implicit class SegmentDemographicsMutableBuilder[Self <: SegmentDemographics] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAppVersion(value: SetDimension): Self = StObject.set(x, "AppVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAppVersionUndefined: Self = StObject.set(x, "AppVersion", js.undefined)
    
    @scala.inline
    def setChannel(value: SetDimension): Self = StObject.set(x, "Channel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChannelUndefined: Self = StObject.set(x, "Channel", js.undefined)
    
    @scala.inline
    def setDeviceType(value: SetDimension): Self = StObject.set(x, "DeviceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeviceTypeUndefined: Self = StObject.set(x, "DeviceType", js.undefined)
    
    @scala.inline
    def setMake(value: SetDimension): Self = StObject.set(x, "Make", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMakeUndefined: Self = StObject.set(x, "Make", js.undefined)
    
    @scala.inline
    def setModel(value: SetDimension): Self = StObject.set(x, "Model", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModelUndefined: Self = StObject.set(x, "Model", js.undefined)
    
    @scala.inline
    def setPlatform(value: SetDimension): Self = StObject.set(x, "Platform", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlatformUndefined: Self = StObject.set(x, "Platform", js.undefined)
  }
}
