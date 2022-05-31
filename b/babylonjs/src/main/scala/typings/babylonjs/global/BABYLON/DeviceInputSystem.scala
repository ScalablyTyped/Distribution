package typings.babylonjs.global.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.DeviceInputSystem")
@js.native
/* private */ class DeviceInputSystem ()
  extends StObject
     with typings.babylonjs.BABYLON.DeviceInputSystem {
  
  /**
    * Releases all held resources
    */
  /* CompleteClass */
  override def dispose(): Unit = js.native
}
/* static members */
object DeviceInputSystem {
  
  @JSGlobal("BABYLON.DeviceInputSystem")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a new DeviceInputSystem instance
    * @param engine Engine to pull input element from
    * @returns The new instance
    */
  inline def Create(engine: typings.babylonjs.BABYLON.Engine): typings.babylonjs.BABYLON.DeviceInputSystem = ^.asInstanceOf[js.Dynamic].applyDynamic("Create")(engine.asInstanceOf[js.Any]).asInstanceOf[typings.babylonjs.BABYLON.DeviceInputSystem]
  
  @JSGlobal("BABYLON.DeviceInputSystem._MAX_KEYCODES")
  @js.native
  def _MAX_KEYCODES: js.Any = js.native
  inline def _MAX_KEYCODES_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_MAX_KEYCODES")(x.asInstanceOf[js.Any])
  
  @JSGlobal("BABYLON.DeviceInputSystem._MAX_POINTER_INPUTS")
  @js.native
  def _MAX_POINTER_INPUTS: js.Any = js.native
  inline def _MAX_POINTER_INPUTS_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_MAX_POINTER_INPUTS")(x.asInstanceOf[js.Any])
}
