package typings
package camelcaseDashKeysLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Deep extends js.Object {
  var deep: js.UndefOr[scala.Boolean] = js.undefined
  var exclude: js.UndefOr[js.Array[java.lang.String] | js.Array[stdLib.RegExp]] = js.undefined
}

object Anon_Deep {
  @scala.inline
  def apply(
    deep: js.UndefOr[scala.Boolean] = js.undefined,
    exclude: js.Array[java.lang.String] | js.Array[stdLib.RegExp] = null
  ): Anon_Deep = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(deep)) __obj.updateDynamic("deep")(deep)
    if (exclude != null) __obj.updateDynamic("exclude")(exclude.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Deep]
  }
}

