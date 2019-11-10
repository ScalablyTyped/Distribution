package typings.cassandraDashDriver.libTypesMod.types

import typings.cassandraDashDriver.cassandraDashDriverMod.ValueCallback
import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cassandra-driver/lib/types", "types.Uuid")
@js.native
class Uuid protected () extends js.Object {
  def this(buffer: Buffer) = this()
  def equals(other: Uuid): Boolean = js.native
  def getBuffer(): Buffer = js.native
  def toJSON(): String = js.native
}

/* static members */
@JSImport("cassandra-driver/lib/types", "types.Uuid")
@js.native
object Uuid extends js.Object {
  def fromString(value: String): Uuid = js.native
  def random(): Uuid = js.native
  def random(callback: ValueCallback[Uuid]): Unit = js.native
}

