package typings.awsSdk.quicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListIngestionsRequest extends StObject {
  
  /**
    * The AWS account ID.
    */
  var AwsAccountId: typings.awsSdk.quicksightMod.AwsAccountId
  
  /**
    * The ID of the dataset used in the ingestion.
    */
  var DataSetId: java.lang.String
  
  /**
    * The maximum number of results to be returned per request.
    */
  var MaxResults: js.UndefOr[IngestionMaxResults] = js.undefined
  
  /**
    * The token for the next set of results, or null if there are no more results.
    */
  var NextToken: js.UndefOr[java.lang.String] = js.undefined
}
object ListIngestionsRequest {
  
  @scala.inline
  def apply(AwsAccountId: AwsAccountId, DataSetId: java.lang.String): ListIngestionsRequest = {
    val __obj = js.Dynamic.literal(AwsAccountId = AwsAccountId.asInstanceOf[js.Any], DataSetId = DataSetId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListIngestionsRequest]
  }
  
  @scala.inline
  implicit class ListIngestionsRequestMutableBuilder[Self <: ListIngestionsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAwsAccountId(value: AwsAccountId): Self = StObject.set(x, "AwsAccountId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataSetId(value: java.lang.String): Self = StObject.set(x, "DataSetId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxResults(value: IngestionMaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    @scala.inline
    def setNextToken(value: java.lang.String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
