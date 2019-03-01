package typings
package chaynsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// chayns.selectTapp()
trait SelectTappConfig extends js.Object {
  var id: js.UndefOr[scala.Double] = js.undefined
  var internalName: js.UndefOr[java.lang.String] = js.undefined
  var position: js.UndefOr[scala.Double] = js.undefined
  var showName: js.UndefOr[java.lang.String] = js.undefined
}

object SelectTappConfig {
  @scala.inline
  def apply(
    id: scala.Int | scala.Double = null,
    internalName: java.lang.String = null,
    position: scala.Int | scala.Double = null,
    showName: java.lang.String = null
  ): SelectTappConfig = {
    val __obj = js.Dynamic.literal()
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (internalName != null) __obj.updateDynamic("internalName")(internalName)
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (showName != null) __obj.updateDynamic("showName")(showName)
    __obj.asInstanceOf[SelectTappConfig]
  }
}

