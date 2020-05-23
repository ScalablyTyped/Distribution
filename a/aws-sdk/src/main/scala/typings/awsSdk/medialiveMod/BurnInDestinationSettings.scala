package typings.awsSdk.medialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  def apply(
    Alignment: BurnInAlignment = null,
    BackgroundColor: BurnInBackgroundColor = null,
    BackgroundOpacity: js.UndefOr[integerMin0Max255] = js.undefined,
    Font: InputLocation = null,
    FontColor: BurnInFontColor = null,
    FontOpacity: js.UndefOr[integerMin0Max255] = js.undefined,
    FontResolution: js.UndefOr[integerMin96Max600] = js.undefined,
    FontSize: string = null,
    OutlineColor: BurnInOutlineColor = null,
    OutlineSize: js.UndefOr[integerMin0Max10] = js.undefined,
    ShadowColor: BurnInShadowColor = null,
    ShadowOpacity: js.UndefOr[integerMin0Max255] = js.undefined,
    ShadowXOffset: js.UndefOr[integer] = js.undefined,
    ShadowYOffset: js.UndefOr[integer] = js.undefined,
    TeletextGridControl: BurnInTeletextGridControl = null,
    XPosition: js.UndefOr[integerMin0] = js.undefined,
    YPosition: js.UndefOr[integerMin0] = js.undefined
  ): BurnInDestinationSettings = {
    val __obj = js.Dynamic.literal()
    if (Alignment != null) __obj.updateDynamic("Alignment")(Alignment.asInstanceOf[js.Any])
    if (BackgroundColor != null) __obj.updateDynamic("BackgroundColor")(BackgroundColor.asInstanceOf[js.Any])
    if (!js.isUndefined(BackgroundOpacity)) __obj.updateDynamic("BackgroundOpacity")(BackgroundOpacity.get.asInstanceOf[js.Any])
    if (Font != null) __obj.updateDynamic("Font")(Font.asInstanceOf[js.Any])
    if (FontColor != null) __obj.updateDynamic("FontColor")(FontColor.asInstanceOf[js.Any])
    if (!js.isUndefined(FontOpacity)) __obj.updateDynamic("FontOpacity")(FontOpacity.get.asInstanceOf[js.Any])
    if (!js.isUndefined(FontResolution)) __obj.updateDynamic("FontResolution")(FontResolution.get.asInstanceOf[js.Any])
    if (FontSize != null) __obj.updateDynamic("FontSize")(FontSize.asInstanceOf[js.Any])
    if (OutlineColor != null) __obj.updateDynamic("OutlineColor")(OutlineColor.asInstanceOf[js.Any])
    if (!js.isUndefined(OutlineSize)) __obj.updateDynamic("OutlineSize")(OutlineSize.get.asInstanceOf[js.Any])
    if (ShadowColor != null) __obj.updateDynamic("ShadowColor")(ShadowColor.asInstanceOf[js.Any])
    if (!js.isUndefined(ShadowOpacity)) __obj.updateDynamic("ShadowOpacity")(ShadowOpacity.get.asInstanceOf[js.Any])
    if (!js.isUndefined(ShadowXOffset)) __obj.updateDynamic("ShadowXOffset")(ShadowXOffset.get.asInstanceOf[js.Any])
    if (!js.isUndefined(ShadowYOffset)) __obj.updateDynamic("ShadowYOffset")(ShadowYOffset.get.asInstanceOf[js.Any])
    if (TeletextGridControl != null) __obj.updateDynamic("TeletextGridControl")(TeletextGridControl.asInstanceOf[js.Any])
    if (!js.isUndefined(XPosition)) __obj.updateDynamic("XPosition")(XPosition.get.asInstanceOf[js.Any])
    if (!js.isUndefined(YPosition)) __obj.updateDynamic("YPosition")(YPosition.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[BurnInDestinationSettings]
  }
}

