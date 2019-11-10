package typings.cassandraDashDriver.cassandraDashDriverMod.types

import typings.cassandraDashDriver.cassandraDashDriverMod.ValueCallback
import typings.node.Buffer
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cassandra-driver", "types.TimeUuid")
@js.native
class TimeUuid ()
  extends typings.cassandraDashDriver.libTypesMod.types.TimeUuid

/* static members */
@JSImport("cassandra-driver", "types.TimeUuid")
@js.native
object TimeUuid extends js.Object {
  def fromDate(date: Date): typings.cassandraDashDriver.libTypesMod.types.TimeUuid = js.native
  def fromDate(date: Date, ticks: Double): typings.cassandraDashDriver.libTypesMod.types.TimeUuid = js.native
  def fromDate(date: Date, ticks: Double, nodeId: String): typings.cassandraDashDriver.libTypesMod.types.TimeUuid = js.native
  def fromDate(date: Date, ticks: Double, nodeId: String, clockId: String): typings.cassandraDashDriver.libTypesMod.types.TimeUuid = js.native
  def fromDate(
    date: Date,
    ticks: Double,
    nodeId: String,
    clockId: String,
    callback: ValueCallback[typings.cassandraDashDriver.libTypesMod.types.TimeUuid]
  ): Unit = js.native
  def fromDate(date: Date, ticks: Double, nodeId: String, clockId: Buffer): typings.cassandraDashDriver.libTypesMod.types.TimeUuid = js.native
  def fromDate(
    date: Date,
    ticks: Double,
    nodeId: String,
    clockId: Buffer,
    callback: ValueCallback[typings.cassandraDashDriver.libTypesMod.types.TimeUuid]
  ): Unit = js.native
  def fromDate(date: Date, ticks: Double, nodeId: Buffer): typings.cassandraDashDriver.libTypesMod.types.TimeUuid = js.native
  def fromDate(date: Date, ticks: Double, nodeId: Buffer, clockId: String): typings.cassandraDashDriver.libTypesMod.types.TimeUuid = js.native
  def fromDate(
    date: Date,
    ticks: Double,
    nodeId: Buffer,
    clockId: String,
    callback: ValueCallback[typings.cassandraDashDriver.libTypesMod.types.TimeUuid]
  ): Unit = js.native
  def fromDate(date: Date, ticks: Double, nodeId: Buffer, clockId: Buffer): typings.cassandraDashDriver.libTypesMod.types.TimeUuid = js.native
  def fromDate(
    date: Date,
    ticks: Double,
    nodeId: Buffer,
    clockId: Buffer,
    callback: ValueCallback[typings.cassandraDashDriver.libTypesMod.types.TimeUuid]
  ): Unit = js.native
  def fromString(value: String): typings.cassandraDashDriver.libTypesMod.types.TimeUuid = js.native
  def max(date: Date, ticks: Double): typings.cassandraDashDriver.libTypesMod.types.TimeUuid = js.native
  def min(date: Date, ticks: Double): typings.cassandraDashDriver.libTypesMod.types.TimeUuid = js.native
  def now(): typings.cassandraDashDriver.libTypesMod.types.TimeUuid = js.native
  def now(callback: ValueCallback[typings.cassandraDashDriver.libTypesMod.types.TimeUuid]): Unit = js.native
  def now(nodeId: String): typings.cassandraDashDriver.libTypesMod.types.TimeUuid = js.native
  def now(nodeId: String, clockId: String): typings.cassandraDashDriver.libTypesMod.types.TimeUuid = js.native
  def now(
    nodeId: String,
    clockId: String,
    callback: ValueCallback[typings.cassandraDashDriver.libTypesMod.types.TimeUuid]
  ): Unit = js.native
  def now(nodeId: String, clockId: Buffer): typings.cassandraDashDriver.libTypesMod.types.TimeUuid = js.native
  def now(
    nodeId: String,
    clockId: Buffer,
    callback: ValueCallback[typings.cassandraDashDriver.libTypesMod.types.TimeUuid]
  ): Unit = js.native
  def now(nodeId: Buffer): typings.cassandraDashDriver.libTypesMod.types.TimeUuid = js.native
  def now(nodeId: Buffer, clockId: String): typings.cassandraDashDriver.libTypesMod.types.TimeUuid = js.native
  def now(
    nodeId: Buffer,
    clockId: String,
    callback: ValueCallback[typings.cassandraDashDriver.libTypesMod.types.TimeUuid]
  ): Unit = js.native
  def now(nodeId: Buffer, clockId: Buffer): typings.cassandraDashDriver.libTypesMod.types.TimeUuid = js.native
  def now(
    nodeId: Buffer,
    clockId: Buffer,
    callback: ValueCallback[typings.cassandraDashDriver.libTypesMod.types.TimeUuid]
  ): Unit = js.native
}

