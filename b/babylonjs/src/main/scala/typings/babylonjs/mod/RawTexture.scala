package typings.babylonjs.mod

import typings.babylonjs.typesMod.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs", "RawTexture")
@js.native
open class RawTexture protected ()
  extends typings.babylonjs.legacyLegacyMod.RawTexture {
  /**
    * Instantiates a new RawTexture.
    * Raw texture can help creating a texture directly from an array of data.
    * This can be super useful if you either get the data from an uncompressed source or
    * if you wish to create your texture pixel by pixel.
    * @param data define the array of data to use to create the texture (null to create an empty texture)
    * @param width define the width of the texture
    * @param height define the height of the texture
    * @param format define the format of the data (RGB, RGBA... Engine.TEXTUREFORMAT_xxx)
    * @param sceneOrEngine defines the scene or engine the texture will belong to
    * @param generateMipMaps define whether mip maps should be generated or not
    * @param invertY define if the data should be flipped on Y when uploaded to the GPU
    * @param samplingMode define the texture sampling mode (Texture.xxx_SAMPLINGMODE)
    * @param type define the format of the data (int, float... Engine.TEXTURETYPE_xxx)
    * @param creationFlags specific flags to use when creating the texture (Constants.TEXTURE_CREATIONFLAG_STORAGE for storage textures, for eg)
    * @param useSRGBBuffer defines if the texture must be loaded in a sRGB GPU buffer (if supported by the GPU).
    */
  def this(
    data: Nullable[js.typedarray.ArrayBufferView],
    width: Double,
    height: Double,
    /**
    * Define the format of the data (RGB, RGBA... Engine.TEXTUREFORMAT_xxx)
    */
  format: Double,
    sceneOrEngine: Nullable[
        typings.babylonjs.sceneMod.Scene | typings.babylonjs.enginesThinEngineMod.ThinEngine
      ],
    generateMipMaps: js.UndefOr[Boolean],
    invertY: js.UndefOr[Boolean],
    samplingMode: js.UndefOr[Double],
    `type`: js.UndefOr[Double],
    creationFlags: js.UndefOr[Double],
    useSRGBBuffer: js.UndefOr[Boolean]
  ) = this()
}
/* static members */
object RawTexture {
  
