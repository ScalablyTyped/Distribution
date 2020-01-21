package typings.awsSdk.mediaconvertMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  def apply(
    FontSize: Int | Double = null,
    Position: TimecodeBurninPosition = null,
    Prefix: stringPattern = null
  ): TimecodeBurnin = {
    val __obj = js.Dynamic.literal()
    if (FontSize != null) __obj.updateDynamic("FontSize")(FontSize.asInstanceOf[js.Any])
    if (Position != null) __obj.updateDynamic("Position")(Position.asInstanceOf[js.Any])
    if (Prefix != null) __obj.updateDynamic("Prefix")(Prefix.asInstanceOf[js.Any])
    __obj.asInstanceOf[TimecodeBurnin]
  }
}

