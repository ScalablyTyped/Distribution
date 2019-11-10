package typings.cassandraDashDriver.cassandraDashDriverMod.types

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cassandra-driver", "types.InetAddress")
@js.native
class InetAddress protected ()
  extends typings.cassandraDashDriver.libTypesMod.types.InetAddress {
  def this(buffer: Buffer) = this()
}

/* static members */
@JSImport("cassandra-driver", "types.InetAddress")
@js.native
object InetAddress extends js.Object {
  def fromString(value: String): typings.cassandraDashDriver.libTypesMod.types.InetAddress = js.native
}

