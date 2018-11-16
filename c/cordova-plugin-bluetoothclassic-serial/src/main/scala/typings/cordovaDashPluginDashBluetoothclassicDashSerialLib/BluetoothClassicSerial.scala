package typings
package cordovaDashPluginDashBluetoothclassicDashSerialLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BluetoothClassicSerial extends js.Object {
  def available(interfaceId: java.lang.String): scala.Unit = js.native
  def available(interfaceId: java.lang.String, success_cb: js.Function1[/* results */ js.Any, _]): scala.Unit = js.native
  def available(
    interfaceId: java.lang.String,
    success_cb: js.Function1[/* results */ js.Any, _],
    fail_cb: js.Function1[/* error */ js.Any, _]
  ): scala.Unit = js.native
  def clear(interfaceId: java.lang.String): scala.Unit = js.native
  def clear(interfaceId: java.lang.String, success_cb: js.Function1[/* results */ js.Any, _]): scala.Unit = js.native
  def clear(
    interfaceId: java.lang.String,
    success_cb: js.Function1[/* results */ js.Any, _],
    fail_cb: js.Function1[/* error */ js.Any, _]
  ): scala.Unit = js.native
  def connect(deviceId: java.lang.String, interfaceArray: js.Array[_]): scala.Unit = js.native
  def connect(
    deviceId: java.lang.String,
    interfaceArray: js.Array[_],
    success_cb: js.Function1[/* results */ js.Any, _]
  ): scala.Unit = js.native
  def connect(
    deviceId: java.lang.String,
    interfaceArray: js.Array[_],
    success_cb: js.Function1[/* results */ js.Any, _],
    fail_cb: js.Function1[/* error */ js.Any, _]
  ): scala.Unit = js.native
  def connectInsecure(deviceId: java.lang.String, interfaceArray: js.Array[_]): scala.Unit = js.native
  def connectInsecure(
    deviceId: java.lang.String,
    interfaceArray: js.Array[_],
    success_cb: js.Function1[/* results */ js.Any, _]
  ): scala.Unit = js.native
  def connectInsecure(
    deviceId: java.lang.String,
    interfaceArray: js.Array[_],
    success_cb: js.Function1[/* results */ js.Any, _],
    fail_cb: js.Function1[/* error */ js.Any, _]
  ): scala.Unit = js.native
  def disconnect(): scala.Unit = js.native
  def disconnect(success_cb: js.Function1[/* results */ js.Any, _]): scala.Unit = js.native
  def disconnect(success_cb: js.Function1[/* results */ js.Any, _], fail_cb: js.Function1[/* error */ js.Any, _]): scala.Unit = js.native
  def discoverUnpaired(): scala.Unit = js.native
  def discoverUnpaired(success_cb: js.Function1[/* results */ js.Any, _]): scala.Unit = js.native
  def discoverUnpaired(success_cb: js.Function1[/* results */ js.Any, _], fail_cb: js.Function1[/* error */ js.Any, _]): scala.Unit = js.native
  def enable(): scala.Unit = js.native
  def enable(success_cb: js.Function1[/* results */ js.Any, _]): scala.Unit = js.native
  def enable(success_cb: js.Function1[/* results */ js.Any, _], fail_cb: js.Function1[/* error */ js.Any, _]): scala.Unit = js.native
  def isConnected(): scala.Unit = js.native
  def isConnected(success_cb: js.Function1[/* results */ js.Any, _]): scala.Unit = js.native
  def isConnected(success_cb: js.Function1[/* results */ js.Any, _], fail_cb: js.Function1[/* error */ js.Any, _]): scala.Unit = js.native
  def isEnabled(): scala.Unit = js.native
  def isEnabled(success_cb: js.Function1[/* results */ js.Any, _]): scala.Unit = js.native
  def isEnabled(success_cb: js.Function1[/* results */ js.Any, _], fail_cb: js.Function1[/* error */ js.Any, _]): scala.Unit = js.native
  def list(): scala.Unit = js.native
  def list(success_cb: js.Function1[/* results */ js.Any, _]): scala.Unit = js.native
  def list(success_cb: js.Function1[/* results */ js.Any, _], fail_cb: js.Function1[/* error */ js.Any, _]): scala.Unit = js.native
  def read(interfaceId: java.lang.String): scala.Unit = js.native
  def read(interfaceId: java.lang.String, success_cb: js.Function1[/* results */ js.Any, _]): scala.Unit = js.native
  def read(
    interfaceId: java.lang.String,
    success_cb: js.Function1[/* results */ js.Any, _],
    fail_cb: js.Function1[/* error */ js.Any, _]
  ): scala.Unit = js.native
  def readUntil(interfaceId: java.lang.String, delimiter: java.lang.String): scala.Unit = js.native
  def readUntil(
    interfaceId: java.lang.String,
    delimiter: java.lang.String,
    success_cb: js.Function1[/* results */ js.Any, _]
  ): scala.Unit = js.native
  def readUntil(
    interfaceId: java.lang.String,
    delimiter: java.lang.String,
    success_cb: js.Function1[/* results */ js.Any, _],
    fail_cb: js.Function1[/* error */ js.Any, _]
  ): scala.Unit = js.native
  def register(): scala.Unit = js.native
  def register(data_cb: js.Function0[_]): scala.Unit = js.native
  def showBluetoothSettings(): scala.Unit = js.native
  def showBluetoothSettings(success_cb: js.Function1[/* results */ js.Any, _]): scala.Unit = js.native
  def showBluetoothSettings(success_cb: js.Function1[/* results */ js.Any, _], fail_cb: js.Function1[/* error */ js.Any, _]): scala.Unit = js.native
  def subscribe(interfaceId: java.lang.String, delimiter: java.lang.String): scala.Unit = js.native
  def subscribe(
    interfaceId: java.lang.String,
    delimiter: java.lang.String,
    success_cb: js.Function1[/* results */ js.Any, _]
  ): scala.Unit = js.native
  def subscribe(
    interfaceId: java.lang.String,
    delimiter: java.lang.String,
    success_cb: js.Function1[/* results */ js.Any, _],
    fail_cb: js.Function1[/* error */ js.Any, _]
  ): scala.Unit = js.native
  def subscribeRawData(interfaceId: java.lang.String): scala.Unit = js.native
  def subscribeRawData(interfaceId: java.lang.String, success_cb: js.Function1[/* results */ js.Any, _]): scala.Unit = js.native
  def subscribeRawData(
    interfaceId: java.lang.String,
    success_cb: js.Function1[/* results */ js.Any, _],
    fail_cb: js.Function1[/* error */ js.Any, _]
  ): scala.Unit = js.native
  def unsubscribe(interfaceId: java.lang.String): scala.Unit = js.native
  def unsubscribe(interfaceId: java.lang.String, success_cb: js.Function1[/* results */ js.Any, _]): scala.Unit = js.native
  def unsubscribe(
    interfaceId: java.lang.String,
    success_cb: js.Function1[/* results */ js.Any, _],
    fail_cb: js.Function1[/* error */ js.Any, _]
  ): scala.Unit = js.native
  def unsubscribeRawData(interfaceId: java.lang.String): scala.Unit = js.native
  def unsubscribeRawData(interfaceId: java.lang.String, success_cb: js.Function1[/* results */ js.Any, _]): scala.Unit = js.native
  def unsubscribeRawData(
    interfaceId: java.lang.String,
    success_cb: js.Function1[/* results */ js.Any, _],
    fail_cb: js.Function1[/* error */ js.Any, _]
  ): scala.Unit = js.native
  def write(interfaceId: java.lang.String, data: java.lang.String): scala.Unit = js.native
  def write(
    interfaceId: java.lang.String,
    data: java.lang.String,
    success_cb: js.Function1[/* results */ js.Any, _]
  ): scala.Unit = js.native
  def write(
    interfaceId: java.lang.String,
    data: java.lang.String,
    success_cb: js.Function1[/* results */ js.Any, _],
    fail_cb: js.Function1[/* error */ js.Any, _]
  ): scala.Unit = js.native
}

