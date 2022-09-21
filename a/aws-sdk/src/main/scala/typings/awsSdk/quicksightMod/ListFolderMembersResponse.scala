package typings.awsSdk.quicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListFolderMembersResponse extends StObject {
  
  /**
    * A structure that contains all of the folder members (dashboards, analyses, and datasets) in the folder.
    */
  var FolderMemberList: js.UndefOr[typings.awsSdk.quicksightMod.FolderMemberList] = js.undefined
  
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
object ListFolderMembersResponse {
  
  inline def apply(): ListFolderMembersResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListFolderMembersResponse]
  }
  
  extension [Self <: ListFolderMembersResponse](x: Self) {
    
    inline def setFolderMemberList(value: FolderMemberList): Self = StObject.set(x, "FolderMemberList", value.asInstanceOf[js.Any])
    
    inline def setFolderMemberListUndefined: Self = StObject.set(x, "FolderMemberList", js.undefined)
    
    inline def setFolderMemberListVarargs(value: MemberIdArnPair*): Self = StObject.set(x, "FolderMemberList", js.Array(value*))
    
    inline def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setRequestId(value: String): Self = StObject.set(x, "RequestId", value.asInstanceOf[js.Any])
    
    inline def setRequestIdUndefined: Self = StObject.set(x, "RequestId", js.undefined)
    
    inline def setStatus(value: StatusCode): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
  }
}
