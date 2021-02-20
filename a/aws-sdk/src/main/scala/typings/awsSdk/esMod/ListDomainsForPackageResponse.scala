package typings.awsSdk.esMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListDomainsForPackageResponse extends StObject {
  
  /**
    * List of DomainPackageDetails objects.
    */
  var DomainPackageDetailsList: js.UndefOr[typings.awsSdk.esMod.DomainPackageDetailsList] = js.native
  
  var NextToken: js.UndefOr[String] = js.native
}
object ListDomainsForPackageResponse {
  
  @scala.inline
  def apply(): ListDomainsForPackageResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListDomainsForPackageResponse]
  }
  
  @scala.inline
  implicit class ListDomainsForPackageResponseMutableBuilder[Self <: ListDomainsForPackageResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDomainPackageDetailsList(value: DomainPackageDetailsList): Self = StObject.set(x, "DomainPackageDetailsList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDomainPackageDetailsListUndefined: Self = StObject.set(x, "DomainPackageDetailsList", js.undefined)
    
    @scala.inline
    def setDomainPackageDetailsListVarargs(value: DomainPackageDetails*): Self = StObject.set(x, "DomainPackageDetailsList", js.Array(value :_*))
    
    @scala.inline
    def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
