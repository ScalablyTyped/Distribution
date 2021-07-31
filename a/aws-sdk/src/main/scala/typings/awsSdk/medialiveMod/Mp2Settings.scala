package typings.awsSdk.medialiveMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Mp2Settings extends StObject {
  
  /**
    * Average bitrate in bits/second.
    */
  var Bitrate: js.UndefOr[double] = js.undefined
  
  /**
    * The MPEG2 Audio coding mode.  Valid values are codingMode10 (for mono) or codingMode20 (for stereo).
    */
  var CodingMode: js.UndefOr[Mp2CodingMode] = js.undefined
  
  /**
    * Sample rate in Hz.
    */
  var SampleRate: js.UndefOr[double] = js.undefined
}
object Mp2Settings {
  
  @scala.inline
  def apply(): Mp2Settings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Mp2Settings]
  }
  
  @scala.inline
  implicit class Mp2SettingsMutableBuilder[Self <: Mp2Settings] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBitrate(value: double): Self = StObject.set(x, "Bitrate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBitrateUndefined: Self = StObject.set(x, "Bitrate", js.undefined)
    
    @scala.inline
    def setCodingMode(value: Mp2CodingMode): Self = StObject.set(x, "CodingMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCodingModeUndefined: Self = StObject.set(x, "CodingMode", js.undefined)
    
    @scala.inline
    def setSampleRate(value: double): Self = StObject.set(x, "SampleRate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSampleRateUndefined: Self = StObject.set(x, "SampleRate", js.undefined)
  }
}
