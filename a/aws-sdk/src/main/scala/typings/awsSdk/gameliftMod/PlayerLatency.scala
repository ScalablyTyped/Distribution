package typings.awsSdk.gameliftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PlayerLatency extends js.Object {
  /**
    * Amount of time that represents the time lag experienced by the player when connected to the specified Region.
    */
  var LatencyInMilliseconds: js.UndefOr[Float] = js.native
  /**
    * A unique identifier for a player associated with the latency data.
    */
  var PlayerId: js.UndefOr[NonZeroAndMaxString] = js.native
  /**
    * Name of the Region that is associated with the latency value.
    */
  var RegionIdentifier: js.UndefOr[NonZeroAndMaxString] = js.native
}

object PlayerLatency {
  @scala.inline
  def apply(
    LatencyInMilliseconds: js.UndefOr[Float] = js.undefined,
    PlayerId: NonZeroAndMaxString = null,
    RegionIdentifier: NonZeroAndMaxString = null
  ): PlayerLatency = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(LatencyInMilliseconds)) __obj.updateDynamic("LatencyInMilliseconds")(LatencyInMilliseconds.get.asInstanceOf[js.Any])
    if (PlayerId != null) __obj.updateDynamic("PlayerId")(PlayerId.asInstanceOf[js.Any])
    if (RegionIdentifier != null) __obj.updateDynamic("RegionIdentifier")(RegionIdentifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlayerLatency]
  }
}

