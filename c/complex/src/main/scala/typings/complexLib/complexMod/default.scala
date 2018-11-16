package typings
package complexLib.complexMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("complex", JSImport.Default)
@js.native
class default protected () extends Complex {
  /**
       * @param real The real part of the number
       * @param im The imaginary part of the number
       */
  def this(real: scala.Double, im: scala.Double) = this()
}

@JSImport("complex", JSImport.Default)
@js.native
object default extends js.Object {
  /**
       * A instance of the imaginary unit
       */
  var i: complexLib.complexMod.Complex = js.native
  /**
       * A instance for the real number
       */
  var one: complexLib.complexMod.Complex = js.native
  /**
       * A in line function like Number.from.
       *
       * Examples:
       * var z = Complex.from(2, 4);
       * var z = Complex.from(5);
       * var z = Complex.from('2+5i');
       *
       * @param real A string representation of the number, for example 1+4i
       */
  def from(real: java.lang.String): complexLib.complexMod.Complex = js.native
  /**
       * A in line function like Number.from.
       * @param real The real part of the number
       * @param im The imaginary part of the number
       */
  def from(real: scala.Double): complexLib.complexMod.Complex = js.native
  /**
       * A in line function like Number.from.
       * @param real The real part of the number
       * @param im The imaginary part of the number
       */
  def from(real: scala.Double, im: scala.Double): complexLib.complexMod.Complex = js.native
  /**
       * Creates a complex instance from a polar representation
       * @param r The radius/magnitude of the number
       * @param phi The angle/phase of the number
       */
  def fromPolar(r: scala.Double, phi: scala.Double): complexLib.complexMod.Complex = js.native
}

