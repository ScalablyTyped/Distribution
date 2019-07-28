package typings.cesium

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_RequestVertexNormals extends js.Object {
  var requestVertexNormals: js.UndefOr[Boolean] = js.undefined
  var requestWaterMask: js.UndefOr[Boolean] = js.undefined
}

object Anon_RequestVertexNormals {
  @scala.inline
  def apply(
    requestVertexNormals: js.UndefOr[Boolean] = js.undefined,
    requestWaterMask: js.UndefOr[Boolean] = js.undefined
  ): Anon_RequestVertexNormals = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(requestVertexNormals)) __obj.updateDynamic("requestVertexNormals")(requestVertexNormals)
    if (!js.isUndefined(requestWaterMask)) __obj.updateDynamic("requestWaterMask")(requestWaterMask)
    __obj.asInstanceOf[Anon_RequestVertexNormals]
  }
}

