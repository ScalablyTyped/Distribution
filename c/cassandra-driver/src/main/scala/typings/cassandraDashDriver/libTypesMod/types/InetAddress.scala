package typings.cassandraDashDriver.libTypesMod.types

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cassandra-driver/lib/types", "types.InetAddress")
@js.native
class InetAddress protected () extends js.Object {
  def this(buffer: Buffer) = this()
  var length: Double = js.native
  var version: Double = js.native
  def equals(other: InetAddress): Boolean = js.native
  def getBuffer(): Buffer = js.native
  def toJSON(): String = js.native
}

/* static members */
@JSImport("cassandra-driver/lib/types", "types.InetAddress")
@js.native
object InetAddress extends js.Object {
  def fromString(value: String): InetAddress = js.native
}

