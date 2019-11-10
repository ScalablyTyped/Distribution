package typings.cassandraDashDriver.cassandraDashDriverMod.types

import typings.node.Buffer
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cassandra-driver", "types.LocalTime")
@js.native
class LocalTime protected ()
  extends typings.cassandraDashDriver.libTypesMod.types.LocalTime {
  def this(totalNanoseconds: typings.cassandraDashDriver.libTypesMod.types.Long) = this()
}

/* static members */
@JSImport("cassandra-driver", "types.LocalTime")
@js.native
object LocalTime extends js.Object {
  def fromBuffer(value: Buffer): typings.cassandraDashDriver.libTypesMod.types.LocalTime = js.native
  def fromDate(date: Date, nanoseconds: Double): typings.cassandraDashDriver.libTypesMod.types.LocalTime = js.native
  def fromMilliseconds(milliseconds: Double): typings.cassandraDashDriver.libTypesMod.types.LocalTime = js.native
  def fromMilliseconds(milliseconds: Double, nanoseconds: Double): typings.cassandraDashDriver.libTypesMod.types.LocalTime = js.native
  def fromString(value: String): typings.cassandraDashDriver.libTypesMod.types.LocalTime = js.native
  def now(): typings.cassandraDashDriver.libTypesMod.types.LocalTime = js.native
  def now(nanoseconds: Double): typings.cassandraDashDriver.libTypesMod.types.LocalTime = js.native
}

