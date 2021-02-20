package typings.awsSdk.mturkMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListQualificationTypesRequest extends StObject {
  
  /**
    *  The maximum number of results to return in a single call. 
    */
  var MaxResults: js.UndefOr[ResultSize] = js.native
  
  /**
    *  Specifies that only Qualification types that the Requester created are returned. If false, the operation returns all Qualification types. 
    */
  var MustBeOwnedByCaller: js.UndefOr[Boolean] = js.native
  
  /**
    * Specifies that only Qualification types that a user can request through the Amazon Mechanical Turk web site, such as by taking a Qualification test, are returned as results of the search. Some Qualification types, such as those assigned automatically by the system, cannot be requested directly by users. If false, all Qualification types, including those managed by the system, are considered. Valid values are True | False. 
    */
  var MustBeRequestable: Boolean = js.native
  
  var NextToken: js.UndefOr[PaginationToken] = js.native
  
  /**
    *  A text query against all of the searchable attributes of Qualification types. 
    */
  var Query: js.UndefOr[String] = js.native
}
object ListQualificationTypesRequest {
  
  @scala.inline
  def apply(MustBeRequestable: Boolean): ListQualificationTypesRequest = {
    val __obj = js.Dynamic.literal(MustBeRequestable = MustBeRequestable.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListQualificationTypesRequest]
  }
  
  @scala.inline
  implicit class ListQualificationTypesRequestMutableBuilder[Self <: ListQualificationTypesRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMaxResults(value: ResultSize): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    @scala.inline
    def setMustBeOwnedByCaller(value: Boolean): Self = StObject.set(x, "MustBeOwnedByCaller", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMustBeOwnedByCallerUndefined: Self = StObject.set(x, "MustBeOwnedByCaller", js.undefined)
    
    @scala.inline
    def setMustBeRequestable(value: Boolean): Self = StObject.set(x, "MustBeRequestable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextToken(value: PaginationToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    @scala.inline
    def setQuery(value: String): Self = StObject.set(x, "Query", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQueryUndefined: Self = StObject.set(x, "Query", js.undefined)
  }
}
