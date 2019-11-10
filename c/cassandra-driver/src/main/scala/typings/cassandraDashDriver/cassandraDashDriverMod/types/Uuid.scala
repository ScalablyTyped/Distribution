package typings.cassandraDashDriver.cassandraDashDriverMod.types

import typings.cassandraDashDriver.cassandraDashDriverMod.ValueCallback
import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cassandra-driver", "types.Uuid")
@js.native
class Uuid protected ()
  extends typings.cassandraDashDriver.libTypesMod.types.Uuid {
  def this(buffer: Buffer) = this()
}

/* static members */
@JSImport("cassandra-driver", "types.Uuid")
@js.native
object Uuid extends js.Object {
  def fromString(value: String): typings.cassandraDashDriver.libTypesMod.types.Uuid = js.native
  def random(): typings.cassandraDashDriver.libTypesMod.types.Uuid = js.native
  def random(callback: ValueCallback[typings.cassandraDashDriver.libTypesMod.types.Uuid]): Unit = js.native
}

