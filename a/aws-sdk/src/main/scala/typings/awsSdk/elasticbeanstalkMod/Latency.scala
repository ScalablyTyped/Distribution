package typings.awsSdk.elasticbeanstalkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Latency extends js.Object {
  /**
    * The average latency for the slowest 90 percent of requests over the last 10 seconds.
    */
  var P10: js.UndefOr[NullableDouble] = js.native
  /**
    * The average latency for the slowest 50 percent of requests over the last 10 seconds.
    */
  var P50: js.UndefOr[NullableDouble] = js.native
  /**
    * The average latency for the slowest 25 percent of requests over the last 10 seconds.
    */
  var P75: js.UndefOr[NullableDouble] = js.native
  /**
    * The average latency for the slowest 15 percent of requests over the last 10 seconds.
    */
  var P85: js.UndefOr[NullableDouble] = js.native
  /**
    * The average latency for the slowest 10 percent of requests over the last 10 seconds.
    */
  var P90: js.UndefOr[NullableDouble] = js.native
  /**
    * The average latency for the slowest 5 percent of requests over the last 10 seconds.
    */
  var P95: js.UndefOr[NullableDouble] = js.native
  /**
    * The average latency for the slowest 1 percent of requests over the last 10 seconds.
    */
  var P99: js.UndefOr[NullableDouble] = js.native
  /**
    * The average latency for the slowest 0.1 percent of requests over the last 10 seconds.
    */
  var P999: js.UndefOr[NullableDouble] = js.native
}

object Latency {
  @scala.inline
  def apply(
    P10: Int | Double = null,
    P50: Int | Double = null,
    P75: Int | Double = null,
    P85: Int | Double = null,
    P90: Int | Double = null,
    P95: Int | Double = null,
    P99: Int | Double = null,
    P999: Int | Double = null
  ): Latency = {
    val __obj = js.Dynamic.literal()
    if (P10 != null) __obj.updateDynamic("P10")(P10.asInstanceOf[js.Any])
    if (P50 != null) __obj.updateDynamic("P50")(P50.asInstanceOf[js.Any])
    if (P75 != null) __obj.updateDynamic("P75")(P75.asInstanceOf[js.Any])
    if (P85 != null) __obj.updateDynamic("P85")(P85.asInstanceOf[js.Any])
    if (P90 != null) __obj.updateDynamic("P90")(P90.asInstanceOf[js.Any])
    if (P95 != null) __obj.updateDynamic("P95")(P95.asInstanceOf[js.Any])
    if (P99 != null) __obj.updateDynamic("P99")(P99.asInstanceOf[js.Any])
    if (P999 != null) __obj.updateDynamic("P999")(P999.asInstanceOf[js.Any])
    __obj.asInstanceOf[Latency]
  }
}

