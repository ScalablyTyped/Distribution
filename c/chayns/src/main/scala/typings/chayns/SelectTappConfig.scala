package typings.chayns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// chayns.selectTapp()
trait SelectTappConfig extends js.Object {
  var id: js.UndefOr[Double] = js.undefined
  var internalName: js.UndefOr[String] = js.undefined
  var position: js.UndefOr[Double] = js.undefined
  var showName: js.UndefOr[String] = js.undefined
}

object SelectTappConfig {
  @scala.inline
  def apply(
    id: js.UndefOr[Double] = js.undefined,
    internalName: String = null,
    position: js.UndefOr[Double] = js.undefined,
    showName: String = null
  ): SelectTappConfig = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(id)) __obj.updateDynamic("id")(id.get.asInstanceOf[js.Any])
    if (internalName != null) __obj.updateDynamic("internalName")(internalName.asInstanceOf[js.Any])
    if (!js.isUndefined(position)) __obj.updateDynamic("position")(position.get.asInstanceOf[js.Any])
    if (showName != null) __obj.updateDynamic("showName")(showName.asInstanceOf[js.Any])
    __obj.asInstanceOf[SelectTappConfig]
  }
}

