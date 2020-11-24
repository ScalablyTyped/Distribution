package typings.babylonjs.engineDynamicTextureMod.babylonjsEnginesThinEngineAugmentingMod

import typings.babylonjs.HTMLCanvasElement
import typings.babylonjs.HTMLVideoElement
import typings.babylonjs.ImageBitmap
import typings.babylonjs.internalTextureMod.InternalTexture
import typings.babylonjs.typesMod.Nullable
import typings.std.HTMLImageElement
import typings.std.ImageData
import typings.std.OffscreenCanvas
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ThinEngine extends js.Object {
  
  /**
    * Creates a dynamic texture
    * @param width defines the width of the texture
    * @param height defines the height of the texture
    * @param generateMipMaps defines if the engine should generate the mip levels
    * @param samplingMode defines the required sampling mode (Texture.NEAREST_SAMPLINGMODE by default)
    * @returns the dynamic texture inside an InternalTexture
    */
  def createDynamicTexture(width: Double, height: Double, generateMipMaps: Boolean, samplingMode: Double): InternalTexture = js.native
  
  /**
    * Update the content of a dynamic texture
    * @param texture defines the texture to update
    * @param source defines the source containing the data
    * @param invertY defines if data must be stored with Y axis inverted
    * @param premulAlpha defines if alpha is stored as premultiplied
    * @param format defines the format of the data
    * @param forceBindTexture if the texture should be forced to be bound eg. after a graphics context loss (Default: false)
    */
  def updateDynamicTexture(
    texture: Nullable[InternalTexture],
    source: ImageBitmap | ImageData | HTMLImageElement | HTMLCanvasElement | HTMLVideoElement | OffscreenCanvas,
    invertY: js.UndefOr[Boolean],
    premulAlpha: js.UndefOr[Boolean],
    format: js.UndefOr[Double],
    forceBindTexture: js.UndefOr[Boolean]
  ): Unit = js.native
}
object ThinEngine {
  
  @scala.inline
  def apply(
    createDynamicTexture: (Double, Double, Boolean, Double) => InternalTexture,
    updateDynamicTexture: (Nullable[InternalTexture], ImageBitmap | ImageData | HTMLImageElement | HTMLCanvasElement | HTMLVideoElement | OffscreenCanvas, js.UndefOr[Boolean], js.UndefOr[Boolean], js.UndefOr[Double], js.UndefOr[Boolean]) => Unit
  ): ThinEngine = {
    val __obj = js.Dynamic.literal(createDynamicTexture = js.Any.fromFunction4(createDynamicTexture), updateDynamicTexture = js.Any.fromFunction6(updateDynamicTexture))
    __obj.asInstanceOf[ThinEngine]
  }
  
  @scala.inline
  implicit class ThinEngineOps[Self <: ThinEngine] (val x: Self) extends AnyVal {
    
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
    def setCreateDynamicTexture(value: (Double, Double, Boolean, Double) => InternalTexture): Self = this.set("createDynamicTexture", js.Any.fromFunction4(value))
    
    @scala.inline
    def setUpdateDynamicTexture(
      value: (Nullable[InternalTexture], ImageBitmap | ImageData | HTMLImageElement | HTMLCanvasElement | HTMLVideoElement | OffscreenCanvas, js.UndefOr[Boolean], js.UndefOr[Boolean], js.UndefOr[Double], js.UndefOr[Boolean]) => Unit
    ): Self = this.set("updateDynamicTexture", js.Any.fromFunction6(value))
  }
}
