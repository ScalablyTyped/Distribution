package typings.cesium.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DestroyPrimitives extends js.Object {
  var destroyPrimitives: js.UndefOr[Boolean] = js.undefined
  var show: js.UndefOr[Boolean] = js.undefined
}

object DestroyPrimitives {
  @scala.inline
  def apply(destroyPrimitives: js.UndefOr[Boolean] = js.undefined, show: js.UndefOr[Boolean] = js.undefined): DestroyPrimitives = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(destroyPrimitives)) __obj.updateDynamic("destroyPrimitives")(destroyPrimitives.get.asInstanceOf[js.Any])
    if (!js.isUndefined(show)) __obj.updateDynamic("show")(show.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[DestroyPrimitives]
  }
}

