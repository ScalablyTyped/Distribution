package typings.awsSdk.iottwinmakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListWorkspacesResponse extends StObject {
  
  /**
    * The string that specifies the next page of results.
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
  
  /**
    * A list of objects that contain information about the workspaces.
    */
  var workspaceSummaries: js.UndefOr[WorkspaceSummaries] = js.undefined
}
object ListWorkspacesResponse {
  
  inline def apply(): ListWorkspacesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListWorkspacesResponse]
  }
  
  extension [Self <: ListWorkspacesResponse](x: Self) {
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    inline def setWorkspaceSummaries(value: WorkspaceSummaries): Self = StObject.set(x, "workspaceSummaries", value.asInstanceOf[js.Any])
    
    inline def setWorkspaceSummariesUndefined: Self = StObject.set(x, "workspaceSummaries", js.undefined)
    
    inline def setWorkspaceSummariesVarargs(value: WorkspaceSummary*): Self = StObject.set(x, "workspaceSummaries", js.Array(value*))
  }
}
