package typings.babylonjs.engineMultiviewMod.babylonjsEnginesEngineAugmentingMod

import typings.babylonjs.internalTextureMod.InternalTexture
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Engine extends js.Object {
  
  /**
    * Binds a multiview framebuffer to be drawn to
    * @param multiviewTexture texture to bind
    */
  def bindMultiviewFramebuffer(multiviewTexture: InternalTexture): Unit = js.native
  
  /**
    * Creates a new multiview render target
    * @param width defines the width of the texture
    * @param height defines the height of the texture
    * @returns the created multiview texture
    */
  def createMultiviewRenderTargetTexture(width: Double, height: Double): InternalTexture = js.native
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
  
  @scala.inline
  implicit class EngineOps[Self <: Engine] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setBindMultiviewFramebuffer(value: InternalTexture => Unit): Self = this.set("bindMultiviewFramebuffer", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCreateMultiviewRenderTargetTexture(value: (Double, Double) => InternalTexture): Self = this.set("createMultiviewRenderTargetTexture", js.Any.fromFunction2(value))
  }
}
