package typings
package bookshelfLib.bookshelfMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ModelOptions extends js.Object {
  var hasTimestamps: js.UndefOr[scala.Boolean] = js.undefined
  var parse: js.UndefOr[scala.Boolean] = js.undefined
  var tableName: js.UndefOr[java.lang.String] = js.undefined
}

object ModelOptions {
  @scala.inline
  def apply(
    hasTimestamps: js.UndefOr[scala.Boolean] = js.undefined,
    parse: js.UndefOr[scala.Boolean] = js.undefined,
    tableName: java.lang.String = null
  ): ModelOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(hasTimestamps)) __obj.updateDynamic("hasTimestamps")(hasTimestamps)
    if (!js.isUndefined(parse)) __obj.updateDynamic("parse")(parse)
    if (tableName != null) __obj.updateDynamic("tableName")(tableName)
    __obj.asInstanceOf[ModelOptions]
  }
}

