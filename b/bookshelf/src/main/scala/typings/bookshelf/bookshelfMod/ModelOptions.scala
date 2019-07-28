package typings.bookshelf.bookshelfMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ModelOptions extends js.Object {
  var hasTimestamps: js.UndefOr[Boolean] = js.undefined
  var parse: js.UndefOr[Boolean] = js.undefined
  var tableName: js.UndefOr[String] = js.undefined
}

object ModelOptions {
  @scala.inline
  def apply(
    hasTimestamps: js.UndefOr[Boolean] = js.undefined,
    parse: js.UndefOr[Boolean] = js.undefined,
    tableName: String = null
  ): ModelOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(hasTimestamps)) __obj.updateDynamic("hasTimestamps")(hasTimestamps)
    if (!js.isUndefined(parse)) __obj.updateDynamic("parse")(parse)
    if (tableName != null) __obj.updateDynamic("tableName")(tableName)
    __obj.asInstanceOf[ModelOptions]
  }
}

