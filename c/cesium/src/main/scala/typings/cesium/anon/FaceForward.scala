package typings.cesium.anon

import typings.cesium.mod.MaterialAppearance.MaterialSupport
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FaceForward extends js.Object {
  var closed: js.UndefOr[Boolean] = js.undefined
  var faceForward: js.UndefOr[Boolean] = js.undefined
  var flat: js.UndefOr[Boolean] = js.undefined
  var fragmentShaderSource: js.UndefOr[String] = js.undefined
  var material: js.UndefOr[typings.cesium.mod.Material] = js.undefined
  var materialSupport: js.UndefOr[MaterialSupport] = js.undefined
  var renderState: js.UndefOr[typings.cesium.mod.RenderState] = js.undefined
  var translucent: js.UndefOr[Boolean] = js.undefined
  var vertexShaderSource: js.UndefOr[String] = js.undefined
}

object FaceForward {
  @scala.inline
  def apply(
    closed: js.UndefOr[Boolean] = js.undefined,
    faceForward: js.UndefOr[Boolean] = js.undefined,
    flat: js.UndefOr[Boolean] = js.undefined,
    fragmentShaderSource: String = null,
    material: typings.cesium.mod.Material = null,
    materialSupport: MaterialSupport = null,
    renderState: typings.cesium.mod.RenderState = null,
    translucent: js.UndefOr[Boolean] = js.undefined,
    vertexShaderSource: String = null
  ): FaceForward = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(closed)) __obj.updateDynamic("closed")(closed.get.asInstanceOf[js.Any])
    if (!js.isUndefined(faceForward)) __obj.updateDynamic("faceForward")(faceForward.get.asInstanceOf[js.Any])
    if (!js.isUndefined(flat)) __obj.updateDynamic("flat")(flat.get.asInstanceOf[js.Any])
    if (fragmentShaderSource != null) __obj.updateDynamic("fragmentShaderSource")(fragmentShaderSource.asInstanceOf[js.Any])
    if (material != null) __obj.updateDynamic("material")(material.asInstanceOf[js.Any])
    if (materialSupport != null) __obj.updateDynamic("materialSupport")(materialSupport.asInstanceOf[js.Any])
    if (renderState != null) __obj.updateDynamic("renderState")(renderState.asInstanceOf[js.Any])
    if (!js.isUndefined(translucent)) __obj.updateDynamic("translucent")(translucent.get.asInstanceOf[js.Any])
    if (vertexShaderSource != null) __obj.updateDynamic("vertexShaderSource")(vertexShaderSource.asInstanceOf[js.Any])
    __obj.asInstanceOf[FaceForward]
  }
}

