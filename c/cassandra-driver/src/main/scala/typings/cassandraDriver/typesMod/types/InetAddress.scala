package typings.cassandraDriver.typesMod.types

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("cassandra-driver/lib/types", "types.InetAddress")
@js.native
class InetAddress protected () extends js.Object {
  def this(buffer: Buffer) = this()
  
  def equals(other: InetAddress): Boolean = js.native
  
  def getBuffer(): Buffer = js.native
  
  var length: Double = js.native
  
  def toJSON(): String = js.native
  
  var version: Double = js.native
}
/* static members */
@JSImport("cassandra-driver/lib/types", "types.InetAddress")
@js.native
object InetAddress extends js.Object {
  
  def fromString(value: String): InetAddress = js.native
}
