package typings.awsSdk.esMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeElasticsearchDomainsRequest extends StObject {
  
  /**
    * The Elasticsearch domains for which you want information.
    */
  var DomainNames: DomainNameList
}
object DescribeElasticsearchDomainsRequest {
  
  inline def apply(DomainNames: DomainNameList): DescribeElasticsearchDomainsRequest = {
    val __obj = js.Dynamic.literal(DomainNames = DomainNames.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeElasticsearchDomainsRequest]
  }
  
  extension [Self <: DescribeElasticsearchDomainsRequest](x: Self) {
    
    inline def setDomainNames(value: DomainNameList): Self = StObject.set(x, "DomainNames", value.asInstanceOf[js.Any])
    
    inline def setDomainNamesVarargs(value: DomainName*): Self = StObject.set(x, "DomainNames", js.Array(value :_*))
  }
}
