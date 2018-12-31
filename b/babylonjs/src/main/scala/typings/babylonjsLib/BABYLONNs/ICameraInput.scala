package typings
package babylonjsLib.BABYLONNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This is the contract to implement in order to create a new input class.
  * Inputs are dealing with listening to user actions and moving the camera accordingly.
  */
@js.native
trait ICameraInput[TCamera /* <: Camera */] extends js.Object {
  /**
    * Defines the camera the input is attached to.
    */
  var camera: Nullable[TCamera] = js.native
  /**
    * Update the current camera state depending on the inputs that have been used this frame.
    * This is a dynamically created lambda to avoid the performance penalty of looping for inputs in the render loop.
    */
  var checkInputs: js.UndefOr[js.Function0[scala.Unit]] = js.native
  /**
    * Attach the input controls to a specific dom element to get the input from.
    * @param element Defines the element the controls should be listened from
    * @param noPreventDefault Defines whether event caught by the controls should call preventdefault() (https://developer.mozilla.org/en-US/docs/Web/API/Event/preventDefault)
    */
  def attachControl(element: stdLib.HTMLElement): scala.Unit = js.native
  def attachControl(element: stdLib.HTMLElement, noPreventDefault: scala.Boolean): scala.Unit = js.native
  /**
    * Detach the current controls from the specified dom element.
    * @param element Defines the element to stop listening the inputs from
    */
  def detachControl(element: Nullable[stdLib.HTMLElement]): scala.Unit = js.native
  /**
    * Gets the class name of the current intput.
    * @returns the class name
    */
  def getClassName(): java.lang.String = js.native
  /**
    * Get the friendly name associated with the input class.
    * @returns the input friendly name
    */
  def getSimpleName(): java.lang.String = js.native
}

