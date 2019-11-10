package typings.cassandraDashDriver.cassandraDashDriverMod.types

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cassandra-driver", "types.BigDecimal")
@js.native
class BigDecimal protected ()
  extends typings.cassandraDashDriver.libTypesMod.types.BigDecimal {
  def this(unscaledValue: Double, scale: Double) = this()
}

/* static members */
@JSImport("cassandra-driver", "types.BigDecimal")
@js.native
object BigDecimal extends js.Object {
  def fromBuffer(buf: Buffer): typings.cassandraDashDriver.libTypesMod.types.BigDecimal = js.native
  def fromNumber(value: Double): typings.cassandraDashDriver.libTypesMod.types.BigDecimal = js.native
  def fromString(value: String): typings.cassandraDashDriver.libTypesMod.types.BigDecimal = js.native
  def toBuffer(value: typings.cassandraDashDriver.libTypesMod.types.BigDecimal): Buffer = js.native
}

