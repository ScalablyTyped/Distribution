package typings.branchSdk.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeepViewOptions extends js.Object {
  var make_new_link: js.UndefOr[Boolean] = js.undefined
  var open_app: js.UndefOr[Boolean] = js.undefined
}

object DeepViewOptions {
  @scala.inline
  def apply(make_new_link: js.UndefOr[Boolean] = js.undefined, open_app: js.UndefOr[Boolean] = js.undefined): DeepViewOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(make_new_link)) __obj.updateDynamic("make_new_link")(make_new_link.get.asInstanceOf[js.Any])
    if (!js.isUndefined(open_app)) __obj.updateDynamic("open_app")(open_app.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeepViewOptions]
  }
}

