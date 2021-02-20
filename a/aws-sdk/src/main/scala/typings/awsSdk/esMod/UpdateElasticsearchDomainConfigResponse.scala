package typings.awsSdk.esMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateElasticsearchDomainConfigResponse extends StObject {
  
  /**
    * The status of the updated Elasticsearch domain. 
    */
  var DomainConfig: ElasticsearchDomainConfig = js.native
}
object UpdateElasticsearchDomainConfigResponse {
  
  @scala.inline
  def apply(DomainConfig: ElasticsearchDomainConfig): UpdateElasticsearchDomainConfigResponse = {
    val __obj = js.Dynamic.literal(DomainConfig = DomainConfig.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateElasticsearchDomainConfigResponse]
  }
  
  @scala.inline
  implicit class UpdateElasticsearchDomainConfigResponseMutableBuilder[Self <: UpdateElasticsearchDomainConfigResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDomainConfig(value: ElasticsearchDomainConfig): Self = StObject.set(x, "DomainConfig", value.asInstanceOf[js.Any])
  }
}
