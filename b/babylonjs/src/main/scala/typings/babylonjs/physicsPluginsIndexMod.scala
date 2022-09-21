package typings.babylonjs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object physicsPluginsIndexMod {
  
  @JSImport("babylonjs/Physics/Plugins/index", "AmmoJSPlugin")
  @js.native
  /**
    * Initializes the ammoJS plugin
    * @param _useDeltaForWorldStep if the time between frames should be used when calculating physics steps (Default: true)
    * @param ammoInjection can be used to inject your own ammo reference
    * @param overlappingPairCache can be used to specify your own overlapping pair cache
    */
  open class AmmoJSPlugin ()
    extends typings.babylonjs.ammoJSPluginMod.AmmoJSPlugin {
    def this(_useDeltaForWorldStep: Boolean) = this()
    def this(_useDeltaForWorldStep: Boolean, ammoInjection: Any) = this()
    def this(_useDeltaForWorldStep: Unit, ammoInjection: Any) = this()
    def this(_useDeltaForWorldStep: Boolean, ammoInjection: Any, overlappingPairCache: Any) = this()
    def this(_useDeltaForWorldStep: Boolean, ammoInjection: Unit, overlappingPairCache: Any) = this()
    def this(_useDeltaForWorldStep: Unit, ammoInjection: Any, overlappingPairCache: Any) = this()
    def this(_useDeltaForWorldStep: Unit, ammoInjection: Unit, overlappingPairCache: Any) = this()
  }
  /* static members */
  object AmmoJSPlugin {
    
    @JSImport("babylonjs/Physics/Plugins/index", "AmmoJSPlugin._DISABLE_COLLISION_FLAG")
    @js.native
    val _DISABLE_COLLISION_FLAG: Any = js.native
    
    @JSImport("babylonjs/Physics/Plugins/index", "AmmoJSPlugin._DISABLE_DEACTIVATION_FLAG")
    @js.native
    val _DISABLE_DEACTIVATION_FLAG: Any = js.native
    
    @JSImport("babylonjs/Physics/Plugins/index", "AmmoJSPlugin._KINEMATIC_FLAG")
    @js.native
    val _KINEMATIC_FLAG: Any = js.native
  }
  
  @JSImport("babylonjs/Physics/Plugins/index", "CannonJSPlugin")
  @js.native
  open class CannonJSPlugin ()
    extends typings.babylonjs.cannonJSPluginMod.CannonJSPlugin {
    def this(_useDeltaForWorldStep: Boolean) = this()
    def this(_useDeltaForWorldStep: Boolean, iterations: Double) = this()
    def this(_useDeltaForWorldStep: Unit, iterations: Double) = this()
    def this(_useDeltaForWorldStep: Boolean, iterations: Double, cannonInjection: Any) = this()
    def this(_useDeltaForWorldStep: Boolean, iterations: Unit, cannonInjection: Any) = this()
    def this(_useDeltaForWorldStep: Unit, iterations: Double, cannonInjection: Any) = this()
    def this(_useDeltaForWorldStep: Unit, iterations: Unit, cannonInjection: Any) = this()
  }
  
  @JSImport("babylonjs/Physics/Plugins/index", "OimoJSPlugin")
  @js.native
  open class OimoJSPlugin ()
    extends typings.babylonjs.oimoJSPluginMod.OimoJSPlugin {
    def this(_useDeltaForWorldStep: Boolean) = this()
    def this(_useDeltaForWorldStep: Boolean, iterations: Double) = this()
    def this(_useDeltaForWorldStep: Unit, iterations: Double) = this()
    def this(_useDeltaForWorldStep: Boolean, iterations: Double, oimoInjection: Any) = this()
    def this(_useDeltaForWorldStep: Boolean, iterations: Unit, oimoInjection: Any) = this()
    def this(_useDeltaForWorldStep: Unit, iterations: Double, oimoInjection: Any) = this()
    def this(_useDeltaForWorldStep: Unit, iterations: Unit, oimoInjection: Any) = this()
  }
}
