package typings.awsSdk.medialiveMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BurnInDestinationSettings extends StObject {
  
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
  implicit class BurnInDestinationSettingsMutableBuilder[Self <: BurnInDestinationSettings] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAlignment(value: BurnInAlignment): Self = StObject.set(x, "Alignment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlignmentUndefined: Self = StObject.set(x, "Alignment", js.undefined)
    
    @scala.inline
    def setBackgroundColor(value: BurnInBackgroundColor): Self = StObject.set(x, "BackgroundColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackgroundColorUndefined: Self = StObject.set(x, "BackgroundColor", js.undefined)
    
    @scala.inline
    def setBackgroundOpacity(value: integerMin0Max255): Self = StObject.set(x, "BackgroundOpacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackgroundOpacityUndefined: Self = StObject.set(x, "BackgroundOpacity", js.undefined)
    
    @scala.inline
    def setFont(value: InputLocation): Self = StObject.set(x, "Font", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFontColor(value: BurnInFontColor): Self = StObject.set(x, "FontColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFontColorUndefined: Self = StObject.set(x, "FontColor", js.undefined)
    
    @scala.inline
    def setFontOpacity(value: integerMin0Max255): Self = StObject.set(x, "FontOpacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFontOpacityUndefined: Self = StObject.set(x, "FontOpacity", js.undefined)
    
    @scala.inline
    def setFontResolution(value: integerMin96Max600): Self = StObject.set(x, "FontResolution", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFontResolutionUndefined: Self = StObject.set(x, "FontResolution", js.undefined)
    
    @scala.inline
    def setFontSize(value: string): Self = StObject.set(x, "FontSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFontSizeUndefined: Self = StObject.set(x, "FontSize", js.undefined)
    
    @scala.inline
    def setFontUndefined: Self = StObject.set(x, "Font", js.undefined)
    
    @scala.inline
    def setOutlineColor(value: BurnInOutlineColor): Self = StObject.set(x, "OutlineColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutlineColorUndefined: Self = StObject.set(x, "OutlineColor", js.undefined)
    
    @scala.inline
    def setOutlineSize(value: integerMin0Max10): Self = StObject.set(x, "OutlineSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutlineSizeUndefined: Self = StObject.set(x, "OutlineSize", js.undefined)
    
    @scala.inline
    def setShadowColor(value: BurnInShadowColor): Self = StObject.set(x, "ShadowColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShadowColorUndefined: Self = StObject.set(x, "ShadowColor", js.undefined)
    
    @scala.inline
    def setShadowOpacity(value: integerMin0Max255): Self = StObject.set(x, "ShadowOpacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShadowOpacityUndefined: Self = StObject.set(x, "ShadowOpacity", js.undefined)
    
    @scala.inline
    def setShadowXOffset(value: integer): Self = StObject.set(x, "ShadowXOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShadowXOffsetUndefined: Self = StObject.set(x, "ShadowXOffset", js.undefined)
    
    @scala.inline
    def setShadowYOffset(value: integer): Self = StObject.set(x, "ShadowYOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShadowYOffsetUndefined: Self = StObject.set(x, "ShadowYOffset", js.undefined)
    
    @scala.inline
    def setTeletextGridControl(value: BurnInTeletextGridControl): Self = StObject.set(x, "TeletextGridControl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTeletextGridControlUndefined: Self = StObject.set(x, "TeletextGridControl", js.undefined)
    
    @scala.inline
    def setXPosition(value: integerMin0): Self = StObject.set(x, "XPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXPositionUndefined: Self = StObject.set(x, "XPosition", js.undefined)
    
    @scala.inline
    def setYPosition(value: integerMin0): Self = StObject.set(x, "YPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYPositionUndefined: Self = StObject.set(x, "YPosition", js.undefined)
  }
}
