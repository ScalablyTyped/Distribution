package typings.cassandraDriver.typesMod.types

import typings.node.Buffer
import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("cassandra-driver/lib/types", "types.LocalTime")
@js.native
class LocalTime protected () extends StObject {
  def this(totalNanoseconds: Long) = this()
  
  def compare(other: LocalTime): Boolean = js.native
  
  def equals(other: LocalTime): Boolean = js.native
  
  def getTotalNanoseconds(): Long = js.native
  
  var hour: Double = js.native
  
  def inspect(): String = js.native
  
  var minute: Double = js.native
  
  var nanosecond: Double = js.native
  
  var second: Double = js.native
  
  def toBuffer(): Buffer = js.native
  
  def toJSON(): String = js.native
}
object LocalTime {
  
  /* static member */
  @JSImport("cassandra-driver/lib/types", "types.LocalTime.fromBuffer")
  @js.native
  def fromBuffer(value: Buffer): LocalTime = js.native
  
  /* static member */
  @JSImport("cassandra-driver/lib/types", "types.LocalTime.fromDate")
  @js.native
  def fromDate(date: Date, nanoseconds: Double): LocalTime = js.native
  
  /* static member */
  @JSImport("cassandra-driver/lib/types", "types.LocalTime.fromMilliseconds")
  @js.native
  def fromMilliseconds(milliseconds: Double): LocalTime = js.native
  @JSImport("cassandra-driver/lib/types", "types.LocalTime.fromMilliseconds")
  @js.native
  def fromMilliseconds(milliseconds: Double, nanoseconds: Double): LocalTime = js.native
  
  /* static member */
  @JSImport("cassandra-driver/lib/types", "types.LocalTime.fromString")
  @js.native
  def fromString(value: String): LocalTime = js.native
  
  /* static member */
  @JSImport("cassandra-driver/lib/types", "types.LocalTime.now")
  @js.native
  def now(): LocalTime = js.native
  @JSImport("cassandra-driver/lib/types", "types.LocalTime.now")
  @js.native
  def now(nanoseconds: Double): LocalTime = js.native
}
