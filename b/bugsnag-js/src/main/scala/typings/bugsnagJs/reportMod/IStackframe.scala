package typings.bugsnagJs.reportMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IStackframe extends js.Object {
  var code: js.UndefOr[js.Object] = js.undefined
  var columnNumber: js.UndefOr[Double] = js.undefined
  var file: String
  var inProject: js.UndefOr[Boolean] = js.undefined
  var lineNumber: js.UndefOr[Double] = js.undefined
  var method: js.UndefOr[String] = js.undefined
}

object IStackframe {
  @scala.inline
  def apply(
    file: String,
    code: js.Object = null,
    columnNumber: js.UndefOr[Double] = js.undefined,
    inProject: js.UndefOr[Boolean] = js.undefined,
    lineNumber: js.UndefOr[Double] = js.undefined,
    method: String = null
  ): IStackframe = {
    val __obj = js.Dynamic.literal(file = file.asInstanceOf[js.Any])
    if (code != null) __obj.updateDynamic("code")(code.asInstanceOf[js.Any])
    if (!js.isUndefined(columnNumber)) __obj.updateDynamic("columnNumber")(columnNumber.get.asInstanceOf[js.Any])
    if (!js.isUndefined(inProject)) __obj.updateDynamic("inProject")(inProject.get.asInstanceOf[js.Any])
    if (!js.isUndefined(lineNumber)) __obj.updateDynamic("lineNumber")(lineNumber.get.asInstanceOf[js.Any])
    if (method != null) __obj.updateDynamic("method")(method.asInstanceOf[js.Any])
    __obj.asInstanceOf[IStackframe]
  }
}

