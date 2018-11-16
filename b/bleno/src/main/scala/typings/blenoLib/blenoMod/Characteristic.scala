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

