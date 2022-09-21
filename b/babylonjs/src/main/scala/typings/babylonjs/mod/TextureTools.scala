package typings.babylonjs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object TextureTools {
  
  @JSImport("babylonjs", "TextureTools")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Apply a post process to a texture
    * @param postProcessName name of the fragment post process
    * @param internalTexture the texture to encode
    * @param scene the scene hosting the texture
    * @param type type of the output texture. If not provided, use the one from internalTexture
    * @param samplingMode sampling mode to use to sample the source texture. If not provided, use the one from internalTexture
    * @param format format of the output texture. If not provided, use the one from internalTexture
    * @returns a promise with the internalTexture having its texture replaced by the result of the processing
    */
  @JSImport("babylonjs", "TextureTools.ApplyPostProcess")
  @js.native
  def ApplyPostProcess: js.Function6[
    /* postProcessName */ String, 
    /* internalTexture */ typings.babylonjs.internalTextureMod.InternalTexture, 
    /* scene */ typings.babylonjs.sceneMod.Scene, 
    /* type */ js.UndefOr[Double], 
    /* samplingMode */ js.UndefOr[Double], 
    /* format */ js.UndefOr[Double], 
    js.Promise[typings.babylonjs.internalTextureMod.InternalTexture]
  ] = js.native
  /**
    * Apply a post process to a texture
    * @param postProcessName name of the fragment post process
    * @param internalTexture the texture to encode
    * @param scene the scene hosting the texture
    * @param type type of the output texture. If not provided, use the one from internalTexture
    * @param samplingMode sampling mode to use to sample the source texture. If not provided, use the one from internalTexture
    * @param format format of the output texture. If not provided, use the one from internalTexture
    * @returns a promise with the internalTexture having its texture replaced by the result of the processing
    */
  inline def ApplyPostProcess(
    postProcessName: String,
    internalTexture: typings.babylonjs.internalTextureMod.InternalTexture,
    scene: typings.babylonjs.sceneMod.Scene
  ): js.Promise[typings.babylonjs.internalTextureMod.InternalTexture] = (^.asInstanceOf[js.Dynamic].applyDynamic("ApplyPostProcess")(postProcessName.asInstanceOf[js.Any], internalTexture.asInstanceOf[js.Any], scene.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.babylonjs.internalTextureMod.InternalTexture]]
  inline def ApplyPostProcess(
    postProcessName: String,
    internalTexture: typings.babylonjs.internalTextureMod.InternalTexture,
    scene: typings.babylonjs.sceneMod.Scene,
    `type`: Double
  ): js.Promise[typings.babylonjs.internalTextureMod.InternalTexture] = (^.asInstanceOf[js.Dynamic].applyDynamic("ApplyPostProcess")(postProcessName.asInstanceOf[js.Any], internalTexture.asInstanceOf[js.Any], scene.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.babylonjs.internalTextureMod.InternalTexture]]
  inline def ApplyPostProcess(
    postProcessName: String,
    internalTexture: typings.babylonjs.internalTextureMod.InternalTexture,
    scene: typings.babylonjs.sceneMod.Scene,
    `type`: Double,
    samplingMode: Double
  ): js.Promise[typings.babylonjs.internalTextureMod.InternalTexture] = (^.asInstanceOf[js.Dynamic].applyDynamic("ApplyPostProcess")(postProcessName.asInstanceOf[js.Any], internalTexture.asInstanceOf[js.Any], scene.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], samplingMode.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.babylonjs.internalTextureMod.InternalTexture]]
  inline def ApplyPostProcess(
    postProcessName: String,
    internalTexture: typings.babylonjs.internalTextureMod.InternalTexture,
    scene: typings.babylonjs.sceneMod.Scene,
    `type`: Double,
    samplingMode: Double,
    format: Double
  ): js.Promise[typings.babylonjs.internalTextureMod.InternalTexture] = (^.asInstanceOf[js.Dynamic].applyDynamic("ApplyPostProcess")(postProcessName.asInstanceOf[js.Any], internalTexture.asInstanceOf[js.Any], scene.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], samplingMode.asInstanceOf[js.Any], format.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.babylonjs.internalTextureMod.InternalTexture]]
  inline def ApplyPostProcess(
    postProcessName: String,
    internalTexture: typings.babylonjs.internalTextureMod.InternalTexture,
    scene: typings.babylonjs.sceneMod.Scene,
    `type`: Double,
    samplingMode: Unit,
    format: Double
  ): js.Promise[typings.babylonjs.internalTextureMod.InternalTexture] = (^.asInstanceOf[js.Dynamic].applyDynamic("ApplyPostProcess")(postProcessName.asInstanceOf[js.Any], internalTexture.asInstanceOf[js.Any], scene.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], samplingMode.asInstanceOf[js.Any], format.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.babylonjs.internalTextureMod.InternalTexture]]
  inline def ApplyPostProcess(
    postProcessName: String,
    internalTexture: typings.babylonjs.internalTextureMod.InternalTexture,
    scene: typings.babylonjs.sceneMod.Scene,
    `type`: Unit,
    samplingMode: Double
  ): js.Promise[typings.babylonjs.internalTextureMod.InternalTexture] = (^.asInstanceOf[js.Dynamic].applyDynamic("ApplyPostProcess")(postProcessName.asInstanceOf[js.Any], internalTexture.asInstanceOf[js.Any], scene.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], samplingMode.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.babylonjs.internalTextureMod.InternalTexture]]
  inline def ApplyPostProcess(
    postProcessName: String,
    internalTexture: typings.babylonjs.internalTextureMod.InternalTexture,
    scene: typings.babylonjs.sceneMod.Scene,
    `type`: Unit,
    samplingMode: Double,
    format: Double
  ): js.Promise[typings.babylonjs.internalTextureMod.InternalTexture] = (^.asInstanceOf[js.Dynamic].applyDynamic("ApplyPostProcess")(postProcessName.asInstanceOf[js.Any], internalTexture.asInstanceOf[js.Any], scene.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], samplingMode.asInstanceOf[js.Any], format.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.babylonjs.internalTextureMod.InternalTexture]]
  inline def ApplyPostProcess(
    postProcessName: String,
    internalTexture: typings.babylonjs.internalTextureMod.InternalTexture,
    scene: typings.babylonjs.sceneMod.Scene,
    `type`: Unit,
    samplingMode: Unit,
    format: Double
  ): js.Promise[typings.babylonjs.internalTextureMod.InternalTexture] = (^.asInstanceOf[js.Dynamic].applyDynamic("ApplyPostProcess")(postProcessName.asInstanceOf[js.Any], internalTexture.asInstanceOf[js.Any], scene.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], samplingMode.asInstanceOf[js.Any], format.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.babylonjs.internalTextureMod.InternalTexture]]
  inline def ApplyPostProcess_=(
    x: js.Function6[
      /* postProcessName */ String, 
      /* internalTexture */ typings.babylonjs.internalTextureMod.InternalTexture, 
      /* scene */ typings.babylonjs.sceneMod.Scene, 
      /* type */ js.UndefOr[Double], 
      /* samplingMode */ js.UndefOr[Double], 
      /* format */ js.UndefOr[Double], 
      js.Promise[typings.babylonjs.internalTextureMod.InternalTexture]
    ]
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ApplyPostProcess")(x.asInstanceOf[js.Any])
  
  /**
    * Uses the GPU to create a copy texture rescaled at a given size
    * @param texture Texture to copy from
    * @param width defines the desired width
    * @param height defines the desired height
    * @param useBilinearMode defines if bilinear mode has to be used
    * @returns the generated texture
    */
  @JSImport("babylonjs", "TextureTools.CreateResizedCopy")
  @js.native
  def CreateResizedCopy: js.Function4[
    /* texture */ typings.babylonjs.textureMod.Texture, 
    /* width */ Double, 
    /* height */ Double, 
    /* useBilinearMode */ js.UndefOr[Boolean], 
    typings.babylonjs.textureMod.Texture
  ] = js.native
  /**
    * Uses the GPU to create a copy texture rescaled at a given size
    * @param texture Texture to copy from
    * @param width defines the desired width
    * @param height defines the desired height
    * @param useBilinearMode defines if bilinear mode has to be used
    * @returns the generated texture
    */
  inline def CreateResizedCopy(texture: typings.babylonjs.textureMod.Texture, width: Double, height: Double): typings.babylonjs.textureMod.Texture = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateResizedCopy")(texture.asInstanceOf[js.Any], width.asInstanceOf[js.Any], height.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.textureMod.Texture]
  inline def CreateResizedCopy(
    texture: typings.babylonjs.textureMod.Texture,
    width: Double,
    height: Double,
    useBilinearMode: Boolean
  ): typings.babylonjs.textureMod.Texture = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateResizedCopy")(texture.asInstanceOf[js.Any], width.asInstanceOf[js.Any], height.asInstanceOf[js.Any], useBilinearMode.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.textureMod.Texture]
  inline def CreateResizedCopy_=(
    x: js.Function4[
      /* texture */ typings.babylonjs.textureMod.Texture, 
      /* width */ Double, 
      /* height */ Double, 
      /* useBilinearMode */ js.UndefOr[Boolean], 
      typings.babylonjs.textureMod.Texture
    ]
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CreateResizedCopy")(x.asInstanceOf[js.Any])
  
  /**
    * Converts a half float to a number
    * @param value half float to convert
    * @returns converted half float
    */
  @JSImport("babylonjs", "TextureTools.FromHalfFloat")
  @js.native
  def FromHalfFloat: js.Function1[/* value */ Double, Double] = js.native
  /**
    * Converts a half float to a number
    * @param value half float to convert
    * @returns converted half float
    */
  inline def FromHalfFloat(value: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("FromHalfFloat")(value.asInstanceOf[js.Any]).asInstanceOf[Double]
  inline def FromHalfFloat_=(x: js.Function1[/* value */ Double, Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FromHalfFloat")(x.asInstanceOf[js.Any])
  
  /**
    * Converts a number to half float
    * @param value number to convert
    * @returns converted number
    */
  @JSImport("babylonjs", "TextureTools.ToHalfFloat")
  @js.native
  def ToHalfFloat: js.Function1[/* value */ Double, Double] = js.native
  /**
    * Converts a number to half float
    * @param value number to convert
    * @returns converted number
    */
  inline def ToHalfFloat(value: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("ToHalfFloat")(value.asInstanceOf[js.Any]).asInstanceOf[Double]
  inline def ToHalfFloat_=(x: js.Function1[/* value */ Double, Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ToHalfFloat")(x.asInstanceOf[js.Any])
}
