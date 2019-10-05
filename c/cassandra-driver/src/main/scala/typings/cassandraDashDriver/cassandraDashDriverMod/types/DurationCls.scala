package typings.cassandraDashDriver.cassandraDashDriverMod.types

import typings.long.longMod.^
import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cassandra-driver", "types.Duration")
@js.native
class DurationCls protected () extends Duration {
  def this(month: Double, days: Double, nanoseconds: Double) = this()
  def this(month: Double, days: Double, nanoseconds: ^) = this()
  /* CompleteClass */
  override def equals(other: Duration): Boolean = js.native
  /* CompleteClass */
  override def toBuffer(): Buffer = js.native
}