  @JSImport("babylonjs", "RawTexture")
  @js.native
  val ^ : js.Any = js.native
  
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
  inline def CreateAlphaTexture(
    data: Nullable[js.typedarray.ArrayBufferView],
    width: Double,
    height: Double,
    sceneOrEngine: Nullable[
      typings.babylonjs.sceneMod.Scene | typings.babylonjs.enginesThinEngineMod.ThinEngine
    ]
  ): typings.babylonjs.materialsTexturesRawTextureMod.RawTexture = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateAlphaTexture")(data.asInstanceOf[js.Any], width.asInstanceOf[js.Any], height.asInstanceOf[js.Any], sceneOrEngine.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.materialsTexturesRawTextureMod.RawTexture]
  inline def CreateAlphaTexture(
    data: Nullable[js.typedarray.ArrayBufferView],
    width: Double,
    height: Double,
    sceneOrEngine: Nullable[
      typings.babylonjs.sceneMod.Scene | typings.babylonjs.enginesThinEngineMod.ThinEngine
    ],
    generateMipMaps: Boolean
  ): typings.babylonjs.materialsTexturesRawTextureMod.RawTexture = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateAlphaTexture")(data.asInstanceOf[js.Any], width.asInstanceOf[js.Any], height.asInstanceOf[js.Any], sceneOrEngine.asInstanceOf[js.Any], generateMipMaps.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.materialsTexturesRawTextureMod.RawTexture]
  inline def CreateAlphaTexture(
    data: Nullable[js.typedarray.ArrayBufferView],
    width: Double,
    height: Double,
    sceneOrEngine: Nullable[
      typings.babylonjs.sceneMod.Scene | typings.babylonjs.enginesThinEngineMod.ThinEngine
    ],
    generateMipMaps: Boolean,
    invertY: Boolean
  ): typings.babylonjs.materialsTexturesRawTextureMod.RawTexture = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateAlphaTexture")(data.asInstanceOf[js.Any], width.asInstanceOf[js.Any], height.asInstanceOf[js.Any], sceneOrEngine.asInstanceOf[js.Any], generateMipMaps.asInstanceOf[js.Any], invertY.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.materialsTexturesRawTextureMod.RawTexture]
  inline def CreateAlphaTexture(
    data: Nullable[js.typedarray.ArrayBufferView],
    width: Double,
    height: Double,
    sceneOrEngine: Nullable[
      typings.babylonjs.sceneMod.Scene | typings.babylonjs.enginesThinEngineMod.ThinEngine
    ],
    generateMipMaps: Boolean,
    invertY: Boolean,
    samplingMode: Double
  ): typings.babylonjs.materialsTexturesRawTextureMod.RawTexture = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateAlphaTexture")(data.asInstanceOf[js.Any], width.asInstanceOf[js.Any], height.asInstanceOf[js.Any], sceneOrEngine.asInstanceOf[js.Any], generateMipMaps.asInstanceOf[js.Any], invertY.asInstanceOf[js.Any], samplingMode.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.materialsTexturesRawTextureMod.RawTexture]
  inline def CreateAlphaTexture(
    data: Nullable[js.typedarray.ArrayBufferView],
    width: Double,
    height: Double,
    sceneOrEngine: Nullable[
      typings.babylonjs.sceneMod.Scene | typings.babylonjs.enginesThinEngineMod.ThinEngine
    ],
    generateMipMaps: Boolean,
    invertY: Unit,
    samplingMode: Double
  ): typings.babylonjs.materialsTexturesRawTextureMod.RawTexture = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateAlphaTexture")(data.asInstanceOf[js.Any], width.asInstanceOf[js.Any], height.asInstanceOf[js.Any], sceneOrEngine.asInstanceOf[js.Any], generateMipMaps.asInstanceOf[js.Any], invertY.asInstanceOf[js.Any], samplingMode.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.materialsTexturesRawTextureMod.RawTexture]
  inline def CreateAlphaTexture(
    data: Nullable[js.typedarray.ArrayBufferView],
    width: Double,
    height: Double,
    sceneOrEngine: Nullable[
      typings.babylonjs.sceneMod.Scene | typings.babylonjs.enginesThinEngineMod.ThinEngine
    ],
    generateMipMaps: Unit,
    invertY: Boolean
  ): typings.babylonjs.materialsTexturesRawTextureMod.RawTexture = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateAlphaTexture")(data.asInstanceOf[js.Any], width.asInstanceOf[js.Any], height.asInstanceOf[js.Any], sceneOrEngine.asInstanceOf[js.Any], generateMipMaps.asInstanceOf[js.Any], invertY.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.materialsTexturesRawTextureMod.RawTexture]
  inline def CreateAlphaTexture(
    data: Nullable[js.typedarray.ArrayBufferView],
    width: Double,
    height: Double,
    sceneOrEngine: Nullable[
      typings.babylonjs.sceneMod.Scene | typings.babylonjs.enginesThinEngineMod.ThinEngine
    ],
    generateMipMaps: Unit,
    invertY: Boolean,
    samplingMode: Double
  ): typings.babylonjs.materialsTexturesRawTextureMod.RawTexture = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateAlphaTexture")(data.asInstanceOf[js.Any], width.asInstanceOf[js.Any], height.asInstanceOf[js.Any], sceneOrEngine.asInstanceOf[js.Any], generateMipMaps.asInstanceOf[js.Any], invertY.asInstanceOf[js.Any], samplingMode.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.materialsTexturesRawTextureMod.RawTexture]
  inline def CreateAlphaTexture(
    data: Nullable[js.typedarray.ArrayBufferView],
    width: Double,
    height: Double,
    sceneOrEngine: Nullable[
      typings.babylonjs.sceneMod.Scene | typings.babylonjs.enginesThinEngineMod.ThinEngine
    ],
    generateMipMaps: Unit,
    invertY: Unit,
    samplingMode: Double
  ): typings.babylonjs.materialsTexturesRawTextureMod.RawTexture = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateAlphaTexture")(data.asInstanceOf[js.Any], width.asInstanceOf[js.Any], height.asInstanceOf[js.Any], sceneOrEngine.asInstanceOf[js.Any], generateMipMaps.asInstanceOf[js.Any], invertY.asInstanceOf[js.Any], samplingMode.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.materialsTexturesRawTextureMod.RawTexture]
  
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
  inline def CreateLuminanceAlphaTexture(
    data: Nullable[js.typedarray.ArrayBufferView],
    width: Double,
    height: Double,
    sceneOrEngine: Nullable[
      typings.babylonjs.sceneMod.Scene | typings.babylonjs.enginesThinEngineMod.ThinEngine
    ]
  ): typings.babylonjs.materialsTexturesRawTextureMod.RawTexture = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateLuminanceAlphaTexture")(data.asInstanceOf[js.Any], width.asInstanceOf[js.Any], height.asInstanceOf[js.Any], sceneOrEngine.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.materialsTexturesRawTextureMod.RawTexture]
  inline def CreateLuminanceAlphaTexture(
    data: Nullable[js.typedarray.ArrayBufferView],
    width: Double,
    height: Double,
    sceneOrEngine: Nullable[
      typings.babylonjs.sceneMod.Scene | typings.babylonjs.enginesThinEngineMod.ThinEngine
    ],
    generateMipMaps: Boolean
  ): typings.babylonjs.materialsTexturesRawTextureMod.RawTexture = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateLuminanceAlphaTexture")(data.asInstanceOf[js.Any], width.asInstanceOf[js.Any], height.asInstanceOf[js.Any], sceneOrEngine.asInstanceOf[js.Any], generateMipMaps.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.materialsTexturesRawTextureMod.RawTexture]
  inline def CreateLuminanceAlphaTexture(
    data: Nullable[js.typedarray.ArrayBufferView],
    width: Double,
    height: Double,
    sceneOrEngine: Nullable[
      typings.babylonjs.sceneMod.Scene | typings.babylonjs.enginesThinEngineMod.ThinEngine
    ],
    generateMipMaps: Boolean,
    invertY: Boolean
  ): typings.babylonjs.materialsTexturesRawTextureMod.RawTexture = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateLuminanceAlphaTexture")(data.asInstanceOf[js.Any], width.asInstanceOf[js.Any], height.asInstanceOf[js.Any], sceneOrEngine.asInstanceOf[js.Any], generateMipMaps.asInstanceOf[js.Any], invertY.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.materialsTexturesRawTextureMod.RawTexture]
  inline def CreateLuminanceAlphaTexture(
    data: Nullable[js.typedarray.ArrayBufferView],
    width: Double,
    height: Double,
    sceneOrEngine: Nullable[
      typings.babylonjs.sceneMod.Scene | typings.babylonjs.enginesThinEngineMod.ThinEngine
    ],
    generateMipMaps: Boolean,
    invertY: Boolean,
    samplingMode: Double
  ): typings.babylonjs.materialsTexturesRawTextureMod.RawTexture = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateLuminanceAlphaTexture")(data.asInstanceOf[js.Any], width.asInstanceOf[js.Any], height.asInstanceOf[js.Any], sceneOrEngine.asInstanceOf[js.Any], generateMipMaps.asInstanceOf[js.Any], invertY.asInstanceOf[js.Any], samplingMode.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.materialsTexturesRawTextureMod.RawTexture]
  inline def CreateLuminanceAlphaTexture(
    data: Nullable[js.typedarray.ArrayBufferView],
    width: Double,
    height: Double,
    sceneOrEngine: Nullable[
      typings.babylonjs.sceneMod.Scene | typings.babylonjs.enginesThinEngineMod.ThinEngine
    ],
    generateMipMaps: Boolean,
    invertY: Unit,
    samplingMode: Double
  ): typings.babylonjs.materialsTexturesRawTextureMod.RawTexture = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateLuminanceAlphaTexture")(data.asInstanceOf[js.Any], width.asInstanceOf[js.Any], height.asInstanceOf[js.Any], sceneOrEngine.asInstanceOf[js.Any], generateMipMaps.asInstanceOf[js.Any], invertY.asInstanceOf[js.Any], samplingMode.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.materialsTexturesRawTextureMod.RawTexture]
  inline def CreateLuminanceAlphaTexture(
    data: Nullable[js.typedarray.ArrayBufferView],
    width: Double,
    height: Double,
    sceneOrEngine: Nullable[
      typings.babylonjs.sceneMod.Scene | typings.babylonjs.enginesThinEngineMod.ThinEngine
    ],
    generateMipMaps: Unit,
    invertY: Boolean
  ): typings.babylonjs.materialsTexturesRawTextureMod.RawTexture = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateLuminanceAlphaTexture")(data.asInstanceOf[js.Any], width.asInstanceOf[js.Any], height.asInstanceOf[js.Any], sceneOrEngine.asInstanceOf[js.Any], generateMipMaps.asInstanceOf[js.Any], invertY.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.materialsTexturesRawTextureMod.RawTexture]
  inline def CreateLuminanceAlphaTexture(
    data: Nullable[js.typedarray.ArrayBufferView],
    width: Double,
    height: Double,
    sceneOrEngine: Nullable[
      typings.babylonjs.sceneMod.Scene | typings.babylonjs.enginesThinEngineMod.ThinEngine
    ],
    generateMipMaps: Unit,
    invertY: Boolean,
    samplingMode: Double
  ): typings.babylonjs.materialsTexturesRawTextureMod.RawTexture = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateLuminanceAlphaTexture")(data.asInstanceOf[js.Any], width.asInstanceOf[js.Any], height.asInstanceOf[js.Any], sceneOrEngine.asInstanceOf[js.Any], generateMipMaps.asInstanceOf[js.Any], invertY.asInstanceOf[js.Any], samplingMode.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.materialsTexturesRawTextureMod.RawTexture]
  inline def CreateLuminanceAlphaTexture(
    data: Nullable[js.typedarray.ArrayBufferView],
    width: Double,
    height: Double,
    sceneOrEngine: Nullable[
      typings.babylonjs.sceneMod.Scene | typings.babylonjs.enginesThinEngineMod.ThinEngine
    ],
    generateMipMaps: Unit,
    invertY: Unit,
    samplingMode: Double
  ): typings.babylonjs.materialsTexturesRawTextureMod.RawTexture = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateLuminanceAlphaTexture")(data.asInstanceOf[js.Any], width.asInstanceOf[js.Any], height.asInstanceOf[js.Any], sceneOrEngine.asInstanceOf[js.Any], generateMipMaps.asInstanceOf[js.Any], invertY.asInstanceOf[js.Any], samplingMode.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.materialsTexturesRawTextureMod.RawTexture]
  
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
  inline def CreateLuminanceTexture(
    data: Nullable[js.typedarray.ArrayBufferView],
    width: Double,
    height: Double,
    sceneOrEngine: Nullable[
      typings.babylonjs.sceneMod.Scene | typings.babylonjs.enginesThinEngineMod.ThinEngine
    ]
  ): typings.babylonjs.materialsTexturesRawTextureMod.RawTexture = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateLuminanceTexture")(data.asInstanceOf[js.Any], width.asInstanceOf[js.Any], height.asInstanceOf[js.Any], sceneOrEngine.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.materialsTexturesRawTextureMod.RawTexture]
  inline def CreateLuminanceTexture(
    data: Nullable[js.typedarray.ArrayBufferView],
    width: Double,
    height: Double,
    sceneOrEngine: Nullable[
      typings.babylonjs.sceneMod.Scene | typings.babylonjs.enginesThinEngineMod.ThinEngine
    ],
    generateMipMaps: Boolean
  ): typings.babylonjs.materialsTexturesRawTextureMod.RawTexture = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateLuminanceTexture")(data.asInstanceOf[js.Any], width.asInstanceOf[js.Any], height.asInstanceOf[js.Any], sceneOrEngine.asInstanceOf[js.Any], generateMipMaps.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.materialsTexturesRawTextureMod.RawTexture]
  inline def CreateLuminanceTexture(
    data: Nullable[js.typedarray.ArrayBufferView],
    width: Double,
    height: Double,
    sceneOrEngine: Nullable[
      typings.babylonjs.sceneMod.Scene | typings.babylonjs.enginesThinEngineMod.ThinEngine
    ],
    generateMipMaps: Boolean,
    invertY: Boolean
  ): typings.babylonjs.materialsTexturesRawTextureMod.RawTexture = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateLuminanceTexture")(data.asInstanceOf[js.Any], width.asInstanceOf[js.Any], height.asInstanceOf[js.Any], sceneOrEngine.asInstanceOf[js.Any], generateMipMaps.asInstanceOf[js.Any], invertY.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.materialsTexturesRawTextureMod.RawTexture]
  inline def CreateLuminanceTexture(
    data: Nullable[js.typedarray.ArrayBufferView],
    width: Double,
    height: Double,
    sceneOrEngine: Nullable[
      typings.babylonjs.sceneMod.Scene | typings.babylonjs.enginesThinEngineMod.ThinEngine
    ],
    generateMipMaps: Boolean,
    invertY: Boolean,
    samplingMode: Double
  ): typings.babylonjs.materialsTexturesRawTextureMod.RawTexture = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateLuminanceTexture")(data.asInstanceOf[js.Any], width.asInstanceOf[js.Any], height.asInstanceOf[js.Any], sceneOrEngine.asInstanceOf[js.Any], generateMipMaps.asInstanceOf[js.Any], invertY.asInstanceOf[js.Any], samplingMode.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.materialsTexturesRawTextureMod.RawTexture]
  inline def CreateLuminanceTexture(
    data: Nullable[js.typedarray.ArrayBufferView],
    width: Double,
    height: Double,
    sceneOrEngine: Nullable[
      typings.babylonjs.sceneMod.Scene | typings.babylonjs.enginesThinEngineMod.ThinEngine
    ],
    generateMipMaps: Boolean,
    invertY: Unit,
    samplingMode: Double
  ): typings.babylonjs.materialsTexturesRawTextureMod.RawTexture = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateLuminanceTexture")(data.asInstanceOf[js.Any], width.asInstanceOf[js.Any], height.asInstanceOf[js.Any], sceneOrEngine.asInstanceOf[js.Any], generateMipMaps.asInstanceOf[js.Any], invertY.asInstanceOf[js.Any], samplingMode.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.materialsTexturesRawTextureMod.RawTexture]
  inline def CreateLuminanceTexture(
    data: Nullable[js.typedarray.ArrayBufferView],
    width: Double,
    height: Double,
    sceneOrEngine: Nullable[
      typings.babylonjs.sceneMod.Scene | typings.babylonjs.enginesThinEngineMod.ThinEngine
    ],
    generateMipMaps: Unit,
    invertY: Boolean
  ): typings.babylonjs.materialsTexturesRawTextureMod.RawTexture = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateLuminanceTexture")(data.asInstanceOf[js.Any], width.asInstanceOf[js.Any], height.asInstanceOf[js.Any], sceneOrEngine.asInstanceOf[js.Any], generateMipMaps.asInstanceOf[js.Any], invertY.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.materialsTexturesRawTextureMod.RawTexture]
  inline def CreateLuminanceTexture(
    data: Nullable[js.typedarray.ArrayBufferView],
    width: Double,
    height: Double,
    sceneOrEngine: Nullable[
      typings.babylonjs.sceneMod.Scene | typings.babylonjs.enginesThinEngineMod.ThinEngine
    ],
    generateMipMaps: Unit,
    invertY: Boolean,
    samplingMode: Double
  ): typings.babylonjs.materialsTexturesRawTextureMod.RawTexture = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateLuminanceTexture")(data.asInstanceOf[js.Any], width.asInstanceOf[js.Any], height.asInstanceOf[js.Any], sceneOrEngine.asInstanceOf[js.Any], generateMipMaps.asInstanceOf[js.Any], invertY.asInstanceOf[js.Any], samplingMode.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.materialsTexturesRawTextureMod.RawTexture]
  inline def CreateLuminanceTexture(
    data: Nullable[js.typedarray.ArrayBufferView],
    width: Double,
    height: Double,
    sceneOrEngine: Nullable[
      typings.babylonjs.sceneMod.Scene | typings.babylonjs.enginesThinEngineMod.ThinEngine
    ],
    generateMipMaps: Unit,
    invertY: Unit,
    samplingMode: Double
  ): typings.babylonjs.materialsTexturesRawTextureMod.RawTexture = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateLuminanceTexture")(data.asInstanceOf[js.Any], width.asInstanceOf[js.Any], height.asInstanceOf[js.Any], sceneOrEngine.asInstanceOf[js.Any], generateMipMaps.asInstanceOf[js.Any], invertY.asInstanceOf[js.Any], samplingMode.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.materialsTexturesRawTextureMod.RawTexture]
  
