package typings.c3.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Data extends js.Object {
  var data: js.UndefOr[Targets] = js.undefined
  var id: js.UndefOr[String] = js.undefined
  var mouse: js.Any
  var x: js.UndefOr[Double] = js.undefined
}

object Data {
  @scala.inline
  def apply(mouse: js.Any, data: Targets = null, id: String = null, x: js.UndefOr[Double] = js.undefined): Data = {
    val __obj = js.Dynamic.literal(mouse = mouse.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (!js.isUndefined(x)) __obj.updateDynamic("x")(x.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Data]
  }
}

