package typings.babylonjs.BABYLON

import typings.babylonjs.anon.Friction
import typings.babylonjs.anon.ImpostorSize
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IWebXRControllerPhysicsOptions extends StObject {
  
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
  implicit class IWebXRControllerPhysicsOptionsMutableBuilder[Self <: IWebXRControllerPhysicsOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnableHeadsetImpostor(value: Boolean): Self = StObject.set(x, "enableHeadsetImpostor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnableHeadsetImpostorUndefined: Self = StObject.set(x, "enableHeadsetImpostor", js.undefined)
    
    @scala.inline
    def setHeadsetImpostorParams(value: Friction): Self = StObject.set(x, "headsetImpostorParams", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeadsetImpostorParamsUndefined: Self = StObject.set(x, "headsetImpostorParams", js.undefined)
    
    @scala.inline
    def setPhysicsProperties(value: ImpostorSize): Self = StObject.set(x, "physicsProperties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPhysicsPropertiesUndefined: Self = StObject.set(x, "physicsProperties", js.undefined)
    
    @scala.inline
    def setXrInput(value: WebXRInput): Self = StObject.set(x, "xrInput", value.asInstanceOf[js.Any])
  }
}
