package typings.awsSdk.devicefarmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetOfferingStatusResult extends js.Object {
  /**
    * When specified, gets the offering status for the current period.
    */
  var current: js.UndefOr[OfferingStatusMap] = js.native
  /**
    * When specified, gets the offering status for the next period.
    */
  var nextPeriod: js.UndefOr[OfferingStatusMap] = js.native
  /**
    * An identifier that was returned from the previous call to this operation, which can be used to return the next set of items in the list.
    */
  var nextToken: js.UndefOr[PaginationToken] = js.native
}

object GetOfferingStatusResult {
  @scala.inline
  def apply(
    current: OfferingStatusMap = null,
    nextPeriod: OfferingStatusMap = null,
    nextToken: PaginationToken = null
  ): GetOfferingStatusResult = {
    val __obj = js.Dynamic.literal()
    if (current != null) __obj.updateDynamic("current")(current.asInstanceOf[js.Any])
    if (nextPeriod != null) __obj.updateDynamic("nextPeriod")(nextPeriod.asInstanceOf[js.Any])
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetOfferingStatusResult]
  }
}

