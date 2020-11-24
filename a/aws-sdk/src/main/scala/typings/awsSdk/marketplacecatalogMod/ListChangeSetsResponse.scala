package typings.awsSdk.marketplacecatalogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListChangeSetsResponse extends js.Object {
  
  /**
    *  Array of ChangeSetSummaryListItem objects.
    */
  var ChangeSetSummaryList: js.UndefOr[typings.awsSdk.marketplacecatalogMod.ChangeSetSummaryList] = js.native
  
  /**
    * The value of the next token, if it exists. Null if there are no more results.
    */
  var NextToken: js.UndefOr[typings.awsSdk.marketplacecatalogMod.NextToken] = js.native
}
object ListChangeSetsResponse {
  
  @scala.inline
  def apply(): ListChangeSetsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListChangeSetsResponse]
  }
  
  @scala.inline
  implicit class ListChangeSetsResponseOps[Self <: ListChangeSetsResponse] (val x: Self) extends AnyVal {
    
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
    def setChangeSetSummaryListVarargs(value: ChangeSetSummaryListItem*): Self = this.set("ChangeSetSummaryList", js.Array(value :_*))
    
    @scala.inline
    def setChangeSetSummaryList(value: ChangeSetSummaryList): Self = this.set("ChangeSetSummaryList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChangeSetSummaryList: Self = this.set("ChangeSetSummaryList", js.undefined)
    
    @scala.inline
    def setNextToken(value: NextToken): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
  }
}
