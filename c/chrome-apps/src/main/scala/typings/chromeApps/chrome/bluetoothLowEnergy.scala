package typings.chromeApps.chrome

import typings.chromeApps.anon.Data
import typings.chromeApps.anon.Uuid
import typings.chromeApps.chromeAppsStrings.read_
import typings.chromeApps.chromeAppsStrings.write_
import typings.std.ArrayBuffer
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
  
  trait Advertisement extends StObject {
    
    /** List of manufacturer specific data to be included in 'Manufacturer Specific Data' fields of the advertising data. */
    var manufacturerData: js.UndefOr[Data] = js.undefined
    
    /** List of service data to be included in 'Service Data' fields of the advertising data. */
    var serviceData: Uuid
    
    /** List of UUIDs to include in the 'Service UUIDs' field of the Advertising Data. These UUIDs can be of the 16bit, 32bit or 128 formats. */
    var serviceUuids: js.UndefOr[js.Array[String]] = js.undefined
    
    /** List of UUIDs to include in the 'Solicit UUIDs' field of the Advertising Data. These UUIDs can be of the 16bit, 32bit or 128 formats. */
    var solicitUuids: js.UndefOr[js.Array[String]] = js.undefined
    
    /** Type of advertisement. */
    var `type`: AdvertisementType
  }
  object Advertisement {
    
    @scala.inline
    def apply(serviceData: Uuid, `type`: AdvertisementType): Advertisement = {
      val __obj = js.Dynamic.literal(serviceData = serviceData.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Advertisement]
    }
    
    @scala.inline
    implicit class AdvertisementMutableBuilder[Self <: Advertisement] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setManufacturerData(value: Data): Self = StObject.set(x, "manufacturerData", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setManufacturerDataUndefined: Self = StObject.set(x, "manufacturerData", js.undefined)
      
      @scala.inline
      def setServiceData(value: Uuid): Self = StObject.set(x, "serviceData", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setServiceUuids(value: js.Array[String]): Self = StObject.set(x, "serviceUuids", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setServiceUuidsUndefined: Self = StObject.set(x, "serviceUuids", js.undefined)
      
      @scala.inline
      def setServiceUuidsVarargs(value: String*): Self = StObject.set(x, "serviceUuids", js.Array(value :_*))
      
      @scala.inline
      def setSolicitUuids(value: js.Array[String]): Self = StObject.set(x, "solicitUuids", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSolicitUuidsUndefined: Self = StObject.set(x, "solicitUuids", js.undefined)
      
      @scala.inline
      def setSolicitUuidsVarargs(value: String*): Self = StObject.set(x, "solicitUuids", js.Array(value :_*))
      
      @scala.inline
      def setType(value: AdvertisementType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.chromeApps.chromeAppsStrings.broadcast
    - typings.chromeApps.chromeAppsStrings.peripheral
  */
  trait AdvertisementType extends StObject
  object AdvertisementType {
    
    @scala.inline
    def broadcast: typings.chromeApps.chromeAppsStrings.broadcast = "broadcast".asInstanceOf[typings.chromeApps.chromeAppsStrings.broadcast]
    
    @scala.inline
    def peripheral: typings.chromeApps.chromeAppsStrings.peripheral = "peripheral".asInstanceOf[typings.chromeApps.chromeAppsStrings.peripheral]
  }
  
  trait Characteristic extends StObject {
    
    /** Returns the identifier assigned to this characteristic. Use the instance ID to distinguish between characteristics from a peripheral with the same UUID and to make function calls that take in a characteristic identifier. Present, if this instance represents a remote characteristic. */
    var instanceId: js.UndefOr[String] = js.undefined
    
    /** The properties of this characteristic. */
    var properties: js.Array[CharacteristicProperties]
    
    /** The GATT service this characteristic belongs to. */
    var service: js.UndefOr[Service] = js.undefined
    
    /** The UUID of the characteristic, e.g. 00002a37-0000-1000-8000-00805f9b34fb. */
    var uuid: String
    
    /** The currently cached characteristic value. This value gets updated when the value of the characteristic is read or updated via a notification or indication. */
    var value: js.UndefOr[ArrayBuffer] = js.undefined
  }
  object Characteristic {
    
    @scala.inline
    def apply(properties: js.Array[CharacteristicProperties], uuid: String): Characteristic = {
      val __obj = js.Dynamic.literal(properties = properties.asInstanceOf[js.Any], uuid = uuid.asInstanceOf[js.Any])
      __obj.asInstanceOf[Characteristic]
    }
    
    @scala.inline
    implicit class CharacteristicMutableBuilder[Self <: Characteristic] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setInstanceId(value: String): Self = StObject.set(x, "instanceId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInstanceIdUndefined: Self = StObject.set(x, "instanceId", js.undefined)
      
      @scala.inline
      def setProperties(value: js.Array[CharacteristicProperties]): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPropertiesVarargs(value: CharacteristicProperties*): Self = StObject.set(x, "properties", js.Array(value :_*))
      
      @scala.inline
      def setService(value: Service): Self = StObject.set(x, "service", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setServiceUndefined: Self = StObject.set(x, "service", js.undefined)
      
      @scala.inline
      def setUuid(value: String): Self = StObject.set(x, "uuid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValue(value: ArrayBuffer): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.chromeApps.chromeAppsStrings.broadcast
    - typings.chromeApps.chromeAppsStrings.read_
    - typings.chromeApps.chromeAppsStrings.writeWithoutResponse
    - typings.chromeApps.chromeAppsStrings.write_
    - typings.chromeApps.chromeAppsStrings.notify
    - typings.chromeApps.chromeAppsStrings.indicate
    - typings.chromeApps.chromeAppsStrings.authenticatedSignedWrites
    - typings.chromeApps.chromeAppsStrings.extendedProperties
    - typings.chromeApps.chromeAppsStrings.reliableWrite
    - typings.chromeApps.chromeAppsStrings.writableAuxiliaries
    - typings.chromeApps.chromeAppsStrings.encryptRead
    - typings.chromeApps.chromeAppsStrings.encryptWrite
    - typings.chromeApps.chromeAppsStrings.encryptAuthenticatedRead
    - typings.chromeApps.chromeAppsStrings.encryptAuthenticatedWrite
  */
  trait CharacteristicProperties extends StObject
  object CharacteristicProperties {
    
    @scala.inline
    def authenticatedSignedWrites: typings.chromeApps.chromeAppsStrings.authenticatedSignedWrites = "authenticatedSignedWrites".asInstanceOf[typings.chromeApps.chromeAppsStrings.authenticatedSignedWrites]
    
    @scala.inline
    def broadcast: typings.chromeApps.chromeAppsStrings.broadcast = "broadcast".asInstanceOf[typings.chromeApps.chromeAppsStrings.broadcast]
    
    @scala.inline
    def encryptAuthenticatedRead: typings.chromeApps.chromeAppsStrings.encryptAuthenticatedRead = "encryptAuthenticatedRead".asInstanceOf[typings.chromeApps.chromeAppsStrings.encryptAuthenticatedRead]
    
    @scala.inline
    def encryptAuthenticatedWrite: typings.chromeApps.chromeAppsStrings.encryptAuthenticatedWrite = "encryptAuthenticatedWrite".asInstanceOf[typings.chromeApps.chromeAppsStrings.encryptAuthenticatedWrite]
    
    @scala.inline
    def encryptRead: typings.chromeApps.chromeAppsStrings.encryptRead = "encryptRead".asInstanceOf[typings.chromeApps.chromeAppsStrings.encryptRead]
    
    @scala.inline
    def encryptWrite: typings.chromeApps.chromeAppsStrings.encryptWrite = "encryptWrite".asInstanceOf[typings.chromeApps.chromeAppsStrings.encryptWrite]
    
    @scala.inline
    def extendedProperties: typings.chromeApps.chromeAppsStrings.extendedProperties = "extendedProperties".asInstanceOf[typings.chromeApps.chromeAppsStrings.extendedProperties]
    
    @scala.inline
    def indicate: typings.chromeApps.chromeAppsStrings.indicate = "indicate".asInstanceOf[typings.chromeApps.chromeAppsStrings.indicate]
    
    @scala.inline
    def read: read_ = "read".asInstanceOf[read_]
    
    @scala.inline
    def reliableWrite: typings.chromeApps.chromeAppsStrings.reliableWrite = "reliableWrite".asInstanceOf[typings.chromeApps.chromeAppsStrings.reliableWrite]
    
    @scala.inline
    def writableAuxiliaries: typings.chromeApps.chromeAppsStrings.writableAuxiliaries = "writableAuxiliaries".asInstanceOf[typings.chromeApps.chromeAppsStrings.writableAuxiliaries]
    
    @scala.inline
    def write: write_ = "write".asInstanceOf[write_]
    
    @scala.inline
    def writeWithoutResponse: typings.chromeApps.chromeAppsStrings.writeWithoutResponse = "writeWithoutResponse".asInstanceOf[typings.chromeApps.chromeAppsStrings.writeWithoutResponse]
  }
  
  trait Descriptor extends StObject {
    
    /** The GATT characteristic this descriptor belongs to. */
    var characteristic: js.UndefOr[Characteristic] = js.undefined
    
    /** Returns the identifier assigned to this descriptor. Use the instance ID to distinguish between descriptors from a peripheral with the same UUID and to make function calls that take in a descriptor identifier. Present, if this instance represents a remote characteristic. */
    var instanceId: js.UndefOr[String] = js.undefined
    
    /**
      * The permissions of this descriptor.
      * @since Chrome 52.
      */
    var permissions: js.Array[DescriptorPermissions]
    
    /** The UUID of the characteristic descriptor, e.g. 00002902-0000-1000-8000-00805f9b34fb. */
    var uuid: String
    
    /** The currently cached descriptor value. This value gets updated when the value of the descriptor is read. */
    var value: js.UndefOr[ArrayBuffer] = js.undefined
  }
  object Descriptor {
    
    @scala.inline
    def apply(permissions: js.Array[DescriptorPermissions], uuid: String): Descriptor = {
      val __obj = js.Dynamic.literal(permissions = permissions.asInstanceOf[js.Any], uuid = uuid.asInstanceOf[js.Any])
      __obj.asInstanceOf[Descriptor]
    }
    
    @scala.inline
    implicit class DescriptorMutableBuilder[Self <: Descriptor] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCharacteristic(value: Characteristic): Self = StObject.set(x, "characteristic", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCharacteristicUndefined: Self = StObject.set(x, "characteristic", js.undefined)
      
      @scala.inline
      def setInstanceId(value: String): Self = StObject.set(x, "instanceId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInstanceIdUndefined: Self = StObject.set(x, "instanceId", js.undefined)
      
      @scala.inline
      def setPermissions(value: js.Array[DescriptorPermissions]): Self = StObject.set(x, "permissions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPermissionsVarargs(value: DescriptorPermissions*): Self = StObject.set(x, "permissions", js.Array(value :_*))
      
      @scala.inline
      def setUuid(value: String): Self = StObject.set(x, "uuid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValue(value: ArrayBuffer): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.chromeApps.chromeAppsStrings.read_
    - typings.chromeApps.chromeAppsStrings.write_
    - typings.chromeApps.chromeAppsStrings.encryptedRead
    - typings.chromeApps.chromeAppsStrings.encryptedWrite
    - typings.chromeApps.chromeAppsStrings.encryptedAuthenticatedRead
    - typings.chromeApps.chromeAppsStrings.encryptedAuthenticatedWrite
  */
  trait DescriptorPermissions extends StObject
  object DescriptorPermissions {
    
    @scala.inline
    def encryptedAuthenticatedRead: typings.chromeApps.chromeAppsStrings.encryptedAuthenticatedRead = "encryptedAuthenticatedRead".asInstanceOf[typings.chromeApps.chromeAppsStrings.encryptedAuthenticatedRead]
    
    @scala.inline
    def encryptedAuthenticatedWrite: typings.chromeApps.chromeAppsStrings.encryptedAuthenticatedWrite = "encryptedAuthenticatedWrite".asInstanceOf[typings.chromeApps.chromeAppsStrings.encryptedAuthenticatedWrite]
    
    @scala.inline
    def encryptedRead: typings.chromeApps.chromeAppsStrings.encryptedRead = "encryptedRead".asInstanceOf[typings.chromeApps.chromeAppsStrings.encryptedRead]
    
    @scala.inline
    def encryptedWrite: typings.chromeApps.chromeAppsStrings.encryptedWrite = "encryptedWrite".asInstanceOf[typings.chromeApps.chromeAppsStrings.encryptedWrite]
    
    @scala.inline
    def read: read_ = "read".asInstanceOf[read_]
    
    @scala.inline
    def write: write_ = "write".asInstanceOf[write_]
  }
  
  trait INotification extends StObject {
    
    /** Optional flag for sending an indication instead of a notification. */
    var shouldIndicate: Boolean
    
    /** New value of the characteristic. */
    var value: ArrayBuffer
  }
  object INotification {
    
    @scala.inline
    def apply(shouldIndicate: Boolean, value: ArrayBuffer): INotification = {
      val __obj = js.Dynamic.literal(shouldIndicate = shouldIndicate.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[INotification]
    }
    
    @scala.inline
    implicit class INotificationMutableBuilder[Self <: INotification] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setShouldIndicate(value: Boolean): Self = StObject.set(x, "shouldIndicate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValue(value: ArrayBuffer): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  trait IProperties extends StObject {
    
    /**
      * Flag indicating whether a connection to the device is left open when the event page of the application is unloaded. The default value is false.
      * @see [HowToManageAppLifecycle]{@link https://developer.chrome.com/apps/app_lifecycle}
      * @default false
      */
    var persistent: Boolean
  }
  object IProperties {
    
    @scala.inline
    def apply(persistent: Boolean): IProperties = {
      val __obj = js.Dynamic.literal(persistent = persistent.asInstanceOf[js.Any])
      __obj.asInstanceOf[IProperties]
    }
    
    @scala.inline
    implicit class IPropertiesMutableBuilder[Self <: IProperties] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPersistent(value: Boolean): Self = StObject.set(x, "persistent", value.asInstanceOf[js.Any])
    }
  }
  
  trait IResponse extends StObject {
    
    /** If this is an error response, this should be true. */
    var isError: Boolean
    
    /** Id of the request this is a response to. */
    var requestId: integer
    
    /** Response value. Write requests and error responses will ignore this parameter. */
    var value: js.UndefOr[ArrayBuffer] = js.undefined
  }
  object IResponse {
    
    @scala.inline
    def apply(isError: Boolean, requestId: integer): IResponse = {
      val __obj = js.Dynamic.literal(isError = isError.asInstanceOf[js.Any], requestId = requestId.asInstanceOf[js.Any])
      __obj.asInstanceOf[IResponse]
    }
    
    @scala.inline
    implicit class IResponseMutableBuilder[Self <: IResponse] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIsError(value: Boolean): Self = StObject.set(x, "isError", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRequestId(value: integer): Self = StObject.set(x, "requestId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValue(value: ArrayBuffer): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  trait Request extends StObject {
    
    /** Device that send this request. */
    var device: RequestDevice
    
    /** Unique ID for this request. Use this ID when responding to this request. */
    var requestId: integer
    
    /** Value to write (if this is a write request). */
    var value: js.UndefOr[ArrayBuffer] = js.undefined
  }
  object Request {
    
    @scala.inline
    def apply(device: RequestDevice, requestId: integer): Request = {
      val __obj = js.Dynamic.literal(device = device.asInstanceOf[js.Any], requestId = requestId.asInstanceOf[js.Any])
      __obj.asInstanceOf[Request]
    }
    
    @scala.inline
    implicit class RequestMutableBuilder[Self <: Request] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDevice(value: RequestDevice): Self = StObject.set(x, "device", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRequestId(value: integer): Self = StObject.set(x, "requestId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValue(value: ArrayBuffer): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  trait RequestDevice extends StObject {
    
    /** The address of the device, in the format 'XX:XX:XX:XX:XX:XX'. */
    var address: String
    
    /** The class of the device, a bit - field defined by:
      * @see [Specs]{@link http://www.bluetooth.org/en-us/specification/assigned-numbers/baseband}
      **/
    var deviceClass: js.UndefOr[integer] = js.undefined
    
    /** The human-readable name of the device. */
    var name: js.UndefOr[String] = js.undefined
  }
  object RequestDevice {
    
    @scala.inline
    def apply(address: String): RequestDevice = {
      val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any])
      __obj.asInstanceOf[RequestDevice]
    }
    
    @scala.inline
    implicit class RequestDeviceMutableBuilder[Self <: RequestDevice] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAddress(value: String): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDeviceClass(value: integer): Self = StObject.set(x, "deviceClass", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDeviceClassUndefined: Self = StObject.set(x, "deviceClass", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    }
  }
  
  trait Service extends StObject {
    
    /**
      * The device address of the remote peripheral that the GATT service belongs to.
      * Present, if this instance represents a remote service.
      */
    var deviceAddress: js.UndefOr[String] = js.undefined
    
    /**
      * Returns the identifier assigned to this service.
      * Use the instance ID to distinguish between services from a peripheral with the same UUID and to make function calls that take in a service identifier.
      * Present, if this instance represents a remote service.
      **/
    var instanceId: js.UndefOr[String] = js.undefined
    
    /** Indicates whether the type of this service is primary or secondary. */
    var isPrimary: Boolean
    
    /** The UUID of the service, e.g. 0000180d-0000-1000-8000-00805f9b34fb. */
    var uuid: String
  }
  object Service {
    
    @scala.inline
    def apply(isPrimary: Boolean, uuid: String): Service = {
      val __obj = js.Dynamic.literal(isPrimary = isPrimary.asInstanceOf[js.Any], uuid = uuid.asInstanceOf[js.Any])
      __obj.asInstanceOf[Service]
    }
    
    @scala.inline
    implicit class ServiceMutableBuilder[Self <: Service] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDeviceAddress(value: String): Self = StObject.set(x, "deviceAddress", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDeviceAddressUndefined: Self = StObject.set(x, "deviceAddress", js.undefined)
      
      @scala.inline
      def setInstanceId(value: String): Self = StObject.set(x, "instanceId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInstanceIdUndefined: Self = StObject.set(x, "instanceId", js.undefined)
      
      @scala.inline
      def setIsPrimary(value: Boolean): Self = StObject.set(x, "isPrimary", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUuid(value: String): Self = StObject.set(x, "uuid", value.asInstanceOf[js.Any])
    }
  }
}
