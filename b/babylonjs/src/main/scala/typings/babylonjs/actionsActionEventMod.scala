package typings.babylonjs

import typings.babylonjs.mathsMathDotvectorMod.Vector2
import typings.babylonjs.meshesAbstractMeshMod.AbstractMesh
import typings.babylonjs.sceneMod.Scene
import typings.babylonjs.spritesSpriteMod.Sprite
import typings.babylonjs.typesMod.Nullable
import typings.std.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object actionsActionEventMod {
  
  @JSImport("babylonjs/Actions/actionEvent", "ActionEvent")
  @js.native
  open class ActionEvent protected ()
    extends StObject
       with IActionEvent {
    /**
      * Creates a new ActionEvent
      * @param source The mesh or sprite that triggered the action
      * @param pointerX The X mouse cursor position at the time of the event
      * @param pointerY The Y mouse cursor position at the time of the event
      * @param meshUnderPointer The mesh that is currently pointed at (can be null)
      * @param sourceEvent the original (browser) event that triggered the ActionEvent
      * @param additionalData additional data for the event
      */
    def this(
      /** The mesh or sprite that triggered the action */
    source: Any,
      /** The X mouse cursor position at the time of the event */
    pointerX: Double,
      /** The Y mouse cursor position at the time of the event */
    pointerY: Double,
      /** The mesh that is currently pointed at (can be null) */
    meshUnderPointer: Nullable[AbstractMesh]
    ) = this()
    def this(
      /** The mesh or sprite that triggered the action */
    source: Any,
      /** The X mouse cursor position at the time of the event */
    pointerX: Double,
      /** The Y mouse cursor position at the time of the event */
    pointerY: Double,
      /** The mesh that is currently pointed at (can be null) */
    meshUnderPointer: Nullable[AbstractMesh],
      /** the original (browser) event that triggered the ActionEvent */
    sourceEvent: Any
    ) = this()
    def this(
      /** The mesh or sprite that triggered the action */
    source: Any,
      /** The X mouse cursor position at the time of the event */
    pointerX: Double,
      /** The Y mouse cursor position at the time of the event */
    pointerY: Double,
      /** The mesh that is currently pointed at (can be null) */
    meshUnderPointer: Nullable[AbstractMesh],
      /** the original (browser) event that triggered the ActionEvent */
    sourceEvent: Any,
      /** additional data for the event */
    additionalData: Any
    ) = this()
    def this(
      /** The mesh or sprite that triggered the action */
    source: Any,
      /** The X mouse cursor position at the time of the event */
    pointerX: Double,
      /** The Y mouse cursor position at the time of the event */
    pointerY: Double,
      /** The mesh that is currently pointed at (can be null) */
    meshUnderPointer: Nullable[AbstractMesh],
      /** the original (browser) event that triggered the ActionEvent */
    sourceEvent: Unit,
      /** additional data for the event */
    additionalData: Any
    ) = this()
    
    /** The mesh that is currently pointed at (can be null) */
    /* CompleteClass */
    var meshUnderPointer: Nullable[AbstractMesh] = js.native
    
    /** The X mouse cursor position at the time of the event */
    /* CompleteClass */
    var pointerX: Double = js.native
    
    /** The Y mouse cursor position at the time of the event */
    /* CompleteClass */
    var pointerY: Double = js.native
    
    /** The mesh or sprite that triggered the action */
    /* CompleteClass */
    var source: Any = js.native
  }
  /* static members */
  object ActionEvent {
    
    @JSImport("babylonjs/Actions/actionEvent", "ActionEvent")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Helper function to auto-create an ActionEvent from a source mesh.
      * @param source The source mesh that triggered the event
      * @param evt The original (browser) event
      * @param additionalData additional data for the event
      * @returns the new ActionEvent
      */
    inline def CreateNew(source: AbstractMesh): ActionEvent = ^.asInstanceOf[js.Dynamic].applyDynamic("CreateNew")(source.asInstanceOf[js.Any]).asInstanceOf[ActionEvent]
    inline def CreateNew(source: AbstractMesh, evt: Any): ActionEvent = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateNew")(source.asInstanceOf[js.Any], evt.asInstanceOf[js.Any])).asInstanceOf[ActionEvent]
    inline def CreateNew(source: AbstractMesh, evt: Any, additionalData: Any): ActionEvent = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateNew")(source.asInstanceOf[js.Any], evt.asInstanceOf[js.Any], additionalData.asInstanceOf[js.Any])).asInstanceOf[ActionEvent]
    inline def CreateNew(source: AbstractMesh, evt: Unit, additionalData: Any): ActionEvent = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateNew")(source.asInstanceOf[js.Any], evt.asInstanceOf[js.Any], additionalData.asInstanceOf[js.Any])).asInstanceOf[ActionEvent]
    
    /**
      * Helper function to auto-create an ActionEvent from a primitive
      * @param prim defines the target primitive
      * @param pointerPos defines the pointer position
      * @param evt The original (browser) event
      * @param additionalData additional data for the event
      * @returns the new ActionEvent
      */
    inline def CreateNewFromPrimitive(prim: Any, pointerPos: Vector2): ActionEvent = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateNewFromPrimitive")(prim.asInstanceOf[js.Any], pointerPos.asInstanceOf[js.Any])).asInstanceOf[ActionEvent]
    inline def CreateNewFromPrimitive(prim: Any, pointerPos: Vector2, evt: Unit, additionalData: Any): ActionEvent = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateNewFromPrimitive")(prim.asInstanceOf[js.Any], pointerPos.asInstanceOf[js.Any], evt.asInstanceOf[js.Any], additionalData.asInstanceOf[js.Any])).asInstanceOf[ActionEvent]
    inline def CreateNewFromPrimitive(prim: Any, pointerPos: Vector2, evt: Event): ActionEvent = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateNewFromPrimitive")(prim.asInstanceOf[js.Any], pointerPos.asInstanceOf[js.Any], evt.asInstanceOf[js.Any])).asInstanceOf[ActionEvent]
    inline def CreateNewFromPrimitive(prim: Any, pointerPos: Vector2, evt: Event, additionalData: Any): ActionEvent = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateNewFromPrimitive")(prim.asInstanceOf[js.Any], pointerPos.asInstanceOf[js.Any], evt.asInstanceOf[js.Any], additionalData.asInstanceOf[js.Any])).asInstanceOf[ActionEvent]
    
    /**
      * Helper function to auto-create an ActionEvent from a scene. If triggered by a mesh use ActionEvent.CreateNew
      * @param scene the scene where the event occurred
      * @param evt The original (browser) event
      * @returns the new ActionEvent
      */
    inline def CreateNewFromScene(scene: Scene, evt: Any): ActionEvent = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateNewFromScene")(scene.asInstanceOf[js.Any], evt.asInstanceOf[js.Any])).asInstanceOf[ActionEvent]
    
    /**
      * Helper function to auto-create an ActionEvent from a source sprite
      * @param source The source sprite that triggered the event
      * @param scene Scene associated with the sprite
      * @param evt The original (browser) event
      * @param additionalData additional data for the event
      * @returns the new ActionEvent
      */
    inline def CreateNewFromSprite(source: Sprite, scene: Scene): ActionEvent = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateNewFromSprite")(source.asInstanceOf[js.Any], scene.asInstanceOf[js.Any])).asInstanceOf[ActionEvent]
    inline def CreateNewFromSprite(source: Sprite, scene: Scene, evt: Any): ActionEvent = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateNewFromSprite")(source.asInstanceOf[js.Any], scene.asInstanceOf[js.Any], evt.asInstanceOf[js.Any])).asInstanceOf[ActionEvent]
    inline def CreateNewFromSprite(source: Sprite, scene: Scene, evt: Any, additionalData: Any): ActionEvent = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateNewFromSprite")(source.asInstanceOf[js.Any], scene.asInstanceOf[js.Any], evt.asInstanceOf[js.Any], additionalData.asInstanceOf[js.Any])).asInstanceOf[ActionEvent]
    inline def CreateNewFromSprite(source: Sprite, scene: Scene, evt: Unit, additionalData: Any): ActionEvent = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateNewFromSprite")(source.asInstanceOf[js.Any], scene.asInstanceOf[js.Any], evt.asInstanceOf[js.Any], additionalData.asInstanceOf[js.Any])).asInstanceOf[ActionEvent]
  }
  
  trait IActionEvent extends StObject {
    
    /** additional data for the event */
    var additionalData: js.UndefOr[Any] = js.undefined
    
    /** The mesh that is currently pointed at (can be null) */
    var meshUnderPointer: Nullable[AbstractMesh]
    
    /** The X mouse cursor position at the time of the event */
    var pointerX: Double
    
    /** The Y mouse cursor position at the time of the event */
    var pointerY: Double
    
    /** The mesh or sprite that triggered the action */
    var source: Any
    
    /** the original (browser) event that triggered the ActionEvent */
    var sourceEvent: js.UndefOr[Any] = js.undefined
  }
  object IActionEvent {
    
    inline def apply(pointerX: Double, pointerY: Double, source: Any): IActionEvent = {
      val __obj = js.Dynamic.literal(pointerX = pointerX.asInstanceOf[js.Any], pointerY = pointerY.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], meshUnderPointer = null)
      __obj.asInstanceOf[IActionEvent]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IActionEvent] (val x: Self) extends AnyVal {
      
      inline def setAdditionalData(value: Any): Self = StObject.set(x, "additionalData", value.asInstanceOf[js.Any])
      
      inline def setAdditionalDataUndefined: Self = StObject.set(x, "additionalData", js.undefined)
      
      inline def setMeshUnderPointer(value: Nullable[AbstractMesh]): Self = StObject.set(x, "meshUnderPointer", value.asInstanceOf[js.Any])
      
      inline def setMeshUnderPointerNull: Self = StObject.set(x, "meshUnderPointer", null)
      
      inline def setPointerX(value: Double): Self = StObject.set(x, "pointerX", value.asInstanceOf[js.Any])
      
      inline def setPointerY(value: Double): Self = StObject.set(x, "pointerY", value.asInstanceOf[js.Any])
      
      inline def setSource(value: Any): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
      
      inline def setSourceEvent(value: Any): Self = StObject.set(x, "sourceEvent", value.asInstanceOf[js.Any])
      
      inline def setSourceEventUndefined: Self = StObject.set(x, "sourceEvent", js.undefined)
    }
  }
}
