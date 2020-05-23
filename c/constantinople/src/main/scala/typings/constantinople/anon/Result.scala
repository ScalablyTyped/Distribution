package typings.constantinople.anon

import typings.constantinople.constantinopleBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Result extends js.Object {
  var constant: `false`
  var result: js.UndefOr[Unit] = js.undefined
}

object Result {
  @scala.inline
  def apply(constant: `false`, result: js.UndefOr[Unit] = js.undefined): Result = {
    val __obj = js.Dynamic.literal(constant = constant.asInstanceOf[js.Any])
    if (!js.isUndefined(result)) __obj.updateDynamic("result")(result.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Result]
  }
}

