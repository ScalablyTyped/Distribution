package typings.awsSdk.esMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteElasticsearchDomainRequest extends StObject {
  
  /**
    * The name of the Elasticsearch domain that you want to permanently delete.
    */
  var DomainName: typings.awsSdk.esMod.DomainName = js.native
}
object DeleteElasticsearchDomainRequest {
  
  @scala.inline
  def apply(DomainName: DomainName): DeleteElasticsearchDomainRequest = {
    val __obj = js.Dynamic.literal(DomainName = DomainName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteElasticsearchDomainRequest]
  }
  
  @scala.inline
  implicit class DeleteElasticsearchDomainRequestMutableBuilder[Self <: DeleteElasticsearchDomainRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDomainName(value: DomainName): Self = StObject.set(x, "DomainName", value.asInstanceOf[js.Any])
  }
}
