package typings.awsSdk.iotsitewiseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MetricWindow extends js.Object {
  /**
    * The tumbling time interval window.
    */
  var tumbling: js.UndefOr[TumblingWindow] = js.native
}

object MetricWindow {
  @scala.inline
  def apply(tumbling: TumblingWindow = null): MetricWindow = {
    val __obj = js.Dynamic.literal()
    if (tumbling != null) __obj.updateDynamic("tumbling")(tumbling.asInstanceOf[js.Any])
    __obj.asInstanceOf[MetricWindow]
  }
}

