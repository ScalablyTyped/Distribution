package typings.complexDotJs.complexDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("complex.js", JSImport.Default)
@js.native
class default protected () extends Complex {
  def this(x: Complex) = this()
  def this(x: Double, y: Double) = this()
}

/* static members */
@JSImport("complex.js", JSImport.Default)
@js.native
object default extends js.Object {
  /**
    * A complex euler number instance.
    */
  var E: Complex = js.native
  /**
    * A small epsilon value used for equals() comparison in order to circumvent double inprecision.
    */
  var EPSILON: Double = js.native
  /**
    * An imaginary number i instance.
    */
  var I: Complex = js.native
  /**
    * A complex infinity value (north pole on the Riemann Sphere).
    */
  var INFINITY: Complex = js.native
  /**
    * A complex NaN value (not on the Riemann Sphere).
    */
  var NAN: Complex = js.native
  /**
    * A complex one instance.
    */
  var ONE: Complex = js.native
  /**
    * A complex PI instance.
    */
  var PI: Complex = js.native
  /**
    * A complex zero value (south pole on the Riemann Sphere).
    */
  var ZERO: Complex = js.native
}

