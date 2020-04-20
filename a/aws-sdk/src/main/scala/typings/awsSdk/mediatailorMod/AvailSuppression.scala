package typings.awsSdk.mediatailorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AvailSuppression extends js.Object {
  /**
    * Sets the mode for avail suppression, also known as ad suppression. By default, ad suppression is off and all ad breaks are filled by MediaTailor with ads or slate.
    */
  var Mode: js.UndefOr[typings.awsSdk.mediatailorMod.Mode] = js.native
  /**
    * The avail suppression value is a live edge offset time in HH:MM:SS. MediaTailor won't fill ad breaks on or behind this time in the manifest lookback window. 
    */
  var Value: js.UndefOr[string] = js.native
}

object AvailSuppression {
  @scala.inline
  def apply(Mode: Mode = null, Value: string = null): AvailSuppression = {
    val __obj = js.Dynamic.literal()
    if (Mode != null) __obj.updateDynamic("Mode")(Mode.asInstanceOf[js.Any])
    if (Value != null) __obj.updateDynamic("Value")(Value.asInstanceOf[js.Any])
    __obj.asInstanceOf[AvailSuppression]
  }
}

