package typings.babylonjs

import typings.babylonjs.sceneMod.Scene
import typings.babylonjs.textureMod.Texture
import typings.std.ArrayBufferView
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object rawTexture3DMod {
  
  @JSImport("babylonjs/Materials/Textures/rawTexture3D", "RawTexture3D")
  @js.native
  class RawTexture3D protected () extends Texture {
    /**
      * Create a new RawTexture3D
      * @param data defines the data of the texture
      * @param width defines the width of the texture
      * @param height defines the height of the texture
      * @param depth defines the depth of the texture
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
      generateMipMaps: js.UndefOr[scala.Nothing],
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
      generateMipMaps: js.UndefOr[scala.Nothing],
      invertY: js.UndefOr[scala.Nothing],
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
      generateMipMaps: js.UndefOr[scala.Nothing],
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
      invertY: js.UndefOr[scala.Nothing],
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
      generateMipMaps: js.UndefOr[scala.Nothing],
      invertY: js.UndefOr[scala.Nothing],
      samplingMode: js.UndefOr[scala.Nothing],
      textureType: Double
    ) = this()
    def this(
      data: ArrayBufferView,
      width: Double,
      height: Double,
      depth: Double,
      /** Gets or sets the texture format to use */
    format: Double,
      scene: Scene,
      generateMipMaps: js.UndefOr[scala.Nothing],
      invertY: js.UndefOr[scala.Nothing],
      samplingMode: Double,
      textureType: Double
    ) = this()
    def this(
      data: ArrayBufferView,
      width: Double,
      height: Double,
      depth: Double,
      /** Gets or sets the texture format to use */
    format: Double,
      scene: Scene,
      generateMipMaps: js.UndefOr[scala.Nothing],
      invertY: Boolean,
      samplingMode: js.UndefOr[scala.Nothing],
      textureType: Double
    ) = this()
    def this(
      data: ArrayBufferView,
      width: Double,
      height: Double,
      depth: Double,
      /** Gets or sets the texture format to use */
    format: Double,
      scene: Scene,
      generateMipMaps: js.UndefOr[scala.Nothing],
      invertY: Boolean,
      samplingMode: Double,
      textureType: Double
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
      invertY: js.UndefOr[scala.Nothing],
      samplingMode: js.UndefOr[scala.Nothing],
      textureType: Double
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
      invertY: js.UndefOr[scala.Nothing],
      samplingMode: Double,
      textureType: Double
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
      samplingMode: js.UndefOr[scala.Nothing],
      textureType: Double
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
    
    /** Gets or sets the texture format to use */
    var format: Double = js.native
    
    /**
      * Update the texture with new data
      * @param data defines the data to store in the texture
      */
    def update(data: ArrayBufferView): Unit = js.native
  }
}
