package typings
package blenoLib.blenoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Characteristic extends js.Object {
  val RESULT_ATTR_NOT_LONG: scala.Double
  val RESULT_INVALID_ATTRIBUTE_LENGTH: scala.Double
  val RESULT_INVALID_OFFSET: scala.Double
  val RESULT_SUCCESS: scala.Double
  val RESULT_UNLIKELY_ERROR: scala.Double
  var descriptors: js.Array[Descriptor]
  var properties: js.Array[blenoLib.Property]
  var secure: js.Array[blenoLib.Property]
  var uuid: java.lang.String
  var value: nodeLib.Buffer | scala.Null
  def onIndicate(): scala.Unit
  def onNotify(): scala.Unit
  def onReadRequest(
    offset: scala.Double,
    callback: js.Function2[/* result */ scala.Double, /* data */ js.UndefOr[nodeLib.Buffer], scala.Unit]
  ): scala.Unit
  def onSubscribe(maxValueSize: scala.Double, updateValueCallback: js.Any): scala.Unit
  def onUnsubscribe(): scala.Unit
  def onWriteRequest(
    data: nodeLib.Buffer,
    offset: scala.Double,
    withoutResponse: scala.Boolean,
    callback: js.Function1[/* result */ scala.Double, scala.Unit]
  ): scala.Unit
}

object Characteristic {
  @scala.inline
  def apply(
    RESULT_ATTR_NOT_LONG: scala.Double,
    RESULT_INVALID_ATTRIBUTE_LENGTH: scala.Double,
    RESULT_INVALID_OFFSET: scala.Double,
    RESULT_SUCCESS: scala.Double,
    RESULT_UNLIKELY_ERROR: scala.Double,
    descriptors: js.Array[Descriptor],
    onIndicate: () => scala.Unit,
    onNotify: () => scala.Unit,
    onReadRequest: (scala.Double, js.Function2[/* result */ scala.Double, /* data */ js.UndefOr[nodeLib.Buffer], scala.Unit]) => scala.Unit,
    onSubscribe: (scala.Double, js.Any) => scala.Unit,
    onUnsubscribe: () => scala.Unit,
    onWriteRequest: (nodeLib.Buffer, scala.Double, scala.Boolean, js.Function1[/* result */ scala.Double, scala.Unit]) => scala.Unit,
    properties: js.Array[blenoLib.Property],
    secure: js.Array[blenoLib.Property],
    toString: () => java.lang.String,
    uuid: java.lang.String,
    value: nodeLib.Buffer = null
  ): Characteristic = {
    val __obj = js.Dynamic.literal(RESULT_ATTR_NOT_LONG = RESULT_ATTR_NOT_LONG, RESULT_INVALID_ATTRIBUTE_LENGTH = RESULT_INVALID_ATTRIBUTE_LENGTH, RESULT_INVALID_OFFSET = RESULT_INVALID_OFFSET, RESULT_SUCCESS = RESULT_SUCCESS, RESULT_UNLIKELY_ERROR = RESULT_UNLIKELY_ERROR, descriptors = descriptors, onIndicate = js.Any.fromFunction0(onIndicate), onNotify = js.Any.fromFunction0(onNotify), onReadRequest = js.Any.fromFunction2(onReadRequest), onSubscribe = js.Any.fromFunction2(onSubscribe), onUnsubscribe = js.Any.fromFunction0(onUnsubscribe), onWriteRequest = js.Any.fromFunction4(onWriteRequest), properties = properties, secure = secure, toString = js.Any.fromFunction0(toString), uuid = uuid)
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[Characteristic]
  }
}

