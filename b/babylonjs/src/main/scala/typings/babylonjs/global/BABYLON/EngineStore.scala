package typings.babylonjs.global.BABYLON

import typings.babylonjs.BABYLON.Nullable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("BABYLON.EngineStore")
@js.native
class EngineStore ()
  extends typings.babylonjs.BABYLON.EngineStore

/* static members */
@JSGlobal("BABYLON.EngineStore")
@js.native
object EngineStore extends js.Object {
  /**
    * Texture content used if a texture cannot loaded
    * @ignorenaming
    */
  var FallbackTexture: String = js.native
  /** Gets the list of created engines */
  var Instances: js.Array[typings.babylonjs.BABYLON.Engine] = js.native
  /**
    * Gets or sets a global variable indicating if fallback texture must be used when a texture cannot be loaded
    * @ignorenaming
    */
  var UseFallbackTexture: Boolean = js.native
  /** @hidden */
  var _LastCreatedScene: Nullable[typings.babylonjs.BABYLON.Scene] = js.native
  /**
    * Gets the latest created engine
    */
  def LastCreatedEngine: Nullable[typings.babylonjs.BABYLON.Engine] = js.native
  /**
    * Gets the latest created scene
    */
  def LastCreatedScene: Nullable[typings.babylonjs.BABYLON.Scene] = js.native
}

