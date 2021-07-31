package typings.awsSdk.discoveryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListServerNeighborsRequest extends StObject {
  
  /**
    * Configuration ID of the server for which neighbors are being listed.
    */
  var configurationId: ConfigurationId
  
  /**
    * Maximum number of results to return in a single page of output.
    */
  var maxResults: js.UndefOr[Integer] = js.undefined
  
  /**
    * List of configuration IDs to test for one-hop-away.
    */
  var neighborConfigurationIds: js.UndefOr[ConfigurationIdList] = js.undefined
  
  /**
    * Token to retrieve the next set of results. For example, if you previously specified 100 IDs for ListServerNeighborsRequest$neighborConfigurationIds but set ListServerNeighborsRequest$maxResults to 10, you received a set of 10 results along with a token. Use that token in this query to get the next set of 10.
    */
  var nextToken: js.UndefOr[String] = js.undefined
  
  /**
    * Flag to indicate if port and protocol information is needed as part of the response.
    */
  var portInformationNeeded: js.UndefOr[Boolean] = js.undefined
}
object ListServerNeighborsRequest {
  
  @scala.inline
  def apply(configurationId: ConfigurationId): ListServerNeighborsRequest = {
    val __obj = js.Dynamic.literal(configurationId = configurationId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListServerNeighborsRequest]
  }
  
  @scala.inline
  implicit class ListServerNeighborsRequestMutableBuilder[Self <: ListServerNeighborsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConfigurationId(value: ConfigurationId): Self = StObject.set(x, "configurationId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxResults(value: Integer): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    @scala.inline
    def setNeighborConfigurationIds(value: ConfigurationIdList): Self = StObject.set(x, "neighborConfigurationIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNeighborConfigurationIdsUndefined: Self = StObject.set(x, "neighborConfigurationIds", js.undefined)
    
    @scala.inline
    def setNeighborConfigurationIdsVarargs(value: ConfigurationId*): Self = StObject.set(x, "neighborConfigurationIds", js.Array(value :_*))
    
    @scala.inline
    def setNextToken(value: String): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    @scala.inline
    def setPortInformationNeeded(value: Boolean): Self = StObject.set(x, "portInformationNeeded", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPortInformationNeededUndefined: Self = StObject.set(x, "portInformationNeeded", js.undefined)
  }
}
