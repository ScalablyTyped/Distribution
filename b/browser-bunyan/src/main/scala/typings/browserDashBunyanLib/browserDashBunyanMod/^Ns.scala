package typings
package browserDashBunyanLib.browserDashBunyanMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("browser-bunyan", JSImport.Namespace)
@js.native
object `^Ns` extends js.Object {
  @js.native
  class RingBuffer protected ()
    extends bunyanLib.bunyanMod.RingBuffer {
    def this(options: bunyanLib.bunyanMod.RingBufferOptions) = this()
  }
  
  @js.native
  class RotatingFileStream protected ()
    extends bunyanLib.bunyanMod.RotatingFileStream {
    def this(options: bunyanLib.bunyanMod.RotatingFileStreamOptions) = this()
  }
  
}

