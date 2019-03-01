package typings
package bowserLib.bowserMod.ParserNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OSDetails extends Details {
  var versionName: js.UndefOr[java.lang.String] = js.undefined
}

object OSDetails {
  @scala.inline
  def apply(
    name: java.lang.String = null,
    version: java.lang.String = null,
    versionName: java.lang.String = null
  ): OSDetails = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name)
    if (version != null) __obj.updateDynamic("version")(version)
    if (versionName != null) __obj.updateDynamic("versionName")(versionName)
    __obj.asInstanceOf[OSDetails]
  }
}

