package typings.babylonjs.engineDynamicTextureMod

import typings.babylonjs.HTMLCanvasElement
import typings.babylonjs.internalTextureMod.InternalTexture
import typings.babylonjs.typesMod.Nullable
import typings.std.OffscreenCanvas
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* augmented module */
@JSImport("babylonjs/Engines/thinEngine", JSImport.Namespace)
@js.native
object babylonjsEnginesThinEngineAugmentingMod extends js.Object {
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
      * @param canvas defines the canvas containing the source
      * @param invertY defines if data must be stored with Y axis inverted
      * @param premulAlpha defines if alpha is stored as premultiplied
      * @param format defines the format of the data
      * @param forceBindTexture if the texture should be forced to be bound eg. after a graphics context loss (Default: false)
      */
    def updateDynamicTexture(texture: Nullable[InternalTexture], canvas: HTMLCanvasElement, invertY: Boolean): Unit = js.native
    def updateDynamicTexture(
      texture: Nullable[InternalTexture],
      canvas: HTMLCanvasElement,
      invertY: Boolean,
      premulAlpha: Boolean
    ): Unit = js.native
    def updateDynamicTexture(
      texture: Nullable[InternalTexture],
      canvas: HTMLCanvasElement,
      invertY: Boolean,
      premulAlpha: Boolean,
      format: Double
    ): Unit = js.native
    def updateDynamicTexture(
      texture: Nullable[InternalTexture],
      canvas: HTMLCanvasElement,
      invertY: Boolean,
      premulAlpha: Boolean,
      format: Double,
      forceBindTexture: Boolean
    ): Unit = js.native
    def updateDynamicTexture(texture: Nullable[InternalTexture], canvas: OffscreenCanvas, invertY: Boolean): Unit = js.native
    def updateDynamicTexture(
      texture: Nullable[InternalTexture],
      canvas: OffscreenCanvas,
      invertY: Boolean,
      premulAlpha: Boolean
    ): Unit = js.native
    def updateDynamicTexture(
      texture: Nullable[InternalTexture],
      canvas: OffscreenCanvas,
      invertY: Boolean,
      premulAlpha: Boolean,
      format: Double
    ): Unit = js.native
    def updateDynamicTexture(
      texture: Nullable[InternalTexture],
      canvas: OffscreenCanvas,
      invertY: Boolean,
      premulAlpha: Boolean,
      format: Double,
      forceBindTexture: Boolean
    ): Unit = js.native
  }
  
}

