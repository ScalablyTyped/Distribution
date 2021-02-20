package typings.awsSdk.cloudsearchMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DomainStatus extends StObject {
  
  var ARN: js.UndefOr[typings.awsSdk.cloudsearchMod.ARN] = js.native
  
  /**
    * True if the search domain is created. It can take several minutes to initialize a domain when CreateDomain is called. Newly created search domains are returned from DescribeDomains with a false value for Created until domain creation is complete.
    */
  var Created: js.UndefOr[Boolean] = js.native
  
  /**
    * True if the search domain has been deleted. The system must clean up resources dedicated to the search domain when DeleteDomain is called. Newly deleted search domains are returned from DescribeDomains with a true value for IsDeleted for several minutes until resource cleanup is complete.
    */
  var Deleted: js.UndefOr[Boolean] = js.native
  
  /**
    * The service endpoint for updating documents in a search domain.
    */
  var DocService: js.UndefOr[ServiceEndpoint] = js.native
  
  var DomainId: typings.awsSdk.cloudsearchMod.DomainId = js.native
  
  var DomainName: typings.awsSdk.cloudsearchMod.DomainName = js.native
  
  var Limits: js.UndefOr[typings.awsSdk.cloudsearchMod.Limits] = js.native
  
  /**
    * True if processing is being done to activate the current domain configuration.
    */
  var Processing: js.UndefOr[Boolean] = js.native
  
  /**
    * True if IndexDocuments needs to be called to activate the current domain configuration.
    */
  var RequiresIndexDocuments: Boolean = js.native
  
  /**
    * The number of search instances that are available to process search requests.
    */
  var SearchInstanceCount: js.UndefOr[InstanceCount] = js.native
  
  /**
    * The instance type that is being used to process search requests.
    */
  var SearchInstanceType: js.UndefOr[typings.awsSdk.cloudsearchMod.SearchInstanceType] = js.native
  
  /**
    * The number of partitions across which the search index is spread.
    */
  var SearchPartitionCount: js.UndefOr[PartitionCount] = js.native
  
  /**
    * The service endpoint for requesting search results from a search domain.
    */
  var SearchService: js.UndefOr[ServiceEndpoint] = js.native
}
object DomainStatus {
  
  @scala.inline
  def apply(DomainId: DomainId, DomainName: DomainName, RequiresIndexDocuments: Boolean): DomainStatus = {
    val __obj = js.Dynamic.literal(DomainId = DomainId.asInstanceOf[js.Any], DomainName = DomainName.asInstanceOf[js.Any], RequiresIndexDocuments = RequiresIndexDocuments.asInstanceOf[js.Any])
    __obj.asInstanceOf[DomainStatus]
  }
  
  @scala.inline
  implicit class DomainStatusMutableBuilder[Self <: DomainStatus] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setARN(value: ARN): Self = StObject.set(x, "ARN", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setARNUndefined: Self = StObject.set(x, "ARN", js.undefined)
    
    @scala.inline
    def setCreated(value: Boolean): Self = StObject.set(x, "Created", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreatedUndefined: Self = StObject.set(x, "Created", js.undefined)
    
    @scala.inline
    def setDeleted(value: Boolean): Self = StObject.set(x, "Deleted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeletedUndefined: Self = StObject.set(x, "Deleted", js.undefined)
    
    @scala.inline
    def setDocService(value: ServiceEndpoint): Self = StObject.set(x, "DocService", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDocServiceUndefined: Self = StObject.set(x, "DocService", js.undefined)
    
    @scala.inline
    def setDomainId(value: DomainId): Self = StObject.set(x, "DomainId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDomainName(value: DomainName): Self = StObject.set(x, "DomainName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLimits(value: Limits): Self = StObject.set(x, "Limits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLimitsUndefined: Self = StObject.set(x, "Limits", js.undefined)
    
    @scala.inline
    def setProcessing(value: Boolean): Self = StObject.set(x, "Processing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProcessingUndefined: Self = StObject.set(x, "Processing", js.undefined)
    
    @scala.inline
    def setRequiresIndexDocuments(value: Boolean): Self = StObject.set(x, "RequiresIndexDocuments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSearchInstanceCount(value: InstanceCount): Self = StObject.set(x, "SearchInstanceCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSearchInstanceCountUndefined: Self = StObject.set(x, "SearchInstanceCount", js.undefined)
    
    @scala.inline
    def setSearchInstanceType(value: SearchInstanceType): Self = StObject.set(x, "SearchInstanceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSearchInstanceTypeUndefined: Self = StObject.set(x, "SearchInstanceType", js.undefined)
    
    @scala.inline
    def setSearchPartitionCount(value: PartitionCount): Self = StObject.set(x, "SearchPartitionCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSearchPartitionCountUndefined: Self = StObject.set(x, "SearchPartitionCount", js.undefined)
    
    @scala.inline
    def setSearchService(value: ServiceEndpoint): Self = StObject.set(x, "SearchService", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSearchServiceUndefined: Self = StObject.set(x, "SearchService", js.undefined)
  }
}
