package typings.cassandraDriver.typesMod.types

import typings.node.Buffer
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cassandra-driver/lib/types", "types.LocalDate")
@js.native
class LocalDate protected () extends js.Object {
  def this(year: Double, month: Double, day: Double) = this()
  var day: Double = js.native
  var month: Double = js.native
  var year: Double = js.native
  def equals(other: LocalDate): Boolean = js.native
  def inspect(): String = js.native
  def toBuffer(): Buffer = js.native
  def toJSON(): String = js.native
}

/* static members */
@JSImport("cassandra-driver/lib/types", "types.LocalDate")
@js.native
object LocalDate extends js.Object {
  def fromBuffer(buffer: Buffer): LocalDate = js.native
  def fromDate(date: Date): LocalDate = js.native
  def fromString(value: String): LocalDate = js.native
  def now(): LocalDate = js.native
  def utcNow(): LocalDate = js.native
}

