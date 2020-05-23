package typings.ckeditorCkeditor5Engine.anon

import typings.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.backward
import typings.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.character
import typings.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.codePoint
import typings.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.forward
import typings.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.word
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Direction extends js.Object {
  var direction: js.UndefOr[forward | backward] = js.undefined
  var unit: js.UndefOr[character | codePoint | word] = js.undefined
}

object Direction {
  @scala.inline
  def apply(direction: forward | backward = null, unit: character | codePoint | word = null): Direction = {
    val __obj = js.Dynamic.literal()
    if (direction != null) __obj.updateDynamic("direction")(direction.asInstanceOf[js.Any])
    if (unit != null) __obj.updateDynamic("unit")(unit.asInstanceOf[js.Any])
    __obj.asInstanceOf[Direction]
  }
}

