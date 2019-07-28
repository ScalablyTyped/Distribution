package typings.commandDashLineDashArgs.commandDashLineDashArgsMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CommandLineOptions
  extends /* propName */ StringDictionary[js.Any] {
  /**
    * Command-line arguments not parsed by `commandLineArgs`.
    */
  var _unknown: js.UndefOr[js.Array[String]] = js.undefined
}

object CommandLineOptions {
  @scala.inline
  def apply(
    StringDictionary: /* propName */ StringDictionary[js.Any] = null,
    _unknown: js.Array[String] = null
  ): CommandLineOptions = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (_unknown != null) __obj.updateDynamic("_unknown")(_unknown)
    __obj.asInstanceOf[CommandLineOptions]
  }
}

