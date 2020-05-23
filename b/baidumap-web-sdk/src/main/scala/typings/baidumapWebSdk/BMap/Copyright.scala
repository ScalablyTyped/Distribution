package typings.baidumapWebSdk.BMap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Copyright extends js.Object {
  var bounds: js.UndefOr[Bounds] = js.undefined
  var content: js.UndefOr[String] = js.undefined
  var id: js.UndefOr[Double] = js.undefined
}

object Copyright {
  @scala.inline
  def apply(bounds: Bounds = null, content: String = null, id: js.UndefOr[Double] = js.undefined): Copyright = {
    val __obj = js.Dynamic.literal()
    if (bounds != null) __obj.updateDynamic("bounds")(bounds.asInstanceOf[js.Any])
    if (content != null) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    if (!js.isUndefined(id)) __obj.updateDynamic("id")(id.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Copyright]
  }
}

