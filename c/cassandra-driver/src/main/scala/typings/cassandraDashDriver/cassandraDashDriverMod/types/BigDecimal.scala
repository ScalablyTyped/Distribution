package typings.cassandraDashDriver.cassandraDashDriverMod.types

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BigDecimal extends js.Object {
  def add(other: BigDecimal): BigDecimal
  def compare(other: BigDecimal): Double
  def equals(other: BigDecimal): Boolean
  def greaterThan(other: BigDecimal): Boolean
  def inspect(): String
  def isNegative(): Boolean
  def isZero(): Boolean
  def notEquals(other: BigDecimal): Boolean
  def subtract(other: BigDecimal): BigDecimal
  def toJSON(): String
  def toNumber(): Double
}

@JSImport("cassandra-driver", "types.BigDecimal")
@js.native
object BigDecimal extends TopLevel[BigDecimalStatic]

