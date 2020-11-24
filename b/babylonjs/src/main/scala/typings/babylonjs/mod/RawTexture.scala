package typings.babylonjs.mod

import typings.babylonjs.typesMod.Nullable
import typings.std.ArrayBufferView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs", "RawTexture")
@js.native
class RawTexture protected ()
  extends typings.babylonjs.legacyMod.RawTexture {
  /**
    * Instantiates a new RawTexture.
    * Raw texture can help creating a texture directly from an array of data.
    * This can be super useful if you either get the data from an uncompressed source or
    * if you wish to create your texture pixel by pixel.
    * @param data define the array of data to use to create the texture
    * @param width define the width of the texture
    * @param height define the height of the texture
    * @param format define the format of the data (RGB, RGBA... Engine.TEXTUREFORMAT_xxx)
    * @param sceneOrEngine defines the scene or engine the texture will belong to
    * @param generateMipMaps define whether mip maps should be generated or not
    * @param invertY define if the data should be flipped on Y when uploaded to the GPU
    * @param samplingMode define the texture sampling mode (Texture.xxx_SAMPLINGMODE)
    * @param type define the format of the data (int, float... Engine.TEXTURETYPE_xxx)
    */
  def this(
    data: ArrayBufferView,
    width: Double,
    height: Double,
    /**
    * Define the format of the data (RGB, RGBA... Engine.TEXTUREFORMAT_xxx)
    */
  format: Double,
    sceneOrEngine: Nullable[typings.babylonjs.sceneMod.Scene | typings.babylonjs.thinEngineMod.ThinEngine]
  ) = this()
  def this(
    data: ArrayBufferView,
    width: Double,
    height: Double,
    /**
    * Define the format of the data (RGB, RGBA... Engine.TEXTUREFORMAT_xxx)
    */
  format: Double,
    sceneOrEngine: Nullable[typings.babylonjs.sceneMod.Scene | typings.babylonjs.thinEngineMod.ThinEngine],
    generateMipMaps: Boolean
  ) = this()
  def this(
    data: ArrayBufferView,
    width: Double,
    height: Double,
    /**
    * Define the format of the data (RGB, RGBA... Engine.TEXTUREFORMAT_xxx)
    */
  format: Double,
    sceneOrEngine: Nullable[typings.babylonjs.sceneMod.Scene | typings.babylonjs.thinEngineMod.ThinEngine],
    generateMipMaps: js.UndefOr[scala.Nothing],
    invertY: Boolean
  ) = this()
  def this(
    data: ArrayBufferView,
    width: Double,
    height: Double,
    /**
    * Define the format of the data (RGB, RGBA... Engine.TEXTUREFORMAT_xxx)
    */
  format: Double,
    sceneOrEngine: Nullable[typings.babylonjs.sceneMod.Scene | typings.babylonjs.thinEngineMod.ThinEngine],
    generateMipMaps: Boolean,
    invertY: Boolean
  ) = this()
  def this(
    data: ArrayBufferView,
    width: Double,
    height: Double,
    /**
    * Define the format of the data (RGB, RGBA... Engine.TEXTUREFORMAT_xxx)
    */
  format: Double,
    sceneOrEngine: Nullable[typings.babylonjs.sceneMod.Scene | typings.babylonjs.thinEngineMod.ThinEngine],
    generateMipMaps: js.UndefOr[scala.Nothing],
    invertY: js.UndefOr[scala.Nothing],
    samplingMode: Double
  ) = this()
  def this(
    data: ArrayBufferView,
    width: Double,
    height: Double,
    /**
    * Define the format of the data (RGB, RGBA... Engine.TEXTUREFORMAT_xxx)
    */
  format: Double,
    sceneOrEngine: Nullable[typings.babylonjs.sceneMod.Scene | typings.babylonjs.thinEngineMod.ThinEngine],
    generateMipMaps: js.UndefOr[scala.Nothing],
    invertY: Boolean,
    samplingMode: Double
  ) = this()
  def this(
    data: ArrayBufferView,
    width: Double,
    height: Double,
    /**
    * Define the format of the data (RGB, RGBA... Engine.TEXTUREFORMAT_xxx)
    */
  format: Double,
    sceneOrEngine: Nullable[typings.babylonjs.sceneMod.Scene | typings.babylonjs.thinEngineMod.ThinEngine],
    generateMipMaps: Boolean,
    invertY: js.UndefOr[scala.Nothing],
    samplingMode: Double
  ) = this()
  def this(
    data: ArrayBufferView,
    width: Double,
    height: Double,
    /**
    * Define the format of the data (RGB, RGBA... Engine.TEXTUREFORMAT_xxx)
    */
  format: Double,
    sceneOrEngine: Nullable[typings.babylonjs.sceneMod.Scene | typings.babylonjs.thinEngineMod.ThinEngine],
    generateMipMaps: Boolean,
    invertY: Boolean,
    samplingMode: Double
  ) = this()
  def this(
    data: ArrayBufferView,
    width: Double,
    height: Double,
    /**
    * Define the format of the data (RGB, RGBA... Engine.TEXTUREFORMAT_xxx)
    */
  format: Double,
    sceneOrEngine: Nullable[typings.babylonjs.sceneMod.Scene | typings.babylonjs.thinEngineMod.ThinEngine],
    generateMipMaps: js.UndefOr[scala.Nothing],
    invertY: js.UndefOr[scala.Nothing],
    samplingMode: js.UndefOr[scala.Nothing],
    `type`: Double
  ) = this()
  def this(
    data: ArrayBufferView,
    width: Double,
    height: Double,
    /**
    * Define the format of the data (RGB, RGBA... Engine.TEXTUREFORMAT_xxx)
    */
  format: Double,
    sceneOrEngine: Nullable[typings.babylonjs.sceneMod.Scene | typings.babylonjs.thinEngineMod.ThinEngine],
    generateMipMaps: js.UndefOr[scala.Nothing],
    invertY: js.UndefOr[scala.Nothing],
    samplingMode: Double,
    `type`: Double
  ) = this()
  def this(
    data: ArrayBufferView,
    width: Double,
    height: Double,
    /**
    * Define the format of the data (RGB, RGBA... Engine.TEXTUREFORMAT_xxx)
    */
  format: Double,
    sceneOrEngine: Nullable[typings.babylonjs.sceneMod.Scene | typings.babylonjs.thinEngineMod.ThinEngine],
    generateMipMaps: js.UndefOr[scala.Nothing],
    invertY: Boolean,
    samplingMode: js.UndefOr[scala.Nothing],
    `type`: Double
  ) = this()
  def this(
    data: ArrayBufferView,
    width: Double,
    height: Double,
    /**
    * Define the format of the data (RGB, RGBA... Engine.TEXTUREFORMAT_xxx)
    */
  format: Double,
    sceneOrEngine: Nullable[typings.babylonjs.sceneMod.Scene | typings.babylonjs.thinEngineMod.ThinEngine],
    generateMipMaps: js.UndefOr[scala.Nothing],
    invertY: Boolean,
    samplingMode: Double,
    `type`: Double
  ) = this()
  def this(
    data: ArrayBufferView,
    width: Double,
    height: Double,
    /**
    * Define the format of the data (RGB, RGBA... Engine.TEXTUREFORMAT_xxx)
    */
  format: Double,
    sceneOrEngine: Nullable[typings.babylonjs.sceneMod.Scene | typings.babylonjs.thinEngineMod.ThinEngine],
    generateMipMaps: Boolean,
    invertY: js.UndefOr[scala.Nothing],
    samplingMode: js.UndefOr[scala.Nothing],
    `type`: Double
  ) = this()
  def this(
    data: ArrayBufferView,
    width: Double,
    height: Double,
    /**
    * Define the format of the data (RGB, RGBA... Engine.TEXTUREFORMAT_xxx)
    */
  format: Double,
    sceneOrEngine: Nullable[typings.babylonjs.sceneMod.Scene | typings.babylonjs.thinEngineMod.ThinEngine],
    generateMipMaps: Boolean,
    invertY: js.UndefOr[scala.Nothing],
    samplingMode: Double,
    `type`: Double
  ) = this()
  def this(
    data: ArrayBufferView,
    width: Double,
    height: Double,
    /**
    * Define the format of the data (RGB, RGBA... Engine.TEXTUREFORMAT_xxx)
    */
  format: Double,
    sceneOrEngine: Nullable[typings.babylonjs.sceneMod.Scene | typings.babylonjs.thinEngineMod.ThinEngine],
    generateMipMaps: Boolean,
    invertY: Boolean,
    samplingMode: js.UndefOr[scala.Nothing],
    `type`: Double
  ) = this()
  def this(
    data: ArrayBufferView,
    width: Double,
    height: Double,
    /**
    * Define the format of the data (RGB, RGBA... Engine.TEXTUREFORMAT_xxx)
    */
  format: Double,
    sceneOrEngine: Nullable[typings.babylonjs.sceneMod.Scene | typings.babylonjs.thinEngineMod.ThinEngine],
    generateMipMaps: Boolean,
    invertY: Boolean,
    samplingMode: Double,
    `type`: Double
  ) = this()
}
/* static members */
@JSImport("babylonjs", "RawTexture")
@js.native
object RawTexture extends js.Object {
  
