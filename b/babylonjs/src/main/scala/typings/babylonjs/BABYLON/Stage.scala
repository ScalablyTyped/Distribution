package typings.babylonjs.BABYLON

import typings.babylonjs.anon.Component
import typings.std.Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Stage[T /* <: js.Function */] extends Array[Component[T]] {
  
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
