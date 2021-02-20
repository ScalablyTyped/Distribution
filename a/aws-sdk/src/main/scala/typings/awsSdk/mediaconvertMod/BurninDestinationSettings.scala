package typings.awsSdk.mediaconvertMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BurninDestinationSettings extends StObject {
  
  /**
    * If no explicit x_position or y_position is provided, setting alignment to centered will place the captions at the bottom center of the output. Similarly, setting a left alignment will align captions to the bottom left of the output. If x and y positions are given in conjunction with the alignment parameter, the font will be justified (either left or centered) relative to those coordinates. This option is not valid for source captions that are STL, 608/embedded or teletext. These source settings are already pre-defined by the caption stream. All burn-in and DVB-Sub font settings must match.
    */
  var Alignment: js.UndefOr[BurninSubtitleAlignment] = js.native
  
  /**
    * Specifies the color of the rectangle behind the captions.
  All burn-in and DVB-Sub font settings must match.
    */
  var BackgroundColor: js.UndefOr[BurninSubtitleBackgroundColor] = js.native
  
  /**
    * Specifies the opacity of the background rectangle. 255 is opaque; 0 is transparent. Leaving this parameter blank is equivalent to setting it to 0 (transparent). All burn-in and DVB-Sub font settings must match.
    */
  var BackgroundOpacity: js.UndefOr[integerMin0Max255] = js.native
  
  /**
    * Specifies the color of the burned-in captions. This option is not valid for source captions that are STL, 608/embedded or teletext. These source settings are already pre-defined by the caption stream. All burn-in and DVB-Sub font settings must match.
    */
  var FontColor: js.UndefOr[BurninSubtitleFontColor] = js.native
  
  /**
    * Specifies the opacity of the burned-in captions. 255 is opaque; 0 is transparent.
  All burn-in and DVB-Sub font settings must match.
    */
  var FontOpacity: js.UndefOr[integerMin0Max255] = js.native
  
  /**
    * Font resolution in DPI (dots per inch); default is 96 dpi.
  All burn-in and DVB-Sub font settings must match.
    */
  var FontResolution: js.UndefOr[integerMin96Max600] = js.native
  
  /**
    * Provide the font script, using an ISO 15924 script code, if the LanguageCode is not sufficient for determining the script type. Where LanguageCode or CustomLanguageCode is sufficient, use "AUTOMATIC" or leave unset. This is used to help determine the appropriate font for rendering burn-in captions.
    */
  var FontScript: js.UndefOr[typings.awsSdk.mediaconvertMod.FontScript] = js.native
  
  /**
    * A positive integer indicates the exact font size in points. Set to 0 for automatic font size selection. All burn-in and DVB-Sub font settings must match.
    */
  var FontSize: js.UndefOr[integerMin0Max96] = js.native
  
  /**
    * Specifies font outline color. This option is not valid for source captions that are either 608/embedded or teletext. These source settings are already pre-defined by the caption stream. All burn-in and DVB-Sub font settings must match.
    */
  var OutlineColor: js.UndefOr[BurninSubtitleOutlineColor] = js.native
  
  /**
    * Specifies font outline size in pixels. This option is not valid for source captions that are either 608/embedded or teletext. These source settings are already pre-defined by the caption stream. All burn-in and DVB-Sub font settings must match.
    */
  var OutlineSize: js.UndefOr[integerMin0Max10] = js.native
  
  /**
    * Specifies the color of the shadow cast by the captions.
  All burn-in and DVB-Sub font settings must match.
    */
  var ShadowColor: js.UndefOr[BurninSubtitleShadowColor] = js.native
  
  /**
    * Specifies the opacity of the shadow. 255 is opaque; 0 is transparent. Leaving this parameter blank is equivalent to setting it to 0 (transparent). All burn-in and DVB-Sub font settings must match.
    */
  var ShadowOpacity: js.UndefOr[integerMin0Max255] = js.native
  
  /**
    * Specifies the horizontal offset of the shadow relative to the captions in pixels. A value of -2 would result in a shadow offset 2 pixels to the left. All burn-in and DVB-Sub font settings must match.
    */
  var ShadowXOffset: js.UndefOr[integerMinNegative2147483648Max2147483647] = js.native
  
  /**
    * Specifies the vertical offset of the shadow relative to the captions in pixels. A value of -2 would result in a shadow offset 2 pixels above the text. All burn-in and DVB-Sub font settings must match.
    */
  var ShadowYOffset: js.UndefOr[integerMinNegative2147483648Max2147483647] = js.native
  
  /**
    * Only applies to jobs with input captions in Teletext or STL formats. Specify whether the spacing between letters in your captions is set by the captions grid or varies depending on letter width. Choose fixed grid to conform to the spacing specified in the captions file more accurately. Choose proportional to make the text easier to read if the captions are closed caption.
    */
  var TeletextSpacing: js.UndefOr[BurninSubtitleTeletextSpacing] = js.native
  
  /**
    * Specifies the horizontal position of the caption relative to the left side of the output in pixels. A value of 10 would result in the captions starting 10 pixels from the left of the output. If no explicit x_position is provided, the horizontal caption position will be determined by the alignment parameter. This option is not valid for source captions that are STL, 608/embedded or teletext. These source settings are already pre-defined by the caption stream. All burn-in and DVB-Sub font settings must match.
    */
  var XPosition: js.UndefOr[integerMin0Max2147483647] = js.native
  
  /**
    * Specifies the vertical position of the caption relative to the top of the output in pixels. A value of 10 would result in the captions starting 10 pixels from the top of the output. If no explicit y_position is provided, the caption will be positioned towards the bottom of the output. This option is not valid for source captions that are STL, 608/embedded or teletext. These source settings are already pre-defined by the caption stream. All burn-in and DVB-Sub font settings must match.
    */
  var YPosition: js.UndefOr[integerMin0Max2147483647] = js.native
}
object BurninDestinationSettings {
  
