package typings.awsSdk.cloudsearchMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeDomainsResponse extends StObject {
  
  var DomainStatusList: typings.awsSdk.cloudsearchMod.DomainStatusList
}
object DescribeDomainsResponse {
  
  @scala.inline
  def apply(DomainStatusList: DomainStatusList): DescribeDomainsResponse = {
    val __obj = js.Dynamic.literal(DomainStatusList = DomainStatusList.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeDomainsResponse]
  }
  
  @scala.inline
  implicit class DescribeDomainsResponseMutableBuilder[Self <: DescribeDomainsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDomainStatusList(value: DomainStatusList): Self = StObject.set(x, "DomainStatusList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDomainStatusListVarargs(value: DomainStatus*): Self = StObject.set(x, "DomainStatusList", js.Array(value :_*))
  }
}
