package typings
package breezeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DataType extends js.Object {
  var dataType: js.UndefOr[breezeLib.breezeNs.DataType] = js.undefined
  var isLiteral: js.UndefOr[scala.Boolean] = js.undefined
  var value: js.Any
}

object Anon_DataType {
  @scala.inline
  def apply(
    value: js.Any,
    dataType: breezeLib.breezeNs.DataType = null,
    isLiteral: js.UndefOr[scala.Boolean] = js.undefined
  ): Anon_DataType = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("value")(value)
    if (dataType != null) __obj.updateDynamic("dataType")(dataType)
    if (!js.isUndefined(isLiteral)) __obj.updateDynamic("isLiteral")(isLiteral)
    __obj.asInstanceOf[Anon_DataType]
  }
}

