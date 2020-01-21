package typings.bowser.mod.Parser

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OSDetails extends Details {
  var versionName: js.UndefOr[String] = js.undefined
}

object OSDetails {
  @scala.inline
  def apply(name: String = null, version: String = null, versionName: String = null): OSDetails = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (version != null) __obj.updateDynamic("version")(version.asInstanceOf[js.Any])
    if (versionName != null) __obj.updateDynamic("versionName")(versionName.asInstanceOf[js.Any])
    __obj.asInstanceOf[OSDetails]
  }
}

