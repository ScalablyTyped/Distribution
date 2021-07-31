package typings.awsSdk.mediaconvertMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TimecodeBurnin extends StObject {
  
  /**
    * Use Font Size (FontSize) to set the font size of any burned-in timecode. Valid values are 10, 16, 32, 48.
    */
  var FontSize: js.UndefOr[integerMin10Max48] = js.undefined
  
  /**
    * Use Position (Position) under under Timecode burn-in (TimecodeBurnIn) to specify the location the burned-in timecode on output video.
    */
  var Position: js.UndefOr[TimecodeBurninPosition] = js.undefined
  
  /**
    * Use Prefix (Prefix) to place ASCII characters before any burned-in timecode. For example, a prefix of "EZ-" will result in the timecode "EZ-00:00:00:00". Provide either the characters themselves or the ASCII code equivalents. The supported range of characters is 0x20 through 0x7e. This includes letters, numbers, and all special characters represented on a standard English keyboard.
    */
  var Prefix: js.UndefOr[stringPattern] = js.undefined
}
object TimecodeBurnin {
  
  @scala.inline
  def apply(): TimecodeBurnin = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TimecodeBurnin]
  }
  
  @scala.inline
  implicit class TimecodeBurninMutableBuilder[Self <: TimecodeBurnin] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFontSize(value: integerMin10Max48): Self = StObject.set(x, "FontSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFontSizeUndefined: Self = StObject.set(x, "FontSize", js.undefined)
    
    @scala.inline
    def setPosition(value: TimecodeBurninPosition): Self = StObject.set(x, "Position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPositionUndefined: Self = StObject.set(x, "Position", js.undefined)
    
    @scala.inline
    def setPrefix(value: stringPattern): Self = StObject.set(x, "Prefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrefixUndefined: Self = StObject.set(x, "Prefix", js.undefined)
  }
}
