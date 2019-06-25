package typings
package complexDotJsLib.complexDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("complex.js", JSImport.Default)
@js.native
class default protected () extends Complex {
  def this(x: Complex) = this()
  def this(x: scala.Double, y: scala.Double) = this()
}

/* static members */
@JSImport("complex.js", JSImport.Default)
@js.native
object default extends js.Object {
  /**
    * A complex euler number instance.
    */
  var E: complexDotJsLib.complexDotJsMod.Complex = js.native
  /**
    * A small epsilon value used for equals() comparison in order to circumvent double inprecision.
    */
  var EPSILON: scala.Double = js.native
  /**
    * An imaginary number i instance.
    */
  var I: complexDotJsLib.complexDotJsMod.Complex = js.native
  /**
    * A complex infinity value (north pole on the Riemann Sphere).
    */
  var INFINITY: complexDotJsLib.complexDotJsMod.Complex = js.native
  /**
    * A complex NaN value (not on the Riemann Sphere).
    */
  var NAN: complexDotJsLib.complexDotJsMod.Complex = js.native
  /**
    * A complex one instance.
    */
  var ONE: complexDotJsLib.complexDotJsMod.Complex = js.native
  /**
    * A complex PI instance.
    */
  var PI: complexDotJsLib.complexDotJsMod.Complex = js.native
  /**
    * A complex zero value (south pole on the Riemann Sphere).
    */
  var ZERO: complexDotJsLib.complexDotJsMod.Complex = js.native
}

