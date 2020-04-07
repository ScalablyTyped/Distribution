package typings.babylonjs

import typings.babylonjs.sceneMod.Scene
import typings.babylonjs.textureMod.Texture
import typings.std.ArrayBufferView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("babylonjs/Materials/Textures/rawTexture2DArray", JSImport.Namespace)
@js.native
object rawTexture2DArrayMod extends js.Object {
  @js.native
  class RawTexture2DArray protected () extends Texture {
    /**
      * Create a new RawTexture2DArray
      * @param data defines the data of the texture
      * @param width defines the width of the texture
      * @param height defines the height of the texture
      * @param depth defines the number of layers of the texture
      * @param format defines the texture format to use
      * @param scene defines the hosting scene
      * @param generateMipMaps defines a boolean indicating if mip levels should be generated (true by default)
      * @param invertY defines if texture must be stored with Y axis inverted
      * @param samplingMode defines the sampling mode to use (Texture.TRILINEAR_SAMPLINGMODE by default)
      * @param textureType defines the texture Type (Engine.TEXTURETYPE_UNSIGNED_INT, Engine.TEXTURETYPE_FLOAT...)
      */
    def this(
      data: ArrayBufferView,
      width: Double,
      height: Double,
      depth: Double,
      /** Gets or sets the texture format to use */
    format: Double,
      scene: Scene
    ) = this()
    def this(
      data: ArrayBufferView,
      width: Double,
      height: Double,
      depth: Double,
      /** Gets or sets the texture format to use */
    format: Double,
      scene: Scene,
      generateMipMaps: Boolean
    ) = this()
    def this(
      data: ArrayBufferView,
      width: Double,
      height: Double,
      depth: Double,
      /** Gets or sets the texture format to use */
    format: Double,
      scene: Scene,
      generateMipMaps: Boolean,
      invertY: Boolean
    ) = this()
    def this(
      data: ArrayBufferView,
      width: Double,
      height: Double,
      depth: Double,
      /** Gets or sets the texture format to use */
    format: Double,
      scene: Scene,
      generateMipMaps: Boolean,
      invertY: Boolean,
      samplingMode: Double
    ) = this()
    def this(
      data: ArrayBufferView,
      width: Double,
      height: Double,
      depth: Double,
      /** Gets or sets the texture format to use */
    format: Double,
      scene: Scene,
      generateMipMaps: Boolean,
      invertY: Boolean,
      samplingMode: Double,
      textureType: Double
    ) = this()
    var _engine: js.Any = js.native
    /** Gets or sets the texture format to use */
    var format: Double = js.native
    /**
      * Update the texture with new data
      * @param data defines the data to store in the texture
      */
    def update(data: ArrayBufferView): Unit = js.native
  }
  
}

