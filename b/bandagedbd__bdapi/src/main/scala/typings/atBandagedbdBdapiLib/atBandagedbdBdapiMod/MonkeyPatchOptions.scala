package typings
package atBandagedbdBdapiLib.atBandagedbdBdapiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MonkeyPatchOptions extends js.Object {
  var after: js.UndefOr[PatchFunction] = js.undefined
  var before: js.UndefOr[PatchFunction] = js.undefined
  var displayName: js.UndefOr[java.lang.String] = js.undefined
  var instead: js.UndefOr[PatchFunction] = js.undefined
  var once: js.UndefOr[scala.Boolean] = js.undefined
  var silent: js.UndefOr[scala.Boolean] = js.undefined
}

object MonkeyPatchOptions {
  @scala.inline
  def apply(
    after: PatchFunction = null,
    before: PatchFunction = null,
    displayName: java.lang.String = null,
    instead: PatchFunction = null,
    once: js.UndefOr[scala.Boolean] = js.undefined,
    silent: js.UndefOr[scala.Boolean] = js.undefined
  ): MonkeyPatchOptions = {
    val __obj = js.Dynamic.literal()
    if (after != null) __obj.updateDynamic("after")(after)
    if (before != null) __obj.updateDynamic("before")(before)
    if (displayName != null) __obj.updateDynamic("displayName")(displayName)
    if (instead != null) __obj.updateDynamic("instead")(instead)
    if (!js.isUndefined(once)) __obj.updateDynamic("once")(once)
    if (!js.isUndefined(silent)) __obj.updateDynamic("silent")(silent)
    __obj.asInstanceOf[MonkeyPatchOptions]
  }
}

