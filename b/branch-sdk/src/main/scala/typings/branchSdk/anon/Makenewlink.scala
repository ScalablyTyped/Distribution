package typings.branchSdk.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Makenewlink extends js.Object {
  var make_new_link: js.UndefOr[Boolean] = js.undefined
}

object Makenewlink {
  @scala.inline
  def apply(make_new_link: js.UndefOr[Boolean] = js.undefined): Makenewlink = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(make_new_link)) __obj.updateDynamic("make_new_link")(make_new_link.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Makenewlink]
  }
}

