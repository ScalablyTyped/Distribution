package typings
package ckeditorLib.CKEDITORNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait htmlDataProcessorOptions extends js.Object {
  var context: js.UndefOr[java.lang.String] = js.undefined
  var dontFilter: js.UndefOr[scala.Boolean] = js.undefined
  var enterMode: js.UndefOr[scala.Double] = js.undefined
  var filter: js.UndefOr[filter] = js.undefined
  var fixForBody: js.UndefOr[scala.Boolean] = js.undefined
  var protectedWhitespaces: js.UndefOr[scala.Boolean] = js.undefined
}

object htmlDataProcessorOptions {
  @scala.inline
  def apply(
    context: java.lang.String = null,
    dontFilter: js.UndefOr[scala.Boolean] = js.undefined,
    enterMode: scala.Int | scala.Double = null,
    filter: filter = null,
    fixForBody: js.UndefOr[scala.Boolean] = js.undefined,
    protectedWhitespaces: js.UndefOr[scala.Boolean] = js.undefined
  ): htmlDataProcessorOptions = {
    val __obj = js.Dynamic.literal()
    if (context != null) __obj.updateDynamic("context")(context)
    if (!js.isUndefined(dontFilter)) __obj.updateDynamic("dontFilter")(dontFilter)
    if (enterMode != null) __obj.updateDynamic("enterMode")(enterMode.asInstanceOf[js.Any])
    if (filter != null) __obj.updateDynamic("filter")(filter)
    if (!js.isUndefined(fixForBody)) __obj.updateDynamic("fixForBody")(fixForBody)
    if (!js.isUndefined(protectedWhitespaces)) __obj.updateDynamic("protectedWhitespaces")(protectedWhitespaces)
    __obj.asInstanceOf[htmlDataProcessorOptions]
  }
}

