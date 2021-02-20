package typings.cassandraDriver.typesMod.types

import typings.node.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("cassandra-driver/lib/types", "types.BigDecimal")
@js.native
class BigDecimal protected () extends StObject {
  def this(unscaledValue: Double, scale: Double) = this()
  
  def add(other: BigDecimal): BigDecimal = js.native
  
  def compare(other: BigDecimal): Double = js.native
  
  def equals(other: BigDecimal): Boolean = js.native
  
  def greaterThan(other: BigDecimal): Boolean = js.native
  
  def isNegative(): Boolean = js.native
  
  def isZero(): Boolean = js.native
  
  def notEquals(other: BigDecimal): Boolean = js.native
  
  def subtract(other: BigDecimal): BigDecimal = js.native
  
  def toJSON(): String = js.native
  
  def toNumber(): Double = js.native
}
object BigDecimal {
  
  /* static member */
  @JSImport("cassandra-driver/lib/types", "types.BigDecimal.fromBuffer")
  @js.native
  def fromBuffer(buf: Buffer): BigDecimal = js.native
  
  /* static member */
  @JSImport("cassandra-driver/lib/types", "types.BigDecimal.fromNumber")
  @js.native
  def fromNumber(value: Double): BigDecimal = js.native
  
  /* static member */
  @JSImport("cassandra-driver/lib/types", "types.BigDecimal.fromString")
  @js.native
  def fromString(value: String): BigDecimal = js.native
  
  /* static member */
  @JSImport("cassandra-driver/lib/types", "types.BigDecimal.toBuffer")
  @js.native
  def toBuffer(value: BigDecimal): Buffer = js.native
}
