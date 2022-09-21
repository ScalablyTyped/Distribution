package typings.babylonjs.global.BABYLON

import typings.babylonjs.BABYLON.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.BaseTexture")
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
  extends StObject
     with typings.babylonjs.BABYLON.BaseTexture {
  def this(sceneOrEngine: Nullable[typings.babylonjs.BABYLON.Scene | typings.babylonjs.BABYLON.ThinEngine]) = this()
  def this(sceneOrEngine: Unit, internalTexture: Nullable[typings.babylonjs.BABYLON.InternalTexture]) = this()
  def this(
    sceneOrEngine: Nullable[typings.babylonjs.BABYLON.Scene | typings.babylonjs.BABYLON.ThinEngine],
    internalTexture: Nullable[typings.babylonjs.BABYLON.InternalTexture]
  ) = this()
  
  /**
    * Array of animations
    */
  /* CompleteClass */
  var animations: Nullable[js.Array[typings.babylonjs.BABYLON.Animation]] = js.native
}
/* static members */
object BaseTexture {
  
  @JSGlobal("BABYLON.BaseTexture")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Default anisotropic filtering level for the application.
    * It is set to 4 as a good tradeoff between perf and quality.
    */
  @JSGlobal("BABYLON.BaseTexture.DEFAULT_ANISOTROPIC_FILTERING_LEVEL")
  @js.native
  def DEFAULT_ANISOTROPIC_FILTERING_LEVEL: Double = js.native
  inline def DEFAULT_ANISOTROPIC_FILTERING_LEVEL_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DEFAULT_ANISOTROPIC_FILTERING_LEVEL")(x.asInstanceOf[js.Any])
  
  /**
    * Helper function to be called back once a list of texture contains only ready textures.
    * @param textures Define the list of textures to wait for
    * @param callback Define the callback triggered once the entire list will be ready
    */
  inline def WhenAllReady(textures: js.Array[typings.babylonjs.BABYLON.BaseTexture], callback: js.Function0[Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("WhenAllReady")(textures.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @JSGlobal("BABYLON.BaseTexture._IsScene")
  @js.native
  def _IsScene: Any = js.native
  inline def _IsScene_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_IsScene")(x.asInstanceOf[js.Any])
}
