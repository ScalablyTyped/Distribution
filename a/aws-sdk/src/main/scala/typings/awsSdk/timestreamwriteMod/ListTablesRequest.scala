package typings.awsSdk.timestreamwriteMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListTablesRequest extends StObject {
  
  /**
    * The name of the Timestream database.
    */
  var DatabaseName: js.UndefOr[ResourceName] = js.native
  
  /**
    * The total number of items to return in the output. If the total number of items available is more than the value specified, a NextToken is provided in the output. To resume pagination, provide the NextToken value as argument of a subsequent API invocation.
    */
  var MaxResults: js.UndefOr[PaginationLimit] = js.native
  
  /**
    * The pagination token. To resume pagination, provide the NextToken value as argument of a subsequent API invocation.
    */
  var NextToken: js.UndefOr[String] = js.native
}
object ListTablesRequest {
  
  @scala.inline
  def apply(): ListTablesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListTablesRequest]
  }
  
  @scala.inline
  implicit class ListTablesRequestMutableBuilder[Self <: ListTablesRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDatabaseName(value: ResourceName): Self = StObject.set(x, "DatabaseName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDatabaseNameUndefined: Self = StObject.set(x, "DatabaseName", js.undefined)
    
    @scala.inline
    def setMaxResults(value: PaginationLimit): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    @scala.inline
    def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
