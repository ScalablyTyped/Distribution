package typings.awsSdk.discoveryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListServerNeighborsRequest extends js.Object {
  
  /**
    * Configuration ID of the server for which neighbors are being listed.
    */
  var configurationId: ConfigurationId = js.native
  
  /**
    * Maximum number of results to return in a single page of output.
    */
  var maxResults: js.UndefOr[Integer] = js.native
  
  /**
    * List of configuration IDs to test for one-hop-away.
    */
  var neighborConfigurationIds: js.UndefOr[ConfigurationIdList] = js.native
  
  /**
    * Token to retrieve the next set of results. For example, if you previously specified 100 IDs for ListServerNeighborsRequest$neighborConfigurationIds but set ListServerNeighborsRequest$maxResults to 10, you received a set of 10 results along with a token. Use that token in this query to get the next set of 10.
    */
  var nextToken: js.UndefOr[String] = js.native
  
  /**
    * Flag to indicate if port and protocol information is needed as part of the response.
    */
  var portInformationNeeded: js.UndefOr[Boolean] = js.native
}
object ListServerNeighborsRequest {
  
  @scala.inline
  def apply(configurationId: ConfigurationId): ListServerNeighborsRequest = {
    val __obj = js.Dynamic.literal(configurationId = configurationId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListServerNeighborsRequest]
  }
  
  @scala.inline
  implicit class ListServerNeighborsRequestOps[Self <: ListServerNeighborsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setConfigurationId(value: ConfigurationId): Self = this.set("configurationId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxResults(value: Integer): Self = this.set("maxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxResults: Self = this.set("maxResults", js.undefined)
    
    @scala.inline
    def setNeighborConfigurationIdsVarargs(value: ConfigurationId*): Self = this.set("neighborConfigurationIds", js.Array(value :_*))
    
    @scala.inline
    def setNeighborConfigurationIds(value: ConfigurationIdList): Self = this.set("neighborConfigurationIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNeighborConfigurationIds: Self = this.set("neighborConfigurationIds", js.undefined)
    
    @scala.inline
    def setNextToken(value: String): Self = this.set("nextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextToken: Self = this.set("nextToken", js.undefined)
    
    @scala.inline
    def setPortInformationNeeded(value: Boolean): Self = this.set("portInformationNeeded", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePortInformationNeeded: Self = this.set("portInformationNeeded", js.undefined)
  }
}
