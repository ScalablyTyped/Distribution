package typings.babylonjs.indexMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/index", "AmmoJSPlugin")
@js.native
/**
  * Initializes the ammoJS plugin
  * @param _useDeltaForWorldStep if the time between frames should be used when calculating physics steps (Default: true)
  * @param ammoInjection can be used to inject your own ammo reference
  * @param overlappingPairCache can be used to specify your own overlapping pair cache
  */
class AmmoJSPlugin ()
  extends typings.babylonjs.physicsIndexMod.AmmoJSPlugin {
  def this(_useDeltaForWorldStep: Boolean) = this()
  def this(_useDeltaForWorldStep: Boolean, ammoInjection: js.Any) = this()
  def this(_useDeltaForWorldStep: Unit, ammoInjection: js.Any) = this()
  def this(_useDeltaForWorldStep: Boolean, ammoInjection: js.Any, overlappingPairCache: js.Any) = this()
  def this(_useDeltaForWorldStep: Boolean, ammoInjection: Unit, overlappingPairCache: js.Any) = this()
  def this(_useDeltaForWorldStep: Unit, ammoInjection: js.Any, overlappingPairCache: js.Any) = this()
  def this(_useDeltaForWorldStep: Unit, ammoInjection: Unit, overlappingPairCache: js.Any) = this()
}
/* static members */
object AmmoJSPlugin {
  
  @JSImport("babylonjs/index", "AmmoJSPlugin.DISABLE_COLLISION_FLAG")
  @js.native
  val DISABLE_COLLISION_FLAG: js.Any = js.native
  
  @JSImport("babylonjs/index", "AmmoJSPlugin.DISABLE_DEACTIVATION_FLAG")
  @js.native
  val DISABLE_DEACTIVATION_FLAG: js.Any = js.native
  
  @JSImport("babylonjs/index", "AmmoJSPlugin.KINEMATIC_FLAG")
  @js.native
  val KINEMATIC_FLAG: js.Any = js.native
}
