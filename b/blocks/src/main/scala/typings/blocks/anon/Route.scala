package typings.blocks.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Route extends js.Object {
  var route: js.UndefOr[js.Any] = js.undefined
  var url: js.UndefOr[String] = js.undefined
}

object Route {
  @scala.inline
  def apply(route: js.Any = null, url: String = null): Route = {
    val __obj = js.Dynamic.literal()
    if (route != null) __obj.updateDynamic("route")(route.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    __obj.asInstanceOf[Route]
  }
}

