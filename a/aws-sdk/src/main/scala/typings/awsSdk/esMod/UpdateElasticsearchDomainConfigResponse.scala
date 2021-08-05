package typings.awsSdk.esMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateElasticsearchDomainConfigResponse extends StObject {
  
  /**
    * The status of the updated Elasticsearch domain. 
    */
  var DomainConfig: ElasticsearchDomainConfig
}
object UpdateElasticsearchDomainConfigResponse {
  
  inline def apply(DomainConfig: ElasticsearchDomainConfig): UpdateElasticsearchDomainConfigResponse = {
    val __obj = js.Dynamic.literal(DomainConfig = DomainConfig.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateElasticsearchDomainConfigResponse]
  }
  
  extension [Self <: UpdateElasticsearchDomainConfigResponse](x: Self) {
    
    inline def setDomainConfig(value: ElasticsearchDomainConfig): Self = StObject.set(x, "DomainConfig", value.asInstanceOf[js.Any])
  }
}
