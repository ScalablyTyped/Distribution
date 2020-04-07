package typings.babylonjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("babylonjs/Physics/Plugins/index", JSImport.Namespace)
@js.native
object physicsPluginsIndexMod extends js.Object {
  @js.native
  /**
    * Initializes the ammoJS plugin
    * @param _useDeltaForWorldStep if the time between frames should be used when calculating physics steps (Default: true)
    * @param ammoInjection can be used to inject your own ammo reference
    * @param overlappingPairCache can be used to specify your own overlapping pair cache
    */
  class AmmoJSPlugin ()
    extends typings.babylonjs.ammoJSPluginMod.AmmoJSPlugin {
    def this(_useDeltaForWorldStep: Boolean) = this()
    def this(_useDeltaForWorldStep: Boolean, ammoInjection: js.Any) = this()
    def this(_useDeltaForWorldStep: Boolean, ammoInjection: js.Any, overlappingPairCache: js.Any) = this()
  }
  
  @js.native
  class CannonJSPlugin ()
    extends typings.babylonjs.cannonJSPluginMod.CannonJSPlugin {
    def this(_useDeltaForWorldStep: Boolean) = this()
    def this(_useDeltaForWorldStep: Boolean, iterations: Double) = this()
    def this(_useDeltaForWorldStep: Boolean, iterations: Double, cannonInjection: js.Any) = this()
  }
  
  @js.native
  class OimoJSPlugin ()
    extends typings.babylonjs.oimoJSPluginMod.OimoJSPlugin {
    def this(iterations: Double) = this()
    def this(iterations: Double, oimoInjection: js.Any) = this()
  }
  
  /* static members */
  @js.native
  object AmmoJSPlugin extends js.Object {
    val DISABLE_COLLISION_FLAG: js.Any = js.native
    val DISABLE_DEACTIVATION_FLAG: js.Any = js.native
    val KINEMATIC_FLAG: js.Any = js.native
  }
  
}

