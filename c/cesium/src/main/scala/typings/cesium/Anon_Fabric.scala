package typings.cesium

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Fabric extends js.Object {
  var fabric: js.Any
  var strict: js.UndefOr[Boolean] = js.undefined
  var translucent: js.UndefOr[Boolean] = js.undefined
}

object Anon_Fabric {
  @scala.inline
  def apply(
    fabric: js.Any,
    strict: js.UndefOr[Boolean] = js.undefined,
    translucent: js.UndefOr[Boolean] = js.undefined
  ): Anon_Fabric = {
    val __obj = js.Dynamic.literal(fabric = fabric)
    if (!js.isUndefined(strict)) __obj.updateDynamic("strict")(strict)
    if (!js.isUndefined(translucent)) __obj.updateDynamic("translucent")(translucent)
    __obj.asInstanceOf[Anon_Fabric]
  }
}

