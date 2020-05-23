package typings.cesium.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RequestVertexNormals extends js.Object {
  var requestVertexNormals: js.UndefOr[Boolean] = js.undefined
  var requestWaterMask: js.UndefOr[Boolean] = js.undefined
}

object RequestVertexNormals {
  @scala.inline
  def apply(
    requestVertexNormals: js.UndefOr[Boolean] = js.undefined,
    requestWaterMask: js.UndefOr[Boolean] = js.undefined
  ): RequestVertexNormals = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(requestVertexNormals)) __obj.updateDynamic("requestVertexNormals")(requestVertexNormals.get.asInstanceOf[js.Any])
    if (!js.isUndefined(requestWaterMask)) __obj.updateDynamic("requestWaterMask")(requestWaterMask.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestVertexNormals]
  }
}

