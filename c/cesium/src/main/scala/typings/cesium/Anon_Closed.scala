package typings.cesium

import typings.cesium.cesiumMod.Material
import typings.cesium.cesiumMod.RenderState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Closed extends js.Object {
  var closed: js.UndefOr[Boolean] = js.undefined
  var fragmentShaderSource: js.UndefOr[String] = js.undefined
  var material: js.UndefOr[Material] = js.undefined
  var renderState: js.UndefOr[RenderState] = js.undefined
  var translucent: js.UndefOr[Boolean] = js.undefined
  var vertexShaderSource: js.UndefOr[String] = js.undefined
}

object Anon_Closed {
  @scala.inline
  def apply(
    closed: js.UndefOr[Boolean] = js.undefined,
    fragmentShaderSource: String = null,
    material: Material = null,
    renderState: RenderState = null,
    translucent: js.UndefOr[Boolean] = js.undefined,
    vertexShaderSource: String = null
  ): Anon_Closed = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(closed)) __obj.updateDynamic("closed")(closed)
    if (fragmentShaderSource != null) __obj.updateDynamic("fragmentShaderSource")(fragmentShaderSource)
    if (material != null) __obj.updateDynamic("material")(material)
    if (renderState != null) __obj.updateDynamic("renderState")(renderState)
    if (!js.isUndefined(translucent)) __obj.updateDynamic("translucent")(translucent)
    if (vertexShaderSource != null) __obj.updateDynamic("vertexShaderSource")(vertexShaderSource)
    __obj.asInstanceOf[Anon_Closed]
  }
}

