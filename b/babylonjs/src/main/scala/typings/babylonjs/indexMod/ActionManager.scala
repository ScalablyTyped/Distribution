package typings.babylonjs.indexMod

import typings.babylonjs.typesMod.Nullable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("babylonjs/index", "ActionManager")
@js.native
class ActionManager protected ()
  extends typings.babylonjs.actionsIndexMod.ActionManager {
  /**
    * Creates a new action manager
    * @param scene defines the hosting scene
    */
  def this(scene: typings.babylonjs.sceneMod.Scene) = this()
}

/* static members */
@JSImport("babylonjs/index", "ActionManager")
@js.native
object ActionManager extends js.Object {
  /**
    * Nothing
    * @see http://doc.babylonjs.com/how_to/how_to_use_actions#triggers
    */
  val NothingTrigger: Double = js.native
  /**
    * On center pick
    * @see http://doc.babylonjs.com/how_to/how_to_use_actions#triggers
    */
  val OnCenterPickTrigger: Double = js.native
  /**
    * On double pick
    * @see http://doc.babylonjs.com/how_to/how_to_use_actions#triggers
    */
  val OnDoublePickTrigger: Double = js.native
  /**
    * On every frame
    * @see http://doc.babylonjs.com/how_to/how_to_use_actions#triggers
    */
  val OnEveryFrameTrigger: Double = js.native
  /**
    * On intersection enter
    * @see http://doc.babylonjs.com/how_to/how_to_use_actions#triggers
    */
  val OnIntersectionEnterTrigger: Double = js.native
  /**
    * On intersection exit
    * @see http://doc.babylonjs.com/how_to/how_to_use_actions#triggers
    */
  val OnIntersectionExitTrigger: Double = js.native
  /**
    * On key down
    * @see http://doc.babylonjs.com/how_to/how_to_use_actions#triggers
    */
  val OnKeyDownTrigger: Double = js.native
  /**
    * On key up
    * @see http://doc.babylonjs.com/how_to/how_to_use_actions#triggers
    */
  val OnKeyUpTrigger: Double = js.native
  /**
    * On left pick
    * @see http://doc.babylonjs.com/how_to/how_to_use_actions#triggers
    */
  val OnLeftPickTrigger: Double = js.native
  /**
    * On long press
    * @see http://doc.babylonjs.com/how_to/how_to_use_actions#triggers
    */
  val OnLongPressTrigger: Double = js.native
  /**
    * On pick down
    * @see http://doc.babylonjs.com/how_to/how_to_use_actions#triggers
    */
  val OnPickDownTrigger: Double = js.native
  /**
    * On pick out.
    * This trigger will only be raised if you also declared a OnPickDown
    * @see http://doc.babylonjs.com/how_to/how_to_use_actions#triggers
    */
  val OnPickOutTrigger: Double = js.native
  /**
    * On pick
    * @see http://doc.babylonjs.com/how_to/how_to_use_actions#triggers
    */
  val OnPickTrigger: Double = js.native
  /**
    * On pick up
    * @see http://doc.babylonjs.com/how_to/how_to_use_actions#triggers
    */
  val OnPickUpTrigger: Double = js.native
  /**
    * On pointer out
    * @see http://doc.babylonjs.com/how_to/how_to_use_actions#triggers
    */
  val OnPointerOutTrigger: Double = js.native
  /**
    * On pointer over
    * @see http://doc.babylonjs.com/how_to/how_to_use_actions#triggers
    */
  val OnPointerOverTrigger: Double = js.native
  /**
    * On right pick
    * @see http://doc.babylonjs.com/how_to/how_to_use_actions#triggers
    */
  val OnRightPickTrigger: Double = js.native
  /**
    * Get a trigger name by index
    * @param trigger defines the trigger index
    * @returns a trigger name
    */
  def GetTriggerName(trigger: Double): String = js.native
  /**
    * Creates a new ActionManager from a JSON data
    * @param parsedActions defines the JSON data to read from
    * @param object defines the hosting mesh
    * @param scene defines the hosting scene
    */
  def Parse(
    parsedActions: js.Any,
    `object`: Nullable[typings.babylonjs.abstractMeshMod.AbstractMesh],
    scene: typings.babylonjs.sceneMod.Scene
  ): Unit = js.native
}

