package typings.awsSdk.servicecatalogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListRecordHistoryOutput extends js.Object {
  
  /**
    * The page token to use to retrieve the next set of results. If there are no additional results, this value is null.
    */
  var NextPageToken: js.UndefOr[PageToken] = js.native
  
  /**
    * The records, in reverse chronological order.
    */
  var RecordDetails: js.UndefOr[typings.awsSdk.servicecatalogMod.RecordDetails] = js.native
}
object ListRecordHistoryOutput {
  
  @scala.inline
  def apply(): ListRecordHistoryOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListRecordHistoryOutput]
  }
  
  @scala.inline
  implicit class ListRecordHistoryOutputOps[Self <: ListRecordHistoryOutput] (val x: Self) extends AnyVal {
    
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
    def setNextPageToken(value: PageToken): Self = this.set("NextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextPageToken: Self = this.set("NextPageToken", js.undefined)
    
    @scala.inline
    def setRecordDetailsVarargs(value: RecordDetail*): Self = this.set("RecordDetails", js.Array(value :_*))
    
    @scala.inline
    def setRecordDetails(value: RecordDetails): Self = this.set("RecordDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRecordDetails: Self = this.set("RecordDetails", js.undefined)
  }
}
