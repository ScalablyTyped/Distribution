package typings
package bunyanLib.bunyanMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("bunyan", "RingBuffer")
@js.native
class RingBuffer protected ()
  extends bunyanLib.bunyanMod.LoggerNs.RingBuffer {
  def this(options: bunyanLib.bunyanMod.LoggerNs.RingBufferOptions) = this()
}

