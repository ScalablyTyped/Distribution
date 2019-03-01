package typings
package chromeDashAppsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AUDIO extends js.Object {
  var AUDIO: chromeDashAppsLib.chromeDashAppsLibStrings.audio
  var SCREEN: chromeDashAppsLib.chromeDashAppsLibStrings.screen
  var TAB: chromeDashAppsLib.chromeDashAppsLibStrings.tab
  var WINDOW: chromeDashAppsLib.chromeDashAppsLibStrings.window
}

object Anon_AUDIO {
  @scala.inline
  def apply(
    AUDIO: chromeDashAppsLib.chromeDashAppsLibStrings.audio,
    SCREEN: chromeDashAppsLib.chromeDashAppsLibStrings.screen,
    TAB: chromeDashAppsLib.chromeDashAppsLibStrings.tab,
    WINDOW: chromeDashAppsLib.chromeDashAppsLibStrings.window
  ): Anon_AUDIO = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("AUDIO")(AUDIO)
    __obj.updateDynamic("SCREEN")(SCREEN)
    __obj.updateDynamic("TAB")(TAB)
    __obj.updateDynamic("WINDOW")(WINDOW)
    __obj.asInstanceOf[Anon_AUDIO]
  }
}

