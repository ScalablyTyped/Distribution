package typings
package babylonjsLib.babylonjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Action Manager manages all events to be triggered on a given mesh or the global scene.
  * A single scene can have many Action Managers to handle predefined actions on specific meshes.
  * @see http://doc.babylonjs.com/how_to/how_to_use_actions
  */
@JSImport("babylonjs", "ActionManager")
@js.native
class ActionManager protected ()
  extends babylonjsLib.BABYLONNs.ActionManager {
  /**
    * Creates a new action manager
    * @param scene defines the hosting scene
    */
  def this(scene: babylonjsLib.BABYLONNs.Scene) = this()
}

/* static members */
@JSImport("babylonjs", "ActionManager")
@js.native
object ActionManager extends js.Object {
  /**
    * Does exist one action manager with at least one pick trigger
    **/
  val HasPickTriggers: scala.Boolean = js.native
  /**
    * Does exist one action manager with at least one trigger
    **/
  val HasTriggers: scala.Boolean = js.native
  /**
    * Nothing
    * @see http://doc.babylonjs.com/how_to/how_to_use_actions#triggers
    */
  val NothingTrigger: scala.Double = js.native
  /**
    * On center pick
    * @see http://doc.babylonjs.com/how_to/how_to_use_actions#triggers
    */
  val OnCenterPickTrigger: scala.Double = js.native
  /**
    * On double pick
    * @see http://doc.babylonjs.com/how_to/how_to_use_actions#triggers
    */
  val OnDoublePickTrigger: scala.Double = js.native
  /**
    * On every frame
    * @see http://doc.babylonjs.com/how_to/how_to_use_actions#triggers
    */
  val OnEveryFrameTrigger: scala.Double = js.native
  /**
    * On intersection enter
    * @see http://doc.babylonjs.com/how_to/how_to_use_actions#triggers
    */
  val OnIntersectionEnterTrigger: scala.Double = js.native
  /**
    * On intersection exit
    * @see http://doc.babylonjs.com/how_to/how_to_use_actions#triggers
    */
  val OnIntersectionExitTrigger: scala.Double = js.native
  /**
    * On key down
    * @see http://doc.babylonjs.com/how_to/how_to_use_actions#triggers
    */
  val OnKeyDownTrigger: scala.Double = js.native
  /**
    * On key up
    * @see http://doc.babylonjs.com/how_to/how_to_use_actions#triggers
    */
  val OnKeyUpTrigger: scala.Double = js.native
  /**
    * On left pick
    * @see http://doc.babylonjs.com/how_to/how_to_use_actions#triggers
    */
  val OnLeftPickTrigger: scala.Double = js.native
  /**
    * On long press
    * @see http://doc.babylonjs.com/how_to/how_to_use_actions#triggers
    */
  val OnLongPressTrigger: scala.Double = js.native
  /**
    * On pick down
    * @see http://doc.babylonjs.com/how_to/how_to_use_actions#triggers
    */
  val OnPickDownTrigger: scala.Double = js.native
  /**
    * On pick out.
    * This trigger will only be raised if you also declared a OnPickDown
    * @see http://doc.babylonjs.com/how_to/how_to_use_actions#triggers
    */
  val OnPickOutTrigger: scala.Double = js.native
  /**
    * On pick
    * @see http://doc.babylonjs.com/how_to/how_to_use_actions#triggers
    */
  val OnPickTrigger: scala.Double = js.native
  /**
    * On pick up
    * @see http://doc.babylonjs.com/how_to/how_to_use_actions#triggers
    */
  val OnPickUpTrigger: scala.Double = js.native
  /**
    * On pointer out
    * @see http://doc.babylonjs.com/how_to/how_to_use_actions#triggers
    */
  val OnPointerOutTrigger: scala.Double = js.native
  /**
    * On pointer over
    * @see http://doc.babylonjs.com/how_to/how_to_use_actions#triggers
    */
  val OnPointerOverTrigger: scala.Double = js.native
  /**
    * On right pick
    * @see http://doc.babylonjs.com/how_to/how_to_use_actions#triggers
    */
  val OnRightPickTrigger: scala.Double = js.native
  /** Gets the list of active triggers */
  var Triggers: org.scalablytyped.runtime.StringDictionary[scala.Double] = js.native
  /**
    * Get a trigger name by index
    * @param trigger defines the trigger index
    * @returns a trigger name
    */
  def GetTriggerName(trigger: scala.Double): java.lang.String = js.native
  /**
    * Does exist one action manager that handles actions of a given trigger
    * @param trigger defines the trigger to be tested
    * @return a boolean indicating whether the trigger is handeled by at least one action manager
    **/
  def HasSpecificTrigger(trigger: scala.Double): scala.Boolean = js.native
  /**
    * Creates a new ActionManager from a JSON data
    * @param parsedActions defines the JSON data to read from
    * @param object defines the hosting mesh
    * @param scene defines the hosting scene
    */
  def Parse(
    parsedActions: js.Any,
    `object`: babylonjsLib.BABYLONNs.Nullable[babylonjsLib.BABYLONNs.AbstractMesh],
    scene: babylonjsLib.BABYLONNs.Scene
  ): scala.Unit = js.native
}

