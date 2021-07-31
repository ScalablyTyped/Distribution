package typings.awsSdk.esMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteElasticsearchDomainResponse extends StObject {
  
  /**
    * The status of the Elasticsearch domain being deleted.
    */
  var DomainStatus: js.UndefOr[ElasticsearchDomainStatus] = js.undefined
}
object DeleteElasticsearchDomainResponse {
  
  @scala.inline
  def apply(): DeleteElasticsearchDomainResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteElasticsearchDomainResponse]
  }
  
  @scala.inline
  implicit class DeleteElasticsearchDomainResponseMutableBuilder[Self <: DeleteElasticsearchDomainResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDomainStatus(value: ElasticsearchDomainStatus): Self = StObject.set(x, "DomainStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDomainStatusUndefined: Self = StObject.set(x, "DomainStatus", js.undefined)
  }
}
