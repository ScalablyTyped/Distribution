package typings.atAwsDashSdkClientDashS3DashBrowser.typesUnderscoreRequestProgressMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _RequestProgress extends js.Object {
  /**
    * <p>Specifies whether periodic QueryProgress frames should be sent. Valid values: TRUE, FALSE. Default value: FALSE.</p>
    */
  var Enabled: js.UndefOr[Boolean] = js.undefined
}

object _RequestProgress {
  @scala.inline
  def apply(Enabled: js.UndefOr[Boolean] = js.undefined): _RequestProgress = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(Enabled)) __obj.updateDynamic("Enabled")(Enabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[_RequestProgress]
  }
}

