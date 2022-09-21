package typings.awsSdk.evidentlyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListFeaturesRequest extends StObject {
  
  /**
    * The maximum number of results to include in the response.
    */
  var maxResults: js.UndefOr[MaxFeatures] = js.undefined
  
  /**
    * The token to use when requesting the next set of results. You received this token from a previous ListFeatures operation.
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
  
  /**
    * The name or ARN of the project to return the feature list from.
    */
  var project: ProjectRef
}
object ListFeaturesRequest {
  
  inline def apply(project: ProjectRef): ListFeaturesRequest = {
    val __obj = js.Dynamic.literal(project = project.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListFeaturesRequest]
  }
  
  extension [Self <: ListFeaturesRequest](x: Self) {
    
    inline def setMaxResults(value: MaxFeatures): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    inline def setProject(value: ProjectRef): Self = StObject.set(x, "project", value.asInstanceOf[js.Any])
  }
}
