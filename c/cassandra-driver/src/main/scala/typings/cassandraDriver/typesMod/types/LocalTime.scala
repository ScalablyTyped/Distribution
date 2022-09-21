package typings.cassandraDriver.typesMod.types

import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("cassandra-driver/lib/types", "types.LocalTime")
@js.native
open class LocalTime protected () extends StObject {
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
  
  @JSImport("cassandra-driver/lib/types", "types.LocalTime")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  inline def fromBuffer(value: Buffer): LocalTime = ^.asInstanceOf[js.Dynamic].applyDynamic("fromBuffer")(value.asInstanceOf[js.Any]).asInstanceOf[LocalTime]
  
  /* static member */
  inline def fromDate(date: js.Date, nanoseconds: Double): LocalTime = (^.asInstanceOf[js.Dynamic].applyDynamic("fromDate")(date.asInstanceOf[js.Any], nanoseconds.asInstanceOf[js.Any])).asInstanceOf[LocalTime]
  
  /* static member */
  inline def fromMilliseconds(milliseconds: Double): LocalTime = ^.asInstanceOf[js.Dynamic].applyDynamic("fromMilliseconds")(milliseconds.asInstanceOf[js.Any]).asInstanceOf[LocalTime]
  inline def fromMilliseconds(milliseconds: Double, nanoseconds: Double): LocalTime = (^.asInstanceOf[js.Dynamic].applyDynamic("fromMilliseconds")(milliseconds.asInstanceOf[js.Any], nanoseconds.asInstanceOf[js.Any])).asInstanceOf[LocalTime]
  
  /* static member */
  inline def fromString(value: String): LocalTime = ^.asInstanceOf[js.Dynamic].applyDynamic("fromString")(value.asInstanceOf[js.Any]).asInstanceOf[LocalTime]
  
  /* static member */
  inline def now(): LocalTime = ^.asInstanceOf[js.Dynamic].applyDynamic("now")().asInstanceOf[LocalTime]
  inline def now(nanoseconds: Double): LocalTime = ^.asInstanceOf[js.Dynamic].applyDynamic("now")(nanoseconds.asInstanceOf[js.Any]).asInstanceOf[LocalTime]
}
