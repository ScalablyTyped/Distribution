package typings.blocks

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Route extends js.Object {
  var route: js.UndefOr[js.Any] = js.undefined
  var url: js.UndefOr[String] = js.undefined
}

object Anon_Route {
  @scala.inline
  def apply(route: js.Any = null, url: String = null): Anon_Route = {
    val __obj = js.Dynamic.literal()
    if (route != null) __obj.updateDynamic("route")(route.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Route]
  }
}

