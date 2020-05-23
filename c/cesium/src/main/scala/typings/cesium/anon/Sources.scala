package typings.cesium.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Sources extends js.Object {
  var show: js.UndefOr[Boolean] = js.undefined
  var sources: js.UndefOr[js.Any] = js.undefined
}

object Sources {
  @scala.inline
  def apply(show: js.UndefOr[Boolean] = js.undefined, sources: js.Any = null): Sources = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(show)) __obj.updateDynamic("show")(show.get.asInstanceOf[js.Any])
    if (sources != null) __obj.updateDynamic("sources")(sources.asInstanceOf[js.Any])
    __obj.asInstanceOf[Sources]
  }
}

