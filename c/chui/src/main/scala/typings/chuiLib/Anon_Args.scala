package typings
package chuiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Args extends js.Object {
  var callback: js.UndefOr[js.Function1[/* args */ js.UndefOr[js.Any], _]] = js.undefined
  var dynamic: js.UndefOr[scala.Boolean] = js.undefined
}

object Anon_Args {
  @scala.inline
  def apply(
    callback: js.Function1[/* args */ js.UndefOr[js.Any], _] = null,
    dynamic: js.UndefOr[scala.Boolean] = js.undefined
  ): Anon_Args = {
    val __obj = js.Dynamic.literal()
    if (callback != null) __obj.updateDynamic("callback")(callback)
    if (!js.isUndefined(dynamic)) __obj.updateDynamic("dynamic")(dynamic)
    __obj.asInstanceOf[Anon_Args]
  }
}

