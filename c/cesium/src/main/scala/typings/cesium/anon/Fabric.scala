package typings.cesium.anon

import typings.cesium.mod.TextureMagnificationFilter
import typings.cesium.mod.TextureMinificationFilter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Fabric extends js.Object {
  var fabric: js.Any
  var magnificationFilter: js.UndefOr[TextureMagnificationFilter] = js.undefined
  var minificationFilter: js.UndefOr[TextureMinificationFilter] = js.undefined
  var strict: js.UndefOr[Boolean] = js.undefined
  var translucent: js.UndefOr[Boolean | (js.Function1[/* material */ typings.cesium.mod.Material, Boolean])] = js.undefined
}

object Fabric {
  @scala.inline
  def apply(
    fabric: js.Any,
    magnificationFilter: TextureMagnificationFilter = null,
    minificationFilter: TextureMinificationFilter = null,
    strict: js.UndefOr[Boolean] = js.undefined,
    translucent: Boolean | (js.Function1[/* material */ typings.cesium.mod.Material, Boolean]) = null
  ): Fabric = {
    val __obj = js.Dynamic.literal(fabric = fabric.asInstanceOf[js.Any])
    if (magnificationFilter != null) __obj.updateDynamic("magnificationFilter")(magnificationFilter.asInstanceOf[js.Any])
    if (minificationFilter != null) __obj.updateDynamic("minificationFilter")(minificationFilter.asInstanceOf[js.Any])
    if (!js.isUndefined(strict)) __obj.updateDynamic("strict")(strict.get.asInstanceOf[js.Any])
    if (translucent != null) __obj.updateDynamic("translucent")(translucent.asInstanceOf[js.Any])
    __obj.asInstanceOf[Fabric]
  }
}

