package typings
package backoffLib.backoffMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("backoff", "FibonacciStrategy")
@js.native
class FibonacciStrategy () extends BackoffStrategy {
  /**
       * The options are the following.
       *
       * @param options.randomisationFactor: defaults to 0, must be between 0 and 1
       * @param options.initialDelay: defaults to 100 ms
       * @param options.maxDelay: defaults to 10000 ms
       */
  def this(options: Options) = this()
}

