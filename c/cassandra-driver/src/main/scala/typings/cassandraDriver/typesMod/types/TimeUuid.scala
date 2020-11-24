package typings.cassandraDriver.typesMod.types

import typings.cassandraDriver.mod.ValueCallback
import typings.node.Buffer
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("cassandra-driver/lib/types", "types.TimeUuid")
@js.native
class TimeUuid () extends Uuid {
  
  def getDate(): Date = js.native
  
  def getDatePrecision(): typings.cassandraDriver.anon.Date = js.native
}
/* static members */
@JSImport("cassandra-driver/lib/types", "types.TimeUuid")
@js.native
object TimeUuid extends js.Object {
  
  def fromDate(date: Date): TimeUuid = js.native
  def fromDate(date: Date, ticks: js.UndefOr[scala.Nothing], nodeId: js.UndefOr[scala.Nothing], clockId: String): TimeUuid = js.native
  def fromDate(date: Date, ticks: js.UndefOr[scala.Nothing], nodeId: js.UndefOr[scala.Nothing], clockId: Buffer): TimeUuid = js.native
  def fromDate(date: Date, ticks: js.UndefOr[scala.Nothing], nodeId: String): TimeUuid = js.native
  def fromDate(date: Date, ticks: js.UndefOr[scala.Nothing], nodeId: String, clockId: String): TimeUuid = js.native
  def fromDate(date: Date, ticks: js.UndefOr[scala.Nothing], nodeId: String, clockId: Buffer): TimeUuid = js.native
  def fromDate(date: Date, ticks: js.UndefOr[scala.Nothing], nodeId: Buffer): TimeUuid = js.native
  def fromDate(date: Date, ticks: js.UndefOr[scala.Nothing], nodeId: Buffer, clockId: String): TimeUuid = js.native
  def fromDate(date: Date, ticks: js.UndefOr[scala.Nothing], nodeId: Buffer, clockId: Buffer): TimeUuid = js.native
  def fromDate(date: Date, ticks: Double): TimeUuid = js.native
  def fromDate(date: Date, ticks: Double, nodeId: js.UndefOr[scala.Nothing], clockId: String): TimeUuid = js.native
  def fromDate(date: Date, ticks: Double, nodeId: js.UndefOr[scala.Nothing], clockId: Buffer): TimeUuid = js.native
  def fromDate(date: Date, ticks: Double, nodeId: String): TimeUuid = js.native
  def fromDate(date: Date, ticks: Double, nodeId: String, clockId: String): TimeUuid = js.native
  def fromDate(date: Date, ticks: Double, nodeId: String, clockId: String, callback: ValueCallback[TimeUuid]): Unit = js.native
  def fromDate(date: Date, ticks: Double, nodeId: String, clockId: Buffer): TimeUuid = js.native
  def fromDate(date: Date, ticks: Double, nodeId: String, clockId: Buffer, callback: ValueCallback[TimeUuid]): Unit = js.native
  def fromDate(date: Date, ticks: Double, nodeId: Buffer): TimeUuid = js.native
  def fromDate(date: Date, ticks: Double, nodeId: Buffer, clockId: String): TimeUuid = js.native
  def fromDate(date: Date, ticks: Double, nodeId: Buffer, clockId: String, callback: ValueCallback[TimeUuid]): Unit = js.native
  def fromDate(date: Date, ticks: Double, nodeId: Buffer, clockId: Buffer): TimeUuid = js.native
  def fromDate(date: Date, ticks: Double, nodeId: Buffer, clockId: Buffer, callback: ValueCallback[TimeUuid]): Unit = js.native
  
  def fromString(value: String): TimeUuid = js.native
  
  def max(date: Date, ticks: Double): TimeUuid = js.native
  
  def min(date: Date, ticks: Double): TimeUuid = js.native
  
  def now(): TimeUuid = js.native
  def now(callback: ValueCallback[TimeUuid]): Unit = js.native
  def now(nodeId: String): TimeUuid = js.native
  def now(nodeId: String, clockId: String): TimeUuid = js.native
  def now(nodeId: String, clockId: String, callback: ValueCallback[TimeUuid]): Unit = js.native
  def now(nodeId: String, clockId: Buffer): TimeUuid = js.native
  def now(nodeId: String, clockId: Buffer, callback: ValueCallback[TimeUuid]): Unit = js.native
  def now(nodeId: Buffer): TimeUuid = js.native
  def now(nodeId: Buffer, clockId: String): TimeUuid = js.native
  def now(nodeId: Buffer, clockId: String, callback: ValueCallback[TimeUuid]): Unit = js.native
  def now(nodeId: Buffer, clockId: Buffer): TimeUuid = js.native
  def now(nodeId: Buffer, clockId: Buffer, callback: ValueCallback[TimeUuid]): Unit = js.native
}
