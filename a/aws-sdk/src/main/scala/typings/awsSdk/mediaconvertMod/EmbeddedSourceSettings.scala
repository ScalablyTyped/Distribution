package typings.awsSdk.mediaconvertMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EmbeddedSourceSettings extends StObject {
  
  /**
    * Specify whether this set of input captions appears in your outputs in both 608 and 708 format. If you choose Upconvert (UPCONVERT), MediaConvert includes the captions data in two ways: it passes the 608 data through using the 608 compatibility bytes fields of the 708 wrapper, and it also translates the 608 data into 708.
    */
  var Convert608To708: js.UndefOr[EmbeddedConvert608To708] = js.native
  
  /**
    * Specifies the 608/708 channel number within the video track from which to extract captions. Unused for passthrough.
    */
  var Source608ChannelNumber: js.UndefOr[integerMin1Max4] = js.native
  
  /**
    * Specifies the video track index used for extracting captions. The system only supports one input video track, so this should always be set to '1'.
    */
  var Source608TrackNumber: js.UndefOr[integerMin1Max1] = js.native
  
  /**
    * By default, the service terminates any unterminated captions at the end of each input. If you want the caption to continue onto your next input, disable this setting.
    */
  var TerminateCaptions: js.UndefOr[EmbeddedTerminateCaptions] = js.native
}
object EmbeddedSourceSettings {
  
  @scala.inline
  def apply(): EmbeddedSourceSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EmbeddedSourceSettings]
  }
  
  @scala.inline
  implicit class EmbeddedSourceSettingsMutableBuilder[Self <: EmbeddedSourceSettings] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConvert608To708(value: EmbeddedConvert608To708): Self = StObject.set(x, "Convert608To708", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConvert608To708Undefined: Self = StObject.set(x, "Convert608To708", js.undefined)
    
    @scala.inline
    def setSource608ChannelNumber(value: integerMin1Max4): Self = StObject.set(x, "Source608ChannelNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSource608ChannelNumberUndefined: Self = StObject.set(x, "Source608ChannelNumber", js.undefined)
    
    @scala.inline
    def setSource608TrackNumber(value: integerMin1Max1): Self = StObject.set(x, "Source608TrackNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSource608TrackNumberUndefined: Self = StObject.set(x, "Source608TrackNumber", js.undefined)
    
    @scala.inline
    def setTerminateCaptions(value: EmbeddedTerminateCaptions): Self = StObject.set(x, "TerminateCaptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTerminateCaptionsUndefined: Self = StObject.set(x, "TerminateCaptions", js.undefined)
  }
}
