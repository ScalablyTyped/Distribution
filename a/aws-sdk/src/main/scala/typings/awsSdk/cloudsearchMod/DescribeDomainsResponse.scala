package typings.awsSdk.cloudsearchMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeDomainsResponse extends StObject {
  
  var DomainStatusList: typings.awsSdk.cloudsearchMod.DomainStatusList
}
object DescribeDomainsResponse {
  
  inline def apply(DomainStatusList: DomainStatusList): DescribeDomainsResponse = {
    val __obj = js.Dynamic.literal(DomainStatusList = DomainStatusList.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeDomainsResponse]
  }
  
  extension [Self <: DescribeDomainsResponse](x: Self) {
    
    inline def setDomainStatusList(value: DomainStatusList): Self = StObject.set(x, "DomainStatusList", value.asInstanceOf[js.Any])
    
    inline def setDomainStatusListVarargs(value: DomainStatus*): Self = StObject.set(x, "DomainStatusList", js.Array(value :_*))
  }
}
