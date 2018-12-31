package typings
package babylonjsLib.BABYLONNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * ActionEvent is the event being sent when an action is triggered.
  */
@JSGlobal("BABYLON.ActionEvent")
@js.native
class ActionEvent protected () extends js.Object {
  /**
    * Creates a new ActionEvent
    * @param source The mesh or sprite that triggered the action
    * @param pointerX The X mouse cursor position at the time of the event
    * @param pointerY The Y mouse cursor position at the time of the event
    * @param meshUnderPointer The mesh that is currently pointed at (can be null)
    * @param sourceEvent the original (browser) event that triggered the ActionEvent
    * @param additionalData additional data for the event
    */
  def this(/** The mesh or sprite that triggered the action */
  source: js.Any, /** The X mouse cursor position at the time of the event */
  pointerX: scala.Double, /** The Y mouse cursor position at the time of the event */
  pointerY: scala.Double, /** The mesh that is currently pointed at (can be null) */
  meshUnderPointer: Nullable[AbstractMesh]) = this()
  def this(/** The mesh or sprite that triggered the action */
  source: js.Any, /** The X mouse cursor position at the time of the event */
  pointerX: scala.Double, /** The Y mouse cursor position at the time of the event */
  pointerY: scala.Double, /** The mesh that is currently pointed at (can be null) */
  meshUnderPointer: Nullable[AbstractMesh], /** the original (browser) event that triggered the ActionEvent */
  sourceEvent: js.Any) = this()
  def this(/** The mesh or sprite that triggered the action */
  source: js.Any, /** The X mouse cursor position at the time of the event */
  pointerX: scala.Double, /** The Y mouse cursor position at the time of the event */
  pointerY: scala.Double, /** The mesh that is currently pointed at (can be null) */
  meshUnderPointer: Nullable[AbstractMesh], /** the original (browser) event that triggered the ActionEvent */
  sourceEvent: js.Any, /** additional data for the event */
  additionalData: js.Any) = this()
  /** additional data for the event */
  var additionalData: js.UndefOr[js.Any] = js.native
  /** The mesh that is currently pointed at (can be null) */
  var meshUnderPointer: Nullable[AbstractMesh] = js.native
  /** The X mouse cursor position at the time of the event */
  var pointerX: scala.Double = js.native
  /** The Y mouse cursor position at the time of the event */
  var pointerY: scala.Double = js.native
  /** The mesh or sprite that triggered the action */
  var source: js.Any = js.native
  /** the original (browser) event that triggered the ActionEvent */
  var sourceEvent: js.UndefOr[js.Any] = js.native
}

/**
  * ActionEvent is the event being sent when an action is triggered.
  */
@JSGlobal("BABYLON.ActionEvent")
@js.native
object ActionEvent extends js.Object {
  /**
    * Helper function to auto-create an ActionEvent from a source mesh.
    * @param source The source mesh that triggered the event
    * @param evt The original (browser) event
    * @param additionalData additional data for the event
    * @returns the new ActionEvent
    */
  def CreateNew(source: babylonjsLib.BABYLONNs.AbstractMesh): babylonjsLib.BABYLONNs.ActionEvent = js.native
  def CreateNew(source: babylonjsLib.BABYLONNs.AbstractMesh, evt: stdLib.Event): babylonjsLib.BABYLONNs.ActionEvent = js.native
  def CreateNew(source: babylonjsLib.BABYLONNs.AbstractMesh, evt: stdLib.Event, additionalData: js.Any): babylonjsLib.BABYLONNs.ActionEvent = js.native
  /**
    * Helper function to auto-create an ActionEvent from a primitive
    * @param prim defines the target primitive
    * @param pointerPos defines the pointer position
    * @param evt The original (browser) event
    * @param additionalData additional data for the event
    * @returns the new ActionEvent
    */
  def CreateNewFromPrimitive(prim: js.Any, pointerPos: babylonjsLib.BABYLONNs.Vector2): babylonjsLib.BABYLONNs.ActionEvent = js.native
  def CreateNewFromPrimitive(prim: js.Any, pointerPos: babylonjsLib.BABYLONNs.Vector2, evt: stdLib.Event): babylonjsLib.BABYLONNs.ActionEvent = js.native
  def CreateNewFromPrimitive(
    prim: js.Any,
    pointerPos: babylonjsLib.BABYLONNs.Vector2,
    evt: stdLib.Event,
    additionalData: js.Any
  ): babylonjsLib.BABYLONNs.ActionEvent = js.native
  /**
    * Helper function to auto-create an ActionEvent from a scene. If triggered by a mesh use ActionEvent.CreateNew
    * @param scene the scene where the event occurred
    * @param evt The original (browser) event
    * @returns the new ActionEvent
    */
  def CreateNewFromScene(scene: babylonjsLib.BABYLONNs.Scene, evt: stdLib.Event): babylonjsLib.BABYLONNs.ActionEvent = js.native
  /**
    * Helper function to auto-create an ActionEvent from a source sprite
    * @param source The source sprite that triggered the event
    * @param scene Scene associated with the sprite
    * @param evt The original (browser) event
    * @param additionalData additional data for the event
    * @returns the new ActionEvent
    */
  def CreateNewFromSprite(source: babylonjsLib.BABYLONNs.Sprite, scene: babylonjsLib.BABYLONNs.Scene): babylonjsLib.BABYLONNs.ActionEvent = js.native
  def CreateNewFromSprite(source: babylonjsLib.BABYLONNs.Sprite, scene: babylonjsLib.BABYLONNs.Scene, evt: stdLib.Event): babylonjsLib.BABYLONNs.ActionEvent = js.native
  def CreateNewFromSprite(
    source: babylonjsLib.BABYLONNs.Sprite,
    scene: babylonjsLib.BABYLONNs.Scene,
    evt: stdLib.Event,
    additionalData: js.Any
  ): babylonjsLib.BABYLONNs.ActionEvent = js.native
}

