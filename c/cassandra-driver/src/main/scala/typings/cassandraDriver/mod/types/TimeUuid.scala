package typings.cassandraDriver.mod.types

import typings.cassandraDriver.mod.ValueCallback
import typings.node.Buffer
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cassandra-driver", "types.TimeUuid")
@js.native
class TimeUuid ()
  extends typings.cassandraDriver.typesMod.types.TimeUuid

/* static members */
@JSImport("cassandra-driver", "types.TimeUuid")
@js.native
object TimeUuid extends js.Object {
  def fromDate(date: Date): typings.cassandraDriver.typesMod.types.TimeUuid = js.native
  def fromDate(date: Date, ticks: Double): typings.cassandraDriver.typesMod.types.TimeUuid = js.native
  def fromDate(date: Date, ticks: Double, nodeId: String): typings.cassandraDriver.typesMod.types.TimeUuid = js.native
  def fromDate(date: Date, ticks: Double, nodeId: String, clockId: String): typings.cassandraDriver.typesMod.types.TimeUuid = js.native
  def fromDate(
    date: Date,
    ticks: Double,
    nodeId: String,
    clockId: String,
    callback: ValueCallback[typings.cassandraDriver.typesMod.types.TimeUuid]
  ): Unit = js.native
  def fromDate(date: Date, ticks: Double, nodeId: String, clockId: Buffer): typings.cassandraDriver.typesMod.types.TimeUuid = js.native
  def fromDate(
    date: Date,
    ticks: Double,
    nodeId: String,
    clockId: Buffer,
    callback: ValueCallback[typings.cassandraDriver.typesMod.types.TimeUuid]
  ): Unit = js.native
  def fromDate(date: Date, ticks: Double, nodeId: Buffer): typings.cassandraDriver.typesMod.types.TimeUuid = js.native
  def fromDate(date: Date, ticks: Double, nodeId: Buffer, clockId: String): typings.cassandraDriver.typesMod.types.TimeUuid = js.native
  def fromDate(
    date: Date,
    ticks: Double,
    nodeId: Buffer,
    clockId: String,
    callback: ValueCallback[typings.cassandraDriver.typesMod.types.TimeUuid]
  ): Unit = js.native
  def fromDate(date: Date, ticks: Double, nodeId: Buffer, clockId: Buffer): typings.cassandraDriver.typesMod.types.TimeUuid = js.native
  def fromDate(
    date: Date,
    ticks: Double,
    nodeId: Buffer,
    clockId: Buffer,
    callback: ValueCallback[typings.cassandraDriver.typesMod.types.TimeUuid]
  ): Unit = js.native
  def fromString(value: String): typings.cassandraDriver.typesMod.types.TimeUuid = js.native
  def max(date: Date, ticks: Double): typings.cassandraDriver.typesMod.types.TimeUuid = js.native
  def min(date: Date, ticks: Double): typings.cassandraDriver.typesMod.types.TimeUuid = js.native
  def now(): typings.cassandraDriver.typesMod.types.TimeUuid = js.native
  def now(callback: ValueCallback[typings.cassandraDriver.typesMod.types.TimeUuid]): Unit = js.native
  def now(nodeId: String): typings.cassandraDriver.typesMod.types.TimeUuid = js.native
  def now(nodeId: String, clockId: String): typings.cassandraDriver.typesMod.types.TimeUuid = js.native
  def now(
    nodeId: String,
    clockId: String,
    callback: ValueCallback[typings.cassandraDriver.typesMod.types.TimeUuid]
  ): Unit = js.native
  def now(nodeId: String, clockId: Buffer): typings.cassandraDriver.typesMod.types.TimeUuid = js.native
  def now(
    nodeId: String,
    clockId: Buffer,
    callback: ValueCallback[typings.cassandraDriver.typesMod.types.TimeUuid]
  ): Unit = js.native
  def now(nodeId: Buffer): typings.cassandraDriver.typesMod.types.TimeUuid = js.native
  def now(nodeId: Buffer, clockId: String): typings.cassandraDriver.typesMod.types.TimeUuid = js.native
  def now(
    nodeId: Buffer,
    clockId: String,
    callback: ValueCallback[typings.cassandraDriver.typesMod.types.TimeUuid]
  ): Unit = js.native
  def now(nodeId: Buffer, clockId: Buffer): typings.cassandraDriver.typesMod.types.TimeUuid = js.native
  def now(
    nodeId: Buffer,
    clockId: Buffer,
    callback: ValueCallback[typings.cassandraDriver.typesMod.types.TimeUuid]
  ): Unit = js.native
}

