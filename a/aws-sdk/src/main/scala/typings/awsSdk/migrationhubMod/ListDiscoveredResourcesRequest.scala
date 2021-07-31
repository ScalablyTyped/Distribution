package typings.awsSdk.migrationhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListDiscoveredResourcesRequest extends StObject {
  
  /**
    * The maximum number of results returned per page.
    */
  var MaxResults: js.UndefOr[MaxResultsResources] = js.undefined
  
  /**
    * The name of the MigrationTask. Do not store personal data in this field. 
    */
  var MigrationTaskName: typings.awsSdk.migrationhubMod.MigrationTaskName
  
  /**
    * If a NextToken was returned by a previous call, there are more results available. To retrieve the next page of results, make the call again using the returned token in NextToken.
    */
  var NextToken: js.UndefOr[Token] = js.undefined
  
  /**
    * The name of the ProgressUpdateStream.
    */
  var ProgressUpdateStream: typings.awsSdk.migrationhubMod.ProgressUpdateStream
}
object ListDiscoveredResourcesRequest {
  
  @scala.inline
  def apply(MigrationTaskName: MigrationTaskName, ProgressUpdateStream: ProgressUpdateStream): ListDiscoveredResourcesRequest = {
    val __obj = js.Dynamic.literal(MigrationTaskName = MigrationTaskName.asInstanceOf[js.Any], ProgressUpdateStream = ProgressUpdateStream.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListDiscoveredResourcesRequest]
  }
  
  @scala.inline
  implicit class ListDiscoveredResourcesRequestMutableBuilder[Self <: ListDiscoveredResourcesRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMaxResults(value: MaxResultsResources): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    @scala.inline
    def setMigrationTaskName(value: MigrationTaskName): Self = StObject.set(x, "MigrationTaskName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextToken(value: Token): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    @scala.inline
    def setProgressUpdateStream(value: ProgressUpdateStream): Self = StObject.set(x, "ProgressUpdateStream", value.asInstanceOf[js.Any])
  }
}
