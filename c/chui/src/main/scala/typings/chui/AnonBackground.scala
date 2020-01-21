package typings.chui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBackground extends js.Object {
  var background: js.UndefOr[String] = js.undefined
  var handle: js.UndefOr[Boolean] = js.undefined
  var id: String
  var listClass: js.UndefOr[String] = js.undefined
}

object AnonBackground {
  @scala.inline
  def apply(
    id: String,
    background: String = null,
    handle: js.UndefOr[Boolean] = js.undefined,
    listClass: String = null
  ): AnonBackground = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    if (background != null) __obj.updateDynamic("background")(background.asInstanceOf[js.Any])
    if (!js.isUndefined(handle)) __obj.updateDynamic("handle")(handle.asInstanceOf[js.Any])
    if (listClass != null) __obj.updateDynamic("listClass")(listClass.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonBackground]
  }
}

