package typings.cassandraDriver.typesMod.types

import typings.node.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
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
  
  @JSImport("cassandra-driver/lib/types", "types.Duration")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @scala.inline
  def fromBuffer(buffer: Buffer): Duration = ^.asInstanceOf[js.Dynamic].applyDynamic("fromBuffer")(buffer.asInstanceOf[js.Any]).asInstanceOf[Duration]
  
  /* static member */
  @scala.inline
  def fromString(input: String): Duration = ^.asInstanceOf[js.Dynamic].applyDynamic("fromString")(input.asInstanceOf[js.Any]).asInstanceOf[Duration]
}
