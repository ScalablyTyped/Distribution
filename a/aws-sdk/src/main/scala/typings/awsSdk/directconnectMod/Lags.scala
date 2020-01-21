package typings.awsSdk.directconnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Lags extends js.Object {
  /**
    * The LAGs.
    */
  var lags: js.UndefOr[LagList] = js.native
}

object Lags {
  @scala.inline
  def apply(lags: LagList = null): Lags = {
    val __obj = js.Dynamic.literal()
    if (lags != null) __obj.updateDynamic("lags")(lags.asInstanceOf[js.Any])
    __obj.asInstanceOf[Lags]
  }
}

