package typings.awsSdk.dataexchangeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListDataSetRevisionsResponse extends js.Object {
  
  /**
    * The token value retrieved from a previous call to access the next page of results.
    */
  var NextToken: js.UndefOr[typings.awsSdk.dataexchangeMod.NextToken] = js.native
  
  /**
    * The asset objects listed by the request.
    */
  var Revisions: js.UndefOr[ListOfRevisionEntry] = js.native
}
object ListDataSetRevisionsResponse {
  
  @scala.inline
  def apply(): ListDataSetRevisionsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListDataSetRevisionsResponse]
  }
  
  @scala.inline
  implicit class ListDataSetRevisionsResponseOps[Self <: ListDataSetRevisionsResponse] (val x: Self) extends AnyVal {
    
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
    def setNextToken(value: NextToken): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
    
    @scala.inline
    def setRevisionsVarargs(value: RevisionEntry*): Self = this.set("Revisions", js.Array(value :_*))
    
    @scala.inline
    def setRevisions(value: ListOfRevisionEntry): Self = this.set("Revisions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRevisions: Self = this.set("Revisions", js.undefined)
  }
}
