package typings
package blocksLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Route extends js.Object {
  var route: js.UndefOr[js.Any] = js.undefined
  var url: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_Route {
  @scala.inline
  def apply(route: js.Any = null, url: java.lang.String = null): Anon_Route = {
    val __obj = js.Dynamic.literal()
    if (route != null) __obj.updateDynamic("route")(route)
    if (url != null) __obj.updateDynamic("url")(url)
    __obj.asInstanceOf[Anon_Route]
  }
}

