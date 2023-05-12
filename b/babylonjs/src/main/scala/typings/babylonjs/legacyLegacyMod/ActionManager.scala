package typings.babylonjs.legacyLegacyMod

import typings.babylonjs.typesMod.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/Legacy/legacy", "ActionManager")
@js.native
/**
  * Creates a new action manager
  * @param scene defines the hosting scene
  */
open class ActionManager ()
  extends typings.babylonjs.indexMod.ActionManager {
  def this(scene: Nullable[typings.babylonjs.sceneMod.Scene]) = this()
}
/* static members */
object ActionManager {
  
  @JSImport("babylonjs/Legacy/legacy", "ActionManager")
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
    * @see https://doc.babylonjs.com/features/featuresDeepDive/events/actions#triggers
    */
  @JSImport("babylonjs/Legacy/legacy", "ActionManager.NothingTrigger")
  @js.native
  val NothingTrigger: Double = js.native
  
  /**
    * On center pick
    * @see https://doc.babylonjs.com/features/featuresDeepDive/events/actions#triggers
    */
  @JSImport("babylonjs/Legacy/legacy", "ActionManager.OnCenterPickTrigger")
  @js.native
  val OnCenterPickTrigger: Double = js.native
  
  /**
    * On double pick
    * @see https://doc.babylonjs.com/features/featuresDeepDive/events/actions#triggers
    */
  @JSImport("babylonjs/Legacy/legacy", "ActionManager.OnDoublePickTrigger")
  @js.native
  val OnDoublePickTrigger: Double = js.native
  
  /**
    * On every frame
    * @see https://doc.babylonjs.com/features/featuresDeepDive/events/actions#triggers
    */
  @JSImport("babylonjs/Legacy/legacy", "ActionManager.OnEveryFrameTrigger")
  @js.native
  val OnEveryFrameTrigger: Double = js.native
  
  /**
    * On intersection enter
    * @see https://doc.babylonjs.com/features/featuresDeepDive/events/actions#triggers
    */
  @JSImport("babylonjs/Legacy/legacy", "ActionManager.OnIntersectionEnterTrigger")
  @js.native
  val OnIntersectionEnterTrigger: Double = js.native
  
  /**
    * On intersection exit
    * @see https://doc.babylonjs.com/features/featuresDeepDive/events/actions#triggers
    */
  @JSImport("babylonjs/Legacy/legacy", "ActionManager.OnIntersectionExitTrigger")
  @js.native
  val OnIntersectionExitTrigger: Double = js.native
  
  /**
    * On key down
    * @see https://doc.babylonjs.com/features/featuresDeepDive/events/actions#triggers
    */
  @JSImport("babylonjs/Legacy/legacy", "ActionManager.OnKeyDownTrigger")
  @js.native
  val OnKeyDownTrigger: Double = js.native
  
  /**
    * On key up
    * @see https://doc.babylonjs.com/features/featuresDeepDive/events/actions#triggers
    */
  @JSImport("babylonjs/Legacy/legacy", "ActionManager.OnKeyUpTrigger")
  @js.native
  val OnKeyUpTrigger: Double = js.native
  
  /**
    * On left pick
    * @see https://doc.babylonjs.com/features/featuresDeepDive/events/actions#triggers
    */
  @JSImport("babylonjs/Legacy/legacy", "ActionManager.OnLeftPickTrigger")
  @js.native
  val OnLeftPickTrigger: Double = js.native
  
  /**
    * On long press
    * @see https://doc.babylonjs.com/features/featuresDeepDive/events/actions#triggers
    */
  @JSImport("babylonjs/Legacy/legacy", "ActionManager.OnLongPressTrigger")
  @js.native
  val OnLongPressTrigger: Double = js.native
  
  /**
    * On pick down
    * @see https://doc.babylonjs.com/features/featuresDeepDive/events/actions#triggers
    */
  @JSImport("babylonjs/Legacy/legacy", "ActionManager.OnPickDownTrigger")
  @js.native
  val OnPickDownTrigger: Double = js.native
  
  /**
    * On pick out.
    * This trigger will only be raised if you also declared a OnPickDown
    * @see https://doc.babylonjs.com/features/featuresDeepDive/events/actions#triggers
    */
  @JSImport("babylonjs/Legacy/legacy", "ActionManager.OnPickOutTrigger")
  @js.native
  val OnPickOutTrigger: Double = js.native
  
  /**
    * On pick
    * @see https://doc.babylonjs.com/features/featuresDeepDive/events/actions#triggers
    */
  @JSImport("babylonjs/Legacy/legacy", "ActionManager.OnPickTrigger")
  @js.native
  val OnPickTrigger: Double = js.native
  
  /**
    * On pick up
    * @see https://doc.babylonjs.com/features/featuresDeepDive/events/actions#triggers
    */
  @JSImport("babylonjs/Legacy/legacy", "ActionManager.OnPickUpTrigger")
  @js.native
  val OnPickUpTrigger: Double = js.native
  
  /**
    * On pointer out
    * @see https://doc.babylonjs.com/features/featuresDeepDive/events/actions#triggers
    */
  @JSImport("babylonjs/Legacy/legacy", "ActionManager.OnPointerOutTrigger")
  @js.native
  val OnPointerOutTrigger: Double = js.native
  
  /**
    * On pointer over
    * @see https://doc.babylonjs.com/features/featuresDeepDive/events/actions#triggers
    */
  @JSImport("babylonjs/Legacy/legacy", "ActionManager.OnPointerOverTrigger")
  @js.native
  val OnPointerOverTrigger: Double = js.native
  
  /**
    * On right pick
    * @see https://doc.babylonjs.com/features/featuresDeepDive/events/actions#triggers
    */
  @JSImport("babylonjs/Legacy/legacy", "ActionManager.OnRightPickTrigger")
  @js.native
  val OnRightPickTrigger: Double = js.native
  
  /**
    * Creates a new ActionManager from a JSON data
    * @param parsedActions defines the JSON data to read from
    * @param object defines the hosting mesh
    * @param scene defines the hosting scene
    */
  inline def Parse(
    parsedActions: Any,
    `object`: Nullable[typings.babylonjs.meshesAbstractMeshMod.AbstractMesh],
    scene: typings.babylonjs.sceneMod.Scene
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("Parse")(parsedActions.asInstanceOf[js.Any], `object`.asInstanceOf[js.Any], scene.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
