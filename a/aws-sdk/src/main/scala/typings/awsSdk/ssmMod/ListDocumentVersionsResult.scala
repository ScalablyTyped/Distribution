package typings.awsSdk.ssmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListDocumentVersionsResult extends StObject {
  
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
  implicit class ListDocumentVersionsResultMutableBuilder[Self <: ListDocumentVersionsResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDocumentVersions(value: DocumentVersionList): Self = StObject.set(x, "DocumentVersions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDocumentVersionsUndefined: Self = StObject.set(x, "DocumentVersions", js.undefined)
    
    @scala.inline
    def setDocumentVersionsVarargs(value: DocumentVersionInfo*): Self = StObject.set(x, "DocumentVersions", js.Array(value :_*))
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