  @scala.inline
  def apply(): BurninDestinationSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BurninDestinationSettings]
  }
  
  @scala.inline
  implicit class BurninDestinationSettingsMutableBuilder[Self <: BurninDestinationSettings] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAlignment(value: BurninSubtitleAlignment): Self = StObject.set(x, "Alignment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlignmentUndefined: Self = StObject.set(x, "Alignment", js.undefined)
    
    @scala.inline
    def setBackgroundColor(value: BurninSubtitleBackgroundColor): Self = StObject.set(x, "BackgroundColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackgroundColorUndefined: Self = StObject.set(x, "BackgroundColor", js.undefined)
    
    @scala.inline
    def setBackgroundOpacity(value: integerMin0Max255): Self = StObject.set(x, "BackgroundOpacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackgroundOpacityUndefined: Self = StObject.set(x, "BackgroundOpacity", js.undefined)
    
    @scala.inline
    def setFontColor(value: BurninSubtitleFontColor): Self = StObject.set(x, "FontColor", value.asInstanceOf[js.Any])
    
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
    def setFontScript(value: FontScript): Self = StObject.set(x, "FontScript", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFontScriptUndefined: Self = StObject.set(x, "FontScript", js.undefined)
    
    @scala.inline
    def setFontSize(value: integerMin0Max96): Self = StObject.set(x, "FontSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFontSizeUndefined: Self = StObject.set(x, "FontSize", js.undefined)
    
    @scala.inline
    def setOutlineColor(value: BurninSubtitleOutlineColor): Self = StObject.set(x, "OutlineColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutlineColorUndefined: Self = StObject.set(x, "OutlineColor", js.undefined)
    
    @scala.inline
    def setOutlineSize(value: integerMin0Max10): Self = StObject.set(x, "OutlineSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutlineSizeUndefined: Self = StObject.set(x, "OutlineSize", js.undefined)
    
    @scala.inline
    def setShadowColor(value: BurninSubtitleShadowColor): Self = StObject.set(x, "ShadowColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShadowColorUndefined: Self = StObject.set(x, "ShadowColor", js.undefined)
    
    @scala.inline
    def setShadowOpacity(value: integerMin0Max255): Self = StObject.set(x, "ShadowOpacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShadowOpacityUndefined: Self = StObject.set(x, "ShadowOpacity", js.undefined)
    
    @scala.inline
    def setShadowXOffset(value: integerMinNegative2147483648Max2147483647): Self = StObject.set(x, "ShadowXOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShadowXOffsetUndefined: Self = StObject.set(x, "ShadowXOffset", js.undefined)
    
    @scala.inline
    def setShadowYOffset(value: integerMinNegative2147483648Max2147483647): Self = StObject.set(x, "ShadowYOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShadowYOffsetUndefined: Self = StObject.set(x, "ShadowYOffset", js.undefined)
    
    @scala.inline
    def setTeletextSpacing(value: BurninSubtitleTeletextSpacing): Self = StObject.set(x, "TeletextSpacing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTeletextSpacingUndefined: Self = StObject.set(x, "TeletextSpacing", js.undefined)
    
    @scala.inline
    def setXPosition(value: integerMin0Max2147483647): Self = StObject.set(x, "XPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXPositionUndefined: Self = StObject.set(x, "XPosition", js.undefined)
    
    @scala.inline
    def setYPosition(value: integerMin0Max2147483647): Self = StObject.set(x, "YPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYPositionUndefined: Self = StObject.set(x, "YPosition", js.undefined)
  }
}
