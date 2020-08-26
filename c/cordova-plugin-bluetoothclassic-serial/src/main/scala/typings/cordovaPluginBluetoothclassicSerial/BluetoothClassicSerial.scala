package typings.cordovaPluginBluetoothclassicSerial

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BluetoothClassicSerial extends js.Object {
  def available(interfaceId: String): Unit = js.native
  def available(
    interfaceId: String,
    success_cb: js.UndefOr[scala.Nothing],
    fail_cb: js.Function1[/* error */ js.Any, _]
  ): Unit = js.native
  def available(interfaceId: String, success_cb: js.Function1[/* results */ js.Any, _]): Unit = js.native
  def available(
    interfaceId: String,
    success_cb: js.Function1[/* results */ js.Any, _],
    fail_cb: js.Function1[/* error */ js.Any, _]
  ): Unit = js.native
  def clear(interfaceId: String): Unit = js.native
  def clear(
    interfaceId: String,
    success_cb: js.UndefOr[scala.Nothing],
    fail_cb: js.Function1[/* error */ js.Any, _]
  ): Unit = js.native
  def clear(interfaceId: String, success_cb: js.Function1[/* results */ js.Any, _]): Unit = js.native
  def clear(
    interfaceId: String,
    success_cb: js.Function1[/* results */ js.Any, _],
    fail_cb: js.Function1[/* error */ js.Any, _]
  ): Unit = js.native
  def connect(deviceId: String, interfaceArray: js.Array[_]): Unit = js.native
  def connect(
    deviceId: String,
    interfaceArray: js.Array[_],
    success_cb: js.UndefOr[scala.Nothing],
    fail_cb: js.Function1[/* error */ js.Any, _]
  ): Unit = js.native
  def connect(deviceId: String, interfaceArray: js.Array[_], success_cb: js.Function1[/* results */ js.Any, _]): Unit = js.native
  def connect(
    deviceId: String,
    interfaceArray: js.Array[_],
    success_cb: js.Function1[/* results */ js.Any, _],
    fail_cb: js.Function1[/* error */ js.Any, _]
  ): Unit = js.native
  def connectInsecure(deviceId: String, interfaceArray: js.Array[_]): Unit = js.native
  def connectInsecure(
    deviceId: String,
    interfaceArray: js.Array[_],
    success_cb: js.UndefOr[scala.Nothing],
    fail_cb: js.Function1[/* error */ js.Any, _]
  ): Unit = js.native
  def connectInsecure(deviceId: String, interfaceArray: js.Array[_], success_cb: js.Function1[/* results */ js.Any, _]): Unit = js.native
  def connectInsecure(
    deviceId: String,
    interfaceArray: js.Array[_],
    success_cb: js.Function1[/* results */ js.Any, _],
    fail_cb: js.Function1[/* error */ js.Any, _]
  ): Unit = js.native
  def disconnect(): Unit = js.native
  def disconnect(success_cb: js.UndefOr[scala.Nothing], fail_cb: js.Function1[/* error */ js.Any, _]): Unit = js.native
  def disconnect(success_cb: js.Function1[/* results */ js.Any, _]): Unit = js.native
  def disconnect(success_cb: js.Function1[/* results */ js.Any, _], fail_cb: js.Function1[/* error */ js.Any, _]): Unit = js.native
  def discoverUnpaired(): Unit = js.native
  def discoverUnpaired(success_cb: js.UndefOr[scala.Nothing], fail_cb: js.Function1[/* error */ js.Any, _]): Unit = js.native
  def discoverUnpaired(success_cb: js.Function1[/* results */ js.Any, _]): Unit = js.native
  def discoverUnpaired(success_cb: js.Function1[/* results */ js.Any, _], fail_cb: js.Function1[/* error */ js.Any, _]): Unit = js.native
  def enable(): Unit = js.native
  def enable(success_cb: js.UndefOr[scala.Nothing], fail_cb: js.Function1[/* error */ js.Any, _]): Unit = js.native
  def enable(success_cb: js.Function1[/* results */ js.Any, _]): Unit = js.native
  def enable(success_cb: js.Function1[/* results */ js.Any, _], fail_cb: js.Function1[/* error */ js.Any, _]): Unit = js.native
  def isConnected(): Unit = js.native
  def isConnected(success_cb: js.UndefOr[scala.Nothing], fail_cb: js.Function1[/* error */ js.Any, _]): Unit = js.native
  def isConnected(success_cb: js.Function1[/* results */ js.Any, _]): Unit = js.native
  def isConnected(success_cb: js.Function1[/* results */ js.Any, _], fail_cb: js.Function1[/* error */ js.Any, _]): Unit = js.native
  def isEnabled(): Unit = js.native
  def isEnabled(success_cb: js.UndefOr[scala.Nothing], fail_cb: js.Function1[/* error */ js.Any, _]): Unit = js.native
  def isEnabled(success_cb: js.Function1[/* results */ js.Any, _]): Unit = js.native
  def isEnabled(success_cb: js.Function1[/* results */ js.Any, _], fail_cb: js.Function1[/* error */ js.Any, _]): Unit = js.native
  def list(): Unit = js.native
  def list(success_cb: js.UndefOr[scala.Nothing], fail_cb: js.Function1[/* error */ js.Any, _]): Unit = js.native
  def list(success_cb: js.Function1[/* results */ js.Any, _]): Unit = js.native
  def list(success_cb: js.Function1[/* results */ js.Any, _], fail_cb: js.Function1[/* error */ js.Any, _]): Unit = js.native
  def read(interfaceId: String): Unit = js.native
  def read(
    interfaceId: String,
    success_cb: js.UndefOr[scala.Nothing],
    fail_cb: js.Function1[/* error */ js.Any, _]
  ): Unit = js.native
  def read(interfaceId: String, success_cb: js.Function1[/* results */ js.Any, _]): Unit = js.native
  def read(
    interfaceId: String,
    success_cb: js.Function1[/* results */ js.Any, _],
    fail_cb: js.Function1[/* error */ js.Any, _]
  ): Unit = js.native
  def readUntil(interfaceId: String, delimiter: String): Unit = js.native
  def readUntil(
    interfaceId: String,
    delimiter: String,
    success_cb: js.UndefOr[scala.Nothing],
    fail_cb: js.Function1[/* error */ js.Any, _]
  ): Unit = js.native
  def readUntil(interfaceId: String, delimiter: String, success_cb: js.Function1[/* results */ js.Any, _]): Unit = js.native
  def readUntil(
    interfaceId: String,
    delimiter: String,
    success_cb: js.Function1[/* results */ js.Any, _],
    fail_cb: js.Function1[/* error */ js.Any, _]
  ): Unit = js.native
  def register(): Unit = js.native
  def register(data_cb: js.Function0[_]): Unit = js.native
  def showBluetoothSettings(): Unit = js.native
  def showBluetoothSettings(success_cb: js.UndefOr[scala.Nothing], fail_cb: js.Function1[/* error */ js.Any, _]): Unit = js.native
  def showBluetoothSettings(success_cb: js.Function1[/* results */ js.Any, _]): Unit = js.native
  def showBluetoothSettings(success_cb: js.Function1[/* results */ js.Any, _], fail_cb: js.Function1[/* error */ js.Any, _]): Unit = js.native
  def subscribe(interfaceId: String, delimiter: String): Unit = js.native
  def subscribe(
    interfaceId: String,
    delimiter: String,
    success_cb: js.UndefOr[scala.Nothing],
    fail_cb: js.Function1[/* error */ js.Any, _]
  ): Unit = js.native
  def subscribe(interfaceId: String, delimiter: String, success_cb: js.Function1[/* results */ js.Any, _]): Unit = js.native
  def subscribe(
    interfaceId: String,
    delimiter: String,
    success_cb: js.Function1[/* results */ js.Any, _],
    fail_cb: js.Function1[/* error */ js.Any, _]
  ): Unit = js.native
  def subscribeRawData(interfaceId: String): Unit = js.native
  def subscribeRawData(
    interfaceId: String,
    success_cb: js.UndefOr[scala.Nothing],
    fail_cb: js.Function1[/* error */ js.Any, _]
  ): Unit = js.native
  def subscribeRawData(interfaceId: String, success_cb: js.Function1[/* results */ js.Any, _]): Unit = js.native
  def subscribeRawData(
    interfaceId: String,
    success_cb: js.Function1[/* results */ js.Any, _],
    fail_cb: js.Function1[/* error */ js.Any, _]
  ): Unit = js.native
  def unsubscribe(interfaceId: String): Unit = js.native
  def unsubscribe(
    interfaceId: String,
    success_cb: js.UndefOr[scala.Nothing],
    fail_cb: js.Function1[/* error */ js.Any, _]
  ): Unit = js.native
  def unsubscribe(interfaceId: String, success_cb: js.Function1[/* results */ js.Any, _]): Unit = js.native
  def unsubscribe(
    interfaceId: String,
    success_cb: js.Function1[/* results */ js.Any, _],
    fail_cb: js.Function1[/* error */ js.Any, _]
  ): Unit = js.native
  def unsubscribeRawData(interfaceId: String): Unit = js.native
  def unsubscribeRawData(
    interfaceId: String,
    success_cb: js.UndefOr[scala.Nothing],
    fail_cb: js.Function1[/* error */ js.Any, _]
  ): Unit = js.native
  def unsubscribeRawData(interfaceId: String, success_cb: js.Function1[/* results */ js.Any, _]): Unit = js.native
  def unsubscribeRawData(
    interfaceId: String,
    success_cb: js.Function1[/* results */ js.Any, _],
    fail_cb: js.Function1[/* error */ js.Any, _]
  ): Unit = js.native
  def write(interfaceId: String, data: String): Unit = js.native
  def write(
    interfaceId: String,
    data: String,
    success_cb: js.UndefOr[scala.Nothing],
    fail_cb: js.Function1[/* error */ js.Any, _]
  ): Unit = js.native
  def write(interfaceId: String, data: String, success_cb: js.Function1[/* results */ js.Any, _]): Unit = js.native
  def write(
    interfaceId: String,
    data: String,
    success_cb: js.Function1[/* results */ js.Any, _],
    fail_cb: js.Function1[/* error */ js.Any, _]
  ): Unit = js.native
}

