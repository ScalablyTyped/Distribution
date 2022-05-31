package typings.babylonjs.global.BABYLON

import typings.babylonjs.BABYLON.Nullable
import typings.babylonjs.XRReferenceSpaceType
import typings.babylonjs.XRSessionMode
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.WebXREnterExitUIButton")
@js.native
class WebXREnterExitUIButton protected ()
  extends StObject
     with typings.babylonjs.BABYLON.WebXREnterExitUIButton {
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
  /* CompleteClass */
  var element: HTMLElement = js.native
  
  /** Reference space type */
  /* CompleteClass */
  var referenceSpaceType: XRReferenceSpaceType = js.native
  
  /** XR initialization options for the button */
  /* CompleteClass */
  var sessionMode: XRSessionMode = js.native
  
  /**
    * Extendable function which can be used to update the button's visuals when the state changes
    * @param activeButton the current active button in the UI
    */
  /* CompleteClass */
  override def update(activeButton: Nullable[typings.babylonjs.BABYLON.WebXREnterExitUIButton]): Unit = js.native
}
