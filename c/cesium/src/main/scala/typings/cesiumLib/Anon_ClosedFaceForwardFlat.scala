package typings
package cesiumLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ClosedFaceForwardFlat extends js.Object {
  var closed: js.UndefOr[scala.Boolean] = js.undefined
  var faceForward: js.UndefOr[scala.Boolean] = js.undefined
  var flat: js.UndefOr[scala.Boolean] = js.undefined
  var fragmentShaderSource: js.UndefOr[java.lang.String] = js.undefined
  var renderState: js.UndefOr[cesiumLib.cesiumMod.CesiumNs.RenderState] = js.undefined
  var translucent: js.UndefOr[scala.Boolean] = js.undefined
  var vertexShaderSource: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_ClosedFaceForwardFlat {
  @scala.inline
  def apply(
    closed: js.UndefOr[scala.Boolean] = js.undefined,
    faceForward: js.UndefOr[scala.Boolean] = js.undefined,
    flat: js.UndefOr[scala.Boolean] = js.undefined,
    fragmentShaderSource: java.lang.String = null,
    renderState: cesiumLib.cesiumMod.CesiumNs.RenderState = null,
    translucent: js.UndefOr[scala.Boolean] = js.undefined,
    vertexShaderSource: java.lang.String = null
  ): Anon_ClosedFaceForwardFlat = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(closed)) __obj.updateDynamic("closed")(closed)
    if (!js.isUndefined(faceForward)) __obj.updateDynamic("faceForward")(faceForward)
    if (!js.isUndefined(flat)) __obj.updateDynamic("flat")(flat)
    if (fragmentShaderSource != null) __obj.updateDynamic("fragmentShaderSource")(fragmentShaderSource)
    if (renderState != null) __obj.updateDynamic("renderState")(renderState)
    if (!js.isUndefined(translucent)) __obj.updateDynamic("translucent")(translucent)
    if (vertexShaderSource != null) __obj.updateDynamic("vertexShaderSource")(vertexShaderSource)
    __obj.asInstanceOf[Anon_ClosedFaceForwardFlat]
  }
}

