package typings.babylonjs.mod

import typings.babylonjs.environmentTextureToolsMod.CreateEnvTextureOptions
import typings.babylonjs.environmentTextureToolsMod.EnvironmentTextureInfo
import typings.babylonjs.environmentTextureToolsMod.EnvironmentTextureInfoV2
import typings.babylonjs.typesMod.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object EnvironmentTextureTools {
  
  @JSImport("babylonjs", "EnvironmentTextureTools")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates an environment texture from a loaded cube texture.
    * @param texture defines the cube texture to convert in env file
    * @param options options for the conversion process
    * @param options.imageType the mime type for the encoded images, with support for "image/png" (default) and "image/webp"
    * @param options.imageQuality the image quality of encoded WebP images.
    * @returns a promise containing the environment data if successful.
    */
  @JSImport("babylonjs", "EnvironmentTextureTools.CreateEnvTextureAsync")
  @js.native
  def CreateEnvTextureAsync: js.Function2[
    /* texture */ typings.babylonjs.baseTextureMod.BaseTexture, 
    /* options */ js.UndefOr[CreateEnvTextureOptions], 
    js.Promise[js.typedarray.ArrayBuffer]
  ] = js.native
  /**
    * Creates an environment texture from a loaded cube texture.
    * @param texture defines the cube texture to convert in env file
    * @param options options for the conversion process
    * @param options.imageType the mime type for the encoded images, with support for "image/png" (default) and "image/webp"
    * @param options.imageQuality the image quality of encoded WebP images.
    * @returns a promise containing the environment data if successful.
    */
  inline def CreateEnvTextureAsync(texture: typings.babylonjs.baseTextureMod.BaseTexture): js.Promise[js.typedarray.ArrayBuffer] = ^.asInstanceOf[js.Dynamic].applyDynamic("CreateEnvTextureAsync")(texture.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.typedarray.ArrayBuffer]]
  inline def CreateEnvTextureAsync(texture: typings.babylonjs.baseTextureMod.BaseTexture, options: CreateEnvTextureOptions): js.Promise[js.typedarray.ArrayBuffer] = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateEnvTextureAsync")(texture.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.typedarray.ArrayBuffer]]
  inline def CreateEnvTextureAsync_=(
    x: js.Function2[
      /* texture */ typings.babylonjs.baseTextureMod.BaseTexture, 
      /* options */ js.UndefOr[CreateEnvTextureOptions], 
      js.Promise[js.typedarray.ArrayBuffer]
    ]
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CreateEnvTextureAsync")(x.asInstanceOf[js.Any])
  
  /**
    * Creates the ArrayBufferViews used for initializing environment texture image data.
    * @param data the image data
    * @param info parameters that determine what views will be created for accessing the underlying buffer
    * @returns the views described by info providing access to the underlying buffer
    */
  @JSImport("babylonjs", "EnvironmentTextureTools.CreateImageDataArrayBufferViews")
  @js.native
  def CreateImageDataArrayBufferViews: js.Function2[
    /* data */ js.typedarray.ArrayBufferView, 
    /* info */ EnvironmentTextureInfo, 
    js.Array[js.Array[js.typedarray.ArrayBufferView]]
  ] = js.native
  /**
    * Creates the ArrayBufferViews used for initializing environment texture image data.
    * @param data the image data
    * @param info parameters that determine what views will be created for accessing the underlying buffer
    * @returns the views described by info providing access to the underlying buffer
    */
  inline def CreateImageDataArrayBufferViews(data: js.typedarray.ArrayBufferView, info: EnvironmentTextureInfo): js.Array[js.Array[js.typedarray.ArrayBufferView]] = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateImageDataArrayBufferViews")(data.asInstanceOf[js.Any], info.asInstanceOf[js.Any])).asInstanceOf[js.Array[js.Array[js.typedarray.ArrayBufferView]]]
  inline def CreateImageDataArrayBufferViews_=(
    x: js.Function2[
      /* data */ js.typedarray.ArrayBufferView, 
      /* info */ EnvironmentTextureInfo, 
      js.Array[js.Array[js.typedarray.ArrayBufferView]]
    ]
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CreateImageDataArrayBufferViews")(x.asInstanceOf[js.Any])
  
  /**
    * Gets the environment info from an env file.
    * @param data The array buffer containing the .env bytes.
    * @returns the environment file info (the json header) if successfully parsed, normalized to the latest supported version.
    */
  @JSImport("babylonjs", "EnvironmentTextureTools.GetEnvInfo")
  @js.native
  def GetEnvInfo: js.Function1[/* data */ js.typedarray.ArrayBufferView, Nullable[EnvironmentTextureInfoV2]] = js.native
  /**
    * Gets the environment info from an env file.
    * @param data The array buffer containing the .env bytes.
    * @returns the environment file info (the json header) if successfully parsed, normalized to the latest supported version.
    */
  inline def GetEnvInfo(data: js.typedarray.ArrayBufferView): Nullable[EnvironmentTextureInfoV2] = ^.asInstanceOf[js.Dynamic].applyDynamic("GetEnvInfo")(data.asInstanceOf[js.Any]).asInstanceOf[Nullable[EnvironmentTextureInfoV2]]
  inline def GetEnvInfo_=(x: js.Function1[/* data */ js.typedarray.ArrayBufferView, Nullable[EnvironmentTextureInfoV2]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("GetEnvInfo")(x.asInstanceOf[js.Any])
  
  /**
    * Uploads the texture info contained in the env file to the GPU.
    * @param texture defines the internal texture to upload to
    * @param data defines the data to load
    * @param info defines the texture info retrieved through the GetEnvInfo method
    * @returns a promise
    */
  @JSImport("babylonjs", "EnvironmentTextureTools.UploadEnvLevelsAsync")
  @js.native
  def UploadEnvLevelsAsync: js.Function3[
    /* texture */ typings.babylonjs.internalTextureMod.InternalTexture, 
    /* data */ js.typedarray.ArrayBufferView, 
    /* info */ EnvironmentTextureInfo, 
    js.Promise[Unit]
  ] = js.native
  /**
    * Uploads the texture info contained in the env file to the GPU.
    * @param texture defines the internal texture to upload to
    * @param data defines the data to load
    * @param info defines the texture info retrieved through the GetEnvInfo method
    * @returns a promise
    */
  inline def UploadEnvLevelsAsync(
    texture: typings.babylonjs.internalTextureMod.InternalTexture,
    data: js.typedarray.ArrayBufferView,
    info: EnvironmentTextureInfo
  ): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("UploadEnvLevelsAsync")(texture.asInstanceOf[js.Any], data.asInstanceOf[js.Any], info.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def UploadEnvLevelsAsync_=(
    x: js.Function3[
      /* texture */ typings.babylonjs.internalTextureMod.InternalTexture, 
      /* data */ js.typedarray.ArrayBufferView, 
      /* info */ EnvironmentTextureInfo, 
      js.Promise[Unit]
    ]
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("UploadEnvLevelsAsync")(x.asInstanceOf[js.Any])
  
  /**
    * Uploads spherical polynomials information to the texture.
    * @param texture defines the texture we are trying to upload the information to
    * @param info defines the environment texture info retrieved through the GetEnvInfo method
    */
  @JSImport("babylonjs", "EnvironmentTextureTools.UploadEnvSpherical")
  @js.native
  def UploadEnvSpherical: js.Function2[
    /* texture */ typings.babylonjs.internalTextureMod.InternalTexture, 
    /* info */ EnvironmentTextureInfo, 
    Unit
  ] = js.native
  /**
    * Uploads spherical polynomials information to the texture.
    * @param texture defines the texture we are trying to upload the information to
    * @param info defines the environment texture info retrieved through the GetEnvInfo method
    */
  inline def UploadEnvSpherical(texture: typings.babylonjs.internalTextureMod.InternalTexture, info: EnvironmentTextureInfo): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("UploadEnvSpherical")(texture.asInstanceOf[js.Any], info.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def UploadEnvSpherical_=(
    x: js.Function2[
      /* texture */ typings.babylonjs.internalTextureMod.InternalTexture, 
      /* info */ EnvironmentTextureInfo, 
      Unit
    ]
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("UploadEnvSpherical")(x.asInstanceOf[js.Any])
  
  /**
    * Uploads the levels of image data to the GPU.
    * @param texture defines the internal texture to upload to
    * @param imageData defines the array buffer views of image data [mipmap][face]
    * @param imageType the mime type of the image data
    * @returns a promise
    */
  @JSImport("babylonjs", "EnvironmentTextureTools.UploadLevelsAsync")
  @js.native
  def UploadLevelsAsync: js.Function3[
    /* texture */ typings.babylonjs.internalTextureMod.InternalTexture, 
    /* imageData */ js.Array[js.Array[js.typedarray.ArrayBufferView]], 
    /* imageType */ js.UndefOr[String], 
    js.Promise[Unit]
  ] = js.native
  /**
    * Uploads the levels of image data to the GPU.
    * @param texture defines the internal texture to upload to
    * @param imageData defines the array buffer views of image data [mipmap][face]
    * @param imageType the mime type of the image data
    * @returns a promise
    */
  inline def UploadLevelsAsync(
    texture: typings.babylonjs.internalTextureMod.InternalTexture,
    imageData: js.Array[js.Array[js.typedarray.ArrayBufferView]]
  ): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("UploadLevelsAsync")(texture.asInstanceOf[js.Any], imageData.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def UploadLevelsAsync(
    texture: typings.babylonjs.internalTextureMod.InternalTexture,
    imageData: js.Array[js.Array[js.typedarray.ArrayBufferView]],
    imageType: String
  ): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("UploadLevelsAsync")(texture.asInstanceOf[js.Any], imageData.asInstanceOf[js.Any], imageType.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def UploadLevelsAsync_=(
    x: js.Function3[
      /* texture */ typings.babylonjs.internalTextureMod.InternalTexture, 
      /* imageData */ js.Array[js.Array[js.typedarray.ArrayBufferView]], 
      /* imageType */ js.UndefOr[String], 
      js.Promise[Unit]
    ]
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("UploadLevelsAsync")(x.asInstanceOf[js.Any])
}
