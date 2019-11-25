package typings.cesium

import typings.cesium.cesiumMod.Material
import typings.cesium.cesiumMod.RenderState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_FragmentShaderSourceMaterial extends js.Object {
  var fragmentShaderSource: js.UndefOr[String] = js.undefined
  var material: js.UndefOr[Material] = js.undefined
  var renderState: js.UndefOr[RenderState] = js.undefined
  var translucent: js.UndefOr[Boolean] = js.undefined
  var vertexShaderSource: js.UndefOr[String] = js.undefined
}

object Anon_FragmentShaderSourceMaterial {
  @scala.inline
  def apply(
    fragmentShaderSource: String = null,
    material: Material = null,
    renderState: RenderState = null,
    translucent: js.UndefOr[Boolean] = js.undefined,
    vertexShaderSource: String = null
  ): Anon_FragmentShaderSourceMaterial = {
    val __obj = js.Dynamic.literal()
    if (fragmentShaderSource != null) __obj.updateDynamic("fragmentShaderSource")(fragmentShaderSource.asInstanceOf[js.Any])
    if (material != null) __obj.updateDynamic("material")(material.asInstanceOf[js.Any])
    if (renderState != null) __obj.updateDynamic("renderState")(renderState.asInstanceOf[js.Any])
    if (!js.isUndefined(translucent)) __obj.updateDynamic("translucent")(translucent.asInstanceOf[js.Any])
    if (vertexShaderSource != null) __obj.updateDynamic("vertexShaderSource")(vertexShaderSource.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_FragmentShaderSourceMaterial]
  }
}

