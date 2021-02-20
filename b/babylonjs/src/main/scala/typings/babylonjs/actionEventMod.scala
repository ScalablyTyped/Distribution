package typings.babylonjs

import typings.babylonjs.abstractMeshMod.AbstractMesh
import typings.babylonjs.mathVectorMod.Vector2
import typings.babylonjs.sceneMod.Scene
import typings.babylonjs.spriteMod.Sprite
import typings.babylonjs.typesMod.Nullable
import typings.std.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object actionEventMod {
  
  @JSImport("babylonjs/Actions/actionEvent", "ActionEvent")
  @js.native
  class ActionEvent protected () extends IActionEvent {
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
    source: js.Any,
      /** The X mouse cursor position at the time of the event */
    pointerX: Double,
      /** The Y mouse cursor position at the time of the event */
    pointerY: Double,
      /** The mesh that is currently pointed at (can be null) */
    meshUnderPointer: Nullable[AbstractMesh]
    ) = this()
    def this(
      /** The mesh or sprite that triggered the action */
    source: js.Any,
      /** The X mouse cursor position at the time of the event */
    pointerX: Double,
      /** The Y mouse cursor position at the time of the event */
    pointerY: Double,
      /** The mesh that is currently pointed at (can be null) */
    meshUnderPointer: Nullable[AbstractMesh],
      /** the original (browser) event that triggered the ActionEvent */
    sourceEvent: js.Any
    ) = this()
    def this(
      /** The mesh or sprite that triggered the action */
    source: js.Any,
      /** The X mouse cursor position at the time of the event */
    pointerX: Double,
      /** The Y mouse cursor position at the time of the event */
    pointerY: Double,
      /** The mesh that is currently pointed at (can be null) */
    meshUnderPointer: Nullable[AbstractMesh],
      /** the original (browser) event that triggered the ActionEvent */
    sourceEvent: js.UndefOr[scala.Nothing],
      /** additional data for the event */
    additionalData: js.Any
    ) = this()
    def this(
      /** The mesh or sprite that triggered the action */
    source: js.Any,
      /** The X mouse cursor position at the time of the event */
    pointerX: Double,
      /** The Y mouse cursor position at the time of the event */
    pointerY: Double,
      /** The mesh that is currently pointed at (can be null) */
    meshUnderPointer: Nullable[AbstractMesh],
      /** the original (browser) event that triggered the ActionEvent */
    sourceEvent: js.Any,
      /** additional data for the event */
    additionalData: js.Any
    ) = this()
  }
  /* static members */
  object ActionEvent {
    
    /**
      * Helper function to auto-create an ActionEvent from a source mesh.
      * @param source The source mesh that triggered the event
      * @param evt The original (browser) event
      * @param additionalData additional data for the event
      * @returns the new ActionEvent
      */
    @JSImport("babylonjs/Actions/actionEvent", "ActionEvent.CreateNew")
    @js.native
    def CreateNew(source: AbstractMesh): ActionEvent = js.native
    @JSImport("babylonjs/Actions/actionEvent", "ActionEvent.CreateNew")
    @js.native
    def CreateNew(source: AbstractMesh, evt: js.UndefOr[scala.Nothing], additionalData: js.Any): ActionEvent = js.native
    @JSImport("babylonjs/Actions/actionEvent", "ActionEvent.CreateNew")
    @js.native
    def CreateNew(source: AbstractMesh, evt: Event): ActionEvent = js.native
    @JSImport("babylonjs/Actions/actionEvent", "ActionEvent.CreateNew")
    @js.native
    def CreateNew(source: AbstractMesh, evt: Event, additionalData: js.Any): ActionEvent = js.native
    
    /**
      * Helper function to auto-create an ActionEvent from a primitive
      * @param prim defines the target primitive
      * @param pointerPos defines the pointer position
      * @param evt The original (browser) event
      * @param additionalData additional data for the event
      * @returns the new ActionEvent
      */
    @JSImport("babylonjs/Actions/actionEvent", "ActionEvent.CreateNewFromPrimitive")
    @js.native
    def CreateNewFromPrimitive(prim: js.Any, pointerPos: Vector2): ActionEvent = js.native
    @JSImport("babylonjs/Actions/actionEvent", "ActionEvent.CreateNewFromPrimitive")
    @js.native
    def CreateNewFromPrimitive(prim: js.Any, pointerPos: Vector2, evt: js.UndefOr[scala.Nothing], additionalData: js.Any): ActionEvent = js.native
    @JSImport("babylonjs/Actions/actionEvent", "ActionEvent.CreateNewFromPrimitive")
    @js.native
    def CreateNewFromPrimitive(prim: js.Any, pointerPos: Vector2, evt: Event): ActionEvent = js.native
    @JSImport("babylonjs/Actions/actionEvent", "ActionEvent.CreateNewFromPrimitive")
    @js.native
    def CreateNewFromPrimitive(prim: js.Any, pointerPos: Vector2, evt: Event, additionalData: js.Any): ActionEvent = js.native
    
    /**
      * Helper function to auto-create an ActionEvent from a scene. If triggered by a mesh use ActionEvent.CreateNew
      * @param scene the scene where the event occurred
      * @param evt The original (browser) event
      * @returns the new ActionEvent
      */
    @JSImport("babylonjs/Actions/actionEvent", "ActionEvent.CreateNewFromScene")
    @js.native
    def CreateNewFromScene(scene: Scene, evt: Event): ActionEvent = js.native
    
    /**
      * Helper function to auto-create an ActionEvent from a source sprite
      * @param source The source sprite that triggered the event
      * @param scene Scene associated with the sprite
      * @param evt The original (browser) event
      * @param additionalData additional data for the event
      * @returns the new ActionEvent
      */
    @JSImport("babylonjs/Actions/actionEvent", "ActionEvent.CreateNewFromSprite")
    @js.native
    def CreateNewFromSprite(source: Sprite, scene: Scene): ActionEvent = js.native
    @JSImport("babylonjs/Actions/actionEvent", "ActionEvent.CreateNewFromSprite")
    @js.native
    def CreateNewFromSprite(source: Sprite, scene: Scene, evt: js.UndefOr[scala.Nothing], additionalData: js.Any): ActionEvent = js.native
    @JSImport("babylonjs/Actions/actionEvent", "ActionEvent.CreateNewFromSprite")
    @js.native
    def CreateNewFromSprite(source: Sprite, scene: Scene, evt: Event): ActionEvent = js.native
    @JSImport("babylonjs/Actions/actionEvent", "ActionEvent.CreateNewFromSprite")
    @js.native
    def CreateNewFromSprite(source: Sprite, scene: Scene, evt: Event, additionalData: js.Any): ActionEvent = js.native
  }
  
  @js.native
  trait IActionEvent extends StObject {
    
    /** additional data for the event */
    var additionalData: js.UndefOr[js.Any] = js.native
    
    /** The mesh that is currently pointed at (can be null) */
    var meshUnderPointer: Nullable[AbstractMesh] = js.native
    
    /** The X mouse cursor position at the time of the event */
    var pointerX: Double = js.native
    
    /** The Y mouse cursor position at the time of the event */
    var pointerY: Double = js.native
    
    /** The mesh or sprite that triggered the action */
    var source: js.Any = js.native
    
    /** the original (browser) event that triggered the ActionEvent */
    var sourceEvent: js.UndefOr[js.Any] = js.native
  }
  object IActionEvent {
    
    @scala.inline
    def apply(pointerX: Double, pointerY: Double, source: js.Any): IActionEvent = {
      val __obj = js.Dynamic.literal(pointerX = pointerX.asInstanceOf[js.Any], pointerY = pointerY.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
      __obj.asInstanceOf[IActionEvent]
    }
    
    @scala.inline
    implicit class IActionEventMutableBuilder[Self <: IActionEvent] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAdditionalData(value: js.Any): Self = StObject.set(x, "additionalData", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAdditionalDataUndefined: Self = StObject.set(x, "additionalData", js.undefined)
      
      @scala.inline
      def setMeshUnderPointer(value: Nullable[AbstractMesh]): Self = StObject.set(x, "meshUnderPointer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMeshUnderPointerNull: Self = StObject.set(x, "meshUnderPointer", null)
      
      @scala.inline
      def setPointerX(value: Double): Self = StObject.set(x, "pointerX", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPointerY(value: Double): Self = StObject.set(x, "pointerY", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSource(value: js.Any): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSourceEvent(value: js.Any): Self = StObject.set(x, "sourceEvent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSourceEventUndefined: Self = StObject.set(x, "sourceEvent", js.undefined)
    }
  }
}
