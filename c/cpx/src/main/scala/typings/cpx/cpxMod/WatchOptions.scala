package typings.cpx.cpxMod

import typings.node.streamMod.Transform
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WatchOptions extends AsyncOptions {
  /** Flag to not copy at the initial time of watch. */
  var initialCopy: js.UndefOr[Boolean] = js.undefined
}

object WatchOptions {
  @scala.inline
  def apply(
    clean: js.UndefOr[Boolean] = js.undefined,
    dereference: js.UndefOr[Boolean] = js.undefined,
    includeEmptyDirs: js.UndefOr[Boolean] = js.undefined,
    initialCopy: js.UndefOr[Boolean] = js.undefined,
    preserve: js.UndefOr[Boolean] = js.undefined,
    transform: /* filepath */ String => js.Array[Transform] = null,
    update: js.UndefOr[Boolean] = js.undefined
  ): WatchOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(clean)) __obj.updateDynamic("clean")(clean)
    if (!js.isUndefined(dereference)) __obj.updateDynamic("dereference")(dereference)
    if (!js.isUndefined(includeEmptyDirs)) __obj.updateDynamic("includeEmptyDirs")(includeEmptyDirs)
    if (!js.isUndefined(initialCopy)) __obj.updateDynamic("initialCopy")(initialCopy)
    if (!js.isUndefined(preserve)) __obj.updateDynamic("preserve")(preserve)
    if (transform != null) __obj.updateDynamic("transform")(js.Any.fromFunction1(transform))
    if (!js.isUndefined(update)) __obj.updateDynamic("update")(update)
    __obj.asInstanceOf[WatchOptions]
  }
}

