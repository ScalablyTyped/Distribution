package typings.broDashFs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Create extends js.Object {
  var create: js.UndefOr[Boolean] = js.undefined
}

object Anon_Create {
  @scala.inline
  def apply(create: js.UndefOr[Boolean] = js.undefined): Anon_Create = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(create)) __obj.updateDynamic("create")(create.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Create]
  }
}

