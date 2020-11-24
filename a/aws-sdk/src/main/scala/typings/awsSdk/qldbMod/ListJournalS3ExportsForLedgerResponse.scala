package typings.awsSdk.qldbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListJournalS3ExportsForLedgerResponse extends js.Object {
  
  /**
    * The array of journal export job descriptions that are associated with the specified ledger.
    */
  var JournalS3Exports: js.UndefOr[JournalS3ExportList] = js.native
  
  /**
    *   If NextToken is empty, then the last page of results has been processed and there are no more results to be retrieved.   If NextToken is not empty, then there are more results available. To retrieve the next page of results, use the value of NextToken in a subsequent ListJournalS3ExportsForLedger call.  
    */
  var NextToken: js.UndefOr[typings.awsSdk.qldbMod.NextToken] = js.native
}
object ListJournalS3ExportsForLedgerResponse {
  
  @scala.inline
  def apply(): ListJournalS3ExportsForLedgerResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListJournalS3ExportsForLedgerResponse]
  }
  
  @scala.inline
  implicit class ListJournalS3ExportsForLedgerResponseOps[Self <: ListJournalS3ExportsForLedgerResponse] (val x: Self) extends AnyVal {
    
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
    def setJournalS3ExportsVarargs(value: JournalS3ExportDescription*): Self = this.set("JournalS3Exports", js.Array(value :_*))
    
    @scala.inline
    def setJournalS3Exports(value: JournalS3ExportList): Self = this.set("JournalS3Exports", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteJournalS3Exports: Self = this.set("JournalS3Exports", js.undefined)
    
    @scala.inline
    def setNextToken(value: NextToken): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
  }
}
