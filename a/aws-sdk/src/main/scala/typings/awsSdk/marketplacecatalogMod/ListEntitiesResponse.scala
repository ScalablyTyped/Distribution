package typings.awsSdk.marketplacecatalogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListEntitiesResponse extends js.Object {
  /**
    *  Array of EntitySummary object.
    */
  var EntitySummaryList: js.UndefOr[typings.awsSdk.marketplacecatalogMod.EntitySummaryList] = js.native
  /**
    * The value of the next token if it exists. Null if there is no more result.
    */
  var NextToken: js.UndefOr[typings.awsSdk.marketplacecatalogMod.NextToken] = js.native
}

object ListEntitiesResponse {
  @scala.inline
  def apply(): ListEntitiesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListEntitiesResponse]
  }
  @scala.inline
  implicit class ListEntitiesResponseOps[Self <: ListEntitiesResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setEntitySummaryListVarargs(value: EntitySummary*): Self = this.set("EntitySummaryList", js.Array(value :_*))
    @scala.inline
    def setEntitySummaryList(value: EntitySummaryList): Self = this.set("EntitySummaryList", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEntitySummaryList: Self = this.set("EntitySummaryList", js.undefined)
    @scala.inline
    def setNextToken(value: NextToken): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
  }
  
}

