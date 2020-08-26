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
  def apply(): GetOfferingStatusResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetOfferingStatusResult]
  }
  @scala.inline
  implicit class GetOfferingStatusResultOps[Self <: GetOfferingStatusResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCurrent(value: OfferingStatusMap): Self = this.set("current", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCurrent: Self = this.set("current", js.undefined)
    @scala.inline
    def setNextPeriod(value: OfferingStatusMap): Self = this.set("nextPeriod", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextPeriod: Self = this.set("nextPeriod", js.undefined)
    @scala.inline
    def setNextToken(value: PaginationToken): Self = this.set("nextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("nextToken", js.undefined)
  }
  
}

