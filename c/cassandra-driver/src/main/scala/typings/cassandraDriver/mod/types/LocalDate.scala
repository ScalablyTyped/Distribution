package typings.cassandraDriver.mod.types

import typings.node.Buffer
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("cassandra-driver", "types.LocalDate")
@js.native
class LocalDate protected ()
  extends typings.cassandraDriver.typesMod.types.LocalDate {
  def this(year: Double, month: Double, day: Double) = this()
}
/* static members */
@JSImport("cassandra-driver", "types.LocalDate")
@js.native
object LocalDate extends js.Object {
  
  def fromBuffer(buffer: Buffer): typings.cassandraDriver.typesMod.types.LocalDate = js.native
  
  def fromDate(date: Date): typings.cassandraDriver.typesMod.types.LocalDate = js.native
  
  def fromString(value: String): typings.cassandraDriver.typesMod.types.LocalDate = js.native
  
  def now(): typings.cassandraDriver.typesMod.types.LocalDate = js.native
  
  def utcNow(): typings.cassandraDriver.typesMod.types.LocalDate = js.native
}