  /**
    * Creates an alpha texture from some data.
    * @param data Define the texture data
    * @param width Define the width of the texture
    * @param height Define the height of the texture
    * @param sceneOrEngine defines the scene or engine the texture will belong to
    * @param generateMipMaps Define whether or not to create mip maps for the texture
    * @param invertY define if the data should be flipped on Y when uploaded to the GPU
    * @param samplingMode define the texture sampling mode (Texture.xxx_SAMPLINGMODE)
    * @returns the alpha texture
    */
  def CreateAlphaTexture(
    data: ArrayBufferView,
    width: Double,
    height: Double,
    sceneOrEngine: Nullable[typings.babylonjs.sceneMod.Scene | typings.babylonjs.thinEngineMod.ThinEngine]
  ): typings.babylonjs.rawTextureMod.RawTexture = js.native
  def CreateAlphaTexture(
    data: ArrayBufferView,
    width: Double,
    height: Double,
    sceneOrEngine: Nullable[typings.babylonjs.sceneMod.Scene | typings.babylonjs.thinEngineMod.ThinEngine],
    generateMipMaps: js.UndefOr[scala.Nothing],
    invertY: js.UndefOr[scala.Nothing],
    samplingMode: Double
  ): typings.babylonjs.rawTextureMod.RawTexture = js.native
  def CreateAlphaTexture(
    data: ArrayBufferView,
    width: Double,
    height: Double,
    sceneOrEngine: Nullable[typings.babylonjs.sceneMod.Scene | typings.babylonjs.thinEngineMod.ThinEngine],
    generateMipMaps: js.UndefOr[scala.Nothing],
    invertY: Boolean
  ): typings.babylonjs.rawTextureMod.RawTexture = js.native
  def CreateAlphaTexture(
    data: ArrayBufferView,
    width: Double,
    height: Double,
    sceneOrEngine: Nullable[typings.babylonjs.sceneMod.Scene | typings.babylonjs.thinEngineMod.ThinEngine],
    generateMipMaps: js.UndefOr[scala.Nothing],
    invertY: Boolean,
    samplingMode: Double
  ): typings.babylonjs.rawTextureMod.RawTexture = js.native
  def CreateAlphaTexture(
    data: ArrayBufferView,
    width: Double,
    height: Double,
    sceneOrEngine: Nullable[typings.babylonjs.sceneMod.Scene | typings.babylonjs.thinEngineMod.ThinEngine],
    generateMipMaps: Boolean
  ): typings.babylonjs.rawTextureMod.RawTexture = js.native
  def CreateAlphaTexture(
    data: ArrayBufferView,
    width: Double,
    height: Double,
    sceneOrEngine: Nullable[typings.babylonjs.sceneMod.Scene | typings.babylonjs.thinEngineMod.ThinEngine],
    generateMipMaps: Boolean,
    invertY: js.UndefOr[scala.Nothing],
    samplingMode: Double
  ): typings.babylonjs.rawTextureMod.RawTexture = js.native
  def CreateAlphaTexture(
    data: ArrayBufferView,
    width: Double,
    height: Double,
    sceneOrEngine: Nullable[typings.babylonjs.sceneMod.Scene | typings.babylonjs.thinEngineMod.ThinEngine],
    generateMipMaps: Boolean,
    invertY: Boolean
  ): typings.babylonjs.rawTextureMod.RawTexture = js.native
  def CreateAlphaTexture(
    data: ArrayBufferView,
    width: Double,
    height: Double,
    sceneOrEngine: Nullable[typings.babylonjs.sceneMod.Scene | typings.babylonjs.thinEngineMod.ThinEngine],
    generateMipMaps: Boolean,
    invertY: Boolean,
    samplingMode: Double
  ): typings.babylonjs.rawTextureMod.RawTexture = js.native
  
