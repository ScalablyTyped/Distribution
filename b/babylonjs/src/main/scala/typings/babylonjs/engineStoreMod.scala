package typings.babylonjs

import typings.babylonjs.engineMod.Engine
import typings.babylonjs.sceneMod.Scene
import typings.babylonjs.typesMod.Nullable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("babylonjs/Engines/engineStore", JSImport.Namespace)
@js.native
object engineStoreMod extends js.Object {
  @js.native
  class EngineStore () extends js.Object
  
  /* static members */
  @js.native
  object EngineStore extends js.Object {
    /**
      * Texture content used if a texture cannot loaded
      * @ignorenaming
      */
    var FallbackTexture: String = js.native
    /** Gets the list of created engines */
    var Instances: js.Array[Engine] = js.native
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
    def LastCreatedEngine(): Nullable[Engine] = js.native
    /**
      * Gets the latest created scene
      */
    def LastCreatedScene(): Nullable[Scene] = js.native
  }
  
}

