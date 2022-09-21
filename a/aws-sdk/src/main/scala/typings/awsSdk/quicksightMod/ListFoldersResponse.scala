package typings.awsSdk.quicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListFoldersResponse extends StObject {
  
  /**
    * A structure that contains all of the folders in the Amazon Web Services account. This structure provides basic information about the folders.
    */
  var FolderSummaryList: js.UndefOr[typings.awsSdk.quicksightMod.FolderSummaryList] = js.undefined
  
  /**
    * The token for the next set of results, or null if there are no more results.
    */
  var NextToken: js.UndefOr[String] = js.undefined
  
  /**
    * The Amazon Web Services request ID for this operation.
    */
  var RequestId: js.UndefOr[String] = js.undefined
  
  /**
    * The HTTP status of the request.
    */
  var Status: js.UndefOr[StatusCode] = js.undefined
}
object ListFoldersResponse {
  
  inline def apply(): ListFoldersResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListFoldersResponse]
  }
  
  extension [Self <: ListFoldersResponse](x: Self) {
    
    inline def setFolderSummaryList(value: FolderSummaryList): Self = StObject.set(x, "FolderSummaryList", value.asInstanceOf[js.Any])
    
    inline def setFolderSummaryListUndefined: Self = StObject.set(x, "FolderSummaryList", js.undefined)
    
    inline def setFolderSummaryListVarargs(value: FolderSummary*): Self = StObject.set(x, "FolderSummaryList", js.Array(value*))
    
    inline def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setRequestId(value: String): Self = StObject.set(x, "RequestId", value.asInstanceOf[js.Any])
    
    inline def setRequestIdUndefined: Self = StObject.set(x, "RequestId", js.undefined)
    
    inline def setStatus(value: StatusCode): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
  }
}
