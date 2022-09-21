package typings.awsSdk.ecsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListContainerInstancesResponse extends StObject {
  
  /**
    * The list of container instances with full ARN entries for each container instance associated with the specified cluster.
    */
  var containerInstanceArns: js.UndefOr[StringList] = js.undefined
  
  /**
    * The nextToken value to include in a future ListContainerInstances request. When the results of a ListContainerInstances request exceed maxResults, this value can be used to retrieve the next page of results. This value is null when there are no more results to return.
    */
  var nextToken: js.UndefOr[String] = js.undefined
}
object ListContainerInstancesResponse {
  
  inline def apply(): ListContainerInstancesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListContainerInstancesResponse]
  }
  
  extension [Self <: ListContainerInstancesResponse](x: Self) {
    
    inline def setContainerInstanceArns(value: StringList): Self = StObject.set(x, "containerInstanceArns", value.asInstanceOf[js.Any])
    
    inline def setContainerInstanceArnsUndefined: Self = StObject.set(x, "containerInstanceArns", js.undefined)
    
    inline def setContainerInstanceArnsVarargs(value: String*): Self = StObject.set(x, "containerInstanceArns", js.Array(value*))
    
    inline def setNextToken(value: String): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
