package typings.chromeApps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonScripts extends js.Object {
  var scripts: js.UndefOr[js.Array[String]] = js.undefined
}

object AnonScripts {
  @scala.inline
  def apply(scripts: js.Array[String] = null): AnonScripts = {
    val __obj = js.Dynamic.literal()
    if (scripts != null) __obj.updateDynamic("scripts")(scripts.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonScripts]
  }
}

