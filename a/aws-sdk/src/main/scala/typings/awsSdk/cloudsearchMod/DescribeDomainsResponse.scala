package typings.awsSdk.cloudsearchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeDomainsResponse extends js.Object {
  
  var DomainStatusList: typings.awsSdk.cloudsearchMod.DomainStatusList = js.native
}
object DescribeDomainsResponse {
  
  @scala.inline
  def apply(DomainStatusList: DomainStatusList): DescribeDomainsResponse = {
    val __obj = js.Dynamic.literal(DomainStatusList = DomainStatusList.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeDomainsResponse]
  }
  
  @scala.inline
  implicit class DescribeDomainsResponseOps[Self <: DescribeDomainsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDomainStatusListVarargs(value: DomainStatus*): Self = this.set("DomainStatusList", js.Array(value :_*))
    
    @scala.inline
    def setDomainStatusList(value: DomainStatusList): Self = this.set("DomainStatusList", value.asInstanceOf[js.Any])
  }
}