  /**
    * Creates a luminance alpha texture from some data.
    * @param data Define the texture data
    * @param width Define the width of the texture
    * @param height Define the height of the texture
    * @param sceneOrEngine defines the scene or engine the texture will belong to
    * @param generateMipMaps Define whether or not to create mip maps for the texture
    * @param invertY define if the data should be flipped on Y when uploaded to the GPU
    * @param samplingMode define the texture sampling mode (Texture.xxx_SAMPLINGMODE)
    * @returns the luminance alpha texture
    */
  def CreateLuminanceAlphaTexture(
    data: ArrayBufferView,
    width: Double,
    height: Double,
    sceneOrEngine: Nullable[typings.babylonjs.sceneMod.Scene | typings.babylonjs.thinEngineMod.ThinEngine]
  ): typings.babylonjs.rawTextureMod.RawTexture = js.native
  def CreateLuminanceAlphaTexture(
    data: ArrayBufferView,
    width: Double,
    height: Double,
    sceneOrEngine: Nullable[typings.babylonjs.sceneMod.Scene | typings.babylonjs.thinEngineMod.ThinEngine],
    generateMipMaps: js.UndefOr[scala.Nothing],
    invertY: js.UndefOr[scala.Nothing],
    samplingMode: Double
  ): typings.babylonjs.rawTextureMod.RawTexture = js.native
  def CreateLuminanceAlphaTexture(
    data: ArrayBufferView,
    width: Double,
    height: Double,
    sceneOrEngine: Nullable[typings.babylonjs.sceneMod.Scene | typings.babylonjs.thinEngineMod.ThinEngine],
    generateMipMaps: js.UndefOr[scala.Nothing],
    invertY: Boolean
  ): typings.babylonjs.rawTextureMod.RawTexture = js.native
  def CreateLuminanceAlphaTexture(
    data: ArrayBufferView,
    width: Double,
    height: Double,
    sceneOrEngine: Nullable[typings.babylonjs.sceneMod.Scene | typings.babylonjs.thinEngineMod.ThinEngine],
    generateMipMaps: js.UndefOr[scala.Nothing],
    invertY: Boolean,
    samplingMode: Double
  ): typings.babylonjs.rawTextureMod.RawTexture = js.native
  def CreateLuminanceAlphaTexture(
    data: ArrayBufferView,
    width: Double,
    height: Double,
    sceneOrEngine: Nullable[typings.babylonjs.sceneMod.Scene | typings.babylonjs.thinEngineMod.ThinEngine],
    generateMipMaps: Boolean
  ): typings.babylonjs.rawTextureMod.RawTexture = js.native
  def CreateLuminanceAlphaTexture(
    data: ArrayBufferView,
    width: Double,
    height: Double,
    sceneOrEngine: Nullable[typings.babylonjs.sceneMod.Scene | typings.babylonjs.thinEngineMod.ThinEngine],
    generateMipMaps: Boolean,
    invertY: js.UndefOr[scala.Nothing],
    samplingMode: Double
  ): typings.babylonjs.rawTextureMod.RawTexture = js.native
  def CreateLuminanceAlphaTexture(
    data: ArrayBufferView,
    width: Double,
    height: Double,
    sceneOrEngine: Nullable[typings.babylonjs.sceneMod.Scene | typings.babylonjs.thinEngineMod.ThinEngine],
    generateMipMaps: Boolean,
    invertY: Boolean
  ): typings.babylonjs.rawTextureMod.RawTexture = js.native
  def CreateLuminanceAlphaTexture(
    data: ArrayBufferView,
    width: Double,
    height: Double,
    sceneOrEngine: Nullable[typings.babylonjs.sceneMod.Scene | typings.babylonjs.thinEngineMod.ThinEngine],
    generateMipMaps: Boolean,
    invertY: Boolean,
    samplingMode: Double
  ): typings.babylonjs.rawTextureMod.RawTexture = js.native
  
