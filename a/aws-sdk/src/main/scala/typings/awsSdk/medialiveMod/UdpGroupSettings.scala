package typings.awsSdk.medialiveMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UdpGroupSettings extends StObject {
  
  /**
    * Specifies behavior of last resort when input video is lost, and no more backup inputs are available. When dropTs is selected the entire transport stream will stop being emitted.  When dropProgram is selected the program can be dropped from the transport stream (and replaced with null packets to meet the TS bitrate requirement).  Or, when emitProgram is chosen the transport stream will continue to be produced normally with repeat frames, black frames, or slate frames substituted for the absent input video.
    */
  var InputLossAction: js.UndefOr[InputLossActionForUdpOut] = js.undefined
  
  /**
    * Indicates ID3 frame that has the timecode.
    */
  var TimedMetadataId3Frame: js.UndefOr[UdpTimedMetadataId3Frame] = js.undefined
  
  /**
    * Timed Metadata interval in seconds.
    */
  var TimedMetadataId3Period: js.UndefOr[integerMin0] = js.undefined
}
object UdpGroupSettings {
  
  @scala.inline
  def apply(): UdpGroupSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UdpGroupSettings]
  }
  
  @scala.inline
  implicit class UdpGroupSettingsMutableBuilder[Self <: UdpGroupSettings] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInputLossAction(value: InputLossActionForUdpOut): Self = StObject.set(x, "InputLossAction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputLossActionUndefined: Self = StObject.set(x, "InputLossAction", js.undefined)
    
    @scala.inline
    def setTimedMetadataId3Frame(value: UdpTimedMetadataId3Frame): Self = StObject.set(x, "TimedMetadataId3Frame", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimedMetadataId3FrameUndefined: Self = StObject.set(x, "TimedMetadataId3Frame", js.undefined)
    
    @scala.inline
    def setTimedMetadataId3Period(value: integerMin0): Self = StObject.set(x, "TimedMetadataId3Period", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimedMetadataId3PeriodUndefined: Self = StObject.set(x, "TimedMetadataId3Period", js.undefined)
  }
}
