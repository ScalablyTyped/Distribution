package typings.awsSdk.medialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BurnInDestinationSettings extends js.Object {
  
  /**
    * If no explicit xPosition or yPosition is provided, setting alignment to centered will place the captions at the bottom center of the output. Similarly, setting a left alignment will align captions to the bottom left of the output. If x and y positions are given in conjunction with the alignment parameter, the font will be justified (either left or centered) relative to those coordinates. Selecting "smart" justification will left-justify live subtitles and center-justify pre-recorded subtitles.  All burn-in and DVB-Sub font settings must match.
    */
  var Alignment: js.UndefOr[BurnInAlignment] = js.native
  
  /**
    * Specifies the color of the rectangle behind the captions.  All burn-in and DVB-Sub font settings must match.
    */
  var BackgroundColor: js.UndefOr[BurnInBackgroundColor] = js.native
  
  /**
    * Specifies the opacity of the background rectangle. 255 is opaque; 0 is transparent. Leaving this parameter out is equivalent to setting it to 0 (transparent).  All burn-in and DVB-Sub font settings must match.
    */
  var BackgroundOpacity: js.UndefOr[integerMin0Max255] = js.native
  
  /**
    * External font file used for caption burn-in. File extension must be 'ttf' or 'tte'.  Although the user can select output fonts for many different types of input captions,  embedded, STL and teletext sources use a strict grid system. Using external fonts with these caption sources could cause unexpected display of proportional fonts.  All burn-in and DVB-Sub font settings must match.
    */
  var Font: js.UndefOr[InputLocation] = js.native
  
  /**
    * Specifies the color of the burned-in captions.  This option is not valid for source captions that are STL, 608/embedded or teletext.  These source settings are already pre-defined by the caption stream.  All burn-in and DVB-Sub font settings must match.
    */
  var FontColor: js.UndefOr[BurnInFontColor] = js.native
  
  /**
    * Specifies the opacity of the burned-in captions. 255 is opaque; 0 is transparent.  All burn-in and DVB-Sub font settings must match.
    */
  var FontOpacity: js.UndefOr[integerMin0Max255] = js.native
  
  /**
    * Font resolution in DPI (dots per inch); default is 96 dpi.  All burn-in and DVB-Sub font settings must match.
    */
  var FontResolution: js.UndefOr[integerMin96Max600] = js.native
  
  /**
    * When set to 'auto' fontSize will scale depending on the size of the output.  Giving a positive integer will specify the exact font size in points.  All burn-in and DVB-Sub font settings must match.
    */
  var FontSize: js.UndefOr[string] = js.native
  
  /**
    * Specifies font outline color. This option is not valid for source captions that are either 608/embedded or teletext. These source settings are already pre-defined by the caption stream. All burn-in and DVB-Sub font settings must match.
    */
  var OutlineColor: js.UndefOr[BurnInOutlineColor] = js.native
  
  /**
    * Specifies font outline size in pixels. This option is not valid for source captions that are either 608/embedded or teletext. These source settings are already pre-defined by the caption stream. All burn-in and DVB-Sub font settings must match.
    */
  var OutlineSize: js.UndefOr[integerMin0Max10] = js.native
  
  /**
    * Specifies the color of the shadow cast by the captions.  All burn-in and DVB-Sub font settings must match.
    */
  var ShadowColor: js.UndefOr[BurnInShadowColor] = js.native
  
  /**
    * Specifies the opacity of the shadow. 255 is opaque; 0 is transparent. Leaving this parameter out is equivalent to setting it to 0 (transparent).  All burn-in and DVB-Sub font settings must match.
    */
  var ShadowOpacity: js.UndefOr[integerMin0Max255] = js.native
  
  /**
    * Specifies the horizontal offset of the shadow relative to the captions in pixels. A value of -2 would result in a shadow offset 2 pixels to the left.  All burn-in and DVB-Sub font settings must match.
    */
  var ShadowXOffset: js.UndefOr[integer] = js.native
  
  /**
    * Specifies the vertical offset of the shadow relative to the captions in pixels. A value of -2 would result in a shadow offset 2 pixels above the text.  All burn-in and DVB-Sub font settings must match.
    */
  var ShadowYOffset: js.UndefOr[integer] = js.native
  
  /**
    * Controls whether a fixed grid size will be used to generate the output subtitles bitmap. Only applicable for Teletext inputs and DVB-Sub/Burn-in outputs.
    */
  var TeletextGridControl: js.UndefOr[BurnInTeletextGridControl] = js.native
  
  /**
    * Specifies the horizontal position of the caption relative to the left side of the output in pixels. A value of 10 would result in the captions starting 10 pixels from the left of the output. If no explicit xPosition is provided, the horizontal caption position will be determined by the alignment parameter.  All burn-in and DVB-Sub font settings must match.
    */
  var XPosition: js.UndefOr[integerMin0] = js.native
  
  /**
    * Specifies the vertical position of the caption relative to the top of the output in pixels. A value of 10 would result in the captions starting 10 pixels from the top of the output. If no explicit yPosition is provided, the caption will be positioned towards the bottom of the output.  All burn-in and DVB-Sub font settings must match.
    */
  var YPosition: js.UndefOr[integerMin0] = js.native
}
object BurnInDestinationSettings {
  
