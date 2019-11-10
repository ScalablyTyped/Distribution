package typings.cassandraDashDriver.libTypesMod.types

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cassandra-driver/lib/types", "types.BigDecimal")
@js.native
class BigDecimal protected () extends js.Object {
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

/* static members */
@JSImport("cassandra-driver/lib/types", "types.BigDecimal")
@js.native
object BigDecimal extends js.Object {
  def fromBuffer(buf: Buffer): BigDecimal = js.native
  def fromNumber(value: Double): BigDecimal = js.native
  def fromString(value: String): BigDecimal = js.native
  def toBuffer(value: BigDecimal): Buffer = js.native
}

