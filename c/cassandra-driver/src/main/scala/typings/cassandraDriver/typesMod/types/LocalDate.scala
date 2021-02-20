package typings.cassandraDriver.typesMod.types

import typings.node.Buffer
import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("cassandra-driver/lib/types", "types.LocalDate")
@js.native
class LocalDate protected () extends StObject {
  def this(year: Double, month: Double, day: Double) = this()
  
  var day: Double = js.native
  
  def equals(other: LocalDate): Boolean = js.native
  
  def inspect(): String = js.native
  
  var month: Double = js.native
  
  def toBuffer(): Buffer = js.native
  
  def toJSON(): String = js.native
  
  var year: Double = js.native
}
object LocalDate {
  
  /* static member */
  @JSImport("cassandra-driver/lib/types", "types.LocalDate.fromBuffer")
  @js.native
  def fromBuffer(buffer: Buffer): LocalDate = js.native
  
  /* static member */
  @JSImport("cassandra-driver/lib/types", "types.LocalDate.fromDate")
  @js.native
  def fromDate(date: Date): LocalDate = js.native
  
  /* static member */
  @JSImport("cassandra-driver/lib/types", "types.LocalDate.fromString")
  @js.native
  def fromString(value: String): LocalDate = js.native
  
  /* static member */
  @JSImport("cassandra-driver/lib/types", "types.LocalDate.now")
  @js.native
  def now(): LocalDate = js.native
  
  /* static member */
  @JSImport("cassandra-driver/lib/types", "types.LocalDate.utcNow")
  @js.native
  def utcNow(): LocalDate = js.native
}
