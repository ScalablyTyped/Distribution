package typings.cassandraDriver.typesMod.types

import typings.node.Buffer
import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
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
  
  @JSImport("cassandra-driver/lib/types", "types.LocalDate")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  inline def fromBuffer(buffer: Buffer): LocalDate = ^.asInstanceOf[js.Dynamic].applyDynamic("fromBuffer")(buffer.asInstanceOf[js.Any]).asInstanceOf[LocalDate]
  
  /* static member */
  inline def fromDate(date: Date): LocalDate = ^.asInstanceOf[js.Dynamic].applyDynamic("fromDate")(date.asInstanceOf[js.Any]).asInstanceOf[LocalDate]
  
  /* static member */
  inline def fromString(value: String): LocalDate = ^.asInstanceOf[js.Dynamic].applyDynamic("fromString")(value.asInstanceOf[js.Any]).asInstanceOf[LocalDate]
  
  /* static member */
  inline def now(): LocalDate = ^.asInstanceOf[js.Dynamic].applyDynamic("now")().asInstanceOf[LocalDate]
  
  /* static member */
  inline def utcNow(): LocalDate = ^.asInstanceOf[js.Dynamic].applyDynamic("utcNow")().asInstanceOf[LocalDate]
}
