package typings.babylonjs.BABYLON

import typings.babylonjs.XRReferenceSpaceType
import typings.babylonjs.XRSessionMode
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WebXREnterExitUIButton extends js.Object {
  /** button element */
  var element: HTMLElement
  /** Reference space type */
  var referenceSpaceType: XRReferenceSpaceType
  /** XR initialization options for the button */
  var sessionMode: XRSessionMode
  /**
    * Extendable function which can be used to update the button's visuals when the state changes
    * @param activeButton the current active button in the UI
    */
  def update(activeButton: Nullable[WebXREnterExitUIButton]): Unit
}

object WebXREnterExitUIButton {
  @scala.inline
  def apply(
    element: HTMLElement,
    referenceSpaceType: XRReferenceSpaceType,
    sessionMode: XRSessionMode,
    update: Nullable[WebXREnterExitUIButton] => Unit
  ): WebXREnterExitUIButton = {
    val __obj = js.Dynamic.literal(element = element.asInstanceOf[js.Any], referenceSpaceType = referenceSpaceType.asInstanceOf[js.Any], sessionMode = sessionMode.asInstanceOf[js.Any], update = js.Any.fromFunction1(update))
    __obj.asInstanceOf[WebXREnterExitUIButton]
  }
}

