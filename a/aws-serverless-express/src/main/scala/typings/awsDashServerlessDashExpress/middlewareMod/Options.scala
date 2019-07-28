package typings.awsDashServerlessDashExpress.middlewareMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var deleteHeaders: js.UndefOr[Boolean] = js.undefined
  var reqPropKey: js.UndefOr[String] = js.undefined
}

object Options {
  @scala.inline
  def apply(deleteHeaders: js.UndefOr[Boolean] = js.undefined, reqPropKey: String = null): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(deleteHeaders)) __obj.updateDynamic("deleteHeaders")(deleteHeaders)
    if (reqPropKey != null) __obj.updateDynamic("reqPropKey")(reqPropKey)
    __obj.asInstanceOf[Options]
  }
}

