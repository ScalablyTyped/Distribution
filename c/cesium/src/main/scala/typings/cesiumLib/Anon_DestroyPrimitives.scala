package typings
package cesiumLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DestroyPrimitives extends js.Object {
  var destroyPrimitives: js.UndefOr[scala.Boolean] = js.undefined
  var show: js.UndefOr[scala.Boolean] = js.undefined
}

object Anon_DestroyPrimitives {
  @scala.inline
  def apply(
    destroyPrimitives: js.UndefOr[scala.Boolean] = js.undefined,
    show: js.UndefOr[scala.Boolean] = js.undefined
  ): Anon_DestroyPrimitives = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(destroyPrimitives)) __obj.updateDynamic("destroyPrimitives")(destroyPrimitives)
    if (!js.isUndefined(show)) __obj.updateDynamic("show")(show)
    __obj.asInstanceOf[Anon_DestroyPrimitives]
  }
}

