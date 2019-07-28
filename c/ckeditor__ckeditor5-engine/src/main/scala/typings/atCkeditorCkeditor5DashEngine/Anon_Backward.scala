package typings.atCkeditorCkeditor5DashEngine

import typings.atCkeditorCkeditor5DashEngine.atCkeditorCkeditor5DashEngineStrings.backward
import typings.atCkeditorCkeditor5DashEngine.atCkeditorCkeditor5DashEngineStrings.character
import typings.atCkeditorCkeditor5DashEngine.atCkeditorCkeditor5DashEngineStrings.codePoint
import typings.atCkeditorCkeditor5DashEngine.atCkeditorCkeditor5DashEngineStrings.forward
import typings.atCkeditorCkeditor5DashEngine.atCkeditorCkeditor5DashEngineStrings.word
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Backward extends js.Object {
  var direction: js.UndefOr[forward | backward] = js.undefined
  var unit: js.UndefOr[character | codePoint | word] = js.undefined
}

object Anon_Backward {
  @scala.inline
  def apply(direction: forward | backward = null, unit: character | codePoint | word = null): Anon_Backward = {
    val __obj = js.Dynamic.literal()
    if (direction != null) __obj.updateDynamic("direction")(direction.asInstanceOf[js.Any])
    if (unit != null) __obj.updateDynamic("unit")(unit.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Backward]
  }
}

