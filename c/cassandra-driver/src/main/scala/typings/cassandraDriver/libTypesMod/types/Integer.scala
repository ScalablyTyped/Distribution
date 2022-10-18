package typings.cassandraDriver.libTypesMod.types

import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("cassandra-driver/lib/types", "types.Integer")
@js.native
open class Integer protected () extends StObject {
  def this(bits: js.Array[Double], sign: Double) = this()
  
  def abs(): Integer = js.native
  
  def add(other: Integer): Integer = js.native
  
  def compare(other: Integer): Double = js.native
  
  def divide(other: Integer): Integer = js.native
  
  def equals(other: Integer): Boolean = js.native
  
  def getBits(index: Double): Double = js.native
  
  def getBitsUnsigned(index: Double): Double = js.native
  
  def getSign(): Double = js.native
  
  def greaterThan(other: Integer): Boolean = js.native
  
  def greaterThanOrEqual(other: Integer): Boolean = js.native
  
  def isNegative(): Boolean = js.native
  
  def isOdd(): Boolean = js.native
  
  def isZero(): Boolean = js.native
  
  def lessThan(other: Integer): Boolean = js.native
  
  def lessThanOrEqual(other: Integer): Boolean = js.native
  
  def modulo(other: Integer): Integer = js.native
  
  def multiply(other: Integer): Integer = js.native
  
  def negate(): Integer = js.native
  
  def not(): Integer = js.native
  
  def notEquals(other: Integer): Boolean = js.native
  
  def or(other: Integer): Integer = js.native
  
  def shiftLeft(numBits: Double): Integer = js.native
  
  def shiftRight(numBits: Double): Integer = js.native
  
  def shorten(numBits: Double): Integer = js.native
  
  def subtract(other: Integer): Integer = js.native
  
  def toInt(): Double = js.native
  
  def toJSON(): String = js.native
  
  def toNumber(): Double = js.native
  
  def toString(opt_radix: Double): String = js.native
  
  def xor(other: Integer): Integer = js.native
}
object Integer {
  
  @JSImport("cassandra-driver/lib/types", "types.Integer")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSImport("cassandra-driver/lib/types", "types.Integer.ONE")
  @js.native
  def ONE: Integer = js.native
  inline def ONE_=(x: Integer): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ONE")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("cassandra-driver/lib/types", "types.Integer.ZERO")
  @js.native
  def ZERO: Integer = js.native
  inline def ZERO_=(x: Integer): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ZERO")(x.asInstanceOf[js.Any])
  
  /* static member */
  inline def fromBits(bits: js.Array[Double]): Integer = ^.asInstanceOf[js.Dynamic].applyDynamic("fromBits")(bits.asInstanceOf[js.Any]).asInstanceOf[Integer]
  
  /* static member */
  inline def fromBuffer(bits: Buffer): Integer = ^.asInstanceOf[js.Dynamic].applyDynamic("fromBuffer")(bits.asInstanceOf[js.Any]).asInstanceOf[Integer]
  
  /* static member */
  inline def fromInt(value: Double): Integer = ^.asInstanceOf[js.Dynamic].applyDynamic("fromInt")(value.asInstanceOf[js.Any]).asInstanceOf[Integer]
  
  /* static member */
  inline def fromNumber(value: Double): Integer = ^.asInstanceOf[js.Dynamic].applyDynamic("fromNumber")(value.asInstanceOf[js.Any]).asInstanceOf[Integer]
  
  /* static member */
  inline def fromString(str: String): Integer = ^.asInstanceOf[js.Dynamic].applyDynamic("fromString")(str.asInstanceOf[js.Any]).asInstanceOf[Integer]
  inline def fromString(str: String, opt_radix: Double): Integer = (^.asInstanceOf[js.Dynamic].applyDynamic("fromString")(str.asInstanceOf[js.Any], opt_radix.asInstanceOf[js.Any])).asInstanceOf[Integer]
  
  /* static member */
  inline def toBuffer(value: Integer): Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("toBuffer")(value.asInstanceOf[js.Any]).asInstanceOf[Buffer]
}
