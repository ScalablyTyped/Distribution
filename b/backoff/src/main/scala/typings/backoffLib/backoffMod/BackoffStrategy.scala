package typings
package backoffLib.backoffMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("backoff", "BackoffStrategy")
@js.native
abstract class BackoffStrategy () extends js.Object {
  /**
       * The options are the following.
       *
       * @param options.randomisationFactor: defaults to 0, must be between 0 and 1
       * @param options.initialDelay: defaults to 100 ms
       * @param options.maxDelay: defaults to 10000 ms
       */
  def this(options: Options) = this()
  def getInitialDelay(): scala.Double = js.native
  def getMaxDelay(): scala.Double = js.native
  /**
       * Computes and returns the next backoff delay.
       */
  def next(): scala.Double = js.native
  /* protected */ def `next_`(): scala.Double = js.native
  /**
       * Resets the backoff delay to its initial value.
       */
  def reset(): scala.Unit = js.native
  /* protected */ def `reset_`(): scala.Unit = js.native
}

