package typings.awsSdk.securityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AwsOpenSearchServiceDomainLogPublishingOptionsDetails extends StObject {
  
  /**
    * Configures the OpenSearch audit logs publishing.
    */
  var AuditLogs: js.UndefOr[AwsOpenSearchServiceDomainLogPublishingOption] = js.undefined
  
  /**
    * Configures the OpenSearch index logs publishing.
    */
  var IndexSlowLogs: js.UndefOr[AwsOpenSearchServiceDomainLogPublishingOption] = js.undefined
  
  /**
    * Configures the OpenSearch search slow log publishing.
    */
  var SearchSlowLogs: js.UndefOr[AwsOpenSearchServiceDomainLogPublishingOption] = js.undefined
}
object AwsOpenSearchServiceDomainLogPublishingOptionsDetails {
  
  inline def apply(): AwsOpenSearchServiceDomainLogPublishingOptionsDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsOpenSearchServiceDomainLogPublishingOptionsDetails]
  }
  
  extension [Self <: AwsOpenSearchServiceDomainLogPublishingOptionsDetails](x: Self) {
    
    inline def setAuditLogs(value: AwsOpenSearchServiceDomainLogPublishingOption): Self = StObject.set(x, "AuditLogs", value.asInstanceOf[js.Any])
    
    inline def setAuditLogsUndefined: Self = StObject.set(x, "AuditLogs", js.undefined)
    
    inline def setIndexSlowLogs(value: AwsOpenSearchServiceDomainLogPublishingOption): Self = StObject.set(x, "IndexSlowLogs", value.asInstanceOf[js.Any])
    
    inline def setIndexSlowLogsUndefined: Self = StObject.set(x, "IndexSlowLogs", js.undefined)
    
    inline def setSearchSlowLogs(value: AwsOpenSearchServiceDomainLogPublishingOption): Self = StObject.set(x, "SearchSlowLogs", value.asInstanceOf[js.Any])
    
    inline def setSearchSlowLogsUndefined: Self = StObject.set(x, "SearchSlowLogs", js.undefined)
  }
}
