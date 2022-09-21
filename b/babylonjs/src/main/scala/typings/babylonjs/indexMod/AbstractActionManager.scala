package typings.babylonjs.indexMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/index", "AbstractActionManager")
@js.native
abstract class AbstractActionManager ()
  extends typings.babylonjs.actionsIndexMod.AbstractActionManager
/* static members */
object AbstractActionManager {
  
  @JSImport("babylonjs/index", "AbstractActionManager")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Does exist one action manager that handles actions of a given trigger
    * @param trigger defines the trigger to be tested
    * @returns a boolean indicating whether the trigger is handled by at least one action manager
    **/
  inline def HasSpecificTrigger(trigger: Double): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("HasSpecificTrigger")(trigger.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  /** Gets the list of active triggers */
  @JSImport("babylonjs/index", "AbstractActionManager.Triggers")
  @js.native
  def Triggers: org.scalablytyped.runtime.StringDictionary[Double] = js.native
  inline def Triggers_=(x: org.scalablytyped.runtime.StringDictionary[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Triggers")(x.asInstanceOf[js.Any])
}
