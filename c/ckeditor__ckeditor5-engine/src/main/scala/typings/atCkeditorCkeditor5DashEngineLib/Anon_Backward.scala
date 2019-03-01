package typings
package atCkeditorCkeditor5DashEngineLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Backward extends js.Object {
  var direction: js.UndefOr[
    atCkeditorCkeditor5DashEngineLib.atCkeditorCkeditor5DashEngineLibStrings.forward | atCkeditorCkeditor5DashEngineLib.atCkeditorCkeditor5DashEngineLibStrings.backward
  ] = js.undefined
  var unit: js.UndefOr[
    atCkeditorCkeditor5DashEngineLib.atCkeditorCkeditor5DashEngineLibStrings.character | atCkeditorCkeditor5DashEngineLib.atCkeditorCkeditor5DashEngineLibStrings.codePoint | atCkeditorCkeditor5DashEngineLib.atCkeditorCkeditor5DashEngineLibStrings.word
  ] = js.undefined
}

object Anon_Backward {
  @scala.inline
  def apply(
    direction: atCkeditorCkeditor5DashEngineLib.atCkeditorCkeditor5DashEngineLibStrings.forward | atCkeditorCkeditor5DashEngineLib.atCkeditorCkeditor5DashEngineLibStrings.backward = null,
    unit: atCkeditorCkeditor5DashEngineLib.atCkeditorCkeditor5DashEngineLibStrings.character | atCkeditorCkeditor5DashEngineLib.atCkeditorCkeditor5DashEngineLibStrings.codePoint | atCkeditorCkeditor5DashEngineLib.atCkeditorCkeditor5DashEngineLibStrings.word = null
  ): Anon_Backward = {
    val __obj = js.Dynamic.literal()
    if (direction != null) __obj.updateDynamic("direction")(direction.asInstanceOf[js.Any])
    if (unit != null) __obj.updateDynamic("unit")(unit.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Backward]
  }
}

