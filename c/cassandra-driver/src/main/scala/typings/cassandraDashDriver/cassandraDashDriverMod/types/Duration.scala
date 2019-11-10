package typings.cassandraDashDriver.cassandraDashDriverMod.types

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cassandra-driver", "types.Duration")
@js.native
class Duration protected ()
  extends typings.cassandraDashDriver.libTypesMod.types.Duration {
  def this(month: Double, days: Double, nanoseconds: Double) = this()
  def this(month: Double, days: Double, nanoseconds: typings.cassandraDashDriver.libTypesMod.types.Long) = this()
}

/* static members */
@JSImport("cassandra-driver", "types.Duration")
@js.native
object Duration extends js.Object {
  def fromBuffer(buffer: Buffer): typings.cassandraDashDriver.libTypesMod.types.Duration = js.native
  def fromString(input: String): typings.cassandraDashDriver.libTypesMod.types.Duration = js.native
}

