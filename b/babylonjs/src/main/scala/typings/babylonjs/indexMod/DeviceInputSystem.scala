package typings.babylonjs.indexMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/index", "DeviceInputSystem")
@js.native
class DeviceInputSystem protected ()
  extends typings.babylonjs.deviceInputIndexMod.DeviceInputSystem
/* static members */
@JSImport("babylonjs/index", "DeviceInputSystem")
@js.native
object DeviceInputSystem extends js.Object {
  
  /**
    * Creates a new DeviceInputSystem instance
    * @param engine Engine to pull input element from
    * @returns The new instance
    */
  def Create(engine: typings.babylonjs.engineMod.Engine): typings.babylonjs.deviceInputSystemMod.DeviceInputSystem = js.native
  
  var _MAX_KEYCODES: js.Any = js.native
  
  var _MAX_POINTER_INPUTS: js.Any = js.native
}
