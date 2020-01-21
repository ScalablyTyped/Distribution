package typings.cesium

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDestroyPrimitives extends js.Object {
  var destroyPrimitives: js.UndefOr[Boolean] = js.undefined
  var show: js.UndefOr[Boolean] = js.undefined
}

object AnonDestroyPrimitives {
  @scala.inline
  def apply(destroyPrimitives: js.UndefOr[Boolean] = js.undefined, show: js.UndefOr[Boolean] = js.undefined): AnonDestroyPrimitives = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(destroyPrimitives)) __obj.updateDynamic("destroyPrimitives")(destroyPrimitives.asInstanceOf[js.Any])
    if (!js.isUndefined(show)) __obj.updateDynamic("show")(show.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDestroyPrimitives]
  }
}

