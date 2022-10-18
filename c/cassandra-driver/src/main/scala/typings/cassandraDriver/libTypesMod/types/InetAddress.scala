package typings.cassandraDriver.libTypesMod.types

import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("cassandra-driver/lib/types", "types.InetAddress")
@js.native
open class InetAddress protected () extends StObject {
  def this(buffer: Buffer) = this()
  
  def equals(other: InetAddress): Boolean = js.native
  
  def getBuffer(): Buffer = js.native
  
  var length: Double = js.native
  
  def toJSON(): String = js.native
  
  var version: Double = js.native
}
object InetAddress {
  
  @JSImport("cassandra-driver/lib/types", "types.InetAddress")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  inline def fromString(value: String): InetAddress = ^.asInstanceOf[js.Dynamic].applyDynamic("fromString")(value.asInstanceOf[js.Any]).asInstanceOf[InetAddress]
}
