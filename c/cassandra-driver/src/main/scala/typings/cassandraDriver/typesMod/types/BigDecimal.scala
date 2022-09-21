package typings.cassandraDriver.typesMod.types

import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("cassandra-driver/lib/types", "types.BigDecimal")
@js.native
open class BigDecimal protected () extends StObject {
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
  
  @JSImport("cassandra-driver/lib/types", "types.BigDecimal")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  inline def fromBuffer(buf: Buffer): BigDecimal = ^.asInstanceOf[js.Dynamic].applyDynamic("fromBuffer")(buf.asInstanceOf[js.Any]).asInstanceOf[BigDecimal]
  
  /* static member */
  inline def fromNumber(value: Double): BigDecimal = ^.asInstanceOf[js.Dynamic].applyDynamic("fromNumber")(value.asInstanceOf[js.Any]).asInstanceOf[BigDecimal]
  
  /* static member */
  inline def fromString(value: String): BigDecimal = ^.asInstanceOf[js.Dynamic].applyDynamic("fromString")(value.asInstanceOf[js.Any]).asInstanceOf[BigDecimal]
  
  /* static member */
  inline def toBuffer(value: BigDecimal): Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("toBuffer")(value.asInstanceOf[js.Any]).asInstanceOf[Buffer]
}
