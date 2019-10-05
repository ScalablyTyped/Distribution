package typings.cassandraDashDriver.cassandraDashDriverMod.types

import org.scalablytyped.runtime.Instantiable2
import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IntegerStatic
  extends Instantiable2[/* bits */ js.Array[Double], /* sign */ Double, Integer] {
  var ONE: Integer = js.native
  var ZERO: Integer = js.native
  def fromBits(bits: js.Array[Double]): Integer = js.native
  def fromBuffer(bits: Buffer): Integer = js.native
  def fromInt(value: Double): Integer = js.native
  def fromNumber(value: Double): Integer = js.native
  def fromString(str: String): Integer = js.native
  def fromString(str: String, opt_radix: Double): Integer = js.native
  def toBuffer(value: Integer): Buffer = js.native
}

