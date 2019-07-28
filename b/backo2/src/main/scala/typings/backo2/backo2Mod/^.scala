package typings.backo2.backo2Mod

import typings.backo2.BackoffOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("backo2", JSImport.Namespace)
@js.native
class ^ () extends Backoff {
  def this(opts: BackoffOptions) = this()
  /* CompleteClass */
  override def duration(): Double = js.native
  /**
    * Reset the number of attempts.
    */
  /* CompleteClass */
  override def reset(): Unit = js.native
  /**
    * Set the jitter
    */
  /* CompleteClass */
  override def setJitter(jitter: Double): Unit = js.native
  /**
    * Set the maximum duration
    */
  /* CompleteClass */
  override def setMax(max: Double): Unit = js.native
  /**
    * Set the minimum duration
    */
  /* CompleteClass */
  override def setMin(min: Double): Unit = js.native
}

