package typings.babylonjs.engineMultiviewMod.babylonjsEnginesEngineAugmentingMod

import typings.babylonjs.internalTextureMod.InternalTexture
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Engine extends js.Object {
  /**
    * Binds a multiview framebuffer to be drawn to
    * @param multiviewTexture texture to bind
    */
  def bindMultiviewFramebuffer(multiviewTexture: InternalTexture): Unit
  /**
    * Creates a new multiview render target
    * @param width defines the width of the texture
    * @param height defines the height of the texture
    * @returns the created multiview texture
    */
  def createMultiviewRenderTargetTexture(width: Double, height: Double): InternalTexture
}

object Engine {
  @scala.inline
  def apply(
    bindMultiviewFramebuffer: InternalTexture => Unit,
    createMultiviewRenderTargetTexture: (Double, Double) => InternalTexture
  ): Engine = {
    val __obj = js.Dynamic.literal(bindMultiviewFramebuffer = js.Any.fromFunction1(bindMultiviewFramebuffer), createMultiviewRenderTargetTexture = js.Any.fromFunction2(createMultiviewRenderTargetTexture))
    __obj.asInstanceOf[Engine]
  }
}

