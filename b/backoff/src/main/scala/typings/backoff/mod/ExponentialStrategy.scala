package typings.backoff.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("backoff", "ExponentialStrategy")
@js.native
/**
  * The options are the following.
  *
  * @param options.randomisationFactor: defaults to 0, must be between 0 and 1
  * @param options.initialDelay: defaults to 100 ms
  * @param options.maxDelay: defaults to 10000 ms
  * @param options.factor: defaults to 2, must be greater than 1
  */
class ExponentialStrategy () extends BackoffStrategy {
  def this(options: ExponentialOptions) = this()
}
