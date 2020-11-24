package typings.awsSdk.cloudsearchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeDomainsRequest extends js.Object {
  
  /**
    * The names of the domains you want to include in the response.
    */
  var DomainNames: js.UndefOr[DomainNameList] = js.native
}
object DescribeDomainsRequest {
  
  @scala.inline
  def apply(): DescribeDomainsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeDomainsRequest]
  }
  
  @scala.inline
  implicit class DescribeDomainsRequestOps[Self <: DescribeDomainsRequest] (val x: Self) extends AnyVal {
    
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
    def setDomainNamesVarargs(value: DomainName*): Self = this.set("DomainNames", js.Array(value :_*))
    
    @scala.inline
    def setDomainNames(value: DomainNameList): Self = this.set("DomainNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDomainNames: Self = this.set("DomainNames", js.undefined)
  }
}
