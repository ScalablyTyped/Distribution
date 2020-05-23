package typings.awsSdk.cloudsearchdomainMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SearchStatus extends js.Object {
  /**
    * The encrypted resource ID for the request.
    */
  var rid: js.UndefOr[String] = js.native
  /**
    * How long it took to process the request, in milliseconds.
    */
  var timems: js.UndefOr[Long] = js.native
}

object SearchStatus {
  @scala.inline
  def apply(rid: String = null, timems: js.UndefOr[Long] = js.undefined): SearchStatus = {
    val __obj = js.Dynamic.literal()
    if (rid != null) __obj.updateDynamic("rid")(rid.asInstanceOf[js.Any])
    if (!js.isUndefined(timems)) __obj.updateDynamic("timems")(timems.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchStatus]
  }
}

