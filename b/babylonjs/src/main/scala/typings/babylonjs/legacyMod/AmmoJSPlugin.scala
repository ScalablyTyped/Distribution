package typings.babylonjs.legacyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/Legacy/legacy", "AmmoJSPlugin")
@js.native
/**
  * Initializes the ammoJS plugin
  * @param _useDeltaForWorldStep if the time between frames should be used when calculating physics steps (Default: true)
  * @param ammoInjection can be used to inject your own ammo reference
  * @param overlappingPairCache can be used to specify your own overlapping pair cache
  */
class AmmoJSPlugin ()
  extends typings.babylonjs.indexMod.AmmoJSPlugin {
  def this(_useDeltaForWorldStep: Boolean) = this()
  def this(_useDeltaForWorldStep: js.UndefOr[scala.Nothing], ammoInjection: js.Any) = this()
  def this(_useDeltaForWorldStep: Boolean, ammoInjection: js.Any) = this()
  def this(
    _useDeltaForWorldStep: js.UndefOr[scala.Nothing],
    ammoInjection: js.UndefOr[scala.Nothing],
    overlappingPairCache: js.Any
  ) = this()
  def this(
    _useDeltaForWorldStep: js.UndefOr[scala.Nothing],
    ammoInjection: js.Any,
    overlappingPairCache: js.Any
  ) = this()
  def this(
    _useDeltaForWorldStep: Boolean,
    ammoInjection: js.UndefOr[scala.Nothing],
    overlappingPairCache: js.Any
  ) = this()
  def this(_useDeltaForWorldStep: Boolean, ammoInjection: js.Any, overlappingPairCache: js.Any) = this()
}
/* static members */
@JSImport("babylonjs/Legacy/legacy", "AmmoJSPlugin")
@js.native
object AmmoJSPlugin extends js.Object {
  
  val DISABLE_COLLISION_FLAG: js.Any = js.native
  
  val DISABLE_DEACTIVATION_FLAG: js.Any = js.native
  
  val KINEMATIC_FLAG: js.Any = js.native
}
