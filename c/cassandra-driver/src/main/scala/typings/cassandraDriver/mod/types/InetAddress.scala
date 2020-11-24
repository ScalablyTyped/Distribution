package typings.cassandraDriver.mod.types

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("cassandra-driver", "types.InetAddress")
@js.native
class InetAddress protected ()
  extends typings.cassandraDriver.typesMod.types.InetAddress {
  def this(buffer: Buffer) = this()
}
/* static members */
@JSImport("cassandra-driver", "types.InetAddress")
@js.native
object InetAddress extends js.Object {
  
  def fromString(value: String): typings.cassandraDriver.typesMod.types.InetAddress = js.native
}
