package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IObservableManager extends StObject {
  
  def _addDevice(deviceSource: DeviceSource[DeviceType]): Unit
  
  def _onInputChanged(deviceType: DeviceType, deviceSlot: Double, eventData: IUIEvent): Unit
  
  def _removeDevice(deviceType: DeviceType, deviceSlot: Double): Unit
  
  var onDeviceConnectedObservable: Observable[DeviceSourceType]
  
  var onDeviceDisconnectedObservable: Observable[DeviceSourceType]
}
object IObservableManager {
  
  inline def apply(
    _addDevice: DeviceSource[DeviceType] => Unit,
    _onInputChanged: (DeviceType, Double, IUIEvent) => Unit,
    _removeDevice: (DeviceType, Double) => Unit,
    onDeviceConnectedObservable: Observable[DeviceSourceType],
    onDeviceDisconnectedObservable: Observable[DeviceSourceType]
  ): IObservableManager = {
    val __obj = js.Dynamic.literal(_addDevice = js.Any.fromFunction1(_addDevice), _onInputChanged = js.Any.fromFunction3(_onInputChanged), _removeDevice = js.Any.fromFunction2(_removeDevice), onDeviceConnectedObservable = onDeviceConnectedObservable.asInstanceOf[js.Any], onDeviceDisconnectedObservable = onDeviceDisconnectedObservable.asInstanceOf[js.Any])
    __obj.asInstanceOf[IObservableManager]
  }
  
  extension [Self <: IObservableManager](x: Self) {
    
    inline def setOnDeviceConnectedObservable(value: Observable[DeviceSourceType]): Self = StObject.set(x, "onDeviceConnectedObservable", value.asInstanceOf[js.Any])
    
    inline def setOnDeviceDisconnectedObservable(value: Observable[DeviceSourceType]): Self = StObject.set(x, "onDeviceDisconnectedObservable", value.asInstanceOf[js.Any])
    
    inline def set_addDevice(value: DeviceSource[DeviceType] => Unit): Self = StObject.set(x, "_addDevice", js.Any.fromFunction1(value))
    
    inline def set_onInputChanged(value: (DeviceType, Double, IUIEvent) => Unit): Self = StObject.set(x, "_onInputChanged", js.Any.fromFunction3(value))
    
    inline def set_removeDevice(value: (DeviceType, Double) => Unit): Self = StObject.set(x, "_removeDevice", js.Any.fromFunction2(value))
  }
}
