package typings.awsSdk.esMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeElasticsearchDomainRequest extends StObject {
  
  /**
    * The name of the Elasticsearch domain for which you want information.
    */
  var DomainName: typings.awsSdk.esMod.DomainName
}
object DescribeElasticsearchDomainRequest {
  
  inline def apply(DomainName: DomainName): DescribeElasticsearchDomainRequest = {
    val __obj = js.Dynamic.literal(DomainName = DomainName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeElasticsearchDomainRequest]
  }
  
  extension [Self <: DescribeElasticsearchDomainRequest](x: Self) {
    
    inline def setDomainName(value: DomainName): Self = StObject.set(x, "DomainName", value.asInstanceOf[js.Any])
  }
}
