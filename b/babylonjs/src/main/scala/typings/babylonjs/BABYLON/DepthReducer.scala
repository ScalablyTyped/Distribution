package typings.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DepthReducer extends MinMaxReducer {
  
  var _depthRenderer: js.Any = js.native
  
  var _depthRendererId: js.Any = js.native
  
  /**
    * Gets the depth renderer used for the computation.
    * Note that the result is null if you provide your own renderer when calling setDepthRenderer.
    */
  def depthRenderer: Nullable[DepthRenderer] = js.native
  
  /**
    * Sets the depth renderer to use to generate the depth map
    * @param depthRenderer The depth renderer to use. If not provided, a new one will be created automatically
    * @param type The texture type of the depth map (default: TEXTURETYPE_HALF_FLOAT)
    * @param forceFullscreenViewport Forces the post processes used for the reduction to be applied without taking into account viewport (defaults to true)
    */
  def setDepthRenderer(): Unit = js.native
  def setDepthRenderer(
    depthRenderer: js.UndefOr[Nullable[DepthRenderer]],
    `type`: js.UndefOr[scala.Nothing],
    forceFullscreenViewport: Boolean
  ): Unit = js.native
  def setDepthRenderer(depthRenderer: js.UndefOr[Nullable[DepthRenderer]], `type`: Double): Unit = js.native
  def setDepthRenderer(
    depthRenderer: js.UndefOr[Nullable[DepthRenderer]],
    `type`: Double,
    forceFullscreenViewport: Boolean
  ): Unit = js.native
  def setDepthRenderer(depthRenderer: Nullable[DepthRenderer]): Unit = js.native
}
