package typings.bleno

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Shortcut
import typings.bleno.anon.TypeofCharacteristic
import typings.bleno.blenoStrings.accept
import typings.bleno.blenoStrings.advertisingStart
import typings.bleno.blenoStrings.advertisingStartError
import typings.bleno.blenoStrings.advertisingStop
import typings.bleno.blenoStrings.disconnect
import typings.bleno.blenoStrings.mtuChange
import typings.bleno.blenoStrings.rssiUpdate
import typings.bleno.blenoStrings.servicesSet
import typings.bleno.blenoStrings.servicesSetError
import typings.bleno.blenoStrings.stateChange
import typings.node.Buffer
import typings.node.eventsMod.global.NodeJS.EventEmitter
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("bleno", JSImport.Namespace)
  @js.native
  val ^ : Bleno = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("bleno", "Characteristic")
  @js.native
  class CharacteristicCls protected ()
    extends StObject
       with Characteristic {
    def this(options: CharacteristicOptions) = this()
    
    /* CompleteClass */
    override val RESULT_ATTR_NOT_LONG: Double = js.native
    
    /* CompleteClass */
    override val RESULT_INVALID_ATTRIBUTE_LENGTH: Double = js.native
    
    /* CompleteClass */
    override val RESULT_INVALID_OFFSET: Double = js.native
    
    /* CompleteClass */
    override val RESULT_SUCCESS: Double = js.native
    
    /* CompleteClass */
    override val RESULT_UNLIKELY_ERROR: Double = js.native
    
    /* CompleteClass */
    var descriptors: js.Array[Descriptor] = js.native
    
    /* CompleteClass */
    override def onIndicate(): Unit = js.native
    
    /* CompleteClass */
    override def onNotify(): Unit = js.native
    
    /* CompleteClass */
    override def onReadRequest(offset: Double, callback: js.Function2[/* result */ Double, /* data */ js.UndefOr[Buffer], Unit]): Unit = js.native
    
    /* CompleteClass */
    override def onSubscribe(maxValueSize: Double, updateValueCallback: js.Any): Unit = js.native
    
    /* CompleteClass */
    override def onUnsubscribe(): Unit = js.native
    
    /* CompleteClass */
    override def onWriteRequest(
      data: Buffer,
      offset: Double,
      withoutResponse: Boolean,
      callback: js.Function1[/* result */ Double, Unit]
    ): Unit = js.native
    
    /* CompleteClass */
    var properties: js.Array[Property] = js.native
    
    /* CompleteClass */
    var secure: js.Array[Property] = js.native
    
    /* CompleteClass */
    var uuid: String = js.native
    
    /* CompleteClass */
    var value: Buffer | Null = js.native
  }
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("bleno", "Descriptor")
  @js.native
  class DescriptorCls protected ()
    extends StObject
       with Descriptor {
    def this(options: DescriptorOptions) = this()
    
    /* CompleteClass */
    var uuid: String = js.native
    
    /* CompleteClass */
    var value: Buffer = js.native
  }
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("bleno", "PrimaryService")
  @js.native
  class PrimaryServiceCls protected ()
    extends StObject
       with PrimaryService {
    def this(options: PrimaryServiceOptions) = this()
    
    /* CompleteClass */
    var characteristics: js.Array[Characteristic] = js.native
    
    /* CompleteClass */
    var uuid: String = js.native
  }
  
  @js.native
  trait Bleno
    extends StObject
       with EventEmitter {
    
    val Characteristic: TypeofCharacteristic & (Instantiable1[/* options */ CharacteristicOptions, typings.bleno.mod.Characteristic]) = js.native
    
    val Descriptor: Instantiable1[/* options */ DescriptorOptions, typings.bleno.mod.Descriptor] = js.native
    
    val PrimaryService: Instantiable1[/* options */ PrimaryServiceOptions, typings.bleno.mod.PrimaryService] = js.native
    
    val address: String = js.native
    
    def disconnect(): Unit = js.native
    
    val mtu: Double = js.native
    
    @JSName("on")
    def on_accept(event: accept, cb: js.Function1[/* address */ String, Unit]): this.type = js.native
    @JSName("on")
    def on_advertisingStart(event: advertisingStart, cb: js.Function1[/* err */ js.UndefOr[Error | Null], Unit]): this.type = js.native
    @JSName("on")
    def on_advertisingStartError(event: advertisingStartError, cb: js.Function1[/* err */ Error, Unit]): this.type = js.native
    @JSName("on")
    def on_advertisingStop(event: advertisingStop, cb: js.Function0[Unit]): this.type = js.native
    @JSName("on")
    def on_disconnect(event: disconnect, cb: js.Function1[/* clientAddress */ String, Unit]): this.type = js.native
    @JSName("on")
    def on_mtuChange(event: mtuChange, cb: js.Function1[/* mtu */ Double, Unit]): this.type = js.native
    @JSName("on")
    def on_rssiUpdate(event: rssiUpdate, cb: js.Function1[/* rssi */ Double, Unit]): this.type = js.native
    @JSName("on")
    def on_servicesSet(event: servicesSet, cb: js.Function1[/* err */ js.UndefOr[Error | Null], Unit]): this.type = js.native
    @JSName("on")
    def on_servicesSetError(event: servicesSetError, cb: js.Function1[/* err */ Error, Unit]): this.type = js.native
    @JSName("on")
    def on_stateChange(event: stateChange, cb: js.Function1[/* state */ State, Unit]): this.type = js.native
    
    val platform: String = js.native
    
    val rssi: Double = js.native
    
    def setServices(services: js.Array[typings.bleno.mod.PrimaryService]): Unit = js.native
    def setServices(
      services: js.Array[typings.bleno.mod.PrimaryService],
      callback: js.Function1[/* arg */ js.UndefOr[Error | Null], Unit]
    ): Unit = js.native
    
    def startAdvertising(name: String): Unit = js.native
    def startAdvertising(name: String, serviceUuids: js.Array[String]): Unit = js.native
    def startAdvertising(
      name: String,
      serviceUuids: js.Array[String],
      callback: js.Function1[/* arg */ js.UndefOr[Error | Null], Unit]
    ): Unit = js.native
    def startAdvertising(name: String, serviceUuids: Unit, callback: js.Function1[/* arg */ js.UndefOr[Error | Null], Unit]): Unit = js.native
    
    def startAdvertisingIBeacon(uuid: String, major: Double, minor: Double, measuredPower: Double): Unit = js.native
    def startAdvertisingIBeacon(
      uuid: String,
      major: Double,
      minor: Double,
      measuredPower: Double,
      callback: js.Function1[/* arg */ js.UndefOr[Error | Null], Unit]
    ): Unit = js.native
    
    def startAdvertisingWithEIRData(advertisementData: Buffer): Unit = js.native
    def startAdvertisingWithEIRData(advertisementData: Buffer, callback: js.Function1[/* arg */ js.UndefOr[Error | Null], Unit]): Unit = js.native
    def startAdvertisingWithEIRData(advertisementData: Buffer, scanData: Buffer): Unit = js.native
    def startAdvertisingWithEIRData(
      advertisementData: Buffer,
      scanData: Buffer,
      callback: js.Function1[/* arg */ js.UndefOr[Error | Null], Unit]
    ): Unit = js.native
    
    val state: State = js.native
    
    def stopAdvertising(): Unit = js.native
    def stopAdvertising(callback: js.Function0[Unit]): Unit = js.native
    
    def updateRssi(): Unit = js.native
    def updateRssi(callback: js.Function2[/* err */ Null, /* rssi */ Double, Unit]): Unit = js.native
  }
  
  trait Characteristic extends StObject {
    
    val RESULT_ATTR_NOT_LONG: Double
    
    val RESULT_INVALID_ATTRIBUTE_LENGTH: Double
    
    val RESULT_INVALID_OFFSET: Double
    
    val RESULT_SUCCESS: Double
    
    val RESULT_UNLIKELY_ERROR: Double
    
    var descriptors: js.Array[Descriptor]
    
    def onIndicate(): Unit
    
    def onNotify(): Unit
    
    def onReadRequest(offset: Double, callback: js.Function2[/* result */ Double, /* data */ js.UndefOr[Buffer], Unit]): Unit
    
    def onSubscribe(maxValueSize: Double, updateValueCallback: js.Any): Unit
    
    def onUnsubscribe(): Unit
    
    def onWriteRequest(
      data: Buffer,
      offset: Double,
      withoutResponse: Boolean,
      callback: js.Function1[/* result */ Double, Unit]
    ): Unit
    
    var properties: js.Array[Property]
    
    var secure: js.Array[Property]
    
    var uuid: String
    
    var value: Buffer | Null
  }
  object Characteristic {
    
    inline def apply(
      RESULT_ATTR_NOT_LONG: Double,
      RESULT_INVALID_ATTRIBUTE_LENGTH: Double,
      RESULT_INVALID_OFFSET: Double,
      RESULT_SUCCESS: Double,
      RESULT_UNLIKELY_ERROR: Double,
      descriptors: js.Array[Descriptor],
      onIndicate: () => Unit,
      onNotify: () => Unit,
      onReadRequest: (Double, js.Function2[/* result */ Double, /* data */ js.UndefOr[Buffer], Unit]) => Unit,
      onSubscribe: (Double, js.Any) => Unit,
      onUnsubscribe: () => Unit,
      onWriteRequest: (Buffer, Double, Boolean, js.Function1[/* result */ Double, Unit]) => Unit,
      properties: js.Array[Property],
      secure: js.Array[Property],
      uuid: String
    ): Characteristic = {
      val __obj = js.Dynamic.literal(RESULT_ATTR_NOT_LONG = RESULT_ATTR_NOT_LONG.asInstanceOf[js.Any], RESULT_INVALID_ATTRIBUTE_LENGTH = RESULT_INVALID_ATTRIBUTE_LENGTH.asInstanceOf[js.Any], RESULT_INVALID_OFFSET = RESULT_INVALID_OFFSET.asInstanceOf[js.Any], RESULT_SUCCESS = RESULT_SUCCESS.asInstanceOf[js.Any], RESULT_UNLIKELY_ERROR = RESULT_UNLIKELY_ERROR.asInstanceOf[js.Any], descriptors = descriptors.asInstanceOf[js.Any], onIndicate = js.Any.fromFunction0(onIndicate), onNotify = js.Any.fromFunction0(onNotify), onReadRequest = js.Any.fromFunction2(onReadRequest), onSubscribe = js.Any.fromFunction2(onSubscribe), onUnsubscribe = js.Any.fromFunction0(onUnsubscribe), onWriteRequest = js.Any.fromFunction4(onWriteRequest), properties = properties.asInstanceOf[js.Any], secure = secure.asInstanceOf[js.Any], uuid = uuid.asInstanceOf[js.Any], value = null)
      __obj.asInstanceOf[Characteristic]
    }
    
    extension [Self <: Characteristic](x: Self) {
      
      inline def setDescriptors(value: js.Array[Descriptor]): Self = StObject.set(x, "descriptors", value.asInstanceOf[js.Any])
      
      inline def setDescriptorsVarargs(value: Descriptor*): Self = StObject.set(x, "descriptors", js.Array(value :_*))
      
      inline def setOnIndicate(value: () => Unit): Self = StObject.set(x, "onIndicate", js.Any.fromFunction0(value))
      
      inline def setOnNotify(value: () => Unit): Self = StObject.set(x, "onNotify", js.Any.fromFunction0(value))
      
      inline def setOnReadRequest(value: (Double, js.Function2[/* result */ Double, /* data */ js.UndefOr[Buffer], Unit]) => Unit): Self = StObject.set(x, "onReadRequest", js.Any.fromFunction2(value))
      
      inline def setOnSubscribe(value: (Double, js.Any) => Unit): Self = StObject.set(x, "onSubscribe", js.Any.fromFunction2(value))
      
      inline def setOnUnsubscribe(value: () => Unit): Self = StObject.set(x, "onUnsubscribe", js.Any.fromFunction0(value))
      
      inline def setOnWriteRequest(value: (Buffer, Double, Boolean, js.Function1[/* result */ Double, Unit]) => Unit): Self = StObject.set(x, "onWriteRequest", js.Any.fromFunction4(value))
      
      inline def setProperties(value: js.Array[Property]): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
      
      inline def setPropertiesVarargs(value: Property*): Self = StObject.set(x, "properties", js.Array(value :_*))
      
      inline def setRESULT_ATTR_NOT_LONG(value: Double): Self = StObject.set(x, "RESULT_ATTR_NOT_LONG", value.asInstanceOf[js.Any])
      
      inline def setRESULT_INVALID_ATTRIBUTE_LENGTH(value: Double): Self = StObject.set(x, "RESULT_INVALID_ATTRIBUTE_LENGTH", value.asInstanceOf[js.Any])
      
      inline def setRESULT_INVALID_OFFSET(value: Double): Self = StObject.set(x, "RESULT_INVALID_OFFSET", value.asInstanceOf[js.Any])
      
      inline def setRESULT_SUCCESS(value: Double): Self = StObject.set(x, "RESULT_SUCCESS", value.asInstanceOf[js.Any])
      
      inline def setRESULT_UNLIKELY_ERROR(value: Double): Self = StObject.set(x, "RESULT_UNLIKELY_ERROR", value.asInstanceOf[js.Any])
      
      inline def setSecure(value: js.Array[Property]): Self = StObject.set(x, "secure", value.asInstanceOf[js.Any])
      
      inline def setSecureVarargs(value: Property*): Self = StObject.set(x, "secure", js.Array(value :_*))
      
      inline def setUuid(value: String): Self = StObject.set(x, "uuid", value.asInstanceOf[js.Any])
      
      inline def setValue(value: Buffer): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueNull: Self = StObject.set(x, "value", null)
    }
  }
  
  trait CharacteristicOptions extends StObject {
    
    var descriptors: js.UndefOr[js.Array[Descriptor] | Null] = js.undefined
    
    var onIndicate: js.UndefOr[js.Function0[Unit] | Null] = js.undefined
    
    var onNotify: js.UndefOr[js.Function0[Unit] | Null] = js.undefined
    
    var onReadRequest: js.UndefOr[
        (js.Function2[
          /* offset */ Double, 
          /* callback */ js.Function2[/* result */ Double, /* data */ js.UndefOr[Buffer], Unit], 
          Unit
        ]) | Null
      ] = js.undefined
    
    var onSubscribe: js.UndefOr[
        (js.Function2[/* maxValueSize */ Double, /* updateValueCallback */ js.Any, Unit]) | Null
      ] = js.undefined
    
    var onUnsubscribe: js.UndefOr[js.Function0[Unit] | Null] = js.undefined
    
    var onWriteRequest: js.UndefOr[
        (js.Function4[
          /* data */ Buffer, 
          /* offset */ Double, 
          /* withoutResponse */ Boolean, 
          /* callback */ js.Function1[/* result */ Double, Unit], 
          Unit
        ]) | Null
      ] = js.undefined
    
    var properties: js.UndefOr[js.Array[Property] | Null] = js.undefined
    
    var secure: js.UndefOr[js.Array[Property] | Null] = js.undefined
    
    var uuid: String
    
    var value: js.UndefOr[Buffer | Null] = js.undefined
  }
  object CharacteristicOptions {
    
    inline def apply(uuid: String): CharacteristicOptions = {
      val __obj = js.Dynamic.literal(uuid = uuid.asInstanceOf[js.Any])
      __obj.asInstanceOf[CharacteristicOptions]
    }
    
    extension [Self <: CharacteristicOptions](x: Self) {
      
      inline def setDescriptors(value: js.Array[Descriptor]): Self = StObject.set(x, "descriptors", value.asInstanceOf[js.Any])
      
      inline def setDescriptorsNull: Self = StObject.set(x, "descriptors", null)
      
      inline def setDescriptorsUndefined: Self = StObject.set(x, "descriptors", js.undefined)
      
      inline def setDescriptorsVarargs(value: Descriptor*): Self = StObject.set(x, "descriptors", js.Array(value :_*))
      
      inline def setOnIndicate(value: () => Unit): Self = StObject.set(x, "onIndicate", js.Any.fromFunction0(value))
      
      inline def setOnIndicateNull: Self = StObject.set(x, "onIndicate", null)
      
      inline def setOnIndicateUndefined: Self = StObject.set(x, "onIndicate", js.undefined)
      
      inline def setOnNotify(value: () => Unit): Self = StObject.set(x, "onNotify", js.Any.fromFunction0(value))
      
      inline def setOnNotifyNull: Self = StObject.set(x, "onNotify", null)
      
      inline def setOnNotifyUndefined: Self = StObject.set(x, "onNotify", js.undefined)
      
      inline def setOnReadRequest(
        value: (/* offset */ Double, /* callback */ js.Function2[/* result */ Double, /* data */ js.UndefOr[Buffer], Unit]) => Unit
      ): Self = StObject.set(x, "onReadRequest", js.Any.fromFunction2(value))
      
      inline def setOnReadRequestNull: Self = StObject.set(x, "onReadRequest", null)
      
      inline def setOnReadRequestUndefined: Self = StObject.set(x, "onReadRequest", js.undefined)
      
      inline def setOnSubscribe(value: (/* maxValueSize */ Double, /* updateValueCallback */ js.Any) => Unit): Self = StObject.set(x, "onSubscribe", js.Any.fromFunction2(value))
      
      inline def setOnSubscribeNull: Self = StObject.set(x, "onSubscribe", null)
      
      inline def setOnSubscribeUndefined: Self = StObject.set(x, "onSubscribe", js.undefined)
      
      inline def setOnUnsubscribe(value: () => Unit): Self = StObject.set(x, "onUnsubscribe", js.Any.fromFunction0(value))
      
      inline def setOnUnsubscribeNull: Self = StObject.set(x, "onUnsubscribe", null)
      
      inline def setOnUnsubscribeUndefined: Self = StObject.set(x, "onUnsubscribe", js.undefined)
      
      inline def setOnWriteRequest(
        value: (/* data */ Buffer, /* offset */ Double, /* withoutResponse */ Boolean, /* callback */ js.Function1[/* result */ Double, Unit]) => Unit
      ): Self = StObject.set(x, "onWriteRequest", js.Any.fromFunction4(value))
      
      inline def setOnWriteRequestNull: Self = StObject.set(x, "onWriteRequest", null)
      
      inline def setOnWriteRequestUndefined: Self = StObject.set(x, "onWriteRequest", js.undefined)
      
      inline def setProperties(value: js.Array[Property]): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
      
      inline def setPropertiesNull: Self = StObject.set(x, "properties", null)
      
      inline def setPropertiesUndefined: Self = StObject.set(x, "properties", js.undefined)
      
      inline def setPropertiesVarargs(value: Property*): Self = StObject.set(x, "properties", js.Array(value :_*))
      
      inline def setSecure(value: js.Array[Property]): Self = StObject.set(x, "secure", value.asInstanceOf[js.Any])
      
      inline def setSecureNull: Self = StObject.set(x, "secure", null)
      
      inline def setSecureUndefined: Self = StObject.set(x, "secure", js.undefined)
      
      inline def setSecureVarargs(value: Property*): Self = StObject.set(x, "secure", js.Array(value :_*))
      
      inline def setUuid(value: String): Self = StObject.set(x, "uuid", value.asInstanceOf[js.Any])
      
      inline def setValue(value: Buffer): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueNull: Self = StObject.set(x, "value", null)
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  trait Descriptor extends StObject {
    
    var uuid: String
    
    var value: Buffer
  }
  object Descriptor {
    
    inline def apply(uuid: String, value: Buffer): Descriptor = {
      val __obj = js.Dynamic.literal(uuid = uuid.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[Descriptor]
    }
    
    extension [Self <: Descriptor](x: Self) {
      
      inline def setUuid(value: String): Self = StObject.set(x, "uuid", value.asInstanceOf[js.Any])
      
      inline def setValue(value: Buffer): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  trait DescriptorOptions extends StObject {
    
    var uuid: String
    
    var value: js.UndefOr[Buffer | String | Null] = js.undefined
  }
  object DescriptorOptions {
    
    inline def apply(uuid: String): DescriptorOptions = {
      val __obj = js.Dynamic.literal(uuid = uuid.asInstanceOf[js.Any])
      __obj.asInstanceOf[DescriptorOptions]
    }
    
    extension [Self <: DescriptorOptions](x: Self) {
      
      inline def setUuid(value: String): Self = StObject.set(x, "uuid", value.asInstanceOf[js.Any])
      
      inline def setValue(value: Buffer | String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueNull: Self = StObject.set(x, "value", null)
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  trait PrimaryService extends StObject {
    
    var characteristics: js.Array[Characteristic]
    
    var uuid: String
  }
  object PrimaryService {
    
    inline def apply(characteristics: js.Array[Characteristic], uuid: String): PrimaryService = {
      val __obj = js.Dynamic.literal(characteristics = characteristics.asInstanceOf[js.Any], uuid = uuid.asInstanceOf[js.Any])
      __obj.asInstanceOf[PrimaryService]
    }
    
    extension [Self <: PrimaryService](x: Self) {
      
      inline def setCharacteristics(value: js.Array[Characteristic]): Self = StObject.set(x, "characteristics", value.asInstanceOf[js.Any])
      
      inline def setCharacteristicsVarargs(value: Characteristic*): Self = StObject.set(x, "characteristics", js.Array(value :_*))
      
      inline def setUuid(value: String): Self = StObject.set(x, "uuid", value.asInstanceOf[js.Any])
    }
  }
  
  trait PrimaryServiceOptions extends StObject {
    
    var characteristics: js.UndefOr[js.Array[Characteristic] | Null] = js.undefined
    
    var uuid: String
  }
  object PrimaryServiceOptions {
    
    inline def apply(uuid: String): PrimaryServiceOptions = {
      val __obj = js.Dynamic.literal(uuid = uuid.asInstanceOf[js.Any])
      __obj.asInstanceOf[PrimaryServiceOptions]
    }
    
    extension [Self <: PrimaryServiceOptions](x: Self) {
      
      inline def setCharacteristics(value: js.Array[Characteristic]): Self = StObject.set(x, "characteristics", value.asInstanceOf[js.Any])
      
      inline def setCharacteristicsNull: Self = StObject.set(x, "characteristics", null)
      
      inline def setCharacteristicsUndefined: Self = StObject.set(x, "characteristics", js.undefined)
      
      inline def setCharacteristicsVarargs(value: Characteristic*): Self = StObject.set(x, "characteristics", js.Array(value :_*))
      
      inline def setUuid(value: String): Self = StObject.set(x, "uuid", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.bleno.blenoStrings.read
    - typings.bleno.blenoStrings.write
    - typings.bleno.blenoStrings.indicate
    - typings.bleno.blenoStrings.notify
    - typings.bleno.blenoStrings.writeWithoutResponse
  */
  trait Property extends StObject
  object Property {
    
    inline def indicate: typings.bleno.blenoStrings.indicate = "indicate".asInstanceOf[typings.bleno.blenoStrings.indicate]
    
    inline def read: typings.bleno.blenoStrings.read = "read".asInstanceOf[typings.bleno.blenoStrings.read]
    
    inline def write: typings.bleno.blenoStrings.write = "write".asInstanceOf[typings.bleno.blenoStrings.write]
    
    inline def writeWithoutResponse: typings.bleno.blenoStrings.writeWithoutResponse = "writeWithoutResponse".asInstanceOf[typings.bleno.blenoStrings.writeWithoutResponse]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.bleno.blenoStrings.poweredOn
    - typings.bleno.blenoStrings.poweredOff
    - typings.bleno.blenoStrings.unauthorized
    - typings.bleno.blenoStrings.unsupported
    - typings.bleno.blenoStrings.unknown
    - typings.bleno.blenoStrings.resetting
  */
  trait State extends StObject
  object State {
    
    inline def poweredOff: typings.bleno.blenoStrings.poweredOff = "poweredOff".asInstanceOf[typings.bleno.blenoStrings.poweredOff]
    
    inline def poweredOn: typings.bleno.blenoStrings.poweredOn = "poweredOn".asInstanceOf[typings.bleno.blenoStrings.poweredOn]
    
    inline def resetting: typings.bleno.blenoStrings.resetting = "resetting".asInstanceOf[typings.bleno.blenoStrings.resetting]
    
    inline def unauthorized: typings.bleno.blenoStrings.unauthorized = "unauthorized".asInstanceOf[typings.bleno.blenoStrings.unauthorized]
    
    inline def unknown: typings.bleno.blenoStrings.unknown = "unknown".asInstanceOf[typings.bleno.blenoStrings.unknown]
    
    inline def unsupported: typings.bleno.blenoStrings.unsupported = "unsupported".asInstanceOf[typings.bleno.blenoStrings.unsupported]
  }
  
  type _To = Bleno
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: Bleno = ^
}
