package typings.babylonjs.legacyLegacyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/Legacy/legacy", "AmmoJSPlugin")
@js.native
/**
  * Initializes the ammoJS plugin
  * @param _useDeltaForWorldStep if the time between frames should be used when calculating physics steps (Default: true)
  * @param ammoInjection can be used to inject your own ammo reference
  * @param overlappingPairCache can be used to specify your own overlapping pair cache
  */
open class AmmoJSPlugin ()
  extends typings.babylonjs.indexMod.AmmoJSPlugin {
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
  
  @JSImport("babylonjs/Legacy/legacy", "AmmoJSPlugin._DISABLE_COLLISION_FLAG")
  @js.native
  val _DISABLE_COLLISION_FLAG: Any = js.native
  
  @JSImport("babylonjs/Legacy/legacy", "AmmoJSPlugin._DISABLE_DEACTIVATION_FLAG")
  @js.native
  val _DISABLE_DEACTIVATION_FLAG: Any = js.native
  
  @JSImport("babylonjs/Legacy/legacy", "AmmoJSPlugin._KINEMATIC_FLAG")
  @js.native
  val _KINEMATIC_FLAG: Any = js.native
}
