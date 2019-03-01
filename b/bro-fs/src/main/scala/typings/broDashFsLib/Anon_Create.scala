package typings
package broDashFsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Create extends js.Object {
  var create: js.UndefOr[scala.Boolean] = js.undefined
}

object Anon_Create {
  @scala.inline
  def apply(create: js.UndefOr[scala.Boolean] = js.undefined): Anon_Create = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(create)) __obj.updateDynamic("create")(create)
    __obj.asInstanceOf[Anon_Create]
  }
}

