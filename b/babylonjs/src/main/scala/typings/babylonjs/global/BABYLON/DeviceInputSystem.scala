package typings.babylonjs.global.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.DeviceInputSystem")
@js.native
class DeviceInputSystem protected ()
  extends typings.babylonjs.BABYLON.DeviceInputSystem
/* static members */
@JSGlobal("BABYLON.DeviceInputSystem")
@js.native
object DeviceInputSystem extends js.Object {
  
  /**
    * Creates a new DeviceInputSystem instance
    * @param engine Engine to pull input element from
    * @returns The new instance
    */
  def Create(engine: typings.babylonjs.BABYLON.Engine): typings.babylonjs.BABYLON.DeviceInputSystem = js.native
  
  var _MAX_KEYCODES: js.Any = js.native
  
  var _MAX_POINTER_INPUTS: js.Any = js.native
}
