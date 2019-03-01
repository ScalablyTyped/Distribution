package typings
package cpxLib.cpxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AsyncOptions extends SyncOptions {
  /** Function that creates a `stream.Transform` object to transform each copying file. */
  var transform: js.UndefOr[
    js.Function1[/* filepath */ java.lang.String, js.Array[nodeLib.streamMod.Transform]]
  ] = js.undefined
}

object AsyncOptions {
  @scala.inline
  def apply(
    clean: js.UndefOr[scala.Boolean] = js.undefined,
    dereference: js.UndefOr[scala.Boolean] = js.undefined,
    includeEmptyDirs: js.UndefOr[scala.Boolean] = js.undefined,
    preserve: js.UndefOr[scala.Boolean] = js.undefined,
    transform: js.Function1[/* filepath */ java.lang.String, js.Array[nodeLib.streamMod.Transform]] = null,
    update: js.UndefOr[scala.Boolean] = js.undefined
  ): AsyncOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(clean)) __obj.updateDynamic("clean")(clean)
    if (!js.isUndefined(dereference)) __obj.updateDynamic("dereference")(dereference)
    if (!js.isUndefined(includeEmptyDirs)) __obj.updateDynamic("includeEmptyDirs")(includeEmptyDirs)
    if (!js.isUndefined(preserve)) __obj.updateDynamic("preserve")(preserve)
    if (transform != null) __obj.updateDynamic("transform")(transform)
    if (!js.isUndefined(update)) __obj.updateDynamic("update")(update)
    __obj.asInstanceOf[AsyncOptions]
  }
}

