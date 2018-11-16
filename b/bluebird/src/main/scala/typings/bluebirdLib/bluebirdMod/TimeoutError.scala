package typings
package bluebirdLib.bluebirdMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
   * Signals that an operation has timed out. Used as a custom cancellation reason in `.timeout`.
   */
@JSImport("bluebird", "TimeoutError")
@js.native
class TimeoutError ()
  extends bluebirdLib.bluebirdMod.BluebirdNs.TimeoutError {
  /* CompleteClass */
  override var message: java.lang.String = js.native
  /* CompleteClass */
  override var name: java.lang.String = js.native
}

