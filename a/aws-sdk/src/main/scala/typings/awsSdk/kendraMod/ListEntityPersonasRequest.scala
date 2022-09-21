package typings.awsSdk.kendraMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListEntityPersonasRequest extends StObject {
  
  /**
    * The identifier of your Amazon Kendra experience.
    */
  var Id: ExperienceId
  
  /**
    * The identifier of the index for your Amazon Kendra experience.
    */
  var IndexId: typings.awsSdk.kendraMod.IndexId
  
  /**
    * The maximum number of returned users or groups.
    */
  var MaxResults: js.UndefOr[MaxResultsIntegerForListEntityPersonasRequest] = js.undefined
  
  /**
    * If the previous response was incomplete (because there is more data to retrieve), Amazon Kendra returns a pagination token in the response. You can use this pagination token to retrieve the next set of users or groups.
    */
  var NextToken: js.UndefOr[typings.awsSdk.kendraMod.NextToken] = js.undefined
}
object ListEntityPersonasRequest {
  
  inline def apply(Id: ExperienceId, IndexId: IndexId): ListEntityPersonasRequest = {
    val __obj = js.Dynamic.literal(Id = Id.asInstanceOf[js.Any], IndexId = IndexId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListEntityPersonasRequest]
  }
  
  extension [Self <: ListEntityPersonasRequest](x: Self) {
    
    inline def setId(value: ExperienceId): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    inline def setIndexId(value: IndexId): Self = StObject.set(x, "IndexId", value.asInstanceOf[js.Any])
    
    inline def setMaxResults(value: MaxResultsIntegerForListEntityPersonasRequest): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
