package typings.cassandraDriver.mod.types

import typings.node.Buffer
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cassandra-driver", "types.LocalTime")
@js.native
class LocalTime protected ()
  extends typings.cassandraDriver.typesMod.types.LocalTime {
  def this(totalNanoseconds: typings.cassandraDriver.typesMod.types.Long) = this()
}

/* static members */
@JSImport("cassandra-driver", "types.LocalTime")
@js.native
object LocalTime extends js.Object {
  def fromBuffer(value: Buffer): typings.cassandraDriver.typesMod.types.LocalTime = js.native
  def fromDate(date: Date, nanoseconds: Double): typings.cassandraDriver.typesMod.types.LocalTime = js.native
  def fromMilliseconds(milliseconds: Double): typings.cassandraDriver.typesMod.types.LocalTime = js.native
  def fromMilliseconds(milliseconds: Double, nanoseconds: Double): typings.cassandraDriver.typesMod.types.LocalTime = js.native
  def fromString(value: String): typings.cassandraDriver.typesMod.types.LocalTime = js.native
  def now(): typings.cassandraDriver.typesMod.types.LocalTime = js.native
  def now(nanoseconds: Double): typings.cassandraDriver.typesMod.types.LocalTime = js.native
}

