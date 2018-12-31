package typings
package backo2Lib.backo2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("backo2", JSImport.Namespace)
@js.native
class namespaced () extends Backoff {
  def this(opts: backo2Lib.BackoffOptions) = this()
  /* CompleteClass */
  override def duration(): scala.Double = js.native
  /**
    * Reset the number of attempts.
    */
  /* CompleteClass */
  override def reset(): scala.Unit = js.native
  /**
    * Set the jitter
    */
  /* CompleteClass */
  override def setJitter(jitter: scala.Double): scala.Unit = js.native
  /**
    * Set the maximum duration
    */
  /* CompleteClass */
  override def setMax(max: scala.Double): scala.Unit = js.native
  /**
    * Set the minimum duration
    */
  /* CompleteClass */
  override def setMin(min: scala.Double): scala.Unit = js.native
}