  /**
    * Creates a RGBA storage texture from some data.
    * @param data Define the texture data
    * @param width Define the width of the texture
    * @param height Define the height of the texture
    * @param sceneOrEngine defines the scene or engine the texture will belong to
    * @param generateMipMaps Define whether or not to create mip maps for the texture
    * @param invertY define if the data should be flipped on Y when uploaded to the GPU
    * @param samplingMode define the texture sampling mode (Texture.xxx_SAMPLINGMODE)
    * @param type define the format of the data (int, float... Engine.TEXTURETYPE_xxx)
    * @param useSRGBBuffer defines if the texture must be loaded in a sRGB GPU buffer (if supported by the GPU).
    * @returns the RGBA texture
    */
  inline def CreateRGBAStorageTexture(
    data: Nullable[js.typedarray.ArrayBufferView],
    width: Double,
    height: Double,
    sceneOrEngine: Nullable[
      typings.babylonjs.sceneMod.Scene | typings.babylonjs.enginesThinEngineMod.ThinEngine
    ]
  ): typings.babylonjs.materialsTexturesRawTextureMod.RawTexture = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateRGBAStorageTexture")(data.asInstanceOf[js.Any], width.asInstanceOf[js.Any], height.asInstanceOf[js.Any], sceneOrEngine.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.materialsTexturesRawTextureMod.RawTexture]
  inline def CreateRGBAStorageTexture(
    data: Nullable[js.typedarray.ArrayBufferView],
    width: Double,
    height: Double,
    sceneOrEngine: Nullable[
      typings.babylonjs.sceneMod.Scene | typings.babylonjs.enginesThinEngineMod.ThinEngine
    ],
    generateMipMaps: Boolean
  ): typings.babylonjs.materialsTexturesRawTextureMod.RawTexture = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateRGBAStorageTexture")(data.asInstanceOf[js.Any], width.asInstanceOf[js.Any], height.asInstanceOf[js.Any], sceneOrEngine.asInstanceOf[js.Any], generateMipMaps.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.materialsTexturesRawTextureMod.RawTexture]
  inline def CreateRGBAStorageTexture(
    data: Nullable[js.typedarray.ArrayBufferView],
    width: Double,
    height: Double,
    sceneOrEngine: Nullable[
      typings.babylonjs.sceneMod.Scene | typings.babylonjs.enginesThinEngineMod.ThinEngine
    ],
    generateMipMaps: Boolean,
    invertY: Boolean
  ): typings.babylonjs.materialsTexturesRawTextureMod.RawTexture = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateRGBAStorageTexture")(data.asInstanceOf[js.Any], width.asInstanceOf[js.Any], height.asInstanceOf[js.Any], sceneOrEngine.asInstanceOf[js.Any], generateMipMaps.asInstanceOf[js.Any], invertY.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.materialsTexturesRawTextureMod.RawTexture]
  inline def CreateRGBAStorageTexture(
    data: Nullable[js.typedarray.ArrayBufferView],
    width: Double,
    height: Double,
    sceneOrEngine: Nullable[
      typings.babylonjs.sceneMod.Scene | typings.babylonjs.enginesThinEngineMod.ThinEngine
    ],
    generateMipMaps: Boolean,
    invertY: Boolean,
    samplingMode: Double
  ): typings.babylonjs.materialsTexturesRawTextureMod.RawTexture = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateRGBAStorageTexture")(data.asInstanceOf[js.Any], width.asInstanceOf[js.Any], height.asInstanceOf[js.Any], sceneOrEngine.asInstanceOf[js.Any], generateMipMaps.asInstanceOf[js.Any], invertY.asInstanceOf[js.Any], samplingMode.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.materialsTexturesRawTextureMod.RawTexture]
  inline def CreateRGBAStorageTexture(
    data: Nullable[js.typedarray.ArrayBufferView],
    width: Double,
    height: Double,
    sceneOrEngine: Nullable[
      typings.babylonjs.sceneMod.Scene | typings.babylonjs.enginesThinEngineMod.ThinEngine
    ],
    generateMipMaps: Boolean,
    invertY: Boolean,
    samplingMode: Double,
    `type`: Double
  ): typings.babylonjs.materialsTexturesRawTextureMod.RawTexture = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateRGBAStorageTexture")(data.asInstanceOf[js.Any], width.asInstanceOf[js.Any], height.asInstanceOf[js.Any], sceneOrEngine.asInstanceOf[js.Any], generateMipMaps.asInstanceOf[js.Any], invertY.asInstanceOf[js.Any], samplingMode.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.materialsTexturesRawTextureMod.RawTexture]
  inline def CreateRGBAStorageTexture(
    data: Nullable[js.typedarray.ArrayBufferView],
    width: Double,
    height: Double,
    sceneOrEngine: Nullable[
      typings.babylonjs.sceneMod.Scene | typings.babylonjs.enginesThinEngineMod.ThinEngine
    ],
    generateMipMaps: Boolean,
    invertY: Boolean,
    samplingMode: Double,
    `type`: Double,
    useSRGBBuffer: Boolean
  ): typings.babylonjs.materialsTexturesRawTextureMod.RawTexture = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateRGBAStorageTexture")(data.asInstanceOf[js.Any], width.asInstanceOf[js.Any], height.asInstanceOf[js.Any], sceneOrEngine.asInstanceOf[js.Any], generateMipMaps.asInstanceOf[js.Any], invertY.asInstanceOf[js.Any], samplingMode.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], useSRGBBuffer.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.materialsTexturesRawTextureMod.RawTexture]
  inline def CreateRGBAStorageTexture(
    data: Nullable[js.typedarray.ArrayBufferView],
    width: Double,
    height: Double,
    sceneOrEngine: Nullable[
      typings.babylonjs.sceneMod.Scene | typings.babylonjs.enginesThinEngineMod.ThinEngine
    ],
    generateMipMaps: Boolean,
    invertY: Boolean,
    samplingMode: Double,
    `type`: Unit,
    useSRGBBuffer: Boolean
  ): typings.babylonjs.materialsTexturesRawTextureMod.RawTexture = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateRGBAStorageTexture")(data.asInstanceOf[js.Any], width.asInstanceOf[js.Any], height.asInstanceOf[js.Any], sceneOrEngine.asInstanceOf[js.Any], generateMipMaps.asInstanceOf[js.Any], invertY.asInstanceOf[js.Any], samplingMode.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], useSRGBBuffer.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.materialsTexturesRawTextureMod.RawTexture]
  inline def CreateRGBAStorageTexture(
    data: Nullable[js.typedarray.ArrayBufferView],
    width: Double,
    height: Double,
    sceneOrEngine: Nullable[
      typings.babylonjs.sceneMod.Scene | typings.babylonjs.enginesThinEngineMod.ThinEngine
    ],
    generateMipMaps: Boolean,
    invertY: Boolean,
    samplingMode: Unit,
    `type`: Double
  ): typings.babylonjs.materialsTexturesRawTextureMod.RawTexture = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateRGBAStorageTexture")(data.asInstanceOf[js.Any], width.asInstanceOf[js.Any], height.asInstanceOf[js.Any], sceneOrEngine.asInstanceOf[js.Any], generateMipMaps.asInstanceOf[js.Any], invertY.asInstanceOf[js.Any], samplingMode.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.materialsTexturesRawTextureMod.RawTexture]
  inline def CreateRGBAStorageTexture(
    data: Nullable[js.typedarray.ArrayBufferView],
    width: Double,
    height: Double,
    sceneOrEngine: Nullable[
      typings.babylonjs.sceneMod.Scene | typings.babylonjs.enginesThinEngineMod.ThinEngine
    ],
    generateMipMaps: Boolean,
    invertY: Boolean,
    samplingMode: Unit,
    `type`: Double,
    useSRGBBuffer: Boolean
  ): typings.babylonjs.materialsTexturesRawTextureMod.RawTexture = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateRGBAStorageTexture")(data.asInstanceOf[js.Any], width.asInstanceOf[js.Any], height.asInstanceOf[js.Any], sceneOrEngine.asInstanceOf[js.Any], generateMipMaps.asInstanceOf[js.Any], invertY.asInstanceOf[js.Any], samplingMode.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], useSRGBBuffer.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.materialsTexturesRawTextureMod.RawTexture]
  inline def CreateRGBAStorageTexture(
    data: Nullable[js.typedarray.ArrayBufferView],
    width: Double,
    height: Double,
    sceneOrEngine: Nullable[
      typings.babylonjs.sceneMod.Scene | typings.babylonjs.enginesThinEngineMod.ThinEngine
    ],
    generateMipMaps: Boolean,
    invertY: Boolean,
    samplingMode: Unit,
    `type`: Unit,
    useSRGBBuffer: Boolean
  ): typings.babylonjs.materialsTexturesRawTextureMod.RawTexture = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateRGBAStorageTexture")(data.asInstanceOf[js.Any], width.asInstanceOf[js.Any], height.asInstanceOf[js.Any], sceneOrEngine.asInstanceOf[js.Any], generateMipMaps.asInstanceOf[js.Any], invertY.asInstanceOf[js.Any], samplingMode.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], useSRGBBuffer.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.materialsTexturesRawTextureMod.RawTexture]
  inline def CreateRGBAStorageTexture(
    data: Nullable[js.typedarray.ArrayBufferView],
    width: Double,
    height: Double,
    sceneOrEngine: Nullable[
      typings.babylonjs.sceneMod.Scene | typings.babylonjs.enginesThinEngineMod.ThinEngine
    ],
    generateMipMaps: Boolean,
    invertY: Unit,
    samplingMode: Double
  ): typings.babylonjs.materialsTexturesRawTextureMod.RawTexture = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateRGBAStorageTexture")(data.asInstanceOf[js.Any], width.asInstanceOf[js.Any], height.asInstanceOf[js.Any], sceneOrEngine.asInstanceOf[js.Any], generateMipMaps.asInstanceOf[js.Any], invertY.asInstanceOf[js.Any], samplingMode.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.materialsTexturesRawTextureMod.RawTexture]
  inline def CreateRGBAStorageTexture(
    data: Nullable[js.typedarray.ArrayBufferView],
    width: Double,
    height: Double,
    sceneOrEngine: Nullable[
      typings.babylonjs.sceneMod.Scene | typings.babylonjs.enginesThinEngineMod.ThinEngine
    ],
    generateMipMaps: Boolean,
    invertY: Unit,
    samplingMode: Double,
    `type`: Double
  ): typings.babylonjs.materialsTexturesRawTextureMod.RawTexture = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateRGBAStorageTexture")(data.asInstanceOf[js.Any], width.asInstanceOf[js.Any], height.asInstanceOf[js.Any], sceneOrEngine.asInstanceOf[js.Any], generateMipMaps.asInstanceOf[js.Any], invertY.asInstanceOf[js.Any], samplingMode.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.materialsTexturesRawTextureMod.RawTexture]
  inline def CreateRGBAStorageTexture(
    data: Nullable[js.typedarray.ArrayBufferView],
    width: Double,
    height: Double,
    sceneOrEngine: Nullable[
      typings.babylonjs.sceneMod.Scene | typings.babylonjs.enginesThinEngineMod.ThinEngine
    ],
    generateMipMaps: Boolean,
    invertY: Unit,
    samplingMode: Double,
    `type`: Double,
    useSRGBBuffer: Boolean
  ): typings.babylonjs.materialsTexturesRawTextureMod.RawTexture = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateRGBAStorageTexture")(data.asInstanceOf[js.Any], width.asInstanceOf[js.Any], height.asInstanceOf[js.Any], sceneOrEngine.asInstanceOf[js.Any], generateMipMaps.asInstanceOf[js.Any], invertY.asInstanceOf[js.Any], samplingMode.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], useSRGBBuffer.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.materialsTexturesRawTextureMod.RawTexture]
  inline def CreateRGBAStorageTexture(
    data: Nullable[js.typedarray.ArrayBufferView],
    width: Double,
    height: Double,
    sceneOrEngine: Nullable[
      typings.babylonjs.sceneMod.Scene | typings.babylonjs.enginesThinEngineMod.ThinEngine
    ],
    generateMipMaps: Boolean,
    invertY: Unit,
    samplingMode: Double,
    `type`: Unit,
    useSRGBBuffer: Boolean
  ): typings.babylonjs.materialsTexturesRawTextureMod.RawTexture = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateRGBAStorageTexture")(data.asInstanceOf[js.Any], width.asInstanceOf[js.Any], height.asInstanceOf[js.Any], sceneOrEngine.asInstanceOf[js.Any], generateMipMaps.asInstanceOf[js.Any], invertY.asInstanceOf[js.Any], samplingMode.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], useSRGBBuffer.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.materialsTexturesRawTextureMod.RawTexture]
  inline def CreateRGBAStorageTexture(
    data: Nullable[js.typedarray.ArrayBufferView],
    width: Double,
    height: Double,
    sceneOrEngine: Nullable[
      typings.babylonjs.sceneMod.Scene | typings.babylonjs.enginesThinEngineMod.ThinEngine
    ],
    generateMipMaps: Boolean,
    invertY: Unit,
    samplingMode: Unit,
    `type`: Double
  ): typings.babylonjs.materialsTexturesRawTextureMod.RawTexture = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateRGBAStorageTexture")(data.asInstanceOf[js.Any], width.asInstanceOf[js.Any], height.asInstanceOf[js.Any], sceneOrEngine.asInstanceOf[js.Any], generateMipMaps.asInstanceOf[js.Any], invertY.asInstanceOf[js.Any], samplingMode.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.materialsTexturesRawTextureMod.RawTexture]
  inline def CreateRGBAStorageTexture(
    data: Nullable[js.typedarray.ArrayBufferView],
    width: Double,
    height: Double,
    sceneOrEngine: Nullable[
      typings.babylonjs.sceneMod.Scene | typings.babylonjs.enginesThinEngineMod.ThinEngine
    ],
    generateMipMaps: Boolean,
    invertY: Unit,
    samplingMode: Unit,
    `type`: Double,
    useSRGBBuffer: Boolean
  ): typings.babylonjs.materialsTexturesRawTextureMod.RawTexture = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateRGBAStorageTexture")(data.asInstanceOf[js.Any], width.asInstanceOf[js.Any], height.asInstanceOf[js.Any], sceneOrEngine.asInstanceOf[js.Any], generateMipMaps.asInstanceOf[js.Any], invertY.asInstanceOf[js.Any], samplingMode.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], useSRGBBuffer.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.materialsTexturesRawTextureMod.RawTexture]
  inline def CreateRGBAStorageTexture(
    data: Nullable[js.typedarray.ArrayBufferView],
    width: Double,
    height: Double,
    sceneOrEngine: Nullable[
      typings.babylonjs.sceneMod.Scene | typings.babylonjs.enginesThinEngineMod.ThinEngine
    ],
    generateMipMaps: Boolean,
    invertY: Unit,
    samplingMode: Unit,
    `type`: Unit,
    useSRGBBuffer: Boolean
  ): typings.babylonjs.materialsTexturesRawTextureMod.RawTexture = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateRGBAStorageTexture")(data.asInstanceOf[js.Any], width.asInstanceOf[js.Any], height.asInstanceOf[js.Any], sceneOrEngine.asInstanceOf[js.Any], generateMipMaps.asInstanceOf[js.Any], invertY.asInstanceOf[js.Any], samplingMode.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], useSRGBBuffer.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.materialsTexturesRawTextureMod.RawTexture]
  inline def CreateRGBAStorageTexture(
    data: Nullable[js.typedarray.ArrayBufferView],
    width: Double,
    height: Double,
    sceneOrEngine: Nullable[
      typings.babylonjs.sceneMod.Scene | typings.babylonjs.enginesThinEngineMod.ThinEngine
    ],
    generateMipMaps: Unit,
    invertY: Boolean
  ): typings.babylonjs.materialsTexturesRawTextureMod.RawTexture = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateRGBAStorageTexture")(data.asInstanceOf[js.Any], width.asInstanceOf[js.Any], height.asInstanceOf[js.Any], sceneOrEngine.asInstanceOf[js.Any], generateMipMaps.asInstanceOf[js.Any], invertY.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.materialsTexturesRawTextureMod.RawTexture]
  inline def CreateRGBAStorageTexture(
    data: Nullable[js.typedarray.ArrayBufferView],
    width: Double,
    height: Double,
    sceneOrEngine: Nullable[
      typings.babylonjs.sceneMod.Scene | typings.babylonjs.enginesThinEngineMod.ThinEngine
    ],
    generateMipMaps: Unit,
    invertY: Boolean,
    samplingMode: Double
  ): typings.babylonjs.materialsTexturesRawTextureMod.RawTexture = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateRGBAStorageTexture")(data.asInstanceOf[js.Any], width.asInstanceOf[js.Any], height.asInstanceOf[js.Any], sceneOrEngine.asInstanceOf[js.Any], generateMipMaps.asInstanceOf[js.Any], invertY.asInstanceOf[js.Any], samplingMode.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.materialsTexturesRawTextureMod.RawTexture]
  inline def CreateRGBAStorageTexture(
    data: Nullable[js.typedarray.ArrayBufferView],
    width: Double,
    height: Double,
    sceneOrEngine: Nullable[
      typings.babylonjs.sceneMod.Scene | typings.babylonjs.enginesThinEngineMod.ThinEngine
    ],
    generateMipMaps: Unit,
    invertY: Boolean,
    samplingMode: Double,
    `type`: Double
  ): typings.babylonjs.materialsTexturesRawTextureMod.RawTexture = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateRGBAStorageTexture")(data.asInstanceOf[js.Any], width.asInstanceOf[js.Any], height.asInstanceOf[js.Any], sceneOrEngine.asInstanceOf[js.Any], generateMipMaps.asInstanceOf[js.Any], invertY.asInstanceOf[js.Any], samplingMode.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.materialsTexturesRawTextureMod.RawTexture]
  inline def CreateRGBAStorageTexture(
    data: Nullable[js.typedarray.ArrayBufferView],
    width: Double,
    height: Double,
    sceneOrEngine: Nullable[
      typings.babylonjs.sceneMod.Scene | typings.babylonjs.enginesThinEngineMod.ThinEngine
    ],
    generateMipMaps: Unit,
    invertY: Boolean,
    samplingMode: Double,
    `type`: Double,
    useSRGBBuffer: Boolean
  ): typings.babylonjs.materialsTexturesRawTextureMod.RawTexture = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateRGBAStorageTexture")(data.asInstanceOf[js.Any], width.asInstanceOf[js.Any], height.asInstanceOf[js.Any], sceneOrEngine.asInstanceOf[js.Any], generateMipMaps.asInstanceOf[js.Any], invertY.asInstanceOf[js.Any], samplingMode.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], useSRGBBuffer.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.materialsTexturesRawTextureMod.RawTexture]
  inline def CreateRGBAStorageTexture(
    data: Nullable[js.typedarray.ArrayBufferView],
    width: Double,
    height: Double,
    sceneOrEngine: Nullable[
      typings.babylonjs.sceneMod.Scene | typings.babylonjs.enginesThinEngineMod.ThinEngine
    ],
    generateMipMaps: Unit,
    invertY: Boolean,
    samplingMode: Double,
    `type`: Unit,
    useSRGBBuffer: Boolean
  ): typings.babylonjs.materialsTexturesRawTextureMod.RawTexture = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateRGBAStorageTexture")(data.asInstanceOf[js.Any], width.asInstanceOf[js.Any], height.asInstanceOf[js.Any], sceneOrEngine.asInstanceOf[js.Any], generateMipMaps.asInstanceOf[js.Any], invertY.asInstanceOf[js.Any], samplingMode.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], useSRGBBuffer.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.materialsTexturesRawTextureMod.RawTexture]
  inline def CreateRGBAStorageTexture(
    data: Nullable[js.typedarray.ArrayBufferView],
    width: Double,
    height: Double,
    sceneOrEngine: Nullable[
      typings.babylonjs.sceneMod.Scene | typings.babylonjs.enginesThinEngineMod.ThinEngine
    ],
    generateMipMaps: Unit,
    invertY: Boolean,
    samplingMode: Unit,
    `type`: Double
  ): typings.babylonjs.materialsTexturesRawTextureMod.RawTexture = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateRGBAStorageTexture")(data.asInstanceOf[js.Any], width.asInstanceOf[js.Any], height.asInstanceOf[js.Any], sceneOrEngine.asInstanceOf[js.Any], generateMipMaps.asInstanceOf[js.Any], invertY.asInstanceOf[js.Any], samplingMode.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.materialsTexturesRawTextureMod.RawTexture]
  inline def CreateRGBAStorageTexture(
    data: Nullable[js.typedarray.ArrayBufferView],
    width: Double,
    height: Double,
    sceneOrEngine: Nullable[
      typings.babylonjs.sceneMod.Scene | typings.babylonjs.enginesThinEngineMod.ThinEngine
    ],
    generateMipMaps: Unit,
    invertY: Boolean,
    samplingMode: Unit,
    `type`: Double,
    useSRGBBuffer: Boolean
  ): typings.babylonjs.materialsTexturesRawTextureMod.RawTexture = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateRGBAStorageTexture")(data.asInstanceOf[js.Any], width.asInstanceOf[js.Any], height.asInstanceOf[js.Any], sceneOrEngine.asInstanceOf[js.Any], generateMipMaps.asInstanceOf[js.Any], invertY.asInstanceOf[js.Any], samplingMode.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], useSRGBBuffer.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.materialsTexturesRawTextureMod.RawTexture]
  inline def CreateRGBAStorageTexture(
    data: Nullable[js.typedarray.ArrayBufferView],
    width: Double,
    height: Double,
    sceneOrEngine: Nullable[
      typings.babylonjs.sceneMod.Scene | typings.babylonjs.enginesThinEngineMod.ThinEngine
    ],
    generateMipMaps: Unit,
    invertY: Boolean,
    samplingMode: Unit,
    `type`: Unit,
    useSRGBBuffer: Boolean
  ): typings.babylonjs.materialsTexturesRawTextureMod.RawTexture = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateRGBAStorageTexture")(data.asInstanceOf[js.Any], width.asInstanceOf[js.Any], height.asInstanceOf[js.Any], sceneOrEngine.asInstanceOf[js.Any], generateMipMaps.asInstanceOf[js.Any], invertY.asInstanceOf[js.Any], samplingMode.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], useSRGBBuffer.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.materialsTexturesRawTextureMod.RawTexture]
  inline def CreateRGBAStorageTexture(
    data: Nullable[js.typedarray.ArrayBufferView],
    width: Double,
    height: Double,
    sceneOrEngine: Nullable[
      typings.babylonjs.sceneMod.Scene | typings.babylonjs.enginesThinEngineMod.ThinEngine
    ],
    generateMipMaps: Unit,
    invertY: Unit,
    samplingMode: Double
  ): typings.babylonjs.materialsTexturesRawTextureMod.RawTexture = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateRGBAStorageTexture")(data.asInstanceOf[js.Any], width.asInstanceOf[js.Any], height.asInstanceOf[js.Any], sceneOrEngine.asInstanceOf[js.Any], generateMipMaps.asInstanceOf[js.Any], invertY.asInstanceOf[js.Any], samplingMode.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.materialsTexturesRawTextureMod.RawTexture]
  inline def CreateRGBAStorageTexture(
    data: Nullable[js.typedarray.ArrayBufferView],
    width: Double,
    height: Double,
    sceneOrEngine: Nullable[
      typings.babylonjs.sceneMod.Scene | typings.babylonjs.enginesThinEngineMod.ThinEngine
    ],
    generateMipMaps: Unit,
    invertY: Unit,
    samplingMode: Double,
    `type`: Double
  ): typings.babylonjs.materialsTexturesRawTextureMod.RawTexture = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateRGBAStorageTexture")(data.asInstanceOf[js.Any], width.asInstanceOf[js.Any], height.asInstanceOf[js.Any], sceneOrEngine.asInstanceOf[js.Any], generateMipMaps.asInstanceOf[js.Any], invertY.asInstanceOf[js.Any], samplingMode.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.materialsTexturesRawTextureMod.RawTexture]
  inline def CreateRGBAStorageTexture(
    data: Nullable[js.typedarray.ArrayBufferView],
    width: Double,
    height: Double,
    sceneOrEngine: Nullable[
      typings.babylonjs.sceneMod.Scene | typings.babylonjs.enginesThinEngineMod.ThinEngine
    ],
    generateMipMaps: Unit,
    invertY: Unit,
    samplingMode: Double,
    `type`: Double,
    useSRGBBuffer: Boolean
  ): typings.babylonjs.materialsTexturesRawTextureMod.RawTexture = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateRGBAStorageTexture")(data.asInstanceOf[js.Any], width.asInstanceOf[js.Any], height.asInstanceOf[js.Any], sceneOrEngine.asInstanceOf[js.Any], generateMipMaps.asInstanceOf[js.Any], invertY.asInstanceOf[js.Any], samplingMode.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], useSRGBBuffer.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.materialsTexturesRawTextureMod.RawTexture]
  inline def CreateRGBAStorageTexture(
    data: Nullable[js.typedarray.ArrayBufferView],
    width: Double,
    height: Double,
    sceneOrEngine: Nullable[
      typings.babylonjs.sceneMod.Scene | typings.babylonjs.enginesThinEngineMod.ThinEngine
    ],
    generateMipMaps: Unit,
    invertY: Unit,
    samplingMode: Double,
    `type`: Unit,
    useSRGBBuffer: Boolean
  ): typings.babylonjs.materialsTexturesRawTextureMod.RawTexture = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateRGBAStorageTexture")(data.asInstanceOf[js.Any], width.asInstanceOf[js.Any], height.asInstanceOf[js.Any], sceneOrEngine.asInstanceOf[js.Any], generateMipMaps.asInstanceOf[js.Any], invertY.asInstanceOf[js.Any], samplingMode.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], useSRGBBuffer.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.materialsTexturesRawTextureMod.RawTexture]
  inline def CreateRGBAStorageTexture(
    data: Nullable[js.typedarray.ArrayBufferView],
    width: Double,
    height: Double,
    sceneOrEngine: Nullable[
      typings.babylonjs.sceneMod.Scene | typings.babylonjs.enginesThinEngineMod.ThinEngine
    ],
    generateMipMaps: Unit,
    invertY: Unit,
    samplingMode: Unit,
    `type`: Double
  ): typings.babylonjs.materialsTexturesRawTextureMod.RawTexture = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateRGBAStorageTexture")(data.asInstanceOf[js.Any], width.asInstanceOf[js.Any], height.asInstanceOf[js.Any], sceneOrEngine.asInstanceOf[js.Any], generateMipMaps.asInstanceOf[js.Any], invertY.asInstanceOf[js.Any], samplingMode.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.materialsTexturesRawTextureMod.RawTexture]
  inline def CreateRGBAStorageTexture(
    data: Nullable[js.typedarray.ArrayBufferView],
    width: Double,
    height: Double,
    sceneOrEngine: Nullable[
      typings.babylonjs.sceneMod.Scene | typings.babylonjs.enginesThinEngineMod.ThinEngine
    ],
    generateMipMaps: Unit,
    invertY: Unit,
    samplingMode: Unit,
    `type`: Double,
    useSRGBBuffer: Boolean
  ): typings.babylonjs.materialsTexturesRawTextureMod.RawTexture = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateRGBAStorageTexture")(data.asInstanceOf[js.Any], width.asInstanceOf[js.Any], height.asInstanceOf[js.Any], sceneOrEngine.asInstanceOf[js.Any], generateMipMaps.asInstanceOf[js.Any], invertY.asInstanceOf[js.Any], samplingMode.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], useSRGBBuffer.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.materialsTexturesRawTextureMod.RawTexture]
  inline def CreateRGBAStorageTexture(
    data: Nullable[js.typedarray.ArrayBufferView],
    width: Double,
    height: Double,
    sceneOrEngine: Nullable[
      typings.babylonjs.sceneMod.Scene | typings.babylonjs.enginesThinEngineMod.ThinEngine
    ],
    generateMipMaps: Unit,
    invertY: Unit,
    samplingMode: Unit,
    `type`: Unit,
    useSRGBBuffer: Boolean
  ): typings.babylonjs.materialsTexturesRawTextureMod.RawTexture = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateRGBAStorageTexture")(data.asInstanceOf[js.Any], width.asInstanceOf[js.Any], height.asInstanceOf[js.Any], sceneOrEngine.asInstanceOf[js.Any], generateMipMaps.asInstanceOf[js.Any], invertY.asInstanceOf[js.Any], samplingMode.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], useSRGBBuffer.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.materialsTexturesRawTextureMod.RawTexture]
  
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
    * @param creationFlags specific flags to use when creating the texture (Constants.TEXTURE_CREATIONFLAG_STORAGE for storage textures, for eg)
    * @param useSRGBBuffer defines if the texture must be loaded in a sRGB GPU buffer (if supported by the GPU).
    * @returns the RGBA texture
    */
  inline def CreateRGBATexture(
    data: Nullable[js.typedarray.ArrayBufferView],
    width: Double,
    height: Double,
    sceneOrEngine: Nullable[
      typings.babylonjs.sceneMod.Scene | typings.babylonjs.enginesThinEngineMod.ThinEngine
    ],
    generateMipMaps: js.UndefOr[Boolean],
    invertY: js.UndefOr[Boolean],
    samplingMode: js.UndefOr[Double],
    `type`: js.UndefOr[Double],
    creationFlags: js.UndefOr[Double],
    useSRGBBuffer: js.UndefOr[Boolean]
  ): typings.babylonjs.materialsTexturesRawTextureMod.RawTexture = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateRGBATexture")(data.asInstanceOf[js.Any], width.asInstanceOf[js.Any], height.asInstanceOf[js.Any], sceneOrEngine.asInstanceOf[js.Any], generateMipMaps.asInstanceOf[js.Any], invertY.asInstanceOf[js.Any], samplingMode.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], creationFlags.asInstanceOf[js.Any], useSRGBBuffer.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.materialsTexturesRawTextureMod.RawTexture]
  
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
    * @param creationFlags specific flags to use when creating the texture (Constants.TEXTURE_CREATIONFLAG_STORAGE for storage textures, for eg)
    * @param useSRGBBuffer defines if the texture must be loaded in a sRGB GPU buffer (if supported by the GPU).
    * @returns the RGB alpha texture
    */
  inline def CreateRGBTexture(
    data: Nullable[js.typedarray.ArrayBufferView],
    width: Double,
    height: Double,
    sceneOrEngine: Nullable[
      typings.babylonjs.sceneMod.Scene | typings.babylonjs.enginesThinEngineMod.ThinEngine
    ],
    generateMipMaps: js.UndefOr[Boolean],
    invertY: js.UndefOr[Boolean],
    samplingMode: js.UndefOr[Double],
    `type`: js.UndefOr[Double],
    creationFlags: js.UndefOr[Double],
    useSRGBBuffer: js.UndefOr[Boolean]
  ): typings.babylonjs.materialsTexturesRawTextureMod.RawTexture = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateRGBTexture")(data.asInstanceOf[js.Any], width.asInstanceOf[js.Any], height.asInstanceOf[js.Any], sceneOrEngine.asInstanceOf[js.Any], generateMipMaps.asInstanceOf[js.Any], invertY.asInstanceOf[js.Any], samplingMode.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], creationFlags.asInstanceOf[js.Any], useSRGBBuffer.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.materialsTexturesRawTextureMod.RawTexture]
  
