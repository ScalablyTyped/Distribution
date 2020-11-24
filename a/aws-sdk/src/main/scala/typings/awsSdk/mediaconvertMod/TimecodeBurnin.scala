package typings.awsSdk.mediaconvertMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TimecodeBurnin extends js.Object {
  
  /**
    * Use Font Size (FontSize) to set the font size of any burned-in timecode. Valid values are 10, 16, 32, 48.
    */
  var FontSize: js.UndefOr[integerMin10Max48] = js.native
  
  /**
    * Use Position (Position) under under Timecode burn-in (TimecodeBurnIn) to specify the location the burned-in timecode on output video.
    */
  var Position: js.UndefOr[TimecodeBurninPosition] = js.native
  
  /**
    * Use Prefix (Prefix) to place ASCII characters before any burned-in timecode. For example, a prefix of "EZ-" will result in the timecode "EZ-00:00:00:00". Provide either the characters themselves or the ASCII code equivalents. The supported range of characters is 0x20 through 0x7e. This includes letters, numbers, and all special characters represented on a standard English keyboard.
    */
  var Prefix: js.UndefOr[stringPattern] = js.native
}
object TimecodeBurnin {
  
  @scala.inline
  def apply(): TimecodeBurnin = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TimecodeBurnin]
  }
  
  @scala.inline
  implicit class TimecodeBurninOps[Self <: TimecodeBurnin] (val x: Self) extends AnyVal {
    
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
    def setFontSize(value: integerMin10Max48): Self = this.set("FontSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFontSize: Self = this.set("FontSize", js.undefined)
    
    @scala.inline
    def setPosition(value: TimecodeBurninPosition): Self = this.set("Position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePosition: Self = this.set("Position", js.undefined)
    
    @scala.inline
    def setPrefix(value: stringPattern): Self = this.set("Prefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrefix: Self = this.set("Prefix", js.undefined)
  }
}
