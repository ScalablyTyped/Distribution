package typings.awsSdk.devicefarmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListOfferingsResult extends js.Object {
  /**
    * An identifier that was returned from the previous call to this operation, which can be used to return the next set of items in the list.
    */
  var nextToken: js.UndefOr[PaginationToken] = js.native
  /**
    * A value that represents the list offering results.
    */
  var offerings: js.UndefOr[Offerings] = js.native
}

object ListOfferingsResult {
  @scala.inline
  def apply(): ListOfferingsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListOfferingsResult]
  }
  @scala.inline
  implicit class ListOfferingsResultOps[Self <: ListOfferingsResult] (val x: Self) extends AnyVal {
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
    def setNextToken(value: PaginationToken): Self = this.set("nextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("nextToken", js.undefined)
    @scala.inline
    def setOfferingsVarargs(value: Offering*): Self = this.set("offerings", js.Array(value :_*))
    @scala.inline
    def setOfferings(value: Offerings): Self = this.set("offerings", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOfferings: Self = this.set("offerings", js.undefined)
  }
  
}

