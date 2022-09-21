package typings.awsSdk.esMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeElasticsearchDomainsResponse extends StObject {
  
  /**
    * The status of the domains requested in the DescribeElasticsearchDomains request.
    */
  var DomainStatusList: ElasticsearchDomainStatusList
}
object DescribeElasticsearchDomainsResponse {
  
  inline def apply(DomainStatusList: ElasticsearchDomainStatusList): DescribeElasticsearchDomainsResponse = {
    val __obj = js.Dynamic.literal(DomainStatusList = DomainStatusList.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeElasticsearchDomainsResponse]
  }
  
  extension [Self <: DescribeElasticsearchDomainsResponse](x: Self) {
    
    inline def setDomainStatusList(value: ElasticsearchDomainStatusList): Self = StObject.set(x, "DomainStatusList", value.asInstanceOf[js.Any])
    
    inline def setDomainStatusListVarargs(value: ElasticsearchDomainStatus*): Self = StObject.set(x, "DomainStatusList", js.Array(value*))
  }
}
