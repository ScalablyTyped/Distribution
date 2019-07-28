package typings.bowser.bowserMod.ParserNs

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
    if (name != null) __obj.updateDynamic("name")(name)
    if (version != null) __obj.updateDynamic("version")(version)
    if (versionName != null) __obj.updateDynamic("versionName")(versionName)
    __obj.asInstanceOf[OSDetails]
  }
}

