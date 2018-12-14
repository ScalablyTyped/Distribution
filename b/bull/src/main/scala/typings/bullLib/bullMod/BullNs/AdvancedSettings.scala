package typings
package bullLib.bullMod.BullNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait AdvancedSettings extends js.Object {
  /**
       * Define a custom backoff strategy
       */
  var backoffStrategies: js.UndefOr[
    org.scalablytyped.runtime.StringDictionary[
      js.Function2[/* attemptsMade */ scala.Double, /* err */ nodeLib.Error, scala.Double]
    ]
  ] = js.undefined
  /**
       * A timeout for when the queue is in `drained` state (empty waiting for jobs).
       * It is used when calling `queue.getNextJob()`, which will pass it to `.brpoplpush` on the Redis client.
       */
  var drainDelay: js.UndefOr[scala.Double] = js.undefined
  /**
       * Poll interval for delayed jobs and added jobs
       */
  var guardInterval: js.UndefOr[scala.Double] = js.undefined
  /**
       * Key expiration time for job locks
       */
  var lockDuration: js.UndefOr[scala.Double] = js.undefined
  /**
       * Max amount of times a stalled job will be re-processed
       */
  var maxStalledCount: js.UndefOr[scala.Double] = js.undefined
  /**
       * Delay before processing next job in case of internal error
       */
  var retryProcessDelay: js.UndefOr[scala.Double] = js.undefined
  /**
       * How often check for stalled jobs (use 0 for never checking)
       */
  var stalledInterval: js.UndefOr[scala.Double] = js.undefined
}

