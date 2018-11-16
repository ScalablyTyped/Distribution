package typings
package backo2Lib.backo2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Backoff extends js.Object {
  def duration(): scala.Double
  /**
       * Reset the number of attempts.
       */
  def reset(): scala.Unit
  /**
       * Set the jitter
       */
  def setJitter(jitter: scala.Double): scala.Unit
  /**
       * Set the maximum duration
       */
  def setMax(max: scala.Double): scala.Unit
  /**
       * Set the minimum duration
       */
  def setMin(min: scala.Double): scala.Unit
}

