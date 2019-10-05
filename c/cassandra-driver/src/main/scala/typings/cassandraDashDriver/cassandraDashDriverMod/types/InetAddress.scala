package typings.cassandraDashDriver.cassandraDashDriverMod.types

import org.scalablytyped.runtime.TopLevel
import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InetAddress extends js.Object {
  var length: Double
  var version: Double
  def equals(other: InetAddress): Boolean
  def getBuffer(): Buffer
  def inspect(): String
  def toJSON(): String
}

@JSImport("cassandra-driver", "types.InetAddress")
@js.native
object InetAddress extends TopLevel[InetAddressStatic]

