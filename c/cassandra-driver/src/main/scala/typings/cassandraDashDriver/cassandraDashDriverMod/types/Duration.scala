package typings.cassandraDashDriver.cassandraDashDriverMod.types

import org.scalablytyped.runtime.TopLevel
import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Duration extends js.Object {
  def equals(other: Duration): Boolean
  def toBuffer(): Buffer
}

@JSImport("cassandra-driver", "types.Duration")
@js.native
object Duration extends TopLevel[DurationStatic]

