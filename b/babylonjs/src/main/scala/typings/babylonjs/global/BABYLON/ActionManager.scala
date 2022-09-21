package typings.babylonjs.global.BABYLON

import typings.babylonjs.BABYLON.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.ActionManager")
@js.native
/**
  * Creates a new action manager
  * @param scene defines the hosting scene
  */
open class ActionManager ()
  extends StObject
     with typings.babylonjs.BABYLON.ActionManager {
  def this(scene: Nullable[typings.babylonjs.BABYLON.Scene]) = this()
  
  /**
    * Releases all held resources
    */
  /* CompleteClass */
  override def dispose(): Unit = js.native
}
/* static members */
object ActionManager {
  
  @JSGlobal("BABYLON.ActionManager")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Get a trigger name by index
    * @param trigger defines the trigger index
    * @returns a trigger name
    */
  inline def GetTriggerName(trigger: Double): String = ^.asInstanceOf[js.Dynamic].applyDynamic("GetTriggerName")(trigger.asInstanceOf[js.Any]).asInstanceOf[String]
  
  /**
    * Nothing
    * @see https://doc.babylonjs.com/how_to/how_to_use_actions#triggers
    */
  @JSGlobal("BABYLON.ActionManager.NothingTrigger")
  @js.native
  val NothingTrigger: /* 0 */ Double = js.native
  
  /**
    * On center pick
    * @see https://doc.babylonjs.com/how_to/how_to_use_actions#triggers
    */
  @JSGlobal("BABYLON.ActionManager.OnCenterPickTrigger")
  @js.native
  val OnCenterPickTrigger: /* 4 */ Double = js.native
  
  /**
    * On double pick
    * @see https://doc.babylonjs.com/how_to/how_to_use_actions#triggers
    */
  @JSGlobal("BABYLON.ActionManager.OnDoublePickTrigger")
  @js.native
  val OnDoublePickTrigger: /* 6 */ Double = js.native
  
  /**
    * On every frame
    * @see https://doc.babylonjs.com/how_to/how_to_use_actions#triggers
    */
  @JSGlobal("BABYLON.ActionManager.OnEveryFrameTrigger")
  @js.native
  val OnEveryFrameTrigger: /* 11 */ Double = js.native
  
  /**
    * On intersection enter
    * @see https://doc.babylonjs.com/how_to/how_to_use_actions#triggers
    */
  @JSGlobal("BABYLON.ActionManager.OnIntersectionEnterTrigger")
  @js.native
  val OnIntersectionEnterTrigger: /* 12 */ Double = js.native
  
  /**
    * On intersection exit
    * @see https://doc.babylonjs.com/how_to/how_to_use_actions#triggers
    */
  @JSGlobal("BABYLON.ActionManager.OnIntersectionExitTrigger")
  @js.native
  val OnIntersectionExitTrigger: /* 13 */ Double = js.native
  
  /**
    * On key down
    * @see https://doc.babylonjs.com/how_to/how_to_use_actions#triggers
    */
  @JSGlobal("BABYLON.ActionManager.OnKeyDownTrigger")
  @js.native
  val OnKeyDownTrigger: /* 14 */ Double = js.native
  
  /**
    * On key up
    * @see https://doc.babylonjs.com/how_to/how_to_use_actions#triggers
    */
  @JSGlobal("BABYLON.ActionManager.OnKeyUpTrigger")
  @js.native
  val OnKeyUpTrigger: /* 15 */ Double = js.native
  
  /**
    * On left pick
    * @see https://doc.babylonjs.com/how_to/how_to_use_actions#triggers
    */
  @JSGlobal("BABYLON.ActionManager.OnLeftPickTrigger")
  @js.native
  val OnLeftPickTrigger: /* 2 */ Double = js.native
  
  /**
    * On long press
    * @see https://doc.babylonjs.com/how_to/how_to_use_actions#triggers
    */
  @JSGlobal("BABYLON.ActionManager.OnLongPressTrigger")
  @js.native
  val OnLongPressTrigger: /* 8 */ Double = js.native
  
  /**
    * On pick down
    * @see https://doc.babylonjs.com/how_to/how_to_use_actions#triggers
    */
  @JSGlobal("BABYLON.ActionManager.OnPickDownTrigger")
  @js.native
  val OnPickDownTrigger: /* 5 */ Double = js.native
  
  /**
    * On pick out.
    * This trigger will only be raised if you also declared a OnPickDown
    * @see https://doc.babylonjs.com/how_to/how_to_use_actions#triggers
    */
  @JSGlobal("BABYLON.ActionManager.OnPickOutTrigger")
  @js.native
  val OnPickOutTrigger: /* 16 */ Double = js.native
  
  /**
    * On pick
    * @see https://doc.babylonjs.com/how_to/how_to_use_actions#triggers
    */
  @JSGlobal("BABYLON.ActionManager.OnPickTrigger")
  @js.native
  val OnPickTrigger: /* 1 */ Double = js.native
  
  /**
    * On pick up
    * @see https://doc.babylonjs.com/how_to/how_to_use_actions#triggers
    */
  @JSGlobal("BABYLON.ActionManager.OnPickUpTrigger")
  @js.native
  val OnPickUpTrigger: /* 7 */ Double = js.native
  
  /**
    * On pointer out
    * @see https://doc.babylonjs.com/how_to/how_to_use_actions#triggers
    */
  @JSGlobal("BABYLON.ActionManager.OnPointerOutTrigger")
  @js.native
  val OnPointerOutTrigger: /* 10 */ Double = js.native
  
  /**
    * On pointer over
    * @see https://doc.babylonjs.com/how_to/how_to_use_actions#triggers
    */
  @JSGlobal("BABYLON.ActionManager.OnPointerOverTrigger")
  @js.native
  val OnPointerOverTrigger: /* 9 */ Double = js.native
  
  /**
    * On right pick
    * @see https://doc.babylonjs.com/how_to/how_to_use_actions#triggers
    */
  @JSGlobal("BABYLON.ActionManager.OnRightPickTrigger")
  @js.native
  val OnRightPickTrigger: /* 3 */ Double = js.native
  
  /**
    * Creates a new ActionManager from a JSON data
    * @param parsedActions defines the JSON data to read from
    * @param object defines the hosting mesh
    * @param scene defines the hosting scene
    */
  inline def Parse(
    parsedActions: Any,
    `object`: Nullable[typings.babylonjs.BABYLON.AbstractMesh],
    scene: typings.babylonjs.BABYLON.Scene
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("Parse")(parsedActions.asInstanceOf[js.Any], `object`.asInstanceOf[js.Any], scene.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
