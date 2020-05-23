package typings.babylonjs.sceneComponentMod

import typings.babylonjs.anon.Action
import typings.std.Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("babylonjs/sceneComponent", "Stage")
@js.native
/**
  * Hide ctor from the rest of the world.
  * @param items The items to add.
  */
class Stage[T /* <: js.Function */] protected () extends Array[Action[T]] {
  /**
    * Clears all the steps from the stage.
    */
  def clear(): Unit = js.native
  /**
    * Registers a step in an ordered way in the targeted stage.
    * @param index Defines the position to register the step in
    * @param component Defines the component attached to the step
    * @param action Defines the action to launch during the step
    */
  def registerStep(index: Double, component: ISceneComponent, action: T): Unit = js.native
}

/* static members */
@JSImport("babylonjs/sceneComponent", "Stage")
@js.native
object Stage extends js.Object {
  /**
    * Creates a new Stage.
    * @returns A new instance of a Stage
    */
  def Create[T /* <: js.Function */](): Stage[T] = js.native
}

