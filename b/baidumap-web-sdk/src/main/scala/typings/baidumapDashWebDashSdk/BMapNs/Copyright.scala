package typings.baidumapDashWebDashSdk.BMapNs

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
  def apply(bounds: Bounds = null, content: String = null, id: Int | Double = null): Copyright = {
    val __obj = js.Dynamic.literal()
    if (bounds != null) __obj.updateDynamic("bounds")(bounds)
    if (content != null) __obj.updateDynamic("content")(content)
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    __obj.asInstanceOf[Copyright]
  }
}

