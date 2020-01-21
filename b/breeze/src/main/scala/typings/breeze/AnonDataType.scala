package typings.breeze

import typings.breeze.breeze.DataType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDataType extends js.Object {
  var dataType: js.UndefOr[DataType] = js.undefined
  var isLiteral: js.UndefOr[Boolean] = js.undefined
  var value: js.Any
}

object AnonDataType {
  @scala.inline
  def apply(value: js.Any, dataType: DataType = null, isLiteral: js.UndefOr[Boolean] = js.undefined): AnonDataType = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    if (dataType != null) __obj.updateDynamic("dataType")(dataType.asInstanceOf[js.Any])
    if (!js.isUndefined(isLiteral)) __obj.updateDynamic("isLiteral")(isLiteral.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDataType]
  }
}

