package typings.babylonjs.BABYLON

import typings.babylonjs.anon.InputIndex
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeviceSource[T /* <: DeviceType */] extends js.Object {
  
  val _deviceInputSystem: js.Any = js.native
  
  /** "Slot" or index that device is referenced in */
  val deviceSlot: Double = js.native
  
  /** Type of device */
  val deviceType: DeviceType = js.native
  
  /**
    * Get input for specific input
    * @param inputIndex index of specific input on device
    * @returns Input value from DeviceInputSystem
    */
  def getInput(inputIndex: DeviceInput[T]): Double = js.native
  
  /**
    * Observable to handle device input changes per device
    */
  val onInputChangedObservable: Observable[InputIndex[T]] = js.native
}
object DeviceSource {
  
  @scala.inline
  def apply[T /* <: DeviceType */](
    _deviceInputSystem: js.Any,
    deviceSlot: Double,
    deviceType: DeviceType,
    getInput: DeviceInput[T] => Double,
    onInputChangedObservable: Observable[InputIndex[T]]
  ): DeviceSource[T] = {
    val __obj = js.Dynamic.literal(_deviceInputSystem = _deviceInputSystem.asInstanceOf[js.Any], deviceSlot = deviceSlot.asInstanceOf[js.Any], deviceType = deviceType.asInstanceOf[js.Any], getInput = js.Any.fromFunction1(getInput), onInputChangedObservable = onInputChangedObservable.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeviceSource[T]]
  }
  
  @scala.inline
  implicit class DeviceSourceOps[Self <: DeviceSource[_], T /* <: DeviceType */] (val x: Self with DeviceSource[T]) extends AnyVal {
    
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
    def set_deviceInputSystem(value: js.Any): Self = this.set("_deviceInputSystem", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeviceSlot(value: Double): Self = this.set("deviceSlot", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeviceType(value: DeviceType): Self = this.set("deviceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetInput(value: DeviceInput[T] => Double): Self = this.set("getInput", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnInputChangedObservable(value: Observable[InputIndex[T]]): Self = this.set("onInputChangedObservable", value.asInstanceOf[js.Any])
  }
}
