package typings.awsSdk.esMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeElasticsearchDomainsRequest extends StObject {
  
  /**
    * The Elasticsearch domains for which you want information.
    */
  var DomainNames: DomainNameList = js.native
}
object DescribeElasticsearchDomainsRequest {
  
  @scala.inline
  def apply(DomainNames: DomainNameList): DescribeElasticsearchDomainsRequest = {
    val __obj = js.Dynamic.literal(DomainNames = DomainNames.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeElasticsearchDomainsRequest]
  }
  
  @scala.inline
  implicit class DescribeElasticsearchDomainsRequestMutableBuilder[Self <: DescribeElasticsearchDomainsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDomainNames(value: DomainNameList): Self = StObject.set(x, "DomainNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDomainNamesVarargs(value: DomainName*): Self = StObject.set(x, "DomainNames", js.Array(value :_*))
  }
}
