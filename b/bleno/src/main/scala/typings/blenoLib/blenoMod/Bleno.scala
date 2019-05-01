package typings
package blenoLib.blenoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Bleno
  extends nodeLib.NodeJSNs.EventEmitter {
  val Characteristic: blenoLib.Anon_Options = js.native
  val Descriptor: org.scalablytyped.runtime.Instantiable1[/* options */ DescriptorOptions, Descriptor] = js.native
  val PrimaryService: org.scalablytyped.runtime.Instantiable1[/* options */ PrimaryServiceOptions, PrimaryService] = js.native
  val address: java.lang.String = js.native
  val mtu: scala.Double = js.native
  val platform: java.lang.String = js.native
  val rssi: scala.Double = js.native
  val state: State = js.native
  def disconnect(): scala.Unit = js.native
  @JSName("on")
  def on_accept(
    event: blenoLib.blenoLibStrings.accept,
    cb: js.Function1[/* address */ java.lang.String, scala.Unit]
  ): this.type = js.native
  @JSName("on")
  def on_advertisingStart(
    event: blenoLib.blenoLibStrings.advertisingStart,
    cb: js.Function1[/* err */ js.UndefOr[stdLib.Error | scala.Null], scala.Unit]
  ): this.type = js.native
  @JSName("on")
  def on_advertisingStartError(
    event: blenoLib.blenoLibStrings.advertisingStartError,
    cb: js.Function1[/* err */ stdLib.Error, scala.Unit]
  ): this.type = js.native
  @JSName("on")
  def on_advertisingStop(event: blenoLib.blenoLibStrings.advertisingStop, cb: js.Function0[scala.Unit]): this.type = js.native
  @JSName("on")
  def on_disconnect(
    event: blenoLib.blenoLibStrings.disconnect,
    cb: js.Function1[/* clientAddress */ java.lang.String, scala.Unit]
  ): this.type = js.native
  @JSName("on")
  def on_mtuChange(event: blenoLib.blenoLibStrings.mtuChange, cb: js.Function1[/* mtu */ scala.Double, scala.Unit]): this.type = js.native
  @JSName("on")
  def on_rssiUpdate(event: blenoLib.blenoLibStrings.rssiUpdate, cb: js.Function1[/* rssi */ scala.Double, scala.Unit]): this.type = js.native
  @JSName("on")
  def on_servicesSet(
    event: blenoLib.blenoLibStrings.servicesSet,
    cb: js.Function1[/* err */ js.UndefOr[stdLib.Error | scala.Null], scala.Unit]
  ): this.type = js.native
  @JSName("on")
  def on_servicesSetError(
    event: blenoLib.blenoLibStrings.servicesSetError,
    cb: js.Function1[/* err */ stdLib.Error, scala.Unit]
  ): this.type = js.native
  @JSName("on")
  def on_stateChange(event: blenoLib.blenoLibStrings.stateChange, cb: js.Function1[/* state */ State, scala.Unit]): this.type = js.native
  def setServices(services: js.Array[PrimaryService]): scala.Unit = js.native
  def setServices(
    services: js.Array[PrimaryService],
    callback: js.Function1[/* arg */ js.UndefOr[stdLib.Error | scala.Null], scala.Unit]
  ): scala.Unit = js.native
  def startAdvertising(name: java.lang.String): scala.Unit = js.native
  def startAdvertising(name: java.lang.String, serviceUuids: js.Array[java.lang.String]): scala.Unit = js.native
  def startAdvertising(
    name: java.lang.String,
    serviceUuids: js.Array[java.lang.String],
    callback: js.Function1[/* arg */ js.UndefOr[stdLib.Error | scala.Null], scala.Unit]
  ): scala.Unit = js.native
  def startAdvertisingIBeacon(uuid: java.lang.String, major: scala.Double, minor: scala.Double, measuredPower: scala.Double): scala.Unit = js.native
  def startAdvertisingIBeacon(
    uuid: java.lang.String,
    major: scala.Double,
    minor: scala.Double,
    measuredPower: scala.Double,
    callback: js.Function1[/* arg */ js.UndefOr[stdLib.Error | scala.Null], scala.Unit]
  ): scala.Unit = js.native
  def startAdvertisingWithEIRData(advertisementData: nodeLib.Buffer): scala.Unit = js.native
  def startAdvertisingWithEIRData(
    advertisementData: nodeLib.Buffer,
    callback: js.Function1[/* arg */ js.UndefOr[stdLib.Error | scala.Null], scala.Unit]
  ): scala.Unit = js.native
  def startAdvertisingWithEIRData(advertisementData: nodeLib.Buffer, scanData: nodeLib.Buffer): scala.Unit = js.native
  def startAdvertisingWithEIRData(
    advertisementData: nodeLib.Buffer,
    scanData: nodeLib.Buffer,
    callback: js.Function1[/* arg */ js.UndefOr[stdLib.Error | scala.Null], scala.Unit]
  ): scala.Unit = js.native
  def stopAdvertising(): scala.Unit = js.native
  def stopAdvertising(callback: js.Function0[scala.Unit]): scala.Unit = js.native
  def updateRssi(): scala.Unit = js.native
  def updateRssi(callback: js.Function2[/* err */ scala.Null, /* rssi */ scala.Double, scala.Unit]): scala.Unit = js.native
}

