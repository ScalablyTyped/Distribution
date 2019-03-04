package typings
package bugsnagDashJsLib.typesReportMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IStackframe extends js.Object {
  var code: js.UndefOr[js.Object] = js.undefined
  var columnNumber: js.UndefOr[scala.Double] = js.undefined
  var file: java.lang.String
  var inProject: js.UndefOr[scala.Boolean] = js.undefined
  var lineNumber: js.UndefOr[scala.Double] = js.undefined
  var method: js.UndefOr[java.lang.String] = js.undefined
}

object IStackframe {
  @scala.inline
  def apply(
    file: java.lang.String,
    code: js.Object = null,
    columnNumber: scala.Int | scala.Double = null,
    inProject: js.UndefOr[scala.Boolean] = js.undefined,
    lineNumber: scala.Int | scala.Double = null,
    method: java.lang.String = null
  ): IStackframe = {
    val __obj = js.Dynamic.literal(file = file)
    if (code != null) __obj.updateDynamic("code")(code)
    if (columnNumber != null) __obj.updateDynamic("columnNumber")(columnNumber.asInstanceOf[js.Any])
    if (!js.isUndefined(inProject)) __obj.updateDynamic("inProject")(inProject)
    if (lineNumber != null) __obj.updateDynamic("lineNumber")(lineNumber.asInstanceOf[js.Any])
    if (method != null) __obj.updateDynamic("method")(method)
    __obj.asInstanceOf[IStackframe]
  }
}

