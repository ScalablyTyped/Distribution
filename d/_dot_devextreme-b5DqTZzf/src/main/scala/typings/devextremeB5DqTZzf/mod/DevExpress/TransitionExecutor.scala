package typings.devextremeB5DqTZzf.mod.DevExpress

import typings.devextremeB5DqTZzf.mod.DevExpress.core.UserDefinedElementsArray
import typings.devextremeB5DqTZzf.mod.DevExpress.core.utils.DxPromise
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TransitionExecutor extends StObject {
  
  def enter(elements: UserDefinedElementsArray, animation: String): Unit = js.native
  /**
    * Registers the set of elements that should be animated as &apos;entering&apos; using the specified animation configuration.
    */
  def enter(elements: UserDefinedElementsArray, animation: AnimationConfig): Unit = js.native
  
  def leave(elements: UserDefinedElementsArray, animation: String): Unit = js.native
  /**
    * Registers a set of elements that should be animated as &apos;leaving&apos; using the specified animation configuration.
    */
  def leave(elements: UserDefinedElementsArray, animation: AnimationConfig): Unit = js.native
  
  /**
    * Deletes all the animations registered in the Transition Executor by using the enter(elements, animation) and leave(elements, animation) methods.
    */
  def reset(): Unit = js.native
  
  /**
    * Starts all the animations registered using the enter(elements, animation) and leave(elements, animation) methods beforehand.
    */
  def start(): DxPromise[Unit] = js.native
  
  /**
    * Stops all started animations.
    */
  def stop(): Unit = js.native
}
