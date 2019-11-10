package typings.cassandraDashDriver.libTypesMod.types

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cassandra-driver/lib/types", "types.Duration")
@js.native
class Duration protected () extends js.Object {
  def this(month: Double, days: Double, nanoseconds: Double) = this()
  def this(month: Double, days: Double, nanoseconds: Long) = this()
  def equals(other: Duration): Boolean = js.native
  def toBuffer(): Buffer = js.native
}

/* static members */
@JSImport("cassandra-driver/lib/types", "types.Duration")
@js.native
object Duration extends js.Object {
  def fromBuffer(buffer: Buffer): Duration = js.native
  def fromString(input: String): Duration = js.native
}

