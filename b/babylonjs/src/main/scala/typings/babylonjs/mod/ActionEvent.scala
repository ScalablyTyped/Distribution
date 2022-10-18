package typings.babylonjs.mod

import typings.babylonjs.typesMod.Nullable
import typings.std.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs", "ActionEvent")
@js.native
open class ActionEvent protected ()
  extends typings.babylonjs.legacyLegacyMod.ActionEvent {
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
  meshUnderPointer: Nullable[typings.babylonjs.meshesAbstractMeshMod.AbstractMesh]
  ) = this()
  def this(
    /** The mesh or sprite that triggered the action */
  source: Any,
    /** The X mouse cursor position at the time of the event */
  pointerX: Double,
    /** The Y mouse cursor position at the time of the event */
  pointerY: Double,
    /** The mesh that is currently pointed at (can be null) */
  meshUnderPointer: Nullable[typings.babylonjs.meshesAbstractMeshMod.AbstractMesh],
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
  meshUnderPointer: Nullable[typings.babylonjs.meshesAbstractMeshMod.AbstractMesh],
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
  meshUnderPointer: Nullable[typings.babylonjs.meshesAbstractMeshMod.AbstractMesh],
    /** the original (browser) event that triggered the ActionEvent */
  sourceEvent: Unit,
    /** additional data for the event */
  additionalData: Any
  ) = this()
}
/* static members */
object ActionEvent {
  
  @JSImport("babylonjs", "ActionEvent")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Helper function to auto-create an ActionEvent from a source mesh.
    * @param source The source mesh that triggered the event
    * @param evt The original (browser) event
    * @param additionalData additional data for the event
    * @returns the new ActionEvent
    */
  inline def CreateNew(source: typings.babylonjs.meshesAbstractMeshMod.AbstractMesh): typings.babylonjs.actionsActionEventMod.ActionEvent = ^.asInstanceOf[js.Dynamic].applyDynamic("CreateNew")(source.asInstanceOf[js.Any]).asInstanceOf[typings.babylonjs.actionsActionEventMod.ActionEvent]
  inline def CreateNew(source: typings.babylonjs.meshesAbstractMeshMod.AbstractMesh, evt: Any): typings.babylonjs.actionsActionEventMod.ActionEvent = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateNew")(source.asInstanceOf[js.Any], evt.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.actionsActionEventMod.ActionEvent]
  inline def CreateNew(source: typings.babylonjs.meshesAbstractMeshMod.AbstractMesh, evt: Any, additionalData: Any): typings.babylonjs.actionsActionEventMod.ActionEvent = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateNew")(source.asInstanceOf[js.Any], evt.asInstanceOf[js.Any], additionalData.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.actionsActionEventMod.ActionEvent]
  inline def CreateNew(source: typings.babylonjs.meshesAbstractMeshMod.AbstractMesh, evt: Unit, additionalData: Any): typings.babylonjs.actionsActionEventMod.ActionEvent = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateNew")(source.asInstanceOf[js.Any], evt.asInstanceOf[js.Any], additionalData.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.actionsActionEventMod.ActionEvent]
  
  /**
    * Helper function to auto-create an ActionEvent from a primitive
    * @param prim defines the target primitive
    * @param pointerPos defines the pointer position
    * @param evt The original (browser) event
    * @param additionalData additional data for the event
    * @returns the new ActionEvent
    */
  inline def CreateNewFromPrimitive(prim: Any, pointerPos: typings.babylonjs.mathsMathDotvectorMod.Vector2): typings.babylonjs.actionsActionEventMod.ActionEvent = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateNewFromPrimitive")(prim.asInstanceOf[js.Any], pointerPos.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.actionsActionEventMod.ActionEvent]
  inline def CreateNewFromPrimitive(
    prim: Any,
    pointerPos: typings.babylonjs.mathsMathDotvectorMod.Vector2,
    evt: Unit,
    additionalData: Any
  ): typings.babylonjs.actionsActionEventMod.ActionEvent = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateNewFromPrimitive")(prim.asInstanceOf[js.Any], pointerPos.asInstanceOf[js.Any], evt.asInstanceOf[js.Any], additionalData.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.actionsActionEventMod.ActionEvent]
  inline def CreateNewFromPrimitive(prim: Any, pointerPos: typings.babylonjs.mathsMathDotvectorMod.Vector2, evt: Event): typings.babylonjs.actionsActionEventMod.ActionEvent = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateNewFromPrimitive")(prim.asInstanceOf[js.Any], pointerPos.asInstanceOf[js.Any], evt.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.actionsActionEventMod.ActionEvent]
  inline def CreateNewFromPrimitive(
    prim: Any,
    pointerPos: typings.babylonjs.mathsMathDotvectorMod.Vector2,
    evt: Event,
    additionalData: Any
  ): typings.babylonjs.actionsActionEventMod.ActionEvent = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateNewFromPrimitive")(prim.asInstanceOf[js.Any], pointerPos.asInstanceOf[js.Any], evt.asInstanceOf[js.Any], additionalData.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.actionsActionEventMod.ActionEvent]
  
  /**
    * Helper function to auto-create an ActionEvent from a scene. If triggered by a mesh use ActionEvent.CreateNew
    * @param scene the scene where the event occurred
    * @param evt The original (browser) event
    * @returns the new ActionEvent
    */
  inline def CreateNewFromScene(scene: typings.babylonjs.sceneMod.Scene, evt: Any): typings.babylonjs.actionsActionEventMod.ActionEvent = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateNewFromScene")(scene.asInstanceOf[js.Any], evt.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.actionsActionEventMod.ActionEvent]
  
  /**
    * Helper function to auto-create an ActionEvent from a source sprite
    * @param source The source sprite that triggered the event
    * @param scene Scene associated with the sprite
    * @param evt The original (browser) event
    * @param additionalData additional data for the event
    * @returns the new ActionEvent
    */
  inline def CreateNewFromSprite(source: typings.babylonjs.spritesSpriteMod.Sprite, scene: typings.babylonjs.sceneMod.Scene): typings.babylonjs.actionsActionEventMod.ActionEvent = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateNewFromSprite")(source.asInstanceOf[js.Any], scene.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.actionsActionEventMod.ActionEvent]
  inline def CreateNewFromSprite(
    source: typings.babylonjs.spritesSpriteMod.Sprite,
    scene: typings.babylonjs.sceneMod.Scene,
    evt: Any
  ): typings.babylonjs.actionsActionEventMod.ActionEvent = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateNewFromSprite")(source.asInstanceOf[js.Any], scene.asInstanceOf[js.Any], evt.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.actionsActionEventMod.ActionEvent]
  inline def CreateNewFromSprite(
    source: typings.babylonjs.spritesSpriteMod.Sprite,
    scene: typings.babylonjs.sceneMod.Scene,
    evt: Any,
    additionalData: Any
  ): typings.babylonjs.actionsActionEventMod.ActionEvent = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateNewFromSprite")(source.asInstanceOf[js.Any], scene.asInstanceOf[js.Any], evt.asInstanceOf[js.Any], additionalData.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.actionsActionEventMod.ActionEvent]
  inline def CreateNewFromSprite(
    source: typings.babylonjs.spritesSpriteMod.Sprite,
    scene: typings.babylonjs.sceneMod.Scene,
    evt: Unit,
    additionalData: Any
  ): typings.babylonjs.actionsActionEventMod.ActionEvent = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateNewFromSprite")(source.asInstanceOf[js.Any], scene.asInstanceOf[js.Any], evt.asInstanceOf[js.Any], additionalData.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.actionsActionEventMod.ActionEvent]
}
