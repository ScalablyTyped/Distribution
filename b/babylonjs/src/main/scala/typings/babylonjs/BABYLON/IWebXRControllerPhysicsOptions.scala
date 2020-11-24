package typings.babylonjs.BABYLON

import typings.babylonjs.anon.Friction
import typings.babylonjs.anon.ImpostorSize
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IWebXRControllerPhysicsOptions extends js.Object {
  
  /**
    * Should the headset get its own impostor
    */
  var enableHeadsetImpostor: js.UndefOr[Boolean] = js.native
  
  /**
    * Optional parameters for the headset impostor
    */
  var headsetImpostorParams: js.UndefOr[Friction] = js.native
  
  /**
    * The physics properties of the future impostors
    */
  var physicsProperties: js.UndefOr[ImpostorSize] = js.native
  
  /**
    * the xr input to use with this pointer selection
    */
  var xrInput: WebXRInput = js.native
}
object IWebXRControllerPhysicsOptions {
  
  @scala.inline
  def apply(xrInput: WebXRInput): IWebXRControllerPhysicsOptions = {
    val __obj = js.Dynamic.literal(xrInput = xrInput.asInstanceOf[js.Any])
    __obj.asInstanceOf[IWebXRControllerPhysicsOptions]
  }
  
  @scala.inline
  implicit class IWebXRControllerPhysicsOptionsOps[Self <: IWebXRControllerPhysicsOptions] (val x: Self) extends AnyVal {
    
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
    def setXrInput(value: WebXRInput): Self = this.set("xrInput", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnableHeadsetImpostor(value: Boolean): Self = this.set("enableHeadsetImpostor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableHeadsetImpostor: Self = this.set("enableHeadsetImpostor", js.undefined)
    
    @scala.inline
    def setHeadsetImpostorParams(value: Friction): Self = this.set("headsetImpostorParams", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeadsetImpostorParams: Self = this.set("headsetImpostorParams", js.undefined)
    
    @scala.inline
    def setPhysicsProperties(value: ImpostorSize): Self = this.set("physicsProperties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePhysicsProperties: Self = this.set("physicsProperties", js.undefined)
  }
}
