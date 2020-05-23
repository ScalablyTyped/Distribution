package typings.bandagedbdBdapi.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MonkeyPatchOptions extends js.Object {
  var after: js.UndefOr[PatchFunction] = js.undefined
  var before: js.UndefOr[PatchFunction] = js.undefined
  var displayName: js.UndefOr[String] = js.undefined
  var instead: js.UndefOr[PatchFunction] = js.undefined
  var once: js.UndefOr[Boolean] = js.undefined
  var silent: js.UndefOr[Boolean] = js.undefined
}

object MonkeyPatchOptions {
  @scala.inline
  def apply(
    after: /* data */ PatchData => js.Any = null,
    before: /* data */ PatchData => js.Any = null,
    displayName: String = null,
    instead: /* data */ PatchData => js.Any = null,
    once: js.UndefOr[Boolean] = js.undefined,
    silent: js.UndefOr[Boolean] = js.undefined
  ): MonkeyPatchOptions = {
    val __obj = js.Dynamic.literal()
    if (after != null) __obj.updateDynamic("after")(js.Any.fromFunction1(after))
    if (before != null) __obj.updateDynamic("before")(js.Any.fromFunction1(before))
    if (displayName != null) __obj.updateDynamic("displayName")(displayName.asInstanceOf[js.Any])
    if (instead != null) __obj.updateDynamic("instead")(js.Any.fromFunction1(instead))
    if (!js.isUndefined(once)) __obj.updateDynamic("once")(once.get.asInstanceOf[js.Any])
    if (!js.isUndefined(silent)) __obj.updateDynamic("silent")(silent.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[MonkeyPatchOptions]
  }
}

