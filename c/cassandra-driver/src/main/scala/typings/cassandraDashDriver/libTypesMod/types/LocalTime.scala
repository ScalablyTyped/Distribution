package typings.cassandraDashDriver.libTypesMod.types

import typings.node.Buffer
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cassandra-driver/lib/types", "types.LocalTime")
@js.native
class LocalTime protected () extends js.Object {
  def this(totalNanoseconds: Long) = this()
  var hour: Double = js.native
  var minute: Double = js.native
  var nanosecond: Double = js.native
  var second: Double = js.native
  def compare(other: LocalTime): Boolean = js.native
  def equals(other: LocalTime): Boolean = js.native
  def getTotalNanoseconds(): Long = js.native
  def inspect(): String = js.native
  def toBuffer(): Buffer = js.native
  def toJSON(): String = js.native
}

/* static members */
@JSImport("cassandra-driver/lib/types", "types.LocalTime")
@js.native
object LocalTime extends js.Object {
  def fromBuffer(value: Buffer): LocalTime = js.native
  def fromDate(date: Date, nanoseconds: Double): LocalTime = js.native
  def fromMilliseconds(milliseconds: Double): LocalTime = js.native
  def fromMilliseconds(milliseconds: Double, nanoseconds: Double): LocalTime = js.native
  def fromString(value: String): LocalTime = js.native
  def now(): LocalTime = js.native
  def now(nanoseconds: Double): LocalTime = js.native
}

