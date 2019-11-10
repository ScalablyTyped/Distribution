package typings.cassandraDashDriver.cassandraDashDriverMod.types

import typings.node.Buffer
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cassandra-driver", "types.LocalDate")
@js.native
class LocalDate protected ()
  extends typings.cassandraDashDriver.libTypesMod.types.LocalDate {
  def this(year: Double, month: Double, day: Double) = this()
}

/* static members */
@JSImport("cassandra-driver", "types.LocalDate")
@js.native
object LocalDate extends js.Object {
  def fromBuffer(buffer: Buffer): typings.cassandraDashDriver.libTypesMod.types.LocalDate = js.native
  def fromDate(date: Date): typings.cassandraDashDriver.libTypesMod.types.LocalDate = js.native
  def fromString(value: String): typings.cassandraDashDriver.libTypesMod.types.LocalDate = js.native
  def now(): typings.cassandraDashDriver.libTypesMod.types.LocalDate = js.native
  def utcNow(): typings.cassandraDashDriver.libTypesMod.types.LocalDate = js.native
}

