package typings.cassandraDriver.typesMod.types

import typings.node.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("cassandra-driver/lib/types", "types.Duration")
@js.native
class Duration protected () extends StObject {
  def this(month: Double, days: Double, nanoseconds: Double) = this()
  def this(month: Double, days: Double, nanoseconds: Long) = this()
  
  def equals(other: Duration): Boolean = js.native
  
  def toBuffer(): Buffer = js.native
}
object Duration {
  
  /* static member */
  @JSImport("cassandra-driver/lib/types", "types.Duration.fromBuffer")
  @js.native
  def fromBuffer(buffer: Buffer): Duration = js.native
  
  /* static member */
  @JSImport("cassandra-driver/lib/types", "types.Duration.fromString")
  @js.native
  def fromString(input: String): Duration = js.native
}
