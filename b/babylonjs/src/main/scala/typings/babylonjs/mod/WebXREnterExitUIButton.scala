package typings.babylonjs.mod

import typings.babylonjs.XRReferenceSpaceType
import typings.babylonjs.XRSessionMode
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("babylonjs", "WebXREnterExitUIButton")
@js.native
class WebXREnterExitUIButton protected ()
  extends typings.babylonjs.legacyMod.WebXREnterExitUIButton {
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
}

