package typings.backoff.backoffMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("backoff", "BackoffStrategy")
@js.native
/**
  * The options are the following.
  *
  * @param options.randomisationFactor: defaults to 0, must be between 0 and 1
  * @param options.initialDelay: defaults to 100 ms
  * @param options.maxDelay: defaults to 10000 ms
  */
abstract class BackoffStrategy () extends js.Object {
  def this(options: Options) = this()
  def getInitialDelay(): Double = js.native
  def getMaxDelay(): Double = js.native
  /**
    * Computes and returns the next backoff delay.
    */
  def next(): Double = js.native
  /* protected */ def next_(): Double = js.native
  /**
    * Resets the backoff delay to its initial value.
    */
  def reset(): Unit = js.native
  /* protected */ def reset_(): Unit = js.native
}

