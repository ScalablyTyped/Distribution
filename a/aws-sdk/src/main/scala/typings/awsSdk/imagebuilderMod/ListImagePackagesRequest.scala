package typings.awsSdk.imagebuilderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListImagePackagesRequest extends StObject {
  
  /**
    * Filter results for the ListImagePackages request by the Image Build Version ARN
    */
  var imageBuildVersionArn: ImageBuildVersionArn
  
  /**
    * The maxiumum number of results to return from the ListImagePackages request.
    */
  var maxResults: js.UndefOr[RestrictedInteger] = js.undefined
  
  /**
    * A token to specify where to start paginating. This is the NextToken from a previously truncated response.
    */
  var nextToken: js.UndefOr[PaginationToken] = js.undefined
}
object ListImagePackagesRequest {
  
  inline def apply(imageBuildVersionArn: ImageBuildVersionArn): ListImagePackagesRequest = {
    val __obj = js.Dynamic.literal(imageBuildVersionArn = imageBuildVersionArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListImagePackagesRequest]
  }
  
  extension [Self <: ListImagePackagesRequest](x: Self) {
    
    inline def setImageBuildVersionArn(value: ImageBuildVersionArn): Self = StObject.set(x, "imageBuildVersionArn", value.asInstanceOf[js.Any])
    
    inline def setMaxResults(value: RestrictedInteger): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    inline def setNextToken(value: PaginationToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
