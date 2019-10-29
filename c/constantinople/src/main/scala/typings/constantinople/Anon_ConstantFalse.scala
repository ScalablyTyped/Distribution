package typings.constantinople

import typings.constantinople.constantinopleNumbers.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ConstantFalse extends js.Object {
  var constant: `false`
  var result: js.UndefOr[Unit] = js.undefined
}

object Anon_ConstantFalse {
  @scala.inline
  def apply(constant: `false`, result: js.UndefOr[Unit] = js.undefined): Anon_ConstantFalse = {
    val __obj = js.Dynamic.literal(constant = constant)
    if (!js.isUndefined(result)) __obj.updateDynamic("result")(result)
    __obj.asInstanceOf[Anon_ConstantFalse]
  }
}

