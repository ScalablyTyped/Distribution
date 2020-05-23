package typings.babylonjs.mod

import typings.babylonjs.typesMod.Nullable
import typings.std.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("babylonjs", "ActionEvent")
@js.native
class ActionEvent protected ()
  extends typings.babylonjs.legacyMod.ActionEvent {
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
  meshUnderPointer: Nullable[typings.babylonjs.abstractMeshMod.AbstractMesh]
  ) = this()
  def this(
    /** The mesh or sprite that triggered the action */
  source: js.Any,
    /** The X mouse cursor position at the time of the event */
  pointerX: Double,
    /** The Y mouse cursor position at the time of the event */
  pointerY: Double,
    /** The mesh that is currently pointed at (can be null) */
  meshUnderPointer: Nullable[typings.babylonjs.abstractMeshMod.AbstractMesh],
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
  meshUnderPointer: Nullable[typings.babylonjs.abstractMeshMod.AbstractMesh],
    /** the original (browser) event that triggered the ActionEvent */
  sourceEvent: js.Any,
    /** additional data for the event */
  additionalData: js.Any
  ) = this()
}

/* static members */
@JSImport("babylonjs", "ActionEvent")
@js.native
object ActionEvent extends js.Object {
  /**
    * Helper function to auto-create an ActionEvent from a source mesh.
    * @param source The source mesh that triggered the event
    * @param evt The original (browser) event
    * @param additionalData additional data for the event
    * @returns the new ActionEvent
    */
  def CreateNew(source: typings.babylonjs.abstractMeshMod.AbstractMesh): typings.babylonjs.actionEventMod.ActionEvent = js.native
  def CreateNew(source: typings.babylonjs.abstractMeshMod.AbstractMesh, evt: Event): typings.babylonjs.actionEventMod.ActionEvent = js.native
  def CreateNew(source: typings.babylonjs.abstractMeshMod.AbstractMesh, evt: Event, additionalData: js.Any): typings.babylonjs.actionEventMod.ActionEvent = js.native
  /**
    * Helper function to auto-create an ActionEvent from a primitive
    * @param prim defines the target primitive
    * @param pointerPos defines the pointer position
    * @param evt The original (browser) event
    * @param additionalData additional data for the event
    * @returns the new ActionEvent
    */
  def CreateNewFromPrimitive(prim: js.Any, pointerPos: typings.babylonjs.mathVectorMod.Vector2): typings.babylonjs.actionEventMod.ActionEvent = js.native
  def CreateNewFromPrimitive(prim: js.Any, pointerPos: typings.babylonjs.mathVectorMod.Vector2, evt: Event): typings.babylonjs.actionEventMod.ActionEvent = js.native
  def CreateNewFromPrimitive(
    prim: js.Any,
    pointerPos: typings.babylonjs.mathVectorMod.Vector2,
    evt: Event,
    additionalData: js.Any
  ): typings.babylonjs.actionEventMod.ActionEvent = js.native
  /**
    * Helper function to auto-create an ActionEvent from a scene. If triggered by a mesh use ActionEvent.CreateNew
    * @param scene the scene where the event occurred
    * @param evt The original (browser) event
    * @returns the new ActionEvent
    */
  def CreateNewFromScene(scene: typings.babylonjs.sceneMod.Scene, evt: Event): typings.babylonjs.actionEventMod.ActionEvent = js.native
  /**
    * Helper function to auto-create an ActionEvent from a source sprite
    * @param source The source sprite that triggered the event
    * @param scene Scene associated with the sprite
    * @param evt The original (browser) event
    * @param additionalData additional data for the event
    * @returns the new ActionEvent
    */
  def CreateNewFromSprite(source: typings.babylonjs.spriteMod.Sprite, scene: typings.babylonjs.sceneMod.Scene): typings.babylonjs.actionEventMod.ActionEvent = js.native
  def CreateNewFromSprite(source: typings.babylonjs.spriteMod.Sprite, scene: typings.babylonjs.sceneMod.Scene, evt: Event): typings.babylonjs.actionEventMod.ActionEvent = js.native
  def CreateNewFromSprite(
    source: typings.babylonjs.spriteMod.Sprite,
    scene: typings.babylonjs.sceneMod.Scene,
    evt: Event,
    additionalData: js.Any
  ): typings.babylonjs.actionEventMod.ActionEvent = js.native
}

