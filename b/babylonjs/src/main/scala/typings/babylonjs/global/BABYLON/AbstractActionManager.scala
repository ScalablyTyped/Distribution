package typings.babylonjs.global.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.AbstractActionManager")
@js.native
abstract class AbstractActionManager ()
  extends typings.babylonjs.BABYLON.AbstractActionManager
/* static members */
object AbstractActionManager {
  
  @JSGlobal("BABYLON.AbstractActionManager")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Does exist one action manager that handles actions of a given trigger
    * @param trigger defines the trigger to be tested
    * @return a boolean indicating whether the trigger is handeled by at least one action manager
    **/
  @JSGlobal("BABYLON.AbstractActionManager.HasSpecificTrigger")
  @js.native
  def HasSpecificTrigger(trigger: Double): Boolean = js.native
  
  /** Gets the list of active triggers */
  @JSGlobal("BABYLON.AbstractActionManager.Triggers")
  @js.native
  def Triggers: org.scalablytyped.runtime.StringDictionary[Double] = js.native
  @scala.inline
  def Triggers_=(x: org.scalablytyped.runtime.StringDictionary[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Triggers")(x.asInstanceOf[js.Any])
}
