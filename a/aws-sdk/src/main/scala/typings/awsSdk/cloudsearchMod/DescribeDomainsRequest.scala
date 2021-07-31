package typings.awsSdk.cloudsearchMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeDomainsRequest extends StObject {
  
  /**
    * The names of the domains you want to include in the response.
    */
  var DomainNames: js.UndefOr[DomainNameList] = js.undefined
}
object DescribeDomainsRequest {
  
  @scala.inline
  def apply(): DescribeDomainsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeDomainsRequest]
  }
  
  @scala.inline
  implicit class DescribeDomainsRequestMutableBuilder[Self <: DescribeDomainsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDomainNames(value: DomainNameList): Self = StObject.set(x, "DomainNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDomainNamesUndefined: Self = StObject.set(x, "DomainNames", js.undefined)
    
    @scala.inline
    def setDomainNamesVarargs(value: DomainName*): Self = StObject.set(x, "DomainNames", js.Array(value :_*))
  }
}
