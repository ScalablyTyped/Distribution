package typings.cordovaPluginGlobalization

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Navigator extends js.Object {
  /** This plugin obtains information and performs operations specific to the user's locale and timezone. */
  var globalization: Globalization
}

object Navigator {
  @scala.inline
  def apply(globalization: Globalization): Navigator = {
    val __obj = js.Dynamic.literal(globalization = globalization.asInstanceOf[js.Any])
    __obj.asInstanceOf[Navigator]
  }
}

