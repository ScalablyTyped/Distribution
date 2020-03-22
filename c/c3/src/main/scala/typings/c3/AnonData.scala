package typings.c3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonData extends js.Object {
  var data: js.UndefOr[AnonTargets] = js.undefined
  var id: js.UndefOr[String] = js.undefined
  var mouse: js.Any
  var x: js.UndefOr[Double] = js.undefined
}

object AnonData {
  @scala.inline
  def apply(mouse: js.Any, data: AnonTargets = null, id: String = null, x: Int | Double = null): AnonData = {
    val __obj = js.Dynamic.literal(mouse = mouse.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (x != null) __obj.updateDynamic("x")(x.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonData]
  }
}

