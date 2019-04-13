package typings
package bookshelfLib.bookshelfMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SaveOptions extends SyncOptions {
  var defaults: js.UndefOr[java.lang.String] = js.undefined
  var method: js.UndefOr[java.lang.String] = js.undefined
  var patch: js.UndefOr[scala.Boolean] = js.undefined
  var require: js.UndefOr[scala.Boolean] = js.undefined
}

object SaveOptions {
  @scala.inline
  def apply(
    debug: js.UndefOr[scala.Boolean] = js.undefined,
    defaults: java.lang.String = null,
    method: java.lang.String = null,
    patch: js.UndefOr[scala.Boolean] = js.undefined,
    require: js.UndefOr[scala.Boolean] = js.undefined,
    transacting: knexLib.knexMod.Transaction = null,
    withSchema: java.lang.String = null
  ): SaveOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(debug)) __obj.updateDynamic("debug")(debug)
    if (defaults != null) __obj.updateDynamic("defaults")(defaults)
    if (method != null) __obj.updateDynamic("method")(method)
    if (!js.isUndefined(patch)) __obj.updateDynamic("patch")(patch)
    if (!js.isUndefined(require)) __obj.updateDynamic("require")(require)
    if (transacting != null) __obj.updateDynamic("transacting")(transacting)
    if (withSchema != null) __obj.updateDynamic("withSchema")(withSchema)
    __obj.asInstanceOf[SaveOptions]
  }
}

