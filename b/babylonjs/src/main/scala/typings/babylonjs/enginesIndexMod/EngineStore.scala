package typings.babylonjs.enginesIndexMod

import typings.babylonjs.sceneMod.Scene
import typings.babylonjs.typesMod.Nullable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("babylonjs/Engines/index", "EngineStore")
@js.native
class EngineStore ()
  extends typings.babylonjs.engineStoreMod.EngineStore

/* static members */
@JSImport("babylonjs/Engines/index", "EngineStore")
@js.native
object EngineStore extends js.Object {
  /**
    * Texture content used if a texture cannot loaded
    * @ignorenaming
    */
  var FallbackTexture: String = js.native
  /** Gets the list of created engines */
  var Instances: js.Array[typings.babylonjs.engineMod.Engine] = js.native
  /**
    * Gets or sets a global variable indicating if fallback texture must be used when a texture cannot be loaded
    * @ignorenaming
    */
  var UseFallbackTexture: Boolean = js.native
  /** @hidden */
  var _LastCreatedScene: Nullable[Scene] = js.native
  /**
    * Gets the latest created engine
    */
  def LastCreatedEngine: Nullable[typings.babylonjs.engineMod.Engine] = js.native
  /**
    * Gets the latest created scene
    */
  def LastCreatedScene: Nullable[Scene] = js.native
}

