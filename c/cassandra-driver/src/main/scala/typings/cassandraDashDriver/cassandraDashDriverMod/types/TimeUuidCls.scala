package typings.cassandraDashDriver.cassandraDashDriverMod.types

import typings.cassandraDashDriver.Anon_Date
import typings.node.Buffer
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cassandra-driver", "types.TimeUuid")
@js.native
class TimeUuidCls () extends TimeUuid {
  def this(value: Date) = this()
  def this(value: Date, ticks: Double) = this()
  def this(value: Date, ticks: Double, nodeId: String) = this()
  def this(value: Date, ticks: Double, nodeId: Buffer) = this()
  def this(value: Date, ticks: Double, nodeId: String, clockId: String) = this()
  def this(value: Date, ticks: Double, nodeId: String, clockId: Buffer) = this()
  def this(value: Date, ticks: Double, nodeId: Buffer, clockId: String) = this()
  def this(value: Date, ticks: Double, nodeId: Buffer, clockId: Buffer) = this()
  /* CompleteClass */
  override var buffer: Buffer = js.native
  // tslint:disable-next-line:no-unnecessary-qualifier
  /* CompleteClass */
  override def equals(other: Uuid): Boolean = js.native
  /* CompleteClass */
  override def getBuffer(): Buffer = js.native
  /* CompleteClass */
  override def getDate(): Date = js.native
  /* CompleteClass */
  override def getDatePrecision(): Anon_Date = js.native
  /* CompleteClass */
  override def getNodeId(): Buffer = js.native
  /* CompleteClass */
  override def getNodeIdString(): String = js.native
  /* CompleteClass */
  override def inspect(): String = js.native
  /* CompleteClass */
  override def toJSON(): String = js.native
}

