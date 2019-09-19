package typings.backo2.backo2Mod

import typings.backo2.BackoffOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("backo2", JSImport.Namespace)
@js.native
class ^ () extends Backoff {
  def this(opts: BackoffOptions) = this()
  /**
    * The number of previous attempts
    */
  /* CompleteClass */
  override var attempts: Double = js.native
  /**
    * The base to which the attempt is raised as an exponent
    */
  /* CompleteClass */
  override var factor: Double = js.native
  /**
    * An upper bound on the variance around the duration between attempts
    */
  /* CompleteClass */
  override var jitter: Double = js.native
  /**
    * An upper bound on the duration between attempts
    */
  /* CompleteClass */
  override var max: Double = js.native
  /**
    * A lower bound on the duration between attempts
    */
  /* CompleteClass */
  override var ms: Double = js.native
  /**
    * Compute the backoff duration and increment the number of attempts
    */
  /* CompleteClass */
  override def duration(): Double = js.native
  /**
    * Reset the number of attempts
    */
  /* CompleteClass */
  override def reset(): Unit = js.native
  /**
    * Set the jitter
    */
  /* CompleteClass */
  override def setJitter(jitter: Double): Unit = js.native
  /**
    * Set the maximum duration between attempts
    */
  /* CompleteClass */
  override def setMax(max: Double): Unit = js.native
  /**
    * Set the minimum duration between attempts
    */
  /* CompleteClass */
  override def setMin(min: Double): Unit = js.native
}

