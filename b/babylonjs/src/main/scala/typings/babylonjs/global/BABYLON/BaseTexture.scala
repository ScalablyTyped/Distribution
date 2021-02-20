package typings.babylonjs.global.BABYLON

import typings.babylonjs.BABYLON.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.BaseTexture")
@js.native
class BaseTexture protected ()
  extends typings.babylonjs.BABYLON.BaseTexture {
  /**
    * Instantiates a new BaseTexture.
    * Base class of all the textures in babylon.
    * It groups all the common properties the materials, post process, lights... might need
    * in order to make a correct use of the texture.
    * @param sceneOrEngine Define the scene or engine the texture blongs to
    */
  def this(sceneOrEngine: Nullable[typings.babylonjs.BABYLON.Scene | typings.babylonjs.BABYLON.ThinEngine]) = this()
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
  @scala.inline
  def DEFAULT_ANISOTROPIC_FILTERING_LEVEL_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DEFAULT_ANISOTROPIC_FILTERING_LEVEL")(x.asInstanceOf[js.Any])
  
  /**
    * Helper function to be called back once a list of texture contains only ready textures.
    * @param textures Define the list of textures to wait for
    * @param callback Define the callback triggered once the entire list will be ready
    */
  @JSGlobal("BABYLON.BaseTexture.WhenAllReady")
  @js.native
  def WhenAllReady(textures: js.Array[typings.babylonjs.BABYLON.BaseTexture], callback: js.Function0[Unit]): Unit = js.native
  
  @JSGlobal("BABYLON.BaseTexture._isScene")
  @js.native
  def _isScene: js.Any = js.native
  @scala.inline
  def _isScene_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_isScene")(x.asInstanceOf[js.Any])
}
