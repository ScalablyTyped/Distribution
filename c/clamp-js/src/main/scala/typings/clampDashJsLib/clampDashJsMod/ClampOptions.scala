package typings
package clampDashJsLib.clampDashJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClampOptions extends js.Object {
  var animate: js.UndefOr[scala.Boolean] = js.undefined
  var clamp: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  var splitOnChars: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var truncationChar: js.UndefOr[java.lang.String] = js.undefined
  var truncationHTML: js.UndefOr[java.lang.String | scala.Null] = js.undefined
  var useNativeClamp: js.UndefOr[scala.Boolean] = js.undefined
}

object ClampOptions {
  @scala.inline
  def apply(
    animate: js.UndefOr[scala.Boolean] = js.undefined,
    clamp: scala.Double | java.lang.String = null,
    splitOnChars: js.Array[java.lang.String] = null,
    truncationChar: java.lang.String = null,
    truncationHTML: java.lang.String = null,
    useNativeClamp: js.UndefOr[scala.Boolean] = js.undefined
  ): ClampOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(animate)) __obj.updateDynamic("animate")(animate)
    if (clamp != null) __obj.updateDynamic("clamp")(clamp.asInstanceOf[js.Any])
    if (splitOnChars != null) __obj.updateDynamic("splitOnChars")(splitOnChars)
    if (truncationChar != null) __obj.updateDynamic("truncationChar")(truncationChar)
    if (truncationHTML != null) __obj.updateDynamic("truncationHTML")(truncationHTML)
    if (!js.isUndefined(useNativeClamp)) __obj.updateDynamic("useNativeClamp")(useNativeClamp)
    __obj.asInstanceOf[ClampOptions]
  }
}