  /**
    * Creates a luminance texture from some data.
    * @param data Define the texture data
    * @param width Define the width of the texture
    * @param height Define the height of the texture
    * @param sceneOrEngine defines the scene or engine the texture will belong to
    * @param generateMipMaps Define whether or not to create mip maps for the texture
    * @param invertY define if the data should be flipped on Y when uploaded to the GPU
    * @param samplingMode define the texture sampling mode (Texture.xxx_SAMPLINGMODE)
    * @returns the luminance texture
    */
  def CreateLuminanceTexture(
    data: ArrayBufferView,
    width: Double,
    height: Double,
    sceneOrEngine: Nullable[typings.babylonjs.sceneMod.Scene | typings.babylonjs.thinEngineMod.ThinEngine]
  ): typings.babylonjs.rawTextureMod.RawTexture = js.native
  def CreateLuminanceTexture(
    data: ArrayBufferView,
    width: Double,
    height: Double,
    sceneOrEngine: Nullable[typings.babylonjs.sceneMod.Scene | typings.babylonjs.thinEngineMod.ThinEngine],
    generateMipMaps: js.UndefOr[scala.Nothing],
    invertY: js.UndefOr[scala.Nothing],
    samplingMode: Double
  ): typings.babylonjs.rawTextureMod.RawTexture = js.native
  def CreateLuminanceTexture(
    data: ArrayBufferView,
    width: Double,
    height: Double,
    sceneOrEngine: Nullable[typings.babylonjs.sceneMod.Scene | typings.babylonjs.thinEngineMod.ThinEngine],
    generateMipMaps: js.UndefOr[scala.Nothing],
    invertY: Boolean
  ): typings.babylonjs.rawTextureMod.RawTexture = js.native
  def CreateLuminanceTexture(
    data: ArrayBufferView,
    width: Double,
    height: Double,
    sceneOrEngine: Nullable[typings.babylonjs.sceneMod.Scene | typings.babylonjs.thinEngineMod.ThinEngine],
    generateMipMaps: js.UndefOr[scala.Nothing],
    invertY: Boolean,
    samplingMode: Double
  ): typings.babylonjs.rawTextureMod.RawTexture = js.native
  def CreateLuminanceTexture(
    data: ArrayBufferView,
    width: Double,
    height: Double,
    sceneOrEngine: Nullable[typings.babylonjs.sceneMod.Scene | typings.babylonjs.thinEngineMod.ThinEngine],
    generateMipMaps: Boolean
  ): typings.babylonjs.rawTextureMod.RawTexture = js.native
  def CreateLuminanceTexture(
    data: ArrayBufferView,
    width: Double,
    height: Double,
    sceneOrEngine: Nullable[typings.babylonjs.sceneMod.Scene | typings.babylonjs.thinEngineMod.ThinEngine],
    generateMipMaps: Boolean,
    invertY: js.UndefOr[scala.Nothing],
    samplingMode: Double
  ): typings.babylonjs.rawTextureMod.RawTexture = js.native
  def CreateLuminanceTexture(
    data: ArrayBufferView,
    width: Double,
    height: Double,
    sceneOrEngine: Nullable[typings.babylonjs.sceneMod.Scene | typings.babylonjs.thinEngineMod.ThinEngine],
    generateMipMaps: Boolean,
    invertY: Boolean
  ): typings.babylonjs.rawTextureMod.RawTexture = js.native
  def CreateLuminanceTexture(
    data: ArrayBufferView,
    width: Double,
    height: Double,
    sceneOrEngine: Nullable[typings.babylonjs.sceneMod.Scene | typings.babylonjs.thinEngineMod.ThinEngine],
    generateMipMaps: Boolean,
    invertY: Boolean,
    samplingMode: Double
  ): typings.babylonjs.rawTextureMod.RawTexture = js.native
  
