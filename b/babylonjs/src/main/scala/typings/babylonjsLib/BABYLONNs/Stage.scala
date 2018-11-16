package typings
package babylonjsLib.BABYLONNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * Repressentation of a stage in the scene (Basically a list of ordered steps)
     * @hidden
     */
@JSGlobal("BABYLON.Stage")
@js.native
class Stage[T /* <: js.Function */] protected ()
  extends stdLib.Array[babylonjsLib.Anon_Action[T]] {
  /**
           * Clears all the steps from the stage.
           */
  def clear(): scala.Unit = js.native
  /**
           * Registers a step in an ordered way in the targeted stage.
           * @param index Defines the position to register the step in
           * @param component Defines the component attached to the step
           * @param action Defines the action to launch during the step
           */
  def registerStep(index: scala.Double, component: ISceneComponent, action: T): scala.Unit = js.native
}

/**
     * Repressentation of a stage in the scene (Basically a list of ordered steps)
     * @hidden
     */
@JSGlobal("BABYLON.Stage")
@js.native
object Stage extends js.Object {
  /**
           * Creates a new Stage.
           * @returns A new instance of a Stage
           */
  def Create[T /* <: js.Function */](): babylonjsLib.BABYLONNs.Stage[T] = js.native
}

