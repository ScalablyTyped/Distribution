package typings.breeze

import typings.breeze.breezeNs.DataType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DataType extends js.Object {
  var dataType: js.UndefOr[DataType] = js.undefined
  var isLiteral: js.UndefOr[Boolean] = js.undefined
  var value: js.Any
}

object Anon_DataType {
  @scala.inline
  def apply(value: js.Any, dataType: DataType = null, isLiteral: js.UndefOr[Boolean] = js.undefined): Anon_DataType = {
    val __obj = js.Dynamic.literal(value = value)
    if (dataType != null) __obj.updateDynamic("dataType")(dataType)
    if (!js.isUndefined(isLiteral)) __obj.updateDynamic("isLiteral")(isLiteral)
    __obj.asInstanceOf[Anon_DataType]
  }
}