  /**
    * Creates a RGBA texture from some data.
    * @param data Define the texture data
    * @param width Define the width of the texture
    * @param height Define the height of the texture
    * @param sceneOrEngine defines the scene or engine the texture will belong to
    * @param generateMipMaps Define whether or not to create mip maps for the texture
    * @param invertY define if the data should be flipped on Y when uploaded to the GPU
    * @param samplingMode define the texture sampling mode (Texture.xxx_SAMPLINGMODE)
    * @param type define the format of the data (int, float... Engine.TEXTURETYPE_xxx)
    * @returns the RGBA texture
    */
  def CreateRGBATexture(
    data: ArrayBufferView,
    width: Double,
    height: Double,
    sceneOrEngine: Nullable[typings.babylonjs.sceneMod.Scene | typings.babylonjs.thinEngineMod.ThinEngine]
  ): typings.babylonjs.rawTextureMod.RawTexture = js.native
  def CreateRGBATexture(
    data: ArrayBufferView,
    width: Double,
    height: Double,
    sceneOrEngine: Nullable[typings.babylonjs.sceneMod.Scene | typings.babylonjs.thinEngineMod.ThinEngine],
    generateMipMaps: js.UndefOr[scala.Nothing],
    invertY: js.UndefOr[scala.Nothing],
    samplingMode: js.UndefOr[scala.Nothing],
    `type`: Double
  ): typings.babylonjs.rawTextureMod.RawTexture = js.native
  def CreateRGBATexture(
    data: ArrayBufferView,
    width: Double,
    height: Double,
    sceneOrEngine: Nullable[typings.babylonjs.sceneMod.Scene | typings.babylonjs.thinEngineMod.ThinEngine],
    generateMipMaps: js.UndefOr[scala.Nothing],
    invertY: js.UndefOr[scala.Nothing],
    samplingMode: Double
  ): typings.babylonjs.rawTextureMod.RawTexture = js.native
  def CreateRGBATexture(
    data: ArrayBufferView,
    width: Double,
    height: Double,
    sceneOrEngine: Nullable[typings.babylonjs.sceneMod.Scene | typings.babylonjs.thinEngineMod.ThinEngine],
    generateMipMaps: js.UndefOr[scala.Nothing],
    invertY: js.UndefOr[scala.Nothing],
    samplingMode: Double,
    `type`: Double
  ): typings.babylonjs.rawTextureMod.RawTexture = js.native
  def CreateRGBATexture(
    data: ArrayBufferView,
    width: Double,
    height: Double,
    sceneOrEngine: Nullable[typings.babylonjs.sceneMod.Scene | typings.babylonjs.thinEngineMod.ThinEngine],
    generateMipMaps: js.UndefOr[scala.Nothing],
    invertY: Boolean
  ): typings.babylonjs.rawTextureMod.RawTexture = js.native
  def CreateRGBATexture(
    data: ArrayBufferView,
    width: Double,
    height: Double,
    sceneOrEngine: Nullable[typings.babylonjs.sceneMod.Scene | typings.babylonjs.thinEngineMod.ThinEngine],
    generateMipMaps: js.UndefOr[scala.Nothing],
    invertY: Boolean,
    samplingMode: js.UndefOr[scala.Nothing],
    `type`: Double
  ): typings.babylonjs.rawTextureMod.RawTexture = js.native
  def CreateRGBATexture(
    data: ArrayBufferView,
    width: Double,
    height: Double,
    sceneOrEngine: Nullable[typings.babylonjs.sceneMod.Scene | typings.babylonjs.thinEngineMod.ThinEngine],
    generateMipMaps: js.UndefOr[scala.Nothing],
    invertY: Boolean,
    samplingMode: Double
  ): typings.babylonjs.rawTextureMod.RawTexture = js.native
  def CreateRGBATexture(
    data: ArrayBufferView,
    width: Double,
    height: Double,
    sceneOrEngine: Nullable[typings.babylonjs.sceneMod.Scene | typings.babylonjs.thinEngineMod.ThinEngine],
    generateMipMaps: js.UndefOr[scala.Nothing],
    invertY: Boolean,
    samplingMode: Double,
    `type`: Double
  ): typings.babylonjs.rawTextureMod.RawTexture = js.native
  def CreateRGBATexture(
    data: ArrayBufferView,
    width: Double,
    height: Double,
    sceneOrEngine: Nullable[typings.babylonjs.sceneMod.Scene | typings.babylonjs.thinEngineMod.ThinEngine],
    generateMipMaps: Boolean
  ): typings.babylonjs.rawTextureMod.RawTexture = js.native
  def CreateRGBATexture(
    data: ArrayBufferView,
    width: Double,
    height: Double,
    sceneOrEngine: Nullable[typings.babylonjs.sceneMod.Scene | typings.babylonjs.thinEngineMod.ThinEngine],
    generateMipMaps: Boolean,
    invertY: js.UndefOr[scala.Nothing],
    samplingMode: js.UndefOr[scala.Nothing],
    `type`: Double
  ): typings.babylonjs.rawTextureMod.RawTexture = js.native
  def CreateRGBATexture(
    data: ArrayBufferView,
    width: Double,
    height: Double,
    sceneOrEngine: Nullable[typings.babylonjs.sceneMod.Scene | typings.babylonjs.thinEngineMod.ThinEngine],
    generateMipMaps: Boolean,
    invertY: js.UndefOr[scala.Nothing],
    samplingMode: Double
  ): typings.babylonjs.rawTextureMod.RawTexture = js.native
  def CreateRGBATexture(
    data: ArrayBufferView,
    width: Double,
    height: Double,
    sceneOrEngine: Nullable[typings.babylonjs.sceneMod.Scene | typings.babylonjs.thinEngineMod.ThinEngine],
    generateMipMaps: Boolean,
    invertY: js.UndefOr[scala.Nothing],
    samplingMode: Double,
    `type`: Double
  ): typings.babylonjs.rawTextureMod.RawTexture = js.native
  def CreateRGBATexture(
    data: ArrayBufferView,
    width: Double,
    height: Double,
    sceneOrEngine: Nullable[typings.babylonjs.sceneMod.Scene | typings.babylonjs.thinEngineMod.ThinEngine],
    generateMipMaps: Boolean,
    invertY: Boolean
  ): typings.babylonjs.rawTextureMod.RawTexture = js.native
  def CreateRGBATexture(
    data: ArrayBufferView,
    width: Double,
    height: Double,
    sceneOrEngine: Nullable[typings.babylonjs.sceneMod.Scene | typings.babylonjs.thinEngineMod.ThinEngine],
    generateMipMaps: Boolean,
    invertY: Boolean,
    samplingMode: js.UndefOr[scala.Nothing],
    `type`: Double
  ): typings.babylonjs.rawTextureMod.RawTexture = js.native
  def CreateRGBATexture(
    data: ArrayBufferView,
    width: Double,
    height: Double,
    sceneOrEngine: Nullable[typings.babylonjs.sceneMod.Scene | typings.babylonjs.thinEngineMod.ThinEngine],
    generateMipMaps: Boolean,
    invertY: Boolean,
    samplingMode: Double
  ): typings.babylonjs.rawTextureMod.RawTexture = js.native
  def CreateRGBATexture(
    data: ArrayBufferView,
    width: Double,
    height: Double,
    sceneOrEngine: Nullable[typings.babylonjs.sceneMod.Scene | typings.babylonjs.thinEngineMod.ThinEngine],
    generateMipMaps: Boolean,
    invertY: Boolean,
    samplingMode: Double,
    `type`: Double
  ): typings.babylonjs.rawTextureMod.RawTexture = js.native
  
