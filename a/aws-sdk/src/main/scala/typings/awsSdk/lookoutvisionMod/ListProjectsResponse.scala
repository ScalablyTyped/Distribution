package typings.awsSdk.lookoutvisionMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListProjectsResponse extends StObject {
  
  /**
    * If the response is truncated, Amazon Lookout for Vision returns this token that you can use in the subsequent request to retrieve the next set of projects.
    */
  var NextToken: js.UndefOr[PaginationToken] = js.undefined
  
  /**
    * A list of projects in your AWS account.
    */
  var Projects: js.UndefOr[ProjectMetadataList] = js.undefined
}
object ListProjectsResponse {
  
  inline def apply(): ListProjectsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListProjectsResponse]
  }
  
  extension [Self <: ListProjectsResponse](x: Self) {
    
    inline def setNextToken(value: PaginationToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setProjects(value: ProjectMetadataList): Self = StObject.set(x, "Projects", value.asInstanceOf[js.Any])
    
    inline def setProjectsUndefined: Self = StObject.set(x, "Projects", js.undefined)
    
    inline def setProjectsVarargs(value: ProjectMetadata*): Self = StObject.set(x, "Projects", js.Array(value*))
  }
}
