package typings.babylonjs.global.BABYLON

import typings.babylonjs.BABYLON.Nullable
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
@JSGlobal("BABYLON.BaseTexture")
@js.native
object BaseTexture extends js.Object {
  
  /**
    * Default anisotropic filtering level for the application.
    * It is set to 4 as a good tradeoff between perf and quality.
    */
  var DEFAULT_ANISOTROPIC_FILTERING_LEVEL: Double = js.native
  
  /**
    * Helper function to be called back once a list of texture contains only ready textures.
    * @param textures Define the list of textures to wait for
    * @param callback Define the callback triggered once the entire list will be ready
    */
  def WhenAllReady(textures: js.Array[typings.babylonjs.BABYLON.BaseTexture], callback: js.Function0[Unit]): Unit = js.native
  
  var _isScene: js.Any = js.native
}
