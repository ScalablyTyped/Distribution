package typings.babylonjs.legacyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/Legacy/legacy", "AbstractActionManager")
@js.native
abstract class AbstractActionManager ()
  extends typings.babylonjs.indexMod.AbstractActionManager
/* static members */
object AbstractActionManager {
  
  @JSImport("babylonjs/Legacy/legacy", "AbstractActionManager")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Does exist one action manager that handles actions of a given trigger
    * @param trigger defines the trigger to be tested
    * @return a boolean indicating whether the trigger is handeled by at least one action manager
    **/
  @JSImport("babylonjs/Legacy/legacy", "AbstractActionManager.HasSpecificTrigger")
  @js.native
  def HasSpecificTrigger(trigger: Double): Boolean = js.native
  
  /** Gets the list of active triggers */
  @JSImport("babylonjs/Legacy/legacy", "AbstractActionManager.Triggers")
  @js.native
  def Triggers: org.scalablytyped.runtime.StringDictionary[Double] = js.native
  @scala.inline
  def Triggers_=(x: org.scalablytyped.runtime.StringDictionary[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Triggers")(x.asInstanceOf[js.Any])
}
