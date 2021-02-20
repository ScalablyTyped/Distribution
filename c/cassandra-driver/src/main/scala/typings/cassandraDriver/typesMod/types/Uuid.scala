package typings.cassandraDriver.typesMod.types

import typings.cassandraDriver.mod.ValueCallback
import typings.node.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("cassandra-driver/lib/types", "types.Uuid")
@js.native
class Uuid protected () extends StObject {
  def this(buffer: Buffer) = this()
  
  def equals(other: Uuid): Boolean = js.native
  
  def getBuffer(): Buffer = js.native
  
  def toJSON(): String = js.native
}
object Uuid {
  
  /* static member */
  @JSImport("cassandra-driver/lib/types", "types.Uuid.fromString")
  @js.native
  def fromString(value: String): Uuid = js.native
  
  /* static member */
  @JSImport("cassandra-driver/lib/types", "types.Uuid.random")
  @js.native
  def random(): Uuid = js.native
  /* static member */
  @JSImport("cassandra-driver/lib/types", "types.Uuid.random")
  @js.native
  def random(callback: ValueCallback[Uuid]): Unit = js.native
}
