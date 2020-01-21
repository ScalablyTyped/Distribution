package typings.cesium

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonRequestVertexNormals extends js.Object {
  var requestVertexNormals: js.UndefOr[Boolean] = js.undefined
  var requestWaterMask: js.UndefOr[Boolean] = js.undefined
}

object AnonRequestVertexNormals {
  @scala.inline
  def apply(
    requestVertexNormals: js.UndefOr[Boolean] = js.undefined,
    requestWaterMask: js.UndefOr[Boolean] = js.undefined
  ): AnonRequestVertexNormals = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(requestVertexNormals)) __obj.updateDynamic("requestVertexNormals")(requestVertexNormals.asInstanceOf[js.Any])
    if (!js.isUndefined(requestWaterMask)) __obj.updateDynamic("requestWaterMask")(requestWaterMask.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonRequestVertexNormals]
  }
}

