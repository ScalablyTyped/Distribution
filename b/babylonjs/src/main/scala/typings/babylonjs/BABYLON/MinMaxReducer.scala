package typings.babylonjs.BABYLON

import typings.babylonjs.AnonMin
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("BABYLON.MinMaxReducer")
@js.native
class MinMaxReducer protected () extends js.Object {
  /**
    * Creates a min/max reducer
    * @param camera The camera to use for the post processes
    */
  def this(camera: Camera) = this()
  var _activated: Boolean = js.native
  var _camera: Camera = js.native
  var _forceFullscreenViewport: Boolean = js.native
  var _onAfterUnbindObserver: Nullable[Observer[RenderTargetTexture]] = js.native
  var _postProcessManager: PostProcessManager = js.native
  var _reductionSteps: Nullable[js.Array[PostProcess]] = js.native
  var _sourceTexture: Nullable[RenderTargetTexture] = js.native
  /**
    * Observable triggered when the computation has been performed
    */
  var onAfterReductionPerformed: Observable[AnonMin] = js.native
  /**
    * Activates the reduction computation.
    * When activated, the observers registered in onAfterReductionPerformed are
    * called after the compuation is performed
    */
  def activate(): Unit = js.native
  /**
    * Gets the activation status of the reducer
    */
  def activated: Boolean = js.native
  /**
    * Deactivates the reduction computation.
    */
  def deactivate(): Unit = js.native
  /**
    * Disposes the min/max reducer
    * @param disposeAll true to dispose all the resources. You should always call this function with true as the parameter (or without any parameter as it is the default one). This flag is meant to be used internally.
    */
  def dispose(): Unit = js.native
  def dispose(disposeAll: Boolean): Unit = js.native
  /**
    * Defines the refresh rate of the computation.
    * Use 0 to compute just once, 1 to compute on every frame, 2 to compute every two frames and so on...
    */
  def refreshRate: Double = js.native
  def refreshRate(value: Double): js.Any = js.native
  /**
    * Sets the source texture to read the values from.
    * One must indicate if the texture is a depth texture or not through the depthRedux parameter
    * because in such textures '1' value must not be taken into account to compute the maximum
    * as this value is used to clear the texture.
    * Note that the computation is not activated by calling this function, you must call activate() for that!
    * @param sourceTexture The texture to read the values from. The values should be in the red channel.
    * @param depthRedux Indicates if the texture is a depth texture or not
    * @param type The type of the textures created for the reduction (defaults to TEXTURETYPE_HALF_FLOAT)
    * @param forceFullscreenViewport Forces the post processes used for the reduction to be applied without taking into account viewport (defaults to true)
    */
  def setSourceTexture(sourceTexture: RenderTargetTexture, depthRedux: Boolean): Unit = js.native
  def setSourceTexture(sourceTexture: RenderTargetTexture, depthRedux: Boolean, `type`: Double): Unit = js.native
  def setSourceTexture(
    sourceTexture: RenderTargetTexture,
    depthRedux: Boolean,
    `type`: Double,
    forceFullscreenViewport: Boolean
  ): Unit = js.native
  /**
    * Gets the texture used to read the values from.
    */
  def sourceTexture: Nullable[RenderTargetTexture] = js.native
}

