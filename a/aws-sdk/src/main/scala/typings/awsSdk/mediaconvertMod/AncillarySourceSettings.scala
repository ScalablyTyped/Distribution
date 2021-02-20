package typings.awsSdk.mediaconvertMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AncillarySourceSettings extends StObject {
  
  /**
    * Specify whether this set of input captions appears in your outputs in both 608 and 708 format. If you choose Upconvert (UPCONVERT), MediaConvert includes the captions data in two ways: it passes the 608 data through using the 608 compatibility bytes fields of the 708 wrapper, and it also translates the 608 data into 708.
    */
  var Convert608To708: js.UndefOr[AncillaryConvert608To708] = js.native
  
  /**
    * Specifies the 608 channel number in the ancillary data track from which to extract captions. Unused for passthrough.
    */
  var SourceAncillaryChannelNumber: js.UndefOr[integerMin1Max4] = js.native
  
  /**
    * By default, the service terminates any unterminated captions at the end of each input. If you want the caption to continue onto your next input, disable this setting.
    */
  var TerminateCaptions: js.UndefOr[AncillaryTerminateCaptions] = js.native
}
object AncillarySourceSettings {
  
  @scala.inline
  def apply(): AncillarySourceSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AncillarySourceSettings]
  }
  
  @scala.inline
  implicit class AncillarySourceSettingsMutableBuilder[Self <: AncillarySourceSettings] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConvert608To708(value: AncillaryConvert608To708): Self = StObject.set(x, "Convert608To708", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConvert608To708Undefined: Self = StObject.set(x, "Convert608To708", js.undefined)
    
    @scala.inline
    def setSourceAncillaryChannelNumber(value: integerMin1Max4): Self = StObject.set(x, "SourceAncillaryChannelNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceAncillaryChannelNumberUndefined: Self = StObject.set(x, "SourceAncillaryChannelNumber", js.undefined)
    
    @scala.inline
    def setTerminateCaptions(value: AncillaryTerminateCaptions): Self = StObject.set(x, "TerminateCaptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTerminateCaptionsUndefined: Self = StObject.set(x, "TerminateCaptions", js.undefined)
  }
}
