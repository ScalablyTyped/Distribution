package typings
package camelcaseDashKeysLib.camelcaseDashKeysMod.camelcaseKeysNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var deep: js.UndefOr[scala.Boolean] = js.undefined
  var exclude: js.UndefOr[js.Array[java.lang.String | stdLib.RegExp]] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    deep: js.UndefOr[scala.Boolean] = js.undefined,
    exclude: js.Array[java.lang.String | stdLib.RegExp] = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(deep)) __obj.updateDynamic("deep")(deep)
    if (exclude != null) __obj.updateDynamic("exclude")(exclude)
    __obj.asInstanceOf[Options]
  }
}

