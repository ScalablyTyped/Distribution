package typings.browserDashHarness

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ArgsLocation extends js.Object {
  var args: js.UndefOr[js.Any] = js.undefined
  var location: js.UndefOr[String] = js.undefined
  var `type`: String
}

object Anon_ArgsLocation {
  @scala.inline
  def apply(`type`: String, args: js.Any = null, location: String = null): Anon_ArgsLocation = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`)
    if (args != null) __obj.updateDynamic("args")(args)
    if (location != null) __obj.updateDynamic("location")(location)
    __obj.asInstanceOf[Anon_ArgsLocation]
  }
}

