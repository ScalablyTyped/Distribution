package typings.babylonjs.legacyLegacyMod

import typings.babylonjs.typesMod.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/Legacy/legacy", "BaseTexture")
@js.native
/**
  * Instantiates a new BaseTexture.
  * Base class of all the textures in babylon.
  * It groups all the common properties the materials, post process, lights... might need
  * in order to make a correct use of the texture.
  * @param sceneOrEngine Define the scene or engine the texture belongs to
  * @param internalTexture Define the internal texture associated with the texture
  */
open class BaseTexture ()
  extends typings.babylonjs.indexMod.BaseTexture {
  def this(sceneOrEngine: Nullable[
        typings.babylonjs.sceneMod.Scene | typings.babylonjs.enginesThinEngineMod.ThinEngine
      ]) = this()
  def this(
    sceneOrEngine: Unit,
    internalTexture: Nullable[typings.babylonjs.materialsTexturesInternalTextureMod.InternalTexture]
  ) = this()
  def this(
    sceneOrEngine: Nullable[
        typings.babylonjs.sceneMod.Scene | typings.babylonjs.enginesThinEngineMod.ThinEngine
      ],
    internalTexture: Nullable[typings.babylonjs.materialsTexturesInternalTextureMod.InternalTexture]
  ) = this()
}
/* static members */
object BaseTexture {
  
  @JSImport("babylonjs/Legacy/legacy", "BaseTexture")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Default anisotropic filtering level for the application.
    * It is set to 4 as a good tradeoff between perf and quality.
    */
  @JSImport("babylonjs/Legacy/legacy", "BaseTexture.DEFAULT_ANISOTROPIC_FILTERING_LEVEL")
  @js.native
  def DEFAULT_ANISOTROPIC_FILTERING_LEVEL: Double = js.native
  inline def DEFAULT_ANISOTROPIC_FILTERING_LEVEL_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DEFAULT_ANISOTROPIC_FILTERING_LEVEL")(x.asInstanceOf[js.Any])
  
  /**
    * Helper function to be called back once a list of texture contains only ready textures.
    * @param textures Define the list of textures to wait for
    * @param callback Define the callback triggered once the entire list will be ready
    */
  inline def WhenAllReady(
    textures: js.Array[typings.babylonjs.materialsTexturesBaseTextureMod.BaseTexture],
    callback: js.Function0[Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("WhenAllReady")(textures.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @JSImport("babylonjs/Legacy/legacy", "BaseTexture._IsScene")
  @js.native
  def _IsScene: Any = js.native
  inline def _IsScene_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_IsScene")(x.asInstanceOf[js.Any])
}