  @scala.inline
  def apply(): BurnInDestinationSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BurnInDestinationSettings]
  }
  
  @scala.inline
  implicit class BurnInDestinationSettingsOps[Self <: BurnInDestinationSettings] (val x: Self) extends AnyVal {
    
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
    def setAlignment(value: BurnInAlignment): Self = this.set("Alignment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAlignment: Self = this.set("Alignment", js.undefined)
    
    @scala.inline
    def setBackgroundColor(value: BurnInBackgroundColor): Self = this.set("BackgroundColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBackgroundColor: Self = this.set("BackgroundColor", js.undefined)
    
    @scala.inline
    def setBackgroundOpacity(value: integerMin0Max255): Self = this.set("BackgroundOpacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBackgroundOpacity: Self = this.set("BackgroundOpacity", js.undefined)
    
    @scala.inline
    def setFont(value: InputLocation): Self = this.set("Font", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFont: Self = this.set("Font", js.undefined)
    
    @scala.inline
    def setFontColor(value: BurnInFontColor): Self = this.set("FontColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFontColor: Self = this.set("FontColor", js.undefined)
    
    @scala.inline
    def setFontOpacity(value: integerMin0Max255): Self = this.set("FontOpacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFontOpacity: Self = this.set("FontOpacity", js.undefined)
    
    @scala.inline
    def setFontResolution(value: integerMin96Max600): Self = this.set("FontResolution", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFontResolution: Self = this.set("FontResolution", js.undefined)
    
    @scala.inline
    def setFontSize(value: string): Self = this.set("FontSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFontSize: Self = this.set("FontSize", js.undefined)
    
    @scala.inline
    def setOutlineColor(value: BurnInOutlineColor): Self = this.set("OutlineColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOutlineColor: Self = this.set("OutlineColor", js.undefined)
    
    @scala.inline
    def setOutlineSize(value: integerMin0Max10): Self = this.set("OutlineSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOutlineSize: Self = this.set("OutlineSize", js.undefined)
    
    @scala.inline
    def setShadowColor(value: BurnInShadowColor): Self = this.set("ShadowColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShadowColor: Self = this.set("ShadowColor", js.undefined)
    
    @scala.inline
    def setShadowOpacity(value: integerMin0Max255): Self = this.set("ShadowOpacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShadowOpacity: Self = this.set("ShadowOpacity", js.undefined)
    
    @scala.inline
    def setShadowXOffset(value: integer): Self = this.set("ShadowXOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShadowXOffset: Self = this.set("ShadowXOffset", js.undefined)
    
    @scala.inline
    def setShadowYOffset(value: integer): Self = this.set("ShadowYOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShadowYOffset: Self = this.set("ShadowYOffset", js.undefined)
    
    @scala.inline
    def setTeletextGridControl(value: BurnInTeletextGridControl): Self = this.set("TeletextGridControl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTeletextGridControl: Self = this.set("TeletextGridControl", js.undefined)
    
    @scala.inline
    def setXPosition(value: integerMin0): Self = this.set("XPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteXPosition: Self = this.set("XPosition", js.undefined)
    
    @scala.inline
    def setYPosition(value: integerMin0): Self = this.set("YPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteYPosition: Self = this.set("YPosition", js.undefined)
  }
}
