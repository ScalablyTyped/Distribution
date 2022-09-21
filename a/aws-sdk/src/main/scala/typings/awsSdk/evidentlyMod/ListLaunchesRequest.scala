package typings.awsSdk.evidentlyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListLaunchesRequest extends StObject {
  
  /**
    * The maximum number of results to include in the response.
    */
  var maxResults: js.UndefOr[MaxLaunches] = js.undefined
  
  /**
    * The token to use when requesting the next set of results. You received this token from a previous ListLaunches operation.
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
  
  /**
    * The name or ARN of the project to return the launch list from.
    */
  var project: ProjectRef
  
  /**
    * Use this optional parameter to limit the returned results to only the launches with the status that you specify here.
    */
  var status: js.UndefOr[LaunchStatus] = js.undefined
}
object ListLaunchesRequest {
  
  inline def apply(project: ProjectRef): ListLaunchesRequest = {
    val __obj = js.Dynamic.literal(project = project.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListLaunchesRequest]
  }
  
  extension [Self <: ListLaunchesRequest](x: Self) {
    
    inline def setMaxResults(value: MaxLaunches): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    inline def setProject(value: ProjectRef): Self = StObject.set(x, "project", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: LaunchStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