  /**
    * Creates a RGB texture from some data.
    * @param data Define the texture data
    * @param width Define the width of the texture
    * @param height Define the height of the texture
    * @param sceneOrEngine defines the scene or engine the texture will belong to
    * @param generateMipMaps Define whether or not to create mip maps for the texture
    * @param invertY define if the data should be flipped on Y when uploaded to the GPU
    * @param samplingMode define the texture sampling mode (Texture.xxx_SAMPLINGMODE)
    * @param type define the format of the data (int, float... Engine.TEXTURETYPE_xxx)
    * @returns the RGB alpha texture
    */
  def CreateRGBTexture(
    data: ArrayBufferView,
    width: Double,
    height: Double,
    sceneOrEngine: Nullable[typings.babylonjs.sceneMod.Scene | typings.babylonjs.thinEngineMod.ThinEngine]
  ): typings.babylonjs.rawTextureMod.RawTexture = js.native
  def CreateRGBTexture(
    data: ArrayBufferView,
    width: Double,
    height: Double,
    sceneOrEngine: Nullable[typings.babylonjs.sceneMod.Scene | typings.babylonjs.thinEngineMod.ThinEngine],
    generateMipMaps: js.UndefOr[scala.Nothing],
    invertY: js.UndefOr[scala.Nothing],
    samplingMode: js.UndefOr[scala.Nothing],
    `type`: Double
  ): typings.babylonjs.rawTextureMod.RawTexture = js.native
  def CreateRGBTexture(
    data: ArrayBufferView,
    width: Double,
    height: Double,
    sceneOrEngine: Nullable[typings.babylonjs.sceneMod.Scene | typings.babylonjs.thinEngineMod.ThinEngine],
    generateMipMaps: js.UndefOr[scala.Nothing],
    invertY: js.UndefOr[scala.Nothing],
    samplingMode: Double
  ): typings.babylonjs.rawTextureMod.RawTexture = js.native
  def CreateRGBTexture(
    data: ArrayBufferView,
    width: Double,
    height: Double,
    sceneOrEngine: Nullable[typings.babylonjs.sceneMod.Scene | typings.babylonjs.thinEngineMod.ThinEngine],
    generateMipMaps: js.UndefOr[scala.Nothing],
    invertY: js.UndefOr[scala.Nothing],
    samplingMode: Double,
    `type`: Double
  ): typings.babylonjs.rawTextureMod.RawTexture = js.native
  def CreateRGBTexture(
    data: ArrayBufferView,
    width: Double,
    height: Double,
    sceneOrEngine: Nullable[typings.babylonjs.sceneMod.Scene | typings.babylonjs.thinEngineMod.ThinEngine],
    generateMipMaps: js.UndefOr[scala.Nothing],
    invertY: Boolean
  ): typings.babylonjs.rawTextureMod.RawTexture = js.native
  def CreateRGBTexture(
    data: ArrayBufferView,
    width: Double,
    height: Double,
    sceneOrEngine: Nullable[typings.babylonjs.sceneMod.Scene | typings.babylonjs.thinEngineMod.ThinEngine],
    generateMipMaps: js.UndefOr[scala.Nothing],
    invertY: Boolean,
    samplingMode: js.UndefOr[scala.Nothing],
    `type`: Double
  ): typings.babylonjs.rawTextureMod.RawTexture = js.native
  def CreateRGBTexture(
    data: ArrayBufferView,
    width: Double,
    height: Double,
    sceneOrEngine: Nullable[typings.babylonjs.sceneMod.Scene | typings.babylonjs.thinEngineMod.ThinEngine],
    generateMipMaps: js.UndefOr[scala.Nothing],
    invertY: Boolean,
    samplingMode: Double
  ): typings.babylonjs.rawTextureMod.RawTexture = js.native
  def CreateRGBTexture(
    data: ArrayBufferView,
    width: Double,
    height: Double,
    sceneOrEngine: Nullable[typings.babylonjs.sceneMod.Scene | typings.babylonjs.thinEngineMod.ThinEngine],
    generateMipMaps: js.UndefOr[scala.Nothing],
    invertY: Boolean,
    samplingMode: Double,
    `type`: Double
  ): typings.babylonjs.rawTextureMod.RawTexture = js.native
  def CreateRGBTexture(
    data: ArrayBufferView,
    width: Double,
    height: Double,
    sceneOrEngine: Nullable[typings.babylonjs.sceneMod.Scene | typings.babylonjs.thinEngineMod.ThinEngine],
    generateMipMaps: Boolean
  ): typings.babylonjs.rawTextureMod.RawTexture = js.native
  def CreateRGBTexture(
    data: ArrayBufferView,
    width: Double,
    height: Double,
    sceneOrEngine: Nullable[typings.babylonjs.sceneMod.Scene | typings.babylonjs.thinEngineMod.ThinEngine],
    generateMipMaps: Boolean,
    invertY: js.UndefOr[scala.Nothing],
    samplingMode: js.UndefOr[scala.Nothing],
    `type`: Double
  ): typings.babylonjs.rawTextureMod.RawTexture = js.native
  def CreateRGBTexture(
    data: ArrayBufferView,
    width: Double,
    height: Double,
    sceneOrEngine: Nullable[typings.babylonjs.sceneMod.Scene | typings.babylonjs.thinEngineMod.ThinEngine],
    generateMipMaps: Boolean,
    invertY: js.UndefOr[scala.Nothing],
    samplingMode: Double
  ): typings.babylonjs.rawTextureMod.RawTexture = js.native
  def CreateRGBTexture(
    data: ArrayBufferView,
    width: Double,
    height: Double,
    sceneOrEngine: Nullable[typings.babylonjs.sceneMod.Scene | typings.babylonjs.thinEngineMod.ThinEngine],
    generateMipMaps: Boolean,
    invertY: js.UndefOr[scala.Nothing],
    samplingMode: Double,
    `type`: Double
  ): typings.babylonjs.rawTextureMod.RawTexture = js.native
  def CreateRGBTexture(
    data: ArrayBufferView,
    width: Double,
    height: Double,
    sceneOrEngine: Nullable[typings.babylonjs.sceneMod.Scene | typings.babylonjs.thinEngineMod.ThinEngine],
    generateMipMaps: Boolean,
    invertY: Boolean
  ): typings.babylonjs.rawTextureMod.RawTexture = js.native
  def CreateRGBTexture(
    data: ArrayBufferView,
    width: Double,
    height: Double,
    sceneOrEngine: Nullable[typings.babylonjs.sceneMod.Scene | typings.babylonjs.thinEngineMod.ThinEngine],
    generateMipMaps: Boolean,
    invertY: Boolean,
    samplingMode: js.UndefOr[scala.Nothing],
    `type`: Double
  ): typings.babylonjs.rawTextureMod.RawTexture = js.native
  def CreateRGBTexture(
    data: ArrayBufferView,
    width: Double,
    height: Double,
    sceneOrEngine: Nullable[typings.babylonjs.sceneMod.Scene | typings.babylonjs.thinEngineMod.ThinEngine],
    generateMipMaps: Boolean,
    invertY: Boolean,
    samplingMode: Double
  ): typings.babylonjs.rawTextureMod.RawTexture = js.native
  def CreateRGBTexture(
    data: ArrayBufferView,
    width: Double,
    height: Double,
    sceneOrEngine: Nullable[typings.babylonjs.sceneMod.Scene | typings.babylonjs.thinEngineMod.ThinEngine],
    generateMipMaps: Boolean,
    invertY: Boolean,
    samplingMode: Double,
    `type`: Double
  ): typings.babylonjs.rawTextureMod.RawTexture = js.native
  
