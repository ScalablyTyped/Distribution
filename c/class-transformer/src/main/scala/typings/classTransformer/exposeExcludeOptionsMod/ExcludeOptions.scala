package typings.classTransformer.exposeExcludeOptionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExcludeOptions extends js.Object {
  var toClassOnly: js.UndefOr[Boolean] = js.undefined
  var toPlainOnly: js.UndefOr[Boolean] = js.undefined
}

object ExcludeOptions {
  @scala.inline
  def apply(toClassOnly: js.UndefOr[Boolean] = js.undefined, toPlainOnly: js.UndefOr[Boolean] = js.undefined): ExcludeOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(toClassOnly)) __obj.updateDynamic("toClassOnly")(toClassOnly.get.asInstanceOf[js.Any])
    if (!js.isUndefined(toPlainOnly)) __obj.updateDynamic("toPlainOnly")(toPlainOnly.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExcludeOptions]
  }
}

