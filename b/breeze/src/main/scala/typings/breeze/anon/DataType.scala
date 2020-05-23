package typings.breeze.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DataType extends js.Object {
  var dataType: js.UndefOr[typings.breeze.breeze.DataType] = js.undefined
  var isLiteral: js.UndefOr[Boolean] = js.undefined
  var value: js.Any
}

object DataType {
  @scala.inline
  def apply(
    value: js.Any,
    dataType: typings.breeze.breeze.DataType = null,
    isLiteral: js.UndefOr[Boolean] = js.undefined
  ): DataType = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    if (dataType != null) __obj.updateDynamic("dataType")(dataType.asInstanceOf[js.Any])
    if (!js.isUndefined(isLiteral)) __obj.updateDynamic("isLiteral")(isLiteral.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataType]
  }
}

