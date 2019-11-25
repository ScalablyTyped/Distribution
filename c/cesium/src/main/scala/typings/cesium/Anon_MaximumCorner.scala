package typings.cesium

import typings.cesium.cesiumMod.Cartesian3
import typings.cesium.cesiumMod.VertexFormat
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_MaximumCorner extends js.Object {
  var maximumCorner: Cartesian3
  var minimumCorner: Cartesian3
  var vertexFormat: js.UndefOr[VertexFormat] = js.undefined
}

object Anon_MaximumCorner {
  @scala.inline
  def apply(maximumCorner: Cartesian3, minimumCorner: Cartesian3, vertexFormat: VertexFormat = null): Anon_MaximumCorner = {
    val __obj = js.Dynamic.literal(maximumCorner = maximumCorner.asInstanceOf[js.Any], minimumCorner = minimumCorner.asInstanceOf[js.Any])
    if (vertexFormat != null) __obj.updateDynamic("vertexFormat")(vertexFormat.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_MaximumCorner]
  }
}