  /**
    * Creates a R texture from some data.
    * @param data Define the texture data
    * @param width Define the width of the texture
    * @param height Define the height of the texture
    * @param sceneOrEngine defines the scene or engine the texture will belong to
    * @param generateMipMaps Define whether or not to create mip maps for the texture
    * @param invertY define if the data should be flipped on Y when uploaded to the GPU
    * @param samplingMode define the texture sampling mode (Texture.xxx_SAMPLINGMODE)
    * @param type define the format of the data (int, float... Engine.TEXTURETYPE_xxx)
    * @returns the R texture
    */
  def CreateRTexture(
    data: ArrayBufferView,
    width: Double,
    height: Double,
    sceneOrEngine: Nullable[typings.babylonjs.sceneMod.Scene | typings.babylonjs.thinEngineMod.ThinEngine]
  ): typings.babylonjs.rawTextureMod.RawTexture = js.native
  def CreateRTexture(
    data: ArrayBufferView,
    width: Double,
    height: Double,
    sceneOrEngine: Nullable[typings.babylonjs.sceneMod.Scene | typings.babylonjs.thinEngineMod.ThinEngine],
    generateMipMaps: js.UndefOr[scala.Nothing],
    invertY: js.UndefOr[scala.Nothing],
    samplingMode: js.UndefOr[scala.Nothing],
    `type`: Double
  ): typings.babylonjs.rawTextureMod.RawTexture = js.native
  def CreateRTexture(
    data: ArrayBufferView,
    width: Double,
    height: Double,
    sceneOrEngine: Nullable[typings.babylonjs.sceneMod.Scene | typings.babylonjs.thinEngineMod.ThinEngine],
    generateMipMaps: js.UndefOr[scala.Nothing],
    invertY: js.UndefOr[scala.Nothing],
    samplingMode: Double
  ): typings.babylonjs.rawTextureMod.RawTexture = js.native
  def CreateRTexture(
    data: ArrayBufferView,
    width: Double,
    height: Double,
    sceneOrEngine: Nullable[typings.babylonjs.sceneMod.Scene | typings.babylonjs.thinEngineMod.ThinEngine],
    generateMipMaps: js.UndefOr[scala.Nothing],
    invertY: js.UndefOr[scala.Nothing],
    samplingMode: Double,
    `type`: Double
  ): typings.babylonjs.rawTextureMod.RawTexture = js.native
  def CreateRTexture(
    data: ArrayBufferView,
    width: Double,
    height: Double,
    sceneOrEngine: Nullable[typings.babylonjs.sceneMod.Scene | typings.babylonjs.thinEngineMod.ThinEngine],
    generateMipMaps: js.UndefOr[scala.Nothing],
    invertY: Boolean
  ): typings.babylonjs.rawTextureMod.RawTexture = js.native
  def CreateRTexture(
    data: ArrayBufferView,
    width: Double,
    height: Double,
    sceneOrEngine: Nullable[typings.babylonjs.sceneMod.Scene | typings.babylonjs.thinEngineMod.ThinEngine],
    generateMipMaps: js.UndefOr[scala.Nothing],
    invertY: Boolean,
    samplingMode: js.UndefOr[scala.Nothing],
    `type`: Double
  ): typings.babylonjs.rawTextureMod.RawTexture = js.native
  def CreateRTexture(
    data: ArrayBufferView,
    width: Double,
    height: Double,
    sceneOrEngine: Nullable[typings.babylonjs.sceneMod.Scene | typings.babylonjs.thinEngineMod.ThinEngine],
    generateMipMaps: js.UndefOr[scala.Nothing],
    invertY: Boolean,
    samplingMode: Double
  ): typings.babylonjs.rawTextureMod.RawTexture = js.native
  def CreateRTexture(
    data: ArrayBufferView,
    width: Double,
    height: Double,
    sceneOrEngine: Nullable[typings.babylonjs.sceneMod.Scene | typings.babylonjs.thinEngineMod.ThinEngine],
    generateMipMaps: js.UndefOr[scala.Nothing],
    invertY: Boolean,
    samplingMode: Double,
    `type`: Double
  ): typings.babylonjs.rawTextureMod.RawTexture = js.native
  def CreateRTexture(
    data: ArrayBufferView,
    width: Double,
    height: Double,
    sceneOrEngine: Nullable[typings.babylonjs.sceneMod.Scene | typings.babylonjs.thinEngineMod.ThinEngine],
    generateMipMaps: Boolean
  ): typings.babylonjs.rawTextureMod.RawTexture = js.native
  def CreateRTexture(
    data: ArrayBufferView,
    width: Double,
    height: Double,
    sceneOrEngine: Nullable[typings.babylonjs.sceneMod.Scene | typings.babylonjs.thinEngineMod.ThinEngine],
    generateMipMaps: Boolean,
    invertY: js.UndefOr[scala.Nothing],
    samplingMode: js.UndefOr[scala.Nothing],
    `type`: Double
  ): typings.babylonjs.rawTextureMod.RawTexture = js.native
  def CreateRTexture(
    data: ArrayBufferView,
    width: Double,
    height: Double,
    sceneOrEngine: Nullable[typings.babylonjs.sceneMod.Scene | typings.babylonjs.thinEngineMod.ThinEngine],
    generateMipMaps: Boolean,
    invertY: js.UndefOr[scala.Nothing],
    samplingMode: Double
  ): typings.babylonjs.rawTextureMod.RawTexture = js.native
  def CreateRTexture(
    data: ArrayBufferView,
    width: Double,
    height: Double,
    sceneOrEngine: Nullable[typings.babylonjs.sceneMod.Scene | typings.babylonjs.thinEngineMod.ThinEngine],
    generateMipMaps: Boolean,
    invertY: js.UndefOr[scala.Nothing],
    samplingMode: Double,
    `type`: Double
  ): typings.babylonjs.rawTextureMod.RawTexture = js.native
  def CreateRTexture(
    data: ArrayBufferView,
    width: Double,
    height: Double,
    sceneOrEngine: Nullable[typings.babylonjs.sceneMod.Scene | typings.babylonjs.thinEngineMod.ThinEngine],
    generateMipMaps: Boolean,
    invertY: Boolean
  ): typings.babylonjs.rawTextureMod.RawTexture = js.native
  def CreateRTexture(
    data: ArrayBufferView,
    width: Double,
    height: Double,
    sceneOrEngine: Nullable[typings.babylonjs.sceneMod.Scene | typings.babylonjs.thinEngineMod.ThinEngine],
    generateMipMaps: Boolean,
    invertY: Boolean,
    samplingMode: js.UndefOr[scala.Nothing],
    `type`: Double
  ): typings.babylonjs.rawTextureMod.RawTexture = js.native
  def CreateRTexture(
    data: ArrayBufferView,
    width: Double,
    height: Double,
    sceneOrEngine: Nullable[typings.babylonjs.sceneMod.Scene | typings.babylonjs.thinEngineMod.ThinEngine],
    generateMipMaps: Boolean,
    invertY: Boolean,
    samplingMode: Double
  ): typings.babylonjs.rawTextureMod.RawTexture = js.native
  def CreateRTexture(
    data: ArrayBufferView,
    width: Double,
    height: Double,
    sceneOrEngine: Nullable[typings.babylonjs.sceneMod.Scene | typings.babylonjs.thinEngineMod.ThinEngine],
    generateMipMaps: Boolean,
    invertY: Boolean,
    samplingMode: Double,
    `type`: Double
  ): typings.babylonjs.rawTextureMod.RawTexture = js.native
}
