package typings.cassandraDriver.typesMod.types

import typings.cassandraDriver.mod.ValueCallback
import typings.node.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
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
  
  @JSImport("cassandra-driver/lib/types", "types.Uuid")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @scala.inline
  def fromString(value: String): Uuid = ^.asInstanceOf[js.Dynamic].applyDynamic("fromString")(value.asInstanceOf[js.Any]).asInstanceOf[Uuid]
  
  /* static member */
  @scala.inline
  def random(): Uuid = ^.asInstanceOf[js.Dynamic].applyDynamic("random")().asInstanceOf[Uuid]
  /* static member */
  @scala.inline
  def random(callback: ValueCallback[Uuid]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("random")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
