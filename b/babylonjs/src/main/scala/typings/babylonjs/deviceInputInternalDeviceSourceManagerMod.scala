package typings.babylonjs

import typings.babylonjs.deviceInputInputDevicesDeviceEnumsMod.DeviceType
import typings.babylonjs.deviceInputInputDevicesDeviceSourceMod.DeviceSource
import typings.babylonjs.deviceInputInputInterfacesMod.IDeviceInputSystem
import typings.babylonjs.enginesEngineMod.Engine
import typings.babylonjs.eventsDeviceInputEventsMod.IUIEvent
import typings.babylonjs.miscObservableMod.Observable
import typings.babylonjs.sceneMod.IDisposable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object deviceInputInternalDeviceSourceManagerMod {
  
  @JSImport("babylonjs/DeviceInput/internalDeviceSourceManager", "InternalDeviceSourceManager")
  @js.native
  open class InternalDeviceSourceManager protected ()
    extends StObject
       with IDisposable {
    def this(engine: Engine) = this()
    
    val _deviceInputSystem: IDeviceInputSystem = js.native
    
    /* private */ val _devices: Any = js.native
    
    var _refCount: Double = js.native
    
    /* private */ val _registeredManagers: Any = js.native
    
    /**
      * Releases all held resources
      */
    /* CompleteClass */
    override def dispose(): Unit = js.native
    
    def registerManager(manager: IObservableManager): Unit = js.native
    
    def unregisterManager(manager: IObservableManager): Unit = js.native
  }
  
  type DeviceSourceType = Distribute[DeviceType]
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
    * TS definition: {{{
    T extends babylonjs.babylonjs/DeviceInput/InputDevices/deviceEnums.DeviceType ? babylonjs.babylonjs/DeviceInput/InputDevices/deviceSource.DeviceSource<T> : never
    }}}
    */
  type Distribute[T] = DeviceSource[T]
  
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
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IObservableManager] (val x: Self) extends AnyVal {
      
      inline def setOnDeviceConnectedObservable(value: Observable[DeviceSourceType]): Self = StObject.set(x, "onDeviceConnectedObservable", value.asInstanceOf[js.Any])
      
      inline def setOnDeviceDisconnectedObservable(value: Observable[DeviceSourceType]): Self = StObject.set(x, "onDeviceDisconnectedObservable", value.asInstanceOf[js.Any])
      
      inline def set_addDevice(value: DeviceSource[DeviceType] => Unit): Self = StObject.set(x, "_addDevice", js.Any.fromFunction1(value))
      
      inline def set_onInputChanged(value: (DeviceType, Double, IUIEvent) => Unit): Self = StObject.set(x, "_onInputChanged", js.Any.fromFunction3(value))
      
      inline def set_removeDevice(value: (DeviceType, Double) => Unit): Self = StObject.set(x, "_removeDevice", js.Any.fromFunction2(value))
    }
  }
  
  /* augmented module */
  object babylonjsEnginesEngineAugmentingMod {
    
    trait Engine extends StObject {
      
      /** @internal */
      var _deviceSourceManager: js.UndefOr[InternalDeviceSourceManager] = js.undefined
    }
    object Engine {
      
      inline def apply(): typings.babylonjs.deviceInputInternalDeviceSourceManagerMod.babylonjsEnginesEngineAugmentingMod.Engine = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[typings.babylonjs.deviceInputInternalDeviceSourceManagerMod.babylonjsEnginesEngineAugmentingMod.Engine]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: typings.babylonjs.deviceInputInternalDeviceSourceManagerMod.babylonjsEnginesEngineAugmentingMod.Engine] (val x: Self) extends AnyVal {
        
        inline def set_deviceSourceManager(value: InternalDeviceSourceManager): Self = StObject.set(x, "_deviceSourceManager", value.asInstanceOf[js.Any])
        
        inline def set_deviceSourceManagerUndefined: Self = StObject.set(x, "_deviceSourceManager", js.undefined)
      }
    }
  }
}
