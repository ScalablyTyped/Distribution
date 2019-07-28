package typings.browserDashBunyan.browserDashBunyanMod

import typings.bunyan.bunyanMod.RingBufferOptions
import typings.bunyan.bunyanMod.RotatingFileStreamOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("browser-bunyan", JSImport.Namespace)
@js.native
object `^Ns` extends js.Object {
  @js.native
  class RingBuffer protected ()
    extends typings.bunyan.bunyanMod.RingBuffer {
    def this(options: RingBufferOptions) = this()
  }
  
  @js.native
  class RotatingFileStream protected ()
    extends typings.bunyan.bunyanMod.RotatingFileStream {
    def this(options: RotatingFileStreamOptions) = this()
  }
  
}

