package typings.awsSdk.medialiveMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EbuTtDDestinationSettings extends StObject {
  
  /**
    * Specifies how to handle the gap between the lines (in multi-line captions).
  - enabled: Fill with the captions background color (as specified in the input captions).
  - disabled: Leave the gap unfilled.
    */
  var FillLineGap: js.UndefOr[EbuTtDFillLineGapControl] = js.native
  
  /**
    * Specifies the font family to include in the font data attached to the EBU-TT captions. Valid only if styleControl is set to include. If you leave this field empty, the font family is set to "monospaced". (If styleControl is set to exclude, the font family is always set to "monospaced".)
  You specify only the font family. All other style information (color, bold, position and so on) is copied from the input captions. The size is always set to 100% to allow the downstream player to choose the size.
  - Enter a list of font families, as a comma-separated list of font names, in order of preference. The name can be a font family (such as “Arial”), or a generic font family (such as “serif”), or “default” (to let the downstream player choose the font).
  - Leave blank to set the family to “monospace”.
    */
  var FontFamily: js.UndefOr[string] = js.native
  
  /**
    * Specifies the style information (font color, font position, and so on) to include in the font data that is attached to the EBU-TT captions.
  - include: Take the style information (font color, font position, and so on) from the source captions and include that information in the font data attached to the EBU-TT captions. This option is valid only if the source captions are Embedded or Teletext.
  - exclude: In the font data attached to the EBU-TT captions, set the font family to "monospaced". Do not include any other style information.
    */
  var StyleControl: js.UndefOr[EbuTtDDestinationStyleControl] = js.native
}
object EbuTtDDestinationSettings {
  
  @scala.inline
  def apply(): EbuTtDDestinationSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EbuTtDDestinationSettings]
  }
  
  @scala.inline
  implicit class EbuTtDDestinationSettingsMutableBuilder[Self <: EbuTtDDestinationSettings] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFillLineGap(value: EbuTtDFillLineGapControl): Self = StObject.set(x, "FillLineGap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFillLineGapUndefined: Self = StObject.set(x, "FillLineGap", js.undefined)
    
    @scala.inline
    def setFontFamily(value: string): Self = StObject.set(x, "FontFamily", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFontFamilyUndefined: Self = StObject.set(x, "FontFamily", js.undefined)
    
    @scala.inline
    def setStyleControl(value: EbuTtDDestinationStyleControl): Self = StObject.set(x, "StyleControl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyleControlUndefined: Self = StObject.set(x, "StyleControl", js.undefined)
  }
}
