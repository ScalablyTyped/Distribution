package typings.awsSdk.cloudsearchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DomainStatus extends js.Object {
  
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
  implicit class DomainStatusOps[Self <: DomainStatus] (val x: Self) extends AnyVal {
    
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
    def setDomainId(value: DomainId): Self = this.set("DomainId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDomainName(value: DomainName): Self = this.set("DomainName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequiresIndexDocuments(value: Boolean): Self = this.set("RequiresIndexDocuments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setARN(value: ARN): Self = this.set("ARN", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteARN: Self = this.set("ARN", js.undefined)
    
    @scala.inline
    def setCreated(value: Boolean): Self = this.set("Created", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreated: Self = this.set("Created", js.undefined)
    
    @scala.inline
    def setDeleted(value: Boolean): Self = this.set("Deleted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeleted: Self = this.set("Deleted", js.undefined)
    
    @scala.inline
    def setDocService(value: ServiceEndpoint): Self = this.set("DocService", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDocService: Self = this.set("DocService", js.undefined)
    
    @scala.inline
    def setLimits(value: Limits): Self = this.set("Limits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLimits: Self = this.set("Limits", js.undefined)
    
    @scala.inline
    def setProcessing(value: Boolean): Self = this.set("Processing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProcessing: Self = this.set("Processing", js.undefined)
    
    @scala.inline
    def setSearchInstanceCount(value: InstanceCount): Self = this.set("SearchInstanceCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSearchInstanceCount: Self = this.set("SearchInstanceCount", js.undefined)
    
    @scala.inline
    def setSearchInstanceType(value: SearchInstanceType): Self = this.set("SearchInstanceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSearchInstanceType: Self = this.set("SearchInstanceType", js.undefined)
    
    @scala.inline
    def setSearchPartitionCount(value: PartitionCount): Self = this.set("SearchPartitionCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSearchPartitionCount: Self = this.set("SearchPartitionCount", js.undefined)
    
    @scala.inline
    def setSearchService(value: ServiceEndpoint): Self = this.set("SearchService", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSearchService: Self = this.set("SearchService", js.undefined)
  }
}
