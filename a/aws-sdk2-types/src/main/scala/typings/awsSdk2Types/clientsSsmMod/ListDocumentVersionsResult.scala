package typings.awsSdk2Types.clientsSsmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListDocumentVersionsResult extends StObject {
  
  /**
    * The document versions.
    */
  var DocumentVersions: js.UndefOr[DocumentVersionList] = js.undefined
  
  /**
    * The token to use when requesting the next set of items. If there are no additional items to return, the string is empty.
    */
  var NextToken: js.UndefOr[typings.awsSdk2Types.clientsSsmMod.NextToken] = js.undefined
}
object ListDocumentVersionsResult {
  
  inline def apply(): ListDocumentVersionsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListDocumentVersionsResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListDocumentVersionsResult] (val x: Self) extends AnyVal {
    
    inline def setDocumentVersions(value: DocumentVersionList): Self = StObject.set(x, "DocumentVersions", value.asInstanceOf[js.Any])
    
    inline def setDocumentVersionsUndefined: Self = StObject.set(x, "DocumentVersions", js.undefined)
    
    inline def setDocumentVersionsVarargs(value: DocumentVersionInfo*): Self = StObject.set(x, "DocumentVersions", js.Array(value*))
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
