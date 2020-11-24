package typings.cassandraDriver.typesMod.types

import typings.node.Buffer
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("cassandra-driver/lib/types", "types.LocalTime")
@js.native
class LocalTime protected () extends js.Object {
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
/* static members */
@JSImport("cassandra-driver/lib/types", "types.LocalTime")
@js.native
object LocalTime extends js.Object {
  
  def fromBuffer(value: Buffer): LocalTime = js.native
  
  def fromDate(date: Date, nanoseconds: Double): LocalTime = js.native
  
  def fromMilliseconds(milliseconds: Double): LocalTime = js.native
  def fromMilliseconds(milliseconds: Double, nanoseconds: Double): LocalTime = js.native
  
  def fromString(value: String): LocalTime = js.native
  
  def now(): LocalTime = js.native
  def now(nanoseconds: Double): LocalTime = js.native
}
