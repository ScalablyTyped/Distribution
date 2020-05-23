package typings.clampJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClampOptions extends js.Object {
  var animate: js.UndefOr[Boolean] = js.undefined
  var clamp: js.UndefOr[Double | String] = js.undefined
  var splitOnChars: js.UndefOr[js.Array[String]] = js.undefined
  var truncationChar: js.UndefOr[String] = js.undefined
  var truncationHTML: js.UndefOr[String | Null] = js.undefined
  var useNativeClamp: js.UndefOr[Boolean] = js.undefined
}

object ClampOptions {
  @scala.inline
  def apply(
    animate: js.UndefOr[Boolean] = js.undefined,
    clamp: Double | String = null,
    splitOnChars: js.Array[String] = null,
    truncationChar: String = null,
    truncationHTML: js.UndefOr[Null | String] = js.undefined,
    useNativeClamp: js.UndefOr[Boolean] = js.undefined
  ): ClampOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(animate)) __obj.updateDynamic("animate")(animate.get.asInstanceOf[js.Any])
    if (clamp != null) __obj.updateDynamic("clamp")(clamp.asInstanceOf[js.Any])
    if (splitOnChars != null) __obj.updateDynamic("splitOnChars")(splitOnChars.asInstanceOf[js.Any])
    if (truncationChar != null) __obj.updateDynamic("truncationChar")(truncationChar.asInstanceOf[js.Any])
    if (!js.isUndefined(truncationHTML)) __obj.updateDynamic("truncationHTML")(truncationHTML.asInstanceOf[js.Any])
    if (!js.isUndefined(useNativeClamp)) __obj.updateDynamic("useNativeClamp")(useNativeClamp.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClampOptions]
  }
}

