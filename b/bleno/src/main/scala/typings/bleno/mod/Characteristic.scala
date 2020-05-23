package typings.bleno.mod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Characteristic extends js.Object {
  val RESULT_ATTR_NOT_LONG: Double
  val RESULT_INVALID_ATTRIBUTE_LENGTH: Double
  val RESULT_INVALID_OFFSET: Double
  val RESULT_SUCCESS: Double
  val RESULT_UNLIKELY_ERROR: Double
  var descriptors: js.Array[Descriptor]
  var properties: js.Array[Property]
  var secure: js.Array[Property]
  var uuid: String
  var value: Buffer | Null
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
    uuid: String,
    value: Buffer = null
  ): Characteristic = {
    val __obj = js.Dynamic.literal(RESULT_ATTR_NOT_LONG = RESULT_ATTR_NOT_LONG.asInstanceOf[js.Any], RESULT_INVALID_ATTRIBUTE_LENGTH = RESULT_INVALID_ATTRIBUTE_LENGTH.asInstanceOf[js.Any], RESULT_INVALID_OFFSET = RESULT_INVALID_OFFSET.asInstanceOf[js.Any], RESULT_SUCCESS = RESULT_SUCCESS.asInstanceOf[js.Any], RESULT_UNLIKELY_ERROR = RESULT_UNLIKELY_ERROR.asInstanceOf[js.Any], descriptors = descriptors.asInstanceOf[js.Any], onIndicate = js.Any.fromFunction0(onIndicate), onNotify = js.Any.fromFunction0(onNotify), onReadRequest = js.Any.fromFunction2(onReadRequest), onSubscribe = js.Any.fromFunction2(onSubscribe), onUnsubscribe = js.Any.fromFunction0(onUnsubscribe), onWriteRequest = js.Any.fromFunction4(onWriteRequest), properties = properties.asInstanceOf[js.Any], secure = secure.asInstanceOf[js.Any], uuid = uuid.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Characteristic]
  }
}

