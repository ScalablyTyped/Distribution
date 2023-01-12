package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NativeDeviceInputSystem
  extends StObject
     with IDeviceInputSystem {
  
  /**
    * For versions of BabylonNative that don't have the NativeInput plugin initialized, create a dummy version
    * @returns Object with dummy functions
    */
  /* private */ var _createDummyNativeInput: Any
  
  /* private */ val _nativeInput: Any
}
object NativeDeviceInputSystem {
  
  inline def apply(
    _createDummyNativeInput: Any,
    _nativeInput: Any,
    dispose: () => Unit,
    isDeviceAvailable: DeviceType => Boolean,
    pollInput: (DeviceType, Double, Double) => Double
  ): NativeDeviceInputSystem = {
    val __obj = js.Dynamic.literal(_createDummyNativeInput = _createDummyNativeInput.asInstanceOf[js.Any], _nativeInput = _nativeInput.asInstanceOf[js.Any], dispose = js.Any.fromFunction0(dispose), isDeviceAvailable = js.Any.fromFunction1(isDeviceAvailable), pollInput = js.Any.fromFunction3(pollInput))
    __obj.asInstanceOf[NativeDeviceInputSystem]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NativeDeviceInputSystem] (val x: Self) extends AnyVal {
    
    inline def set_createDummyNativeInput(value: Any): Self = StObject.set(x, "_createDummyNativeInput", value.asInstanceOf[js.Any])
    
    inline def set_nativeInput(value: Any): Self = StObject.set(x, "_nativeInput", value.asInstanceOf[js.Any])
  }
}
