package typings.awsSdk.esMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateElasticsearchDomainResponse extends StObject {
  
  /**
    * The status of the newly created Elasticsearch domain. 
    */
  var DomainStatus: js.UndefOr[ElasticsearchDomainStatus] = js.undefined
}
object CreateElasticsearchDomainResponse {
  
  inline def apply(): CreateElasticsearchDomainResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateElasticsearchDomainResponse]
  }
  
  extension [Self <: CreateElasticsearchDomainResponse](x: Self) {
    
    inline def setDomainStatus(value: ElasticsearchDomainStatus): Self = StObject.set(x, "DomainStatus", value.asInstanceOf[js.Any])
    
    inline def setDomainStatusUndefined: Self = StObject.set(x, "DomainStatus", js.undefined)
  }
}
