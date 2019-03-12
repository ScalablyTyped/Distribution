package typings
package blazyLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BlazyOptions extends js.Object {
  var breakpoints: js.UndefOr[js.Array[Breakpoint]] = js.undefined
  var container: js.UndefOr[java.lang.String] = js.undefined
  var error: js.UndefOr[
    js.Function2[
      /* ele */ stdLib.Element | stdLib.HTMLElement, 
      /* msg */ java.lang.String, 
      scala.Unit
    ]
  ] = js.undefined
  var errorClass: js.UndefOr[java.lang.String] = js.undefined
  var loadInvisible: js.UndefOr[scala.Boolean] = js.undefined
  var offset: js.UndefOr[scala.Double] = js.undefined
  var saveViewportOffsetDelay: js.UndefOr[scala.Double] = js.undefined
  var selector: js.UndefOr[java.lang.String] = js.undefined
  var separator: js.UndefOr[java.lang.String] = js.undefined
  var src: js.UndefOr[java.lang.String] = js.undefined
  var success: js.UndefOr[js.Function1[/* ele */ stdLib.Element | stdLib.HTMLElement, scala.Unit]] = js.undefined
  var successClass: js.UndefOr[java.lang.String] = js.undefined
  var validateDelay: js.UndefOr[scala.Double] = js.undefined
}

object BlazyOptions {
  @scala.inline
  def apply(
    breakpoints: js.Array[Breakpoint] = null,
    container: java.lang.String = null,
    error: (/* ele */ stdLib.Element | stdLib.HTMLElement, /* msg */ java.lang.String) => scala.Unit = null,
    errorClass: java.lang.String = null,
    loadInvisible: js.UndefOr[scala.Boolean] = js.undefined,
    offset: scala.Int | scala.Double = null,
    saveViewportOffsetDelay: scala.Int | scala.Double = null,
    selector: java.lang.String = null,
    separator: java.lang.String = null,
    src: java.lang.String = null,
    success: /* ele */ stdLib.Element | stdLib.HTMLElement => scala.Unit = null,
    successClass: java.lang.String = null,
    validateDelay: scala.Int | scala.Double = null
  ): BlazyOptions = {
    val __obj = js.Dynamic.literal()
    if (breakpoints != null) __obj.updateDynamic("breakpoints")(breakpoints)
    if (container != null) __obj.updateDynamic("container")(container)
    if (error != null) __obj.updateDynamic("error")(js.Any.fromFunction2(error))
    if (errorClass != null) __obj.updateDynamic("errorClass")(errorClass)
    if (!js.isUndefined(loadInvisible)) __obj.updateDynamic("loadInvisible")(loadInvisible)
    if (offset != null) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
    if (saveViewportOffsetDelay != null) __obj.updateDynamic("saveViewportOffsetDelay")(saveViewportOffsetDelay.asInstanceOf[js.Any])
    if (selector != null) __obj.updateDynamic("selector")(selector)
    if (separator != null) __obj.updateDynamic("separator")(separator)
    if (src != null) __obj.updateDynamic("src")(src)
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction1(success))
    if (successClass != null) __obj.updateDynamic("successClass")(successClass)
    if (validateDelay != null) __obj.updateDynamic("validateDelay")(validateDelay.asInstanceOf[js.Any])
    __obj.asInstanceOf[BlazyOptions]
  }
}

