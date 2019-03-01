package typings
package commandDashLineDashArgsLib.commandDashLineDashArgsMod.commandLineArgsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CommandLineOptions
  extends /* propName */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  /**
    * Command-line arguments not parsed by `commandLineArgs`.
    */
  var _unknown: js.UndefOr[js.Array[java.lang.String]] = js.undefined
}

object CommandLineOptions {
  @scala.inline
  def apply(
    StringDictionary: /* propName */ org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    _unknown: js.Array[java.lang.String] = null
  ): CommandLineOptions = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (_unknown != null) __obj.updateDynamic("_unknown")(_unknown)
    __obj.asInstanceOf[CommandLineOptions]
  }
}

