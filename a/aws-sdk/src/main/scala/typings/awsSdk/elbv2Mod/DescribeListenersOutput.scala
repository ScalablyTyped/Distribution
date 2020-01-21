package typings.awsSdk.elbv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeListenersOutput extends js.Object {
  /**
    * Information about the listeners.
    */
  var Listeners: js.UndefOr[typings.awsSdk.elbv2Mod.Listeners] = js.native
  /**
    * If there are additional results, this is the marker for the next set of results. Otherwise, this is null.
    */
  var NextMarker: js.UndefOr[Marker] = js.native
}

object DescribeListenersOutput {
  @scala.inline
  def apply(Listeners: Listeners = null, NextMarker: Marker = null): DescribeListenersOutput = {
    val __obj = js.Dynamic.literal()
    if (Listeners != null) __obj.updateDynamic("Listeners")(Listeners.asInstanceOf[js.Any])
    if (NextMarker != null) __obj.updateDynamic("NextMarker")(NextMarker.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeListenersOutput]
  }
}

