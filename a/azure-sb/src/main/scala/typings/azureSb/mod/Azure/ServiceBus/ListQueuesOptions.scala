package typings.azureSb.mod.Azure.ServiceBus

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<azure-sb.azure-sb.Azure.ServiceBus.PaginationOptions> */
trait ListQueuesOptions extends js.Object {
  var skip: js.UndefOr[Double] = js.undefined
  var top: js.UndefOr[Double] = js.undefined
}

object ListQueuesOptions {
  @scala.inline
  def apply(skip: Int | Double = null, top: Int | Double = null): ListQueuesOptions = {
    val __obj = js.Dynamic.literal()
    if (skip != null) __obj.updateDynamic("skip")(skip.asInstanceOf[js.Any])
    if (top != null) __obj.updateDynamic("top")(top.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListQueuesOptions]
  }
}

