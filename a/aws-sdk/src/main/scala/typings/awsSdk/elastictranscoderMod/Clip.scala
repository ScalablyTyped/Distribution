package typings.awsSdk.elastictranscoderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Clip extends js.Object {
  /**
    * Settings that determine when a clip begins and how long it lasts.
    */
  var TimeSpan: js.UndefOr[typings.awsSdk.elastictranscoderMod.TimeSpan] = js.native
}

object Clip {
  @scala.inline
  def apply(TimeSpan: TimeSpan = null): Clip = {
    val __obj = js.Dynamic.literal()
    if (TimeSpan != null) __obj.updateDynamic("TimeSpan")(TimeSpan.asInstanceOf[js.Any])
    __obj.asInstanceOf[Clip]
  }
}

