package typings.cesium.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Closed extends js.Object {
  var closed: js.UndefOr[Boolean] = js.undefined
  var fragmentShaderSource: js.UndefOr[String] = js.undefined
  var material: js.UndefOr[typings.cesium.mod.Material] = js.undefined
  var renderState: js.UndefOr[typings.cesium.mod.RenderState] = js.undefined
  var translucent: js.UndefOr[Boolean] = js.undefined
  var vertexShaderSource: js.UndefOr[String] = js.undefined
}

object Closed {
  @scala.inline
  def apply(
    closed: js.UndefOr[Boolean] = js.undefined,
    fragmentShaderSource: String = null,
    material: typings.cesium.mod.Material = null,
    renderState: typings.cesium.mod.RenderState = null,
    translucent: js.UndefOr[Boolean] = js.undefined,
    vertexShaderSource: String = null
  ): Closed = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(closed)) __obj.updateDynamic("closed")(closed.get.asInstanceOf[js.Any])
    if (fragmentShaderSource != null) __obj.updateDynamic("fragmentShaderSource")(fragmentShaderSource.asInstanceOf[js.Any])
    if (material != null) __obj.updateDynamic("material")(material.asInstanceOf[js.Any])
    if (renderState != null) __obj.updateDynamic("renderState")(renderState.asInstanceOf[js.Any])
    if (!js.isUndefined(translucent)) __obj.updateDynamic("translucent")(translucent.get.asInstanceOf[js.Any])
    if (vertexShaderSource != null) __obj.updateDynamic("vertexShaderSource")(vertexShaderSource.asInstanceOf[js.Any])
    __obj.asInstanceOf[Closed]
  }
}

