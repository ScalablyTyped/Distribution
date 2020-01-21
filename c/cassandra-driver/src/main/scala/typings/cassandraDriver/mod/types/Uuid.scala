package typings.cassandraDriver.mod.types

import typings.cassandraDriver.mod.ValueCallback
import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cassandra-driver", "types.Uuid")
@js.native
class Uuid protected ()
  extends typings.cassandraDriver.typesMod.types.Uuid {
  def this(buffer: Buffer) = this()
}

/* static members */
@JSImport("cassandra-driver", "types.Uuid")
@js.native
object Uuid extends js.Object {
  def fromString(value: String): typings.cassandraDriver.typesMod.types.Uuid = js.native
  def random(): typings.cassandraDriver.typesMod.types.Uuid = js.native
  def random(callback: ValueCallback[typings.cassandraDriver.typesMod.types.Uuid]): Unit = js.native
}

