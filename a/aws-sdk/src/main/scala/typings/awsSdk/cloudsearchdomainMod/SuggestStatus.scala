package typings.awsSdk.cloudsearchdomainMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SuggestStatus extends js.Object {
  /**
    * The encrypted resource ID for the request.
    */
  var rid: js.UndefOr[String] = js.native
  /**
    * How long it took to process the request, in milliseconds.
    */
  var timems: js.UndefOr[Long] = js.native
}

object SuggestStatus {
  @scala.inline
  def apply(rid: String = null, timems: Int | scala.Double = null): SuggestStatus = {
    val __obj = js.Dynamic.literal()
    if (rid != null) __obj.updateDynamic("rid")(rid.asInstanceOf[js.Any])
    if (timems != null) __obj.updateDynamic("timems")(timems.asInstanceOf[js.Any])
    __obj.asInstanceOf[SuggestStatus]
  }
}

