package typings.babylonjs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs", "AbstractActionManager")
@js.native
abstract class AbstractActionManager ()
  extends typings.babylonjs.legacyMod.AbstractActionManager
/* static members */
@JSImport("babylonjs", "AbstractActionManager")
@js.native
object AbstractActionManager extends js.Object {
  
  /**
    * Does exist one action manager with at least one pick trigger
    **/
  def HasPickTriggers: Boolean = js.native
  
  /**
    * Does exist one action manager that handles actions of a given trigger
    * @param trigger defines the trigger to be tested
    * @return a boolean indicating whether the trigger is handeled by at least one action manager
    **/
  def HasSpecificTrigger(trigger: Double): Boolean = js.native
  
  /**
    * Does exist one action manager with at least one trigger
    **/
  def HasTriggers: Boolean = js.native
  
  /** Gets the list of active triggers */
  var Triggers: org.scalablytyped.runtime.StringDictionary[Double] = js.native
}
