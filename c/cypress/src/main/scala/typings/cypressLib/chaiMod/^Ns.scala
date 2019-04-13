package typings
package cypressLib.chaiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("chai", JSImport.Namespace)
@js.native
object `^Ns` extends js.Object {
  @js.native
  class AssertionError protected ()
    extends cypressLib.ChaiNs.AssertionError {
    def this(message: java.lang.String) = this()
    def this(message: java.lang.String, _props: js.Any) = this()
    def this(message: java.lang.String, _props: js.Any, ssf: js.Function) = this()
  }
  
}