  /**
    * Creates a R storage texture from some data.
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
  inline def CreateRStorageTexture(
    data: Nullable[js.typedarray.ArrayBufferView],
    width: Double,
    height: Double,
    sceneOrEngine: Nullable[
      typings.babylonjs.sceneMod.Scene | typings.babylonjs.enginesThinEngineMod.ThinEngine
    ]
  ): typings.babylonjs.materialsTexturesRawTextureMod.RawTexture = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateRStorageTexture")(data.asInstanceOf[js.Any], width.asInstanceOf[js.Any], height.asInstanceOf[js.Any], sceneOrEngine.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.materialsTexturesRawTextureMod.RawTexture]
  inline def CreateRStorageTexture(
    data: Nullable[js.typedarray.ArrayBufferView],
    width: Double,
    height: Double,
    sceneOrEngine: Nullable[
      typings.babylonjs.sceneMod.Scene | typings.babylonjs.enginesThinEngineMod.ThinEngine
    ],
    generateMipMaps: Boolean
  ): typings.babylonjs.materialsTexturesRawTextureMod.RawTexture = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateRStorageTexture")(data.asInstanceOf[js.Any], width.asInstanceOf[js.Any], height.asInstanceOf[js.Any], sceneOrEngine.asInstanceOf[js.Any], generateMipMaps.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.materialsTexturesRawTextureMod.RawTexture]
  inline def CreateRStorageTexture(
    data: Nullable[js.typedarray.ArrayBufferView],
    width: Double,
    height: Double,
    sceneOrEngine: Nullable[
      typings.babylonjs.sceneMod.Scene | typings.babylonjs.enginesThinEngineMod.ThinEngine
    ],
    generateMipMaps: Boolean,
    invertY: Boolean
  ): typings.babylonjs.materialsTexturesRawTextureMod.RawTexture = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateRStorageTexture")(data.asInstanceOf[js.Any], width.asInstanceOf[js.Any], height.asInstanceOf[js.Any], sceneOrEngine.asInstanceOf[js.Any], generateMipMaps.asInstanceOf[js.Any], invertY.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.materialsTexturesRawTextureMod.RawTexture]
  inline def CreateRStorageTexture(
    data: Nullable[js.typedarray.ArrayBufferView],
    width: Double,
    height: Double,
    sceneOrEngine: Nullable[
      typings.babylonjs.sceneMod.Scene | typings.babylonjs.enginesThinEngineMod.ThinEngine
    ],
    generateMipMaps: Boolean,
    invertY: Boolean,
    samplingMode: Double
  ): typings.babylonjs.materialsTexturesRawTextureMod.RawTexture = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateRStorageTexture")(data.asInstanceOf[js.Any], width.asInstanceOf[js.Any], height.asInstanceOf[js.Any], sceneOrEngine.asInstanceOf[js.Any], generateMipMaps.asInstanceOf[js.Any], invertY.asInstanceOf[js.Any], samplingMode.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.materialsTexturesRawTextureMod.RawTexture]
  inline def CreateRStorageTexture(
    data: Nullable[js.typedarray.ArrayBufferView],
    width: Double,
    height: Double,
    sceneOrEngine: Nullable[
      typings.babylonjs.sceneMod.Scene | typings.babylonjs.enginesThinEngineMod.ThinEngine
    ],
    generateMipMaps: Boolean,
    invertY: Boolean,
    samplingMode: Double,
    `type`: Double
  ): typings.babylonjs.materialsTexturesRawTextureMod.RawTexture = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateRStorageTexture")(data.asInstanceOf[js.Any], width.asInstanceOf[js.Any], height.asInstanceOf[js.Any], sceneOrEngine.asInstanceOf[js.Any], generateMipMaps.asInstanceOf[js.Any], invertY.asInstanceOf[js.Any], samplingMode.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.materialsTexturesRawTextureMod.RawTexture]
  inline def CreateRStorageTexture(
    data: Nullable[js.typedarray.ArrayBufferView],
    width: Double,
    height: Double,
    sceneOrEngine: Nullable[
      typings.babylonjs.sceneMod.Scene | typings.babylonjs.enginesThinEngineMod.ThinEngine
    ],
    generateMipMaps: Boolean,
    invertY: Boolean,
    samplingMode: Unit,
    `type`: Double
  ): typings.babylonjs.materialsTexturesRawTextureMod.RawTexture = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateRStorageTexture")(data.asInstanceOf[js.Any], width.asInstanceOf[js.Any], height.asInstanceOf[js.Any], sceneOrEngine.asInstanceOf[js.Any], generateMipMaps.asInstanceOf[js.Any], invertY.asInstanceOf[js.Any], samplingMode.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.materialsTexturesRawTextureMod.RawTexture]
  inline def CreateRStorageTexture(
    data: Nullable[js.typedarray.ArrayBufferView],
    width: Double,
    height: Double,
    sceneOrEngine: Nullable[
      typings.babylonjs.sceneMod.Scene | typings.babylonjs.enginesThinEngineMod.ThinEngine
    ],
    generateMipMaps: Boolean,
    invertY: Unit,
    samplingMode: Double
  ): typings.babylonjs.materialsTexturesRawTextureMod.RawTexture = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateRStorageTexture")(data.asInstanceOf[js.Any], width.asInstanceOf[js.Any], height.asInstanceOf[js.Any], sceneOrEngine.asInstanceOf[js.Any], generateMipMaps.asInstanceOf[js.Any], invertY.asInstanceOf[js.Any], samplingMode.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.materialsTexturesRawTextureMod.RawTexture]
  inline def CreateRStorageTexture(
    data: Nullable[js.typedarray.ArrayBufferView],
    width: Double,
    height: Double,
    sceneOrEngine: Nullable[
      typings.babylonjs.sceneMod.Scene | typings.babylonjs.enginesThinEngineMod.ThinEngine
    ],
    generateMipMaps: Boolean,
    invertY: Unit,
    samplingMode: Double,
    `type`: Double
  ): typings.babylonjs.materialsTexturesRawTextureMod.RawTexture = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateRStorageTexture")(data.asInstanceOf[js.Any], width.asInstanceOf[js.Any], height.asInstanceOf[js.Any], sceneOrEngine.asInstanceOf[js.Any], generateMipMaps.asInstanceOf[js.Any], invertY.asInstanceOf[js.Any], samplingMode.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.materialsTexturesRawTextureMod.RawTexture]
  inline def CreateRStorageTexture(
    data: Nullable[js.typedarray.ArrayBufferView],
    width: Double,
    height: Double,
    sceneOrEngine: Nullable[
      typings.babylonjs.sceneMod.Scene | typings.babylonjs.enginesThinEngineMod.ThinEngine
    ],
    generateMipMaps: Boolean,
    invertY: Unit,
    samplingMode: Unit,
    `type`: Double
  ): typings.babylonjs.materialsTexturesRawTextureMod.RawTexture = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateRStorageTexture")(data.asInstanceOf[js.Any], width.asInstanceOf[js.Any], height.asInstanceOf[js.Any], sceneOrEngine.asInstanceOf[js.Any], generateMipMaps.asInstanceOf[js.Any], invertY.asInstanceOf[js.Any], samplingMode.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.materialsTexturesRawTextureMod.RawTexture]
  inline def CreateRStorageTexture(
    data: Nullable[js.typedarray.ArrayBufferView],
    width: Double,
    height: Double,
    sceneOrEngine: Nullable[
      typings.babylonjs.sceneMod.Scene | typings.babylonjs.enginesThinEngineMod.ThinEngine
    ],
    generateMipMaps: Unit,
    invertY: Boolean
  ): typings.babylonjs.materialsTexturesRawTextureMod.RawTexture = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateRStorageTexture")(data.asInstanceOf[js.Any], width.asInstanceOf[js.Any], height.asInstanceOf[js.Any], sceneOrEngine.asInstanceOf[js.Any], generateMipMaps.asInstanceOf[js.Any], invertY.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.materialsTexturesRawTextureMod.RawTexture]
  inline def CreateRStorageTexture(
    data: Nullable[js.typedarray.ArrayBufferView],
    width: Double,
    height: Double,
    sceneOrEngine: Nullable[
      typings.babylonjs.sceneMod.Scene | typings.babylonjs.enginesThinEngineMod.ThinEngine
    ],
    generateMipMaps: Unit,
    invertY: Boolean,
    samplingMode: Double
  ): typings.babylonjs.materialsTexturesRawTextureMod.RawTexture = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateRStorageTexture")(data.asInstanceOf[js.Any], width.asInstanceOf[js.Any], height.asInstanceOf[js.Any], sceneOrEngine.asInstanceOf[js.Any], generateMipMaps.asInstanceOf[js.Any], invertY.asInstanceOf[js.Any], samplingMode.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.materialsTexturesRawTextureMod.RawTexture]
  inline def CreateRStorageTexture(
    data: Nullable[js.typedarray.ArrayBufferView],
    width: Double,
    height: Double,
    sceneOrEngine: Nullable[
      typings.babylonjs.sceneMod.Scene | typings.babylonjs.enginesThinEngineMod.ThinEngine
    ],
    generateMipMaps: Unit,
    invertY: Boolean,
    samplingMode: Double,
    `type`: Double
  ): typings.babylonjs.materialsTexturesRawTextureMod.RawTexture = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateRStorageTexture")(data.asInstanceOf[js.Any], width.asInstanceOf[js.Any], height.asInstanceOf[js.Any], sceneOrEngine.asInstanceOf[js.Any], generateMipMaps.asInstanceOf[js.Any], invertY.asInstanceOf[js.Any], samplingMode.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.materialsTexturesRawTextureMod.RawTexture]
  inline def CreateRStorageTexture(
    data: Nullable[js.typedarray.ArrayBufferView],
    width: Double,
    height: Double,
    sceneOrEngine: Nullable[
      typings.babylonjs.sceneMod.Scene | typings.babylonjs.enginesThinEngineMod.ThinEngine
    ],
    generateMipMaps: Unit,
    invertY: Boolean,
    samplingMode: Unit,
    `type`: Double
  ): typings.babylonjs.materialsTexturesRawTextureMod.RawTexture = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateRStorageTexture")(data.asInstanceOf[js.Any], width.asInstanceOf[js.Any], height.asInstanceOf[js.Any], sceneOrEngine.asInstanceOf[js.Any], generateMipMaps.asInstanceOf[js.Any], invertY.asInstanceOf[js.Any], samplingMode.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.materialsTexturesRawTextureMod.RawTexture]
  inline def CreateRStorageTexture(
    data: Nullable[js.typedarray.ArrayBufferView],
    width: Double,
    height: Double,
    sceneOrEngine: Nullable[
      typings.babylonjs.sceneMod.Scene | typings.babylonjs.enginesThinEngineMod.ThinEngine
    ],
    generateMipMaps: Unit,
    invertY: Unit,
    samplingMode: Double
  ): typings.babylonjs.materialsTexturesRawTextureMod.RawTexture = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateRStorageTexture")(data.asInstanceOf[js.Any], width.asInstanceOf[js.Any], height.asInstanceOf[js.Any], sceneOrEngine.asInstanceOf[js.Any], generateMipMaps.asInstanceOf[js.Any], invertY.asInstanceOf[js.Any], samplingMode.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.materialsTexturesRawTextureMod.RawTexture]
  inline def CreateRStorageTexture(
    data: Nullable[js.typedarray.ArrayBufferView],
    width: Double,
    height: Double,
    sceneOrEngine: Nullable[
      typings.babylonjs.sceneMod.Scene | typings.babylonjs.enginesThinEngineMod.ThinEngine
    ],
    generateMipMaps: Unit,
    invertY: Unit,
    samplingMode: Double,
    `type`: Double
  ): typings.babylonjs.materialsTexturesRawTextureMod.RawTexture = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateRStorageTexture")(data.asInstanceOf[js.Any], width.asInstanceOf[js.Any], height.asInstanceOf[js.Any], sceneOrEngine.asInstanceOf[js.Any], generateMipMaps.asInstanceOf[js.Any], invertY.asInstanceOf[js.Any], samplingMode.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.materialsTexturesRawTextureMod.RawTexture]
  inline def CreateRStorageTexture(
    data: Nullable[js.typedarray.ArrayBufferView],
    width: Double,
    height: Double,
    sceneOrEngine: Nullable[
      typings.babylonjs.sceneMod.Scene | typings.babylonjs.enginesThinEngineMod.ThinEngine
    ],
    generateMipMaps: Unit,
    invertY: Unit,
    samplingMode: Unit,
    `type`: Double
  ): typings.babylonjs.materialsTexturesRawTextureMod.RawTexture = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateRStorageTexture")(data.asInstanceOf[js.Any], width.asInstanceOf[js.Any], height.asInstanceOf[js.Any], sceneOrEngine.asInstanceOf[js.Any], generateMipMaps.asInstanceOf[js.Any], invertY.asInstanceOf[js.Any], samplingMode.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.materialsTexturesRawTextureMod.RawTexture]
  
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
  inline def CreateRTexture(
    data: Nullable[js.typedarray.ArrayBufferView],
    width: Double,
    height: Double,
    sceneOrEngine: Nullable[
      typings.babylonjs.sceneMod.Scene | typings.babylonjs.enginesThinEngineMod.ThinEngine
    ]
  ): typings.babylonjs.materialsTexturesRawTextureMod.RawTexture = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateRTexture")(data.asInstanceOf[js.Any], width.asInstanceOf[js.Any], height.asInstanceOf[js.Any], sceneOrEngine.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.materialsTexturesRawTextureMod.RawTexture]
  inline def CreateRTexture(
    data: Nullable[js.typedarray.ArrayBufferView],
    width: Double,
    height: Double,
    sceneOrEngine: Nullable[
      typings.babylonjs.sceneMod.Scene | typings.babylonjs.enginesThinEngineMod.ThinEngine
    ],
    generateMipMaps: Boolean
  ): typings.babylonjs.materialsTexturesRawTextureMod.RawTexture = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateRTexture")(data.asInstanceOf[js.Any], width.asInstanceOf[js.Any], height.asInstanceOf[js.Any], sceneOrEngine.asInstanceOf[js.Any], generateMipMaps.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.materialsTexturesRawTextureMod.RawTexture]
  inline def CreateRTexture(
    data: Nullable[js.typedarray.ArrayBufferView],
    width: Double,
    height: Double,
    sceneOrEngine: Nullable[
      typings.babylonjs.sceneMod.Scene | typings.babylonjs.enginesThinEngineMod.ThinEngine
    ],
    generateMipMaps: Boolean,
    invertY: Boolean
  ): typings.babylonjs.materialsTexturesRawTextureMod.RawTexture = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateRTexture")(data.asInstanceOf[js.Any], width.asInstanceOf[js.Any], height.asInstanceOf[js.Any], sceneOrEngine.asInstanceOf[js.Any], generateMipMaps.asInstanceOf[js.Any], invertY.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.materialsTexturesRawTextureMod.RawTexture]
  inline def CreateRTexture(
    data: Nullable[js.typedarray.ArrayBufferView],
    width: Double,
    height: Double,
    sceneOrEngine: Nullable[
      typings.babylonjs.sceneMod.Scene | typings.babylonjs.enginesThinEngineMod.ThinEngine
    ],
    generateMipMaps: Boolean,
    invertY: Boolean,
    samplingMode: Double
  ): typings.babylonjs.materialsTexturesRawTextureMod.RawTexture = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateRTexture")(data.asInstanceOf[js.Any], width.asInstanceOf[js.Any], height.asInstanceOf[js.Any], sceneOrEngine.asInstanceOf[js.Any], generateMipMaps.asInstanceOf[js.Any], invertY.asInstanceOf[js.Any], samplingMode.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.materialsTexturesRawTextureMod.RawTexture]
  inline def CreateRTexture(
    data: Nullable[js.typedarray.ArrayBufferView],
    width: Double,
    height: Double,
    sceneOrEngine: Nullable[
      typings.babylonjs.sceneMod.Scene | typings.babylonjs.enginesThinEngineMod.ThinEngine
    ],
    generateMipMaps: Boolean,
    invertY: Boolean,
    samplingMode: Double,
    `type`: Double
  ): typings.babylonjs.materialsTexturesRawTextureMod.RawTexture = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateRTexture")(data.asInstanceOf[js.Any], width.asInstanceOf[js.Any], height.asInstanceOf[js.Any], sceneOrEngine.asInstanceOf[js.Any], generateMipMaps.asInstanceOf[js.Any], invertY.asInstanceOf[js.Any], samplingMode.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.materialsTexturesRawTextureMod.RawTexture]
  inline def CreateRTexture(
    data: Nullable[js.typedarray.ArrayBufferView],
    width: Double,
    height: Double,
    sceneOrEngine: Nullable[
      typings.babylonjs.sceneMod.Scene | typings.babylonjs.enginesThinEngineMod.ThinEngine
    ],
    generateMipMaps: Boolean,
    invertY: Boolean,
    samplingMode: Unit,
    `type`: Double
  ): typings.babylonjs.materialsTexturesRawTextureMod.RawTexture = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateRTexture")(data.asInstanceOf[js.Any], width.asInstanceOf[js.Any], height.asInstanceOf[js.Any], sceneOrEngine.asInstanceOf[js.Any], generateMipMaps.asInstanceOf[js.Any], invertY.asInstanceOf[js.Any], samplingMode.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.materialsTexturesRawTextureMod.RawTexture]
  inline def CreateRTexture(
    data: Nullable[js.typedarray.ArrayBufferView],
    width: Double,
    height: Double,
    sceneOrEngine: Nullable[
      typings.babylonjs.sceneMod.Scene | typings.babylonjs.enginesThinEngineMod.ThinEngine
    ],
    generateMipMaps: Boolean,
    invertY: Unit,
    samplingMode: Double
  ): typings.babylonjs.materialsTexturesRawTextureMod.RawTexture = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateRTexture")(data.asInstanceOf[js.Any], width.asInstanceOf[js.Any], height.asInstanceOf[js.Any], sceneOrEngine.asInstanceOf[js.Any], generateMipMaps.asInstanceOf[js.Any], invertY.asInstanceOf[js.Any], samplingMode.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.materialsTexturesRawTextureMod.RawTexture]
  inline def CreateRTexture(
    data: Nullable[js.typedarray.ArrayBufferView],
    width: Double,
    height: Double,
    sceneOrEngine: Nullable[
      typings.babylonjs.sceneMod.Scene | typings.babylonjs.enginesThinEngineMod.ThinEngine
    ],
    generateMipMaps: Boolean,
    invertY: Unit,
    samplingMode: Double,
    `type`: Double
  ): typings.babylonjs.materialsTexturesRawTextureMod.RawTexture = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateRTexture")(data.asInstanceOf[js.Any], width.asInstanceOf[js.Any], height.asInstanceOf[js.Any], sceneOrEngine.asInstanceOf[js.Any], generateMipMaps.asInstanceOf[js.Any], invertY.asInstanceOf[js.Any], samplingMode.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.materialsTexturesRawTextureMod.RawTexture]
  inline def CreateRTexture(
    data: Nullable[js.typedarray.ArrayBufferView],
    width: Double,
    height: Double,
    sceneOrEngine: Nullable[
      typings.babylonjs.sceneMod.Scene | typings.babylonjs.enginesThinEngineMod.ThinEngine
    ],
    generateMipMaps: Boolean,
    invertY: Unit,
    samplingMode: Unit,
    `type`: Double
  ): typings.babylonjs.materialsTexturesRawTextureMod.RawTexture = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateRTexture")(data.asInstanceOf[js.Any], width.asInstanceOf[js.Any], height.asInstanceOf[js.Any], sceneOrEngine.asInstanceOf[js.Any], generateMipMaps.asInstanceOf[js.Any], invertY.asInstanceOf[js.Any], samplingMode.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.materialsTexturesRawTextureMod.RawTexture]
  inline def CreateRTexture(
    data: Nullable[js.typedarray.ArrayBufferView],
    width: Double,
    height: Double,
    sceneOrEngine: Nullable[
      typings.babylonjs.sceneMod.Scene | typings.babylonjs.enginesThinEngineMod.ThinEngine
    ],
    generateMipMaps: Unit,
    invertY: Boolean
  ): typings.babylonjs.materialsTexturesRawTextureMod.RawTexture = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateRTexture")(data.asInstanceOf[js.Any], width.asInstanceOf[js.Any], height.asInstanceOf[js.Any], sceneOrEngine.asInstanceOf[js.Any], generateMipMaps.asInstanceOf[js.Any], invertY.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.materialsTexturesRawTextureMod.RawTexture]
  inline def CreateRTexture(
    data: Nullable[js.typedarray.ArrayBufferView],
    width: Double,
    height: Double,
    sceneOrEngine: Nullable[
      typings.babylonjs.sceneMod.Scene | typings.babylonjs.enginesThinEngineMod.ThinEngine
    ],
    generateMipMaps: Unit,
    invertY: Boolean,
    samplingMode: Double
  ): typings.babylonjs.materialsTexturesRawTextureMod.RawTexture = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateRTexture")(data.asInstanceOf[js.Any], width.asInstanceOf[js.Any], height.asInstanceOf[js.Any], sceneOrEngine.asInstanceOf[js.Any], generateMipMaps.asInstanceOf[js.Any], invertY.asInstanceOf[js.Any], samplingMode.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.materialsTexturesRawTextureMod.RawTexture]
  inline def CreateRTexture(
    data: Nullable[js.typedarray.ArrayBufferView],
    width: Double,
    height: Double,
    sceneOrEngine: Nullable[
      typings.babylonjs.sceneMod.Scene | typings.babylonjs.enginesThinEngineMod.ThinEngine
    ],
    generateMipMaps: Unit,
    invertY: Boolean,
    samplingMode: Double,
    `type`: Double
  ): typings.babylonjs.materialsTexturesRawTextureMod.RawTexture = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateRTexture")(data.asInstanceOf[js.Any], width.asInstanceOf[js.Any], height.asInstanceOf[js.Any], sceneOrEngine.asInstanceOf[js.Any], generateMipMaps.asInstanceOf[js.Any], invertY.asInstanceOf[js.Any], samplingMode.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.materialsTexturesRawTextureMod.RawTexture]
  inline def CreateRTexture(
    data: Nullable[js.typedarray.ArrayBufferView],
    width: Double,
    height: Double,
    sceneOrEngine: Nullable[
      typings.babylonjs.sceneMod.Scene | typings.babylonjs.enginesThinEngineMod.ThinEngine
    ],
    generateMipMaps: Unit,
    invertY: Boolean,
    samplingMode: Unit,
    `type`: Double
  ): typings.babylonjs.materialsTexturesRawTextureMod.RawTexture = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateRTexture")(data.asInstanceOf[js.Any], width.asInstanceOf[js.Any], height.asInstanceOf[js.Any], sceneOrEngine.asInstanceOf[js.Any], generateMipMaps.asInstanceOf[js.Any], invertY.asInstanceOf[js.Any], samplingMode.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.materialsTexturesRawTextureMod.RawTexture]
  inline def CreateRTexture(
    data: Nullable[js.typedarray.ArrayBufferView],
    width: Double,
    height: Double,
    sceneOrEngine: Nullable[
      typings.babylonjs.sceneMod.Scene | typings.babylonjs.enginesThinEngineMod.ThinEngine
    ],
    generateMipMaps: Unit,
    invertY: Unit,
    samplingMode: Double
  ): typings.babylonjs.materialsTexturesRawTextureMod.RawTexture = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateRTexture")(data.asInstanceOf[js.Any], width.asInstanceOf[js.Any], height.asInstanceOf[js.Any], sceneOrEngine.asInstanceOf[js.Any], generateMipMaps.asInstanceOf[js.Any], invertY.asInstanceOf[js.Any], samplingMode.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.materialsTexturesRawTextureMod.RawTexture]
  inline def CreateRTexture(
    data: Nullable[js.typedarray.ArrayBufferView],
    width: Double,
    height: Double,
    sceneOrEngine: Nullable[
      typings.babylonjs.sceneMod.Scene | typings.babylonjs.enginesThinEngineMod.ThinEngine
    ],
    generateMipMaps: Unit,
    invertY: Unit,
    samplingMode: Double,
    `type`: Double
  ): typings.babylonjs.materialsTexturesRawTextureMod.RawTexture = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateRTexture")(data.asInstanceOf[js.Any], width.asInstanceOf[js.Any], height.asInstanceOf[js.Any], sceneOrEngine.asInstanceOf[js.Any], generateMipMaps.asInstanceOf[js.Any], invertY.asInstanceOf[js.Any], samplingMode.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.materialsTexturesRawTextureMod.RawTexture]
  inline def CreateRTexture(
    data: Nullable[js.typedarray.ArrayBufferView],
    width: Double,
    height: Double,
    sceneOrEngine: Nullable[
      typings.babylonjs.sceneMod.Scene | typings.babylonjs.enginesThinEngineMod.ThinEngine
    ],
    generateMipMaps: Unit,
    invertY: Unit,
    samplingMode: Unit,
    `type`: Double
  ): typings.babylonjs.materialsTexturesRawTextureMod.RawTexture = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateRTexture")(data.asInstanceOf[js.Any], width.asInstanceOf[js.Any], height.asInstanceOf[js.Any], sceneOrEngine.asInstanceOf[js.Any], generateMipMaps.asInstanceOf[js.Any], invertY.asInstanceOf[js.Any], samplingMode.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.materialsTexturesRawTextureMod.RawTexture]
}
