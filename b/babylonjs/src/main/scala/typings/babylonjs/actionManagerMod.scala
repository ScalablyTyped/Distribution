package typings.babylonjs

import typings.babylonjs.abstractActionManagerMod.AbstractActionManager
import typings.babylonjs.abstractMeshMod.AbstractMesh
import typings.babylonjs.sceneMod.Scene
import typings.babylonjs.typesMod.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object actionManagerMod {
  
  @JSImport("babylonjs/Actions/actionManager", "ActionManager")
  @js.native
  /**
    * Creates a new action manager
    * @param scene defines the hosting scene
    */
  open class ActionManager () extends AbstractActionManager {
    def this(scene: Nullable[Scene]) = this()
    
    /**
      * @internal
      */
    def _getEffectiveTarget(target: Any, propertyPath: String): Any = js.native
    
    /**
      * @internal
      */
    def _getProperty(propertyPath: String): String = js.native
    
    /* private */ var _scene: Any = js.native
    
    /**
      * Gets hosting scene
      * @returns the hosting scene
      */
    def getScene(): Scene = js.native
  }
  /* static members */
  object ActionManager {
    
    @JSImport("babylonjs/Actions/actionManager", "ActionManager")
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
    @JSImport("babylonjs/Actions/actionManager", "ActionManager.NothingTrigger")
    @js.native
    val NothingTrigger: Double = js.native
    
    /**
      * On center pick
      * @see https://doc.babylonjs.com/how_to/how_to_use_actions#triggers
      */
    @JSImport("babylonjs/Actions/actionManager", "ActionManager.OnCenterPickTrigger")
    @js.native
    val OnCenterPickTrigger: Double = js.native
    
    /**
      * On double pick
      * @see https://doc.babylonjs.com/how_to/how_to_use_actions#triggers
      */
    @JSImport("babylonjs/Actions/actionManager", "ActionManager.OnDoublePickTrigger")
    @js.native
    val OnDoublePickTrigger: Double = js.native
    
    /**
      * On every frame
      * @see https://doc.babylonjs.com/how_to/how_to_use_actions#triggers
      */
    @JSImport("babylonjs/Actions/actionManager", "ActionManager.OnEveryFrameTrigger")
    @js.native
    val OnEveryFrameTrigger: Double = js.native
    
    /**
      * On intersection enter
      * @see https://doc.babylonjs.com/how_to/how_to_use_actions#triggers
      */
    @JSImport("babylonjs/Actions/actionManager", "ActionManager.OnIntersectionEnterTrigger")
    @js.native
    val OnIntersectionEnterTrigger: Double = js.native
    
    /**
      * On intersection exit
      * @see https://doc.babylonjs.com/how_to/how_to_use_actions#triggers
      */
    @JSImport("babylonjs/Actions/actionManager", "ActionManager.OnIntersectionExitTrigger")
    @js.native
    val OnIntersectionExitTrigger: Double = js.native
    
    /**
      * On key down
      * @see https://doc.babylonjs.com/how_to/how_to_use_actions#triggers
      */
    @JSImport("babylonjs/Actions/actionManager", "ActionManager.OnKeyDownTrigger")
    @js.native
    val OnKeyDownTrigger: Double = js.native
    
    /**
      * On key up
      * @see https://doc.babylonjs.com/how_to/how_to_use_actions#triggers
      */
    @JSImport("babylonjs/Actions/actionManager", "ActionManager.OnKeyUpTrigger")
    @js.native
    val OnKeyUpTrigger: Double = js.native
    
    /**
      * On left pick
      * @see https://doc.babylonjs.com/how_to/how_to_use_actions#triggers
      */
    @JSImport("babylonjs/Actions/actionManager", "ActionManager.OnLeftPickTrigger")
    @js.native
    val OnLeftPickTrigger: Double = js.native
    
    /**
      * On long press
      * @see https://doc.babylonjs.com/how_to/how_to_use_actions#triggers
      */
    @JSImport("babylonjs/Actions/actionManager", "ActionManager.OnLongPressTrigger")
    @js.native
    val OnLongPressTrigger: Double = js.native
    
    /**
      * On pick down
      * @see https://doc.babylonjs.com/how_to/how_to_use_actions#triggers
      */
    @JSImport("babylonjs/Actions/actionManager", "ActionManager.OnPickDownTrigger")
    @js.native
    val OnPickDownTrigger: Double = js.native
    
    /**
      * On pick out.
      * This trigger will only be raised if you also declared a OnPickDown
      * @see https://doc.babylonjs.com/how_to/how_to_use_actions#triggers
      */
    @JSImport("babylonjs/Actions/actionManager", "ActionManager.OnPickOutTrigger")
    @js.native
    val OnPickOutTrigger: Double = js.native
    
    /**
      * On pick
      * @see https://doc.babylonjs.com/how_to/how_to_use_actions#triggers
      */
    @JSImport("babylonjs/Actions/actionManager", "ActionManager.OnPickTrigger")
    @js.native
    val OnPickTrigger: Double = js.native
    
    /**
      * On pick up
      * @see https://doc.babylonjs.com/how_to/how_to_use_actions#triggers
      */
    @JSImport("babylonjs/Actions/actionManager", "ActionManager.OnPickUpTrigger")
    @js.native
    val OnPickUpTrigger: Double = js.native
    
    /**
      * On pointer out
      * @see https://doc.babylonjs.com/how_to/how_to_use_actions#triggers
      */
    @JSImport("babylonjs/Actions/actionManager", "ActionManager.OnPointerOutTrigger")
    @js.native
    val OnPointerOutTrigger: Double = js.native
    
    /**
      * On pointer over
      * @see https://doc.babylonjs.com/how_to/how_to_use_actions#triggers
      */
    @JSImport("babylonjs/Actions/actionManager", "ActionManager.OnPointerOverTrigger")
    @js.native
    val OnPointerOverTrigger: Double = js.native
    
    /**
      * On right pick
      * @see https://doc.babylonjs.com/how_to/how_to_use_actions#triggers
      */
    @JSImport("babylonjs/Actions/actionManager", "ActionManager.OnRightPickTrigger")
    @js.native
    val OnRightPickTrigger: Double = js.native
    
    /**
      * Creates a new ActionManager from a JSON data
      * @param parsedActions defines the JSON data to read from
      * @param object defines the hosting mesh
      * @param scene defines the hosting scene
      */
    inline def Parse(parsedActions: Any, `object`: Nullable[AbstractMesh], scene: Scene): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("Parse")(parsedActions.asInstanceOf[js.Any], `object`.asInstanceOf[js.Any], scene.asInstanceOf[js.Any])).asInstanceOf[Unit]
  }
}
