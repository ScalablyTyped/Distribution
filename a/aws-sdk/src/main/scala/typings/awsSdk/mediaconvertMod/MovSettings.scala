package typings.awsSdk.mediaconvertMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MovSettings extends StObject {
  
  /**
    * When enabled, include 'clap' atom if appropriate for the video output settings.
    */
  var ClapAtom: js.UndefOr[MovClapAtom] = js.native
  
  /**
    * When enabled, file composition times will start at zero, composition times in the 'ctts' (composition time to sample) box for B-frames will be negative, and a 'cslg' (composition shift least greatest) box will be included per 14496-1 amendment 1. This improves compatibility with Apple players and tools.
    */
  var CslgAtom: js.UndefOr[MovCslgAtom] = js.native
  
  /**
    * When set to XDCAM, writes MPEG2 video streams into the QuickTime file using XDCAM fourcc codes. This increases compatibility with Apple editors and players, but may decrease compatibility with other players. Only applicable when the video codec is MPEG2.
    */
  var Mpeg2FourCCControl: js.UndefOr[MovMpeg2FourCCControl] = js.native
  
  /**
    * To make this output compatible with Omenon, keep the default value, OMNEON. Unless you need Omneon compatibility, set this value to NONE. When you keep the default value, OMNEON, MediaConvert increases the length of the edit list atom. This might cause file rejections when a recipient of the output file doesn't expct this extra padding.
    */
  var PaddingControl: js.UndefOr[MovPaddingControl] = js.native
  
  /**
    * Always keep the default value (SELF_CONTAINED) for this setting.
    */
  var Reference: js.UndefOr[MovReference] = js.native
}
object MovSettings {
  
  @scala.inline
  def apply(): MovSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MovSettings]
  }
  
  @scala.inline
  implicit class MovSettingsMutableBuilder[Self <: MovSettings] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClapAtom(value: MovClapAtom): Self = StObject.set(x, "ClapAtom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClapAtomUndefined: Self = StObject.set(x, "ClapAtom", js.undefined)
    
    @scala.inline
    def setCslgAtom(value: MovCslgAtom): Self = StObject.set(x, "CslgAtom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCslgAtomUndefined: Self = StObject.set(x, "CslgAtom", js.undefined)
    
    @scala.inline
    def setMpeg2FourCCControl(value: MovMpeg2FourCCControl): Self = StObject.set(x, "Mpeg2FourCCControl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMpeg2FourCCControlUndefined: Self = StObject.set(x, "Mpeg2FourCCControl", js.undefined)
    
    @scala.inline
    def setPaddingControl(value: MovPaddingControl): Self = StObject.set(x, "PaddingControl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPaddingControlUndefined: Self = StObject.set(x, "PaddingControl", js.undefined)
    
    @scala.inline
    def setReference(value: MovReference): Self = StObject.set(x, "Reference", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReferenceUndefined: Self = StObject.set(x, "Reference", js.undefined)
  }
}
