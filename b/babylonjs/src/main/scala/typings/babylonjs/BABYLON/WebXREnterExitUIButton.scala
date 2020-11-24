package typings.babylonjs.BABYLON

import typings.babylonjs.XRReferenceSpaceType
import typings.babylonjs.XRSessionMode
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WebXREnterExitUIButton extends js.Object {
  
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
  
  @scala.inline
  implicit class WebXREnterExitUIButtonOps[Self <: WebXREnterExitUIButton] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setElement(value: HTMLElement): Self = this.set("element", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReferenceSpaceType(value: XRReferenceSpaceType): Self = this.set("referenceSpaceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSessionMode(value: XRSessionMode): Self = this.set("sessionMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdate(value: Nullable[WebXREnterExitUIButton] => Unit): Self = this.set("update", js.Any.fromFunction1(value))
  }
}
