package typings.babylonjs

import typings.babylonjs.internalTextureMod.InternalTexture
import typings.babylonjs.sceneMod.Scene
import typings.babylonjs.typesMod.Nullable
import typings.std.ArrayBuffer
import typings.std.ArrayBufferView
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object engineRawTextureMod {
  
  /* augmented module */
  object babylonjsEnginesThinEngineAugmentingMod {
    
    @js.native
    trait ThinEngine extends StObject {
      
      /**
        * Creates a new raw cube texture
        * @param data defines the array of data to use to create each face
        * @param size defines the size of the textures
        * @param format defines the format of the data
        * @param type defines the type of the data (like Engine.TEXTURETYPE_UNSIGNED_INT)
        * @param generateMipMaps  defines if the engine should generate the mip levels
        * @param invertY defines if data must be stored with Y axis inverted
        * @param samplingMode defines the required sampling mode (like Texture.NEAREST_SAMPLINGMODE)
        * @param compression defines the compression used (null by default)
        * @returns the cube texture as an InternalTexture
        */
      def createRawCubeTexture(
        data: Nullable[js.Array[ArrayBufferView]],
        size: Double,
        format: Double,
        `type`: Double,
        generateMipMaps: Boolean,
        invertY: Boolean,
        samplingMode: Double,
        compression: Nullable[String]
      ): InternalTexture = js.native
      
      /**
        * Creates a new raw cube texture from a specified url
        * @param url defines the url where the data is located
        * @param scene defines the current scene
        * @param size defines the size of the textures
        * @param format defines the format of the data
        * @param type defines the type fo the data (like Engine.TEXTURETYPE_UNSIGNED_INT)
        * @param noMipmap defines if the engine should avoid generating the mip levels
        * @param callback defines a callback used to extract texture data from loaded data
        * @param mipmapGenerator defines to provide an optional tool to generate mip levels
        * @param onLoad defines a callback called when texture is loaded
        * @param onError defines a callback called if there is an error
        * @returns the cube texture as an InternalTexture
        */
      def createRawCubeTextureFromUrl(
        url: String,
        scene: Nullable[Scene],
        size: Double,
        format: Double,
        `type`: Double,
        noMipmap: Boolean,
        callback: js.Function1[/* ArrayBuffer */ ArrayBuffer, Nullable[js.Array[ArrayBufferView]]],
        mipmapGenerator: Nullable[
              js.Function1[/* faces */ js.Array[ArrayBufferView], js.Array[js.Array[ArrayBufferView]]]
            ],
        onLoad: Nullable[js.Function0[Unit]],
        onError: Nullable[
              js.Function2[/* message */ js.UndefOr[String], /* exception */ js.UndefOr[_], Unit]
            ]
      ): InternalTexture = js.native
      /**
        * Creates a new raw cube texture from a specified url
        * @param url defines the url where the data is located
        * @param scene defines the current scene
        * @param size defines the size of the textures
        * @param format defines the format of the data
        * @param type defines the type fo the data (like Engine.TEXTURETYPE_UNSIGNED_INT)
        * @param noMipmap defines if the engine should avoid generating the mip levels
        * @param callback defines a callback used to extract texture data from loaded data
        * @param mipmapGenerator defines to provide an optional tool to generate mip levels
        * @param onLoad defines a callback called when texture is loaded
        * @param onError defines a callback called if there is an error
        * @param samplingMode defines the required sampling mode (like Texture.NEAREST_SAMPLINGMODE)
        * @param invertY defines if data must be stored with Y axis inverted
        * @returns the cube texture as an InternalTexture
        */
      def createRawCubeTextureFromUrl(
        url: String,
        scene: Nullable[Scene],
        size: Double,
        format: Double,
        `type`: Double,
        noMipmap: Boolean,
        callback: js.Function1[/* ArrayBuffer */ ArrayBuffer, Nullable[js.Array[ArrayBufferView]]],
        mipmapGenerator: Nullable[
              js.Function1[/* faces */ js.Array[ArrayBufferView], js.Array[js.Array[ArrayBufferView]]]
            ],
        onLoad: Nullable[js.Function0[Unit]],
        onError: Nullable[
              js.Function2[/* message */ js.UndefOr[String], /* exception */ js.UndefOr[_], Unit]
            ],
        samplingMode: Double,
        invertY: Boolean
      ): InternalTexture = js.native
      
      /**
        * Creates a raw texture
        * @param data defines the data to store in the texture
        * @param width defines the width of the texture
        * @param height defines the height of the texture
        * @param format defines the format of the data
        * @param generateMipMaps defines if the engine should generate the mip levels
        * @param invertY defines if data must be stored with Y axis inverted
        * @param samplingMode defines the required sampling mode (Texture.NEAREST_SAMPLINGMODE by default)
        * @param compression defines the compression used (null by default)
        * @param type defines the type fo the data (Engine.TEXTURETYPE_UNSIGNED_INT by default)
        * @returns the raw texture inside an InternalTexture
        */
      def createRawTexture(
        data: Nullable[ArrayBufferView],
        width: Double,
        height: Double,
        format: Double,
        generateMipMaps: Boolean,
        invertY: Boolean,
        samplingMode: Double,
        compression: Nullable[String],
        `type`: Double
      ): InternalTexture = js.native
      
      /**
        * Creates a new raw 2D array texture
        * @param data defines the data used to create the texture
        * @param width defines the width of the texture
        * @param height defines the height of the texture
        * @param depth defines the number of layers of the texture
        * @param format defines the format of the texture
        * @param generateMipMaps defines if the engine must generate mip levels
        * @param invertY defines if data must be stored with Y axis inverted
        * @param samplingMode defines the required sampling mode (like Texture.NEAREST_SAMPLINGMODE)
        * @param compression defines the compressed used (can be null)
        * @param textureType defines the compressed used (can be null)
        * @returns a new raw 2D array texture (stored in an InternalTexture)
        */
      def createRawTexture2DArray(
        data: Nullable[ArrayBufferView],
        width: Double,
        height: Double,
        depth: Double,
        format: Double,
        generateMipMaps: Boolean,
        invertY: Boolean,
        samplingMode: Double,
        compression: Nullable[String],
        textureType: Double
      ): InternalTexture = js.native
      
      /**
        * Creates a new raw 3D texture
        * @param data defines the data used to create the texture
        * @param width defines the width of the texture
        * @param height defines the height of the texture
        * @param depth defines the depth of the texture
        * @param format defines the format of the texture
        * @param generateMipMaps defines if the engine must generate mip levels
        * @param invertY defines if data must be stored with Y axis inverted
        * @param samplingMode defines the required sampling mode (like Texture.NEAREST_SAMPLINGMODE)
        * @param compression defines the compressed used (can be null)
        * @param textureType defines the compressed used (can be null)
        * @returns a new raw 3D texture (stored in an InternalTexture)
        */
      def createRawTexture3D(
        data: Nullable[ArrayBufferView],
        width: Double,
        height: Double,
        depth: Double,
        format: Double,
        generateMipMaps: Boolean,
        invertY: Boolean,
        samplingMode: Double,
        compression: Nullable[String],
        textureType: Double
      ): InternalTexture = js.native
      
      /**
        * Update a raw cube texture
        * @param texture defines the texture to udpdate
        * @param data defines the data to store
        * @param format defines the data format
        * @param type defines the type fo the data (Engine.TEXTURETYPE_UNSIGNED_INT by default)
        * @param invertY defines if data must be stored with Y axis inverted
        */
      def updateRawCubeTexture(
        texture: InternalTexture,
        data: js.Array[ArrayBufferView],
        format: Double,
        `type`: Double,
        invertY: Boolean
      ): Unit = js.native
      /**
        * Update a raw cube texture
        * @param texture defines the texture to udpdate
        * @param data defines the data to store
        * @param format defines the data format
        * @param type defines the type fo the data (Engine.TEXTURETYPE_UNSIGNED_INT by default)
        * @param invertY defines if data must be stored with Y axis inverted
        * @param compression defines the compression used (null by default)
        */
      def updateRawCubeTexture(
        texture: InternalTexture,
        data: js.Array[ArrayBufferView],
        format: Double,
        `type`: Double,
        invertY: Boolean,
        compression: Nullable[String]
      ): Unit = js.native
      /**
        * Update a raw cube texture
        * @param texture defines the texture to udpdate
        * @param data defines the data to store
        * @param format defines the data format
        * @param type defines the type fo the data (Engine.TEXTURETYPE_UNSIGNED_INT by default)
        * @param invertY defines if data must be stored with Y axis inverted
        * @param compression defines the compression used (null by default)
        * @param level defines which level of the texture to update
        */
      def updateRawCubeTexture(
        texture: InternalTexture,
        data: js.Array[ArrayBufferView],
        format: Double,
        `type`: Double,
        invertY: Boolean,
        compression: Nullable[String],
        level: Double
      ): Unit = js.native
      
      /**
        * Update a raw texture
        * @param texture defines the texture to update
        * @param data defines the data to store in the texture
        * @param format defines the format of the data
        * @param invertY defines if data must be stored with Y axis inverted
        */
      def updateRawTexture(
        texture: Nullable[InternalTexture],
        data: Nullable[ArrayBufferView],
        format: Double,
        invertY: Boolean
      ): Unit = js.native
      /**
        * Update a raw texture
        * @param texture defines the texture to update
        * @param data defines the data to store in the texture
        * @param format defines the format of the data
        * @param invertY defines if data must be stored with Y axis inverted
        * @param compression defines the compression used (null by default)
        * @param type defines the type fo the data (Engine.TEXTURETYPE_UNSIGNED_INT by default)
        */
      def updateRawTexture(
        texture: Nullable[InternalTexture],
        data: Nullable[ArrayBufferView],
        format: Double,
        invertY: Boolean,
        compression: Nullable[String],
        `type`: Double
      ): Unit = js.native
      
      /**
        * Update a raw 2D array texture
        * @param texture defines the texture to update
        * @param data defines the data to store
        * @param format defines the data format
        * @param invertY defines if data must be stored with Y axis inverted
        */
      def updateRawTexture2DArray(texture: InternalTexture, data: Nullable[ArrayBufferView], format: Double, invertY: Boolean): Unit = js.native
      /**
        * Update a raw 2D array texture
        * @param texture defines the texture to update
        * @param data defines the data to store
        * @param format defines the data format
        * @param invertY defines if data must be stored with Y axis inverted
        * @param compression defines the used compression (can be null)
        * @param textureType defines the texture Type (Engine.TEXTURETYPE_UNSIGNED_INT, Engine.TEXTURETYPE_FLOAT...)
        */
      def updateRawTexture2DArray(
        texture: InternalTexture,
        data: Nullable[ArrayBufferView],
        format: Double,
        invertY: Boolean,
        compression: Nullable[String],
        textureType: Double
      ): Unit = js.native
      
      /**
        * Update a raw 3D texture
        * @param texture defines the texture to update
        * @param data defines the data to store
        * @param format defines the data format
        * @param invertY defines if data must be stored with Y axis inverted
        */
      def updateRawTexture3D(texture: InternalTexture, data: Nullable[ArrayBufferView], format: Double, invertY: Boolean): Unit = js.native
      /**
        * Update a raw 3D texture
        * @param texture defines the texture to update
        * @param data defines the data to store
        * @param format defines the data format
        * @param invertY defines if data must be stored with Y axis inverted
        * @param compression defines the used compression (can be null)
        * @param textureType defines the texture Type (Engine.TEXTURETYPE_UNSIGNED_INT, Engine.TEXTURETYPE_FLOAT...)
        */
      def updateRawTexture3D(
        texture: InternalTexture,
        data: Nullable[ArrayBufferView],
        format: Double,
        invertY: Boolean,
        compression: Nullable[String],
        textureType: Double
      ): Unit = js.native
    }
  }
}
