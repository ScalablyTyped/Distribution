package typings.cassandraDashDriver.cassandraDashDriverMod.types

import org.scalablytyped.runtime.TopLevel
import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Uuid extends js.Object {
  var buffer: Buffer
  // tslint:disable-next-line:no-unnecessary-qualifier
  def equals(other: Uuid): Boolean
  def getBuffer(): Buffer
  def inspect(): String
  def toJSON(): String
}

@JSImport("cassandra-driver", "types.Uuid")
@js.native
object Uuid extends TopLevel[UuidStatic]

