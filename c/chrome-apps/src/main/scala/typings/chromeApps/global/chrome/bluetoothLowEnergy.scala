package typings.chromeApps.global.chrome

import typings.chromeApps.chrome.bluetoothLowEnergy.Advertisement
import typings.chromeApps.chrome.bluetoothLowEnergy.Characteristic
import typings.chromeApps.chrome.bluetoothLowEnergy.Descriptor
import typings.chromeApps.chrome.bluetoothLowEnergy.INotification
import typings.chromeApps.chrome.bluetoothLowEnergy.IProperties
import typings.chromeApps.chrome.bluetoothLowEnergy.IResponse
import typings.chromeApps.chrome.bluetoothLowEnergy.Service
import typings.chromeApps.chrome.integer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @since Chrome 37
  * @requires Manifest: 'bluetooth': {...}
  * @requires Important: This API works only on Chrome OS.
  * @requires Note: With Chrome 56, users can select nearby Bluetooth Low Energy devices to provide to web sites that use the Web Bluetooth API.
  * @description
  * The chrome.bluetoothLowEnergy API is used to communicate
  * with Bluetooth Smart (Low Energy) devices using the
  * Generic Attribute Profile (GATT).
  */
object bluetoothLowEnergy {
  
  @JSGlobal("chrome.bluetoothLowEnergy")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Establishes a connection between the application and the device with the given address. A device may be already connected and its GATT services available without calling connect, however, an app that wants to access GATT services of a device should call this function to make sure that a connection to the device is maintained. If the device is not connected, all GATT services of the device will be discovered after a successful call to connect.
    * @param deviceAddress The Bluetooth address of the remote device to which a GATT connection should be opened.
    * @param callback Called when the connect request has completed.
    */
  inline def connect(deviceAddress: String, callback: js.Function0[Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("connect")(deviceAddress.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  /**
    * Establishes a connection between the application and the device with the given address. A device may be already connected and its GATT services available without calling connect, however, an app that wants to access GATT services of a device should call this function to make sure that a connection to the device is maintained. If the device is not connected, all GATT services of the device will be discovered after a successful call to connect.
    * @param deviceAddress The Bluetooth address of the remote device to which a GATT connection should be opened.
    * @param properties Connection properties (optional).
    * @param callback Called when the connect request has completed.
    */
  inline def connect(deviceAddress: String, properties: IProperties, callback: js.Function0[Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("connect")(deviceAddress.asInstanceOf[js.Any], properties.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * Create a locally hosted GATT characteristic. This characteristic must be hosted under a valid service. If the service ID is not valid, the lastError will be set. This function is only available if the app has both the bluetooth:low_energy and the bluetooth:peripheral permissions set to true. The peripheral permission may not be available to all apps.
    * @since Chrome 52.
    * @param characteristic The characteristic to create.
    * @param serviceId ID of the service to create this characteristic for.
    * @param callback Called with the created characteristic's unique ID.
    */
  inline def createCharacteristic(
    characteristic: Characteristic,
    serviceId: String,
    callback: js.Function1[/* characteristicId */ String, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("createCharacteristic")(characteristic.asInstanceOf[js.Any], serviceId.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * Create a locally hosted GATT descriptor. This descriptor must be hosted under a valid characteristic. If the characteristic ID is not valid, the lastError will be set. This function is only available if the app has both the bluetooth:low_energy and the bluetooth:peripheral permissions set to true. The peripheral permission may not be available to all apps.
    * @since Chrome 52.
    * @param descriptor The descriptor to create.
    * @param characteristicId ID of the characteristic to create this descriptor for.
    * @param callback Called with the created desciptor's unique ID.
    */
  inline def createDescriptor(
    descriptor: Descriptor,
    characteristicId: String,
    callback: js.Function1[/* descriptorId */ String, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("createDescriptor")(descriptor.asInstanceOf[js.Any], characteristicId.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * Create a locally hosted GATT service. This service can be registered to be available on a local GATT server. This function is only available if the app has both the bluetooth:low_energy and the bluetooth:peripheral permissions set to true. The peripheral permission may not be available to all apps.
    * @since Chrome 52.
    * @param service The service to create.
    * @param callback Called with the created services's unique ID.
    */
  inline def createService(service: Service, callback: js.Function0[Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("createService")(service.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * Closes the app's connection to the device with the given address. Note that this will not always destroy the physical link itself, since there may be other apps with open connections.
    * @param deviceAddress The Bluetooth address of the remote device.
    * @param [callback] Called when the disconnect request has completed.
    */
  inline def disconnect(deviceAddress: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("disconnect")(deviceAddress.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def disconnect(deviceAddress: String, callback: js.Function0[Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("disconnect")(deviceAddress.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * Get the GATT characteristic with the given instance ID that belongs to the given GATT service, if the characteristic exists.
    * @param characteristicId The instance ID of the requested GATT characteristic.
    * @param callback Called with the requested Characteristic object.
    */
  inline def getCharacteristic(characteristicId: String, callback: js.Function1[/* result */ Characteristic, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("getCharacteristic")(characteristicId.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * Get a list of all discovered GATT characteristics that belong to the given service.
    * @param serviceId The instance ID of the GATT service whose characteristics should be returned.
    * @param callback Called with the list of characteristics that belong to the given service.
    */
  inline def getCharacteristics(serviceId: String, callback: js.Function1[/* result */ js.Array[Characteristic], Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("getCharacteristics")(serviceId.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * Get the GATT characteristic descriptor with the given instance ID.
    * @param descriptorId The instance ID of the requested GATT characteristic descriptor.
    * @param callback Called with the requested Descriptor object.
    */
  inline def getDescriptor(descriptorId: String, callback: js.Function1[/* result */ Descriptor, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("getDescriptor")(descriptorId.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * Get a list of GATT characteristic descriptors that belong to the given characteristic.
    * @param characteristicId The instance ID of the GATT characteristic whose descriptors should be returned.
    * @param callback Called with the list of descriptors that belong to the given characteristic.
    */
  inline def getDescriptors(characteristicId: String, callback: js.Function1[/* result */ js.Array[Descriptor], Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("getDescriptors")(characteristicId.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * Get a list of GATT services that are included by the given service.
    * @param serviceId The instance ID of the GATT service whose included services should be returned.
    * @param callback Called with the list of GATT services included from the given service.
    */
  inline def getIncludedServices(serviceId: String, callback: js.Function1[/* result */ js.Array[Service], Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("getIncludedServices")(serviceId.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * Get the GATT service with the given instance ID.
    * @param serviceId The instance ID of the requested GATT service.
    * @param callback Called with the requested Service object.
    */
  inline def getService(serviceId: String, callback: js.Function1[/* result */ Service, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("getService")(serviceId.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * Get all the GATT services that were discovered on the remote device with the given device address.
    * Note: If service discovery is not yet complete on the device, this API will return a subset (possibly empty) of services. A work around is to add a time based delay and/or call repeatedly until the expected number of services is returned.
    * @param deviceAddress The Bluetooth address of the remote device whose GATT services should be returned.
    * @param callback Called with the list of requested Service objects.
    */
  inline def getServices(deviceAddress: String, callback: js.Function1[/* result */ js.Array[Service], Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("getServices")(deviceAddress.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * Notify a remote device of a new value for a characteristic.
    * If the shouldIndicate flag in the notification object is true, an indication will be sent instead of a notification.
    * Note, the characteristic needs to correctly set the 'notify' or 'indicate' property during creation for this call to succeed.
    * This function is only available if the app has both the bluetooth:low_energy and the bluetooth:peripheral permissions set to true.
    * The peripheral permission may not be available to all apps.
    * @since Chrome 52.
    * @param characteristicId The characteristic to send the notication for.
    * @param notification Notification object
    * @param callback Callback called once the notification or indication has been sent successfully.
    */
  inline def notifyCharacteristicValueChanged(characteristicId: String, notification: INotification, callback: js.Function0[Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("notifyCharacteristicValueChanged")(characteristicId.asInstanceOf[js.Any], notification.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * Fired when a connected central device requests to read the value of
    *   a characteristic registered on the local GATT server.
    * Not responding to this request for a long time may lead to a disconnection.
    * This event is only available if the app has both the bluetooth:low_energy
    *   and the bluetooth:peripheral permissions set to true.
    * The peripheral permission may not be available to all apps.
    * @since Chrome 52.
    */
  @JSGlobal("chrome.bluetoothLowEnergy.onCharacteristicReadRequest")
  @js.native
  val onCharacteristicReadRequest: typings.chromeApps.chrome.events.Event[js.Function1[/* characteristic */ Characteristic, Unit]] = js.native
  
  /**
    * Fired when the value of a remote GATT characteristic changes,
    *   either as a result of a read request,
    *   or a value change notification/indication.
    * This event will only be sent if the app has enabled notifications
    *   by calling startCharacteristicNotifications.
    */
  @JSGlobal("chrome.bluetoothLowEnergy.onCharacteristicValueChanged")
  @js.native
  val onCharacteristicValueChanged: typings.chromeApps.chrome.events.Event[js.Function1[/* characteristic */ Characteristic, Unit]] = js.native
  
  /**
    * Fired when a connected central device requests to write the value of
    *   a characteristic registered on the local GATT server.
    * Not responding to this request for a long time may lead to a disconnection.
    * This event is only available if the app has both the bluetooth:low_energy
    *   and the bluetooth:peripheral permissions set to true.
    * The peripheral permission may not be available to all apps.
    * @since Chrome 52.
    */
  @JSGlobal("chrome.bluetoothLowEnergy.onCharacteristicWriteRequest")
  @js.native
  val onCharacteristicWriteRequest: typings.chromeApps.chrome.events.Event[js.Function1[/* characteristic */ Characteristic, Unit]] = js.native
  
  /**
    * Fired when a connected central device requests to read the value of
    *   a descriptor registered on the local GATT server.
    * Not responding to this request for a long time may lead to a disconnection.
    * This event is only available if the app has both the bluetooth:low_energy
    *   and the bluetooth:peripheral permissions set to true.
    * The peripheral permission may not be available to all apps.
    * @since Chrome 52.
    */
  @JSGlobal("chrome.bluetoothLowEnergy.onDescriptorReadRequest")
  @js.native
  val onDescriptorReadRequest: typings.chromeApps.chrome.events.Event[js.Function1[/* descriptor */ Descriptor, Unit]] = js.native
  
  /**
    * Fired when the value of a remote GATT characteristic descriptor changes,
    *   usually as a result of a read request.
    * This event exists mostly for convenience and will always be sent after
    *   a successful call to readDescriptorValue.
    */
  @JSGlobal("chrome.bluetoothLowEnergy.onDescriptorValueChanged")
  @js.native
  val onDescriptorValueChanged: typings.chromeApps.chrome.events.Event[js.Function1[/* descriptor */ Descriptor, Unit]] = js.native
  
  /**
    * Fired when a connected central device requests to write the value of
    *   a descriptor registered on the local GATT server.
    * Not responding to this request for a long time may lead to a disconnection.
    * This event is only available if the app has both the bluetooth:low_energy
    *   and the bluetooth:peripheral permissions set to true.
    * The peripheral permission may not be available to all apps.
    */
  @JSGlobal("chrome.bluetoothLowEnergy.onDescriptorWriteRequest")
  @js.native
  val onDescriptorWriteRequest: typings.chromeApps.chrome.events.Event[js.Function1[/* descriptor */ Descriptor, Unit]] = js.native
  
  /** Fired whan a new GATT service has been discovered on a remote device. */
  @JSGlobal("chrome.bluetoothLowEnergy.onServiceAdded")
  @js.native
  val onServiceAdded: typings.chromeApps.chrome.events.Event[js.Function1[/* service */ Service, Unit]] = js.native
  
  /**
    * Fired when the state of a remote GATT service changes.
    * This involves any characteristics and/or descriptors
    *   that get added or removed from the service, as well as
    *   'ServiceChanged' notifications from the remote device.
    */
  @JSGlobal("chrome.bluetoothLowEnergy.onServiceChanged")
  @js.native
  val onServiceChanged: typings.chromeApps.chrome.events.Event[js.Function1[/* service */ Service, Unit]] = js.native
  
  /** Fired when a GATT service that was previously discovered on a remote device has been removed. */
  @JSGlobal("chrome.bluetoothLowEnergy.onServiceRemoved")
  @js.native
  val onServiceRemoved: typings.chromeApps.chrome.events.Event[js.Function1[/* service */ Service, Unit]] = js.native
  
  /**
    * Retrieve the value of a specified characteristic from a remote peripheral.
    * @param characteristicId The instance ID of the GATT characteristic whose value should be read from the remote device.
    * @param callback Called with the Characteristic object whose value was requested. The value field of the returned Characteristic object contains the result of the read request.
    */
  inline def readCharacteristicValue(characteristicId: String, callback: js.Function1[/* result */ Characteristic, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("readCharacteristicValue")(characteristicId.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * Retrieve the value of a specified characteristic descriptor from a remote peripheral.
    * @param descriptorId The instance ID of the GATT characteristic descriptor whose value should be read from the remote device.
    * @param callback Called with the Descriptor object whose value was requested. The value field of the returned Descriptor object contains the result of the read request.
    */
  inline def readDescriptorValue(descriptorId: String, callback: js.Function1[/* result */ Descriptor, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("readDescriptorValue")(descriptorId.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * Create an advertisement and register it for advertising.
    * To call this function, the app must have
    *  the bluetooth:low_energy and bluetooth:peripheral permissions set to true.
    * Additionally this API is only available to auto launched apps in Kiosk Mode
    *  of by setting the 'enable-ble-advertising-in-apps' flag.
    *  See https://developer.chrome.com/apps/manifest/bluetooth
    * Note: On some hardware, central and peripheral modes at the same time
    *  is supported but on hardware that doesn't support this,
    *  making this call will switch the device to peripheral mode.
    * In the case of hardware which does not support both central and peripheral mode,
    *  attempting to use the device in both modes will lead to undefined behavior
    *  or prevent other central-role applications from behaving correctly
    *  (including the discovery of Bluetooth Low Energy devices).
    * @since Chrome 47.
    * @param advertisement The advertisement to advertise.
    * @param callback Called once the registeration is done and we've started advertising. Returns the id of the created advertisement.
    */
  inline def registerAdvertisement(advertisement: Advertisement, callback: js.Function1[/* advertisementId */ integer, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("registerAdvertisement")(advertisement.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * Register the given service with the local GATT server.
    * If the service ID is invalid, the lastError will be set.
    * This function is only available if the app has both
    *   the bluetooth:low_energy and the bluetooth:peripheral permissions set to true.
    * The peripheral permission may not be available to all apps.
    * @since Chrome 52.
    * @param serviceId Unique ID of a created service.
    * @param callback Callback with the result of the register operation.
    */
  inline def registerService(serviceId: String, callback: js.Function1[/* result */ Any, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("registerService")(serviceId.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * Remove the specified service, unregistering it if it was registered.
    * If the service ID is invalid, the lastError will be set.
    * This function is only available if the app has both
    *   the bluetooth:low_energy and the bluetooth:peripheral permissions set to true.
    * The peripheral permission may not be available to all apps.
    * @since Chrome 52.
    * @param serviceId Unique ID of a current registered service.
    * @param [callback] Callback called once the service is removed.
    */
  inline def removeService(serviceId: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("removeService")(serviceId.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def removeService(serviceId: String, callback: js.Function0[Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeService")(serviceId.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * Resets advertising on the current device. It will unregister and stop all existing advertisements.
    * @since Chrome 61.
    * @param callback Called once the advertisements are reset.
    */
  inline def resetAdvertising(callback: js.Function0[Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("resetAdvertising")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /**
    * Sends a response for a characteristic or descriptor read/write request. This function is only available if the app has both the bluetooth:low_energy and the bluetooth:peripheral permissions set to true. The peripheral permission may not be available to all apps.
    * @since Chrome 52.
    * @param response The response to the request.
    */
  inline def sendRequestResponse(response: IResponse): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("sendRequestResponse")(response.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /**
    * Set's the interval betweeen two consecutive advertisements.
    * Note: This is a best effort.
    * The actual interval may consty non-trivially from the requested intervals.
    * On some hardware, there is a minimum interval of 100ms.
    * The minimum and maximum values cannot exceed the the range allowed by the Bluetooth 4.2 specification.
    * @since Chrome 55.
    * @param minInterval Minimum interval between advertisments (in milliseconds). This cannot be lower than 20ms (as per the spec).
    * @param maxInterval Maximum interval between advertisments (in milliseconds). This cannot be more than 10240ms (as per the spec).
    * @param callback Called once the interval has been set.
    */
  inline def setAdvertisingInterval(minInterval: integer, maxInterval: integer, callback: js.Function0[Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setAdvertisingInterval")(minInterval.asInstanceOf[js.Any], maxInterval.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * Enable value notifications/indications from the specified characteristic. Once enabled, an application can listen to notifications using the onCharacteristicValueChanged event.
    * @see onCharacteristicValueChanged
    * @param characteristicId The instance ID of the GATT characteristic that notifications should be enabled on.
    * @param callback Called when the request has completed.
    */
  inline def startCharacteristicNotifications(characteristicId: String, callback: js.Function0[Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("startCharacteristicNotifications")(characteristicId.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  /**
    * Enable value notifications/indications from the specified characteristic. Once enabled, an application can listen to notifications using the onCharacteristicValueChanged event.
    * @see onCharacteristicValueChanged
    * @param characteristicId The instance ID of the GATT characteristic that notifications should be enabled on.
    * @param properties Notification session properties (optional).
    * @param callback Called when the request has completed.
    */
  inline def startCharacteristicNotifications(characteristicId: String, properties: IProperties, callback: js.Function0[Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("startCharacteristicNotifications")(characteristicId.asInstanceOf[js.Any], properties.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * Disable value notifications/indications from the specified characteristic. After a successful call, the application will stop receiving notifications/indications from this characteristic.
    * @param characteristicId The instance ID of the GATT characteristic on which this app's notification session should be stopped.
    * @param [callback] Called when the request has completed (optional).
    */
  inline def stopCharacteristicNotifications(characteristicId: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("stopCharacteristicNotifications")(characteristicId.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def stopCharacteristicNotifications(characteristicId: String, callback: js.Function0[Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("stopCharacteristicNotifications")(characteristicId.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * Unregisters an advertisement and stops its advertising.
    * If the advertisement fails to unregister the only way
    *  to stop advertising might be to restart the device.
    * @since Chrome 47.
    * @param advertisementId Id of the advertisement to unregister.
    * @param callback Called once the advertisement is unregistered and is no longer being advertised.
    */
  inline def unregisterAdvertisement(advertisementId: integer, callback: js.Function0[Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("unregisterAdvertisement")(advertisementId.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * Unregister the given service with the local GATT server.
    * If the service ID is invalid, the lastError will be set.
    * This function is only available if the app has both
    *   the bluetooth:low_energy and the bluetooth:peripheral permissions set to true.
    * The peripheral permission may not be available to all apps.
    * @since Chrome 52.
    * @param serviceId Unique ID of a current registered service.
    * @param callback Callback with the result of the register operation.
    */
  inline def unregisterService(serviceId: String, callback: js.Function1[/* result */ Any, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("unregisterService")(serviceId.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * Write the value of a specified characteristic from a remote peripheral.
    * @param characteristicId The instance ID of the GATT characteristic whose value should be written to.
    * @param value The value that should be sent to the remote characteristic as part of the write request.
    * @param callback Called when the write request has completed.
    */
  inline def writeCharacteristicValue(characteristicId: String, value: js.typedarray.ArrayBuffer, callback: js.Function0[Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("writeCharacteristicValue")(characteristicId.asInstanceOf[js.Any], value.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * Write the value of a specified characteristic descriptor from a remote peripheral.
    * @param descriptorId The instance ID of the GATT characteristic descriptor whose value should be written to.
    * @param value The value that should be sent to the remote descriptor as part of the write request.
    * @param callback Called when the write request has completed.
    */
  inline def writeDescriptorValue(descriptorId: String, value: js.typedarray.ArrayBuffer, callback: js.Function0[Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("writeDescriptorValue")(descriptorId.asInstanceOf[js.Any], value.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
