package typings
package deprecatedDashDecoratorLib.deprecatedDashDecoratorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeprecatedOptions extends js.Object {
  var alternative: js.UndefOr[java.lang.String] = js.undefined
  var url: js.UndefOr[java.lang.String] = js.undefined
  var version: js.UndefOr[java.lang.String] = js.undefined
}

object DeprecatedOptions {
  @scala.inline
  def apply(
    alternative: java.lang.String = null,
    url: java.lang.String = null,
    version: java.lang.String = null
  ): DeprecatedOptions = {
    val __obj = js.Dynamic.literal()
    if (alternative != null) __obj.updateDynamic("alternative")(alternative)
    if (url != null) __obj.updateDynamic("url")(url)
    if (version != null) __obj.updateDynamic("version")(version)
    __obj.asInstanceOf[DeprecatedOptions]
  }
}

