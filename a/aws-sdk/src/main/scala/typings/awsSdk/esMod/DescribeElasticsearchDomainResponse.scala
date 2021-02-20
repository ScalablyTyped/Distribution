package typings.awsSdk.esMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeElasticsearchDomainResponse extends StObject {
  
  /**
    * The current status of the Elasticsearch domain.
    */
  var DomainStatus: ElasticsearchDomainStatus = js.native
}
object DescribeElasticsearchDomainResponse {
  
  @scala.inline
  def apply(DomainStatus: ElasticsearchDomainStatus): DescribeElasticsearchDomainResponse = {
    val __obj = js.Dynamic.literal(DomainStatus = DomainStatus.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeElasticsearchDomainResponse]
  }
  
  @scala.inline
  implicit class DescribeElasticsearchDomainResponseMutableBuilder[Self <: DescribeElasticsearchDomainResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDomainStatus(value: ElasticsearchDomainStatus): Self = StObject.set(x, "DomainStatus", value.asInstanceOf[js.Any])
  }
}
