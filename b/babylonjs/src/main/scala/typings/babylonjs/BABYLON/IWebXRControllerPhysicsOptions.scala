package typings.babylonjs.BABYLON

import typings.babylonjs.anon.Friction
import typings.babylonjs.anon.ImpostorSize
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IWebXRControllerPhysicsOptions extends StObject {
  
  /**
    * Should the headset get its own impostor
    */
  var enableHeadsetImpostor: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Optional parameters for the headset impostor
    */
  var headsetImpostorParams: js.UndefOr[Friction] = js.undefined
  
  /**
    * The physics properties of the future impostors
    */
  var physicsProperties: js.UndefOr[ImpostorSize] = js.undefined
  
  /**
    * the xr input to use with this pointer selection
    */
  var xrInput: WebXRInput
}
object IWebXRControllerPhysicsOptions {
  
  inline def apply(xrInput: WebXRInput): IWebXRControllerPhysicsOptions = {
    val __obj = js.Dynamic.literal(xrInput = xrInput.asInstanceOf[js.Any])
    __obj.asInstanceOf[IWebXRControllerPhysicsOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IWebXRControllerPhysicsOptions] (val x: Self) extends AnyVal {
    
    inline def setEnableHeadsetImpostor(value: Boolean): Self = StObject.set(x, "enableHeadsetImpostor", value.asInstanceOf[js.Any])
    
    inline def setEnableHeadsetImpostorUndefined: Self = StObject.set(x, "enableHeadsetImpostor", js.undefined)
    
    inline def setHeadsetImpostorParams(value: Friction): Self = StObject.set(x, "headsetImpostorParams", value.asInstanceOf[js.Any])
    
    inline def setHeadsetImpostorParamsUndefined: Self = StObject.set(x, "headsetImpostorParams", js.undefined)
    
    inline def setPhysicsProperties(value: ImpostorSize): Self = StObject.set(x, "physicsProperties", value.asInstanceOf[js.Any])
    
    inline def setPhysicsPropertiesUndefined: Self = StObject.set(x, "physicsProperties", js.undefined)
    
    inline def setXrInput(value: WebXRInput): Self = StObject.set(x, "xrInput", value.asInstanceOf[js.Any])
  }
}
