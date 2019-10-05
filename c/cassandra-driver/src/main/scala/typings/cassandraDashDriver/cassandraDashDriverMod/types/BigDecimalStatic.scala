package typings.cassandraDashDriver.cassandraDashDriverMod.types

import org.scalablytyped.runtime.Instantiable2
import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BigDecimalStatic extends Instantiable2[/* unscaledValue */ Double, /* scale */ Double, BigDecimal] {
  def fromBuffer(buf: Buffer): BigDecimal = js.native
  def fromNumber(value: Double): BigDecimal = js.native
  def fromString(value: String): BigDecimal = js.native
  def toBuffer(value: BigDecimal): Buffer = js.native
}

