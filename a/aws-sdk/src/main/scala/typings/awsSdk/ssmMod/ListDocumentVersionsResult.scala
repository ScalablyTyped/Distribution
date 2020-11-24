package typings.awsSdk.ssmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListDocumentVersionsResult extends js.Object {
  
  /**
    * The document versions.
    */
  var DocumentVersions: js.UndefOr[DocumentVersionList] = js.native
  
  /**
    * The token to use when requesting the next set of items. If there are no additional items to return, the string is empty.
    */
  var NextToken: js.UndefOr[typings.awsSdk.ssmMod.NextToken] = js.native
}
object ListDocumentVersionsResult {
  
  @scala.inline
  def apply(): ListDocumentVersionsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListDocumentVersionsResult]
  }
  
  @scala.inline
  implicit class ListDocumentVersionsResultOps[Self <: ListDocumentVersionsResult] (val x: Self) extends AnyVal {
    
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
    def setDocumentVersionsVarargs(value: DocumentVersionInfo*): Self = this.set("DocumentVersions", js.Array(value :_*))
    
    @scala.inline
    def setDocumentVersions(value: DocumentVersionList): Self = this.set("DocumentVersions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDocumentVersions: Self = this.set("DocumentVersions", js.undefined)
    
    @scala.inline
    def setNextToken(value: NextToken): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
  }
}
