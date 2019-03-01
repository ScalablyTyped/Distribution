package typings
package bingmapsLib.MicrosoftNs.MapsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPanoramaInfo extends js.Object {
  /** The capture date of the streetside scene. */
  var cd: js.UndefOr[java.lang.String] = js.undefined
}

object IPanoramaInfo {
  @scala.inline
  def apply(cd: java.lang.String = null): IPanoramaInfo = {
    val __obj = js.Dynamic.literal()
    if (cd != null) __obj.updateDynamic("cd")(cd)
    __obj.asInstanceOf[IPanoramaInfo]
  }
}

