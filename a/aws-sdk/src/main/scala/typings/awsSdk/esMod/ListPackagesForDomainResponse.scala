package typings.awsSdk.esMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListPackagesForDomainResponse extends StObject {
  
  /**
    * List of DomainPackageDetails objects.
    */
  var DomainPackageDetailsList: js.UndefOr[typings.awsSdk.esMod.DomainPackageDetailsList] = js.undefined
  
  /**
    * Pagination token that needs to be supplied to the next call to get the next page of results.
    */
  var NextToken: js.UndefOr[String] = js.undefined
}
object ListPackagesForDomainResponse {
  
  @scala.inline
  def apply(): ListPackagesForDomainResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListPackagesForDomainResponse]
  }
  
  @scala.inline
  implicit class ListPackagesForDomainResponseMutableBuilder[Self <: ListPackagesForDomainResponse] (val x: Self) extends AnyVal {
    
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
