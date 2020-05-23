package typings.blocks

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/////////////////////////////////////////
// blocks observable
/////////////////////////////////////////
@js.native
trait BlocksObservable extends Extendable[BlocksObservable] {
  def apply(arg: js.Any): BlocksObservable = js.native
  /**
    * If event in prototype is not defined use this function instead.
    * 
    * @param event Name of the event to raise
    * @param trigger Function to be called when event is fired
    */
  def on(event: String, trigger: js.Function): BlocksObservable = js.native
  /**
    * Updates all elements, expressions and dependencies where the observable is used
    */
  def update(): BlocksObservable = js.native
}

