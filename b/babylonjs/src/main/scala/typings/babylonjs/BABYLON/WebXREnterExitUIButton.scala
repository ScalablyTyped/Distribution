package typings.babylonjs.BABYLON

import typings.babylonjs.XRReferenceSpaceType
import typings.babylonjs.XRSessionMode
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("BABYLON.WebXREnterExitUIButton")
@js.native
class WebXREnterExitUIButton protected () extends js.Object {
  /**
    * Creates a WebXREnterExitUIButton
    * @param element button element
    * @param sessionMode XR initialization session mode
    * @param referenceSpaceType the type of reference space to be used
    */
  def this(
    /** button element */
  element: HTMLElement,
    /** XR initialization options for the button */
  sessionMode: XRSessionMode,
    /** Reference space type */
  referenceSpaceType: XRReferenceSpaceType
  ) = this()
  /** button element */
  var element: HTMLElement = js.native
  /** Reference space type */
  var referenceSpaceType: XRReferenceSpaceType = js.native
  /** XR initialization options for the button */
  var sessionMode: XRSessionMode = js.native
  /**
    * Extendable function which can be used to update the button's visuals when the state changes
    * @param activeButton the current active button in the UI
    */
  def update(activeButton: Nullable[WebXREnterExitUIButton]): Unit = js.native
}

