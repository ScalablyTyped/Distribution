package typings.cesium

import typings.cesium.mod.Cartesian3
import typings.cesium.mod.VertexFormat
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonMaximumCorner extends js.Object {
  var maximumCorner: Cartesian3
  var minimumCorner: Cartesian3
  var vertexFormat: js.UndefOr[VertexFormat] = js.undefined
}

object AnonMaximumCorner {
  @scala.inline
  def apply(maximumCorner: Cartesian3, minimumCorner: Cartesian3, vertexFormat: VertexFormat = null): AnonMaximumCorner = {
    val __obj = js.Dynamic.literal(maximumCorner = maximumCorner.asInstanceOf[js.Any], minimumCorner = minimumCorner.asInstanceOf[js.Any])
    if (vertexFormat != null) __obj.updateDynamic("vertexFormat")(vertexFormat.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonMaximumCorner]
  }
}

