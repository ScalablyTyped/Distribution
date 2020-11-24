package typings.bleno.mod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Characteristic extends js.Object {
  
  val RESULT_ATTR_NOT_LONG: Double = js.native
  
  val RESULT_INVALID_ATTRIBUTE_LENGTH: Double = js.native
  
  val RESULT_INVALID_OFFSET: Double = js.native
  
  val RESULT_SUCCESS: Double = js.native
  
  val RESULT_UNLIKELY_ERROR: Double = js.native
  
  var descriptors: js.Array[Descriptor] = js.native
  
  def onIndicate(): Unit = js.native
  
  def onNotify(): Unit = js.native
  
  def onReadRequest(offset: Double, callback: js.Function2[/* result */ Double, /* data */ js.UndefOr[Buffer], Unit]): Unit = js.native
  
  def onSubscribe(maxValueSize: Double, updateValueCallback: js.Any): Unit = js.native
  
  def onUnsubscribe(): Unit = js.native
  
  def onWriteRequest(
    data: Buffer,
    offset: Double,
    withoutResponse: Boolean,
    callback: js.Function1[/* result */ Double, Unit]
  ): Unit = js.native
  
  var properties: js.Array[Property] = js.native
  
  var secure: js.Array[Property] = js.native
  
  var uuid: String = js.native
  
  var value: Buffer | Null = js.native
}
object Characteristic {
  
  @scala.inline
  def apply(
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
    val __obj = js.Dynamic.literal(RESULT_ATTR_NOT_LONG = RESULT_ATTR_NOT_LONG.asInstanceOf[js.Any], RESULT_INVALID_ATTRIBUTE_LENGTH = RESULT_INVALID_ATTRIBUTE_LENGTH.asInstanceOf[js.Any], RESULT_INVALID_OFFSET = RESULT_INVALID_OFFSET.asInstanceOf[js.Any], RESULT_SUCCESS = RESULT_SUCCESS.asInstanceOf[js.Any], RESULT_UNLIKELY_ERROR = RESULT_UNLIKELY_ERROR.asInstanceOf[js.Any], descriptors = descriptors.asInstanceOf[js.Any], onIndicate = js.Any.fromFunction0(onIndicate), onNotify = js.Any.fromFunction0(onNotify), onReadRequest = js.Any.fromFunction2(onReadRequest), onSubscribe = js.Any.fromFunction2(onSubscribe), onUnsubscribe = js.Any.fromFunction0(onUnsubscribe), onWriteRequest = js.Any.fromFunction4(onWriteRequest), properties = properties.asInstanceOf[js.Any], secure = secure.asInstanceOf[js.Any], uuid = uuid.asInstanceOf[js.Any])
    __obj.asInstanceOf[Characteristic]
  }
  
  @scala.inline
  implicit class CharacteristicOps[Self <: Characteristic] (val x: Self) extends AnyVal {
    
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
    def setRESULT_ATTR_NOT_LONG(value: Double): Self = this.set("RESULT_ATTR_NOT_LONG", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRESULT_INVALID_ATTRIBUTE_LENGTH(value: Double): Self = this.set("RESULT_INVALID_ATTRIBUTE_LENGTH", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRESULT_INVALID_OFFSET(value: Double): Self = this.set("RESULT_INVALID_OFFSET", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRESULT_SUCCESS(value: Double): Self = this.set("RESULT_SUCCESS", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRESULT_UNLIKELY_ERROR(value: Double): Self = this.set("RESULT_UNLIKELY_ERROR", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptorsVarargs(value: Descriptor*): Self = this.set("descriptors", js.Array(value :_*))
    
    @scala.inline
    def setDescriptors(value: js.Array[Descriptor]): Self = this.set("descriptors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnIndicate(value: () => Unit): Self = this.set("onIndicate", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnNotify(value: () => Unit): Self = this.set("onNotify", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnReadRequest(value: (Double, js.Function2[/* result */ Double, /* data */ js.UndefOr[Buffer], Unit]) => Unit): Self = this.set("onReadRequest", js.Any.fromFunction2(value))
    
    @scala.inline
    def setOnSubscribe(value: (Double, js.Any) => Unit): Self = this.set("onSubscribe", js.Any.fromFunction2(value))
    
    @scala.inline
    def setOnUnsubscribe(value: () => Unit): Self = this.set("onUnsubscribe", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnWriteRequest(value: (Buffer, Double, Boolean, js.Function1[/* result */ Double, Unit]) => Unit): Self = this.set("onWriteRequest", js.Any.fromFunction4(value))
    
    @scala.inline
    def setPropertiesVarargs(value: Property*): Self = this.set("properties", js.Array(value :_*))
    
    @scala.inline
    def setProperties(value: js.Array[Property]): Self = this.set("properties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecureVarargs(value: Property*): Self = this.set("secure", js.Array(value :_*))
    
    @scala.inline
    def setSecure(value: js.Array[Property]): Self = this.set("secure", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUuid(value: String): Self = this.set("uuid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: Buffer): Self = this.set("value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueNull: Self = this.set("value", null)
  }
}
