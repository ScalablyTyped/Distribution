package typings.awsSdk.directoryserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeDomainControllersRequest extends StObject {
  
  /**
    * Identifier of the directory for which to retrieve the domain controller information.
    */
  var DirectoryId: typings.awsSdk.directoryserviceMod.DirectoryId
  
  /**
    * A list of identifiers for the domain controllers whose information will be provided.
    */
  var DomainControllerIds: js.UndefOr[typings.awsSdk.directoryserviceMod.DomainControllerIds] = js.undefined
  
  /**
    * The maximum number of items to return.
    */
  var Limit: js.UndefOr[typings.awsSdk.directoryserviceMod.Limit] = js.undefined
  
  /**
    * The DescribeDomainControllers.NextToken value from a previous call to DescribeDomainControllers. Pass null if this is the first call. 
    */
  var NextToken: js.UndefOr[typings.awsSdk.directoryserviceMod.NextToken] = js.undefined
}
object DescribeDomainControllersRequest {
  
  @scala.inline
  def apply(DirectoryId: DirectoryId): DescribeDomainControllersRequest = {
    val __obj = js.Dynamic.literal(DirectoryId = DirectoryId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeDomainControllersRequest]
  }
  
  @scala.inline
  implicit class DescribeDomainControllersRequestMutableBuilder[Self <: DescribeDomainControllersRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDirectoryId(value: DirectoryId): Self = StObject.set(x, "DirectoryId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDomainControllerIds(value: DomainControllerIds): Self = StObject.set(x, "DomainControllerIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDomainControllerIdsUndefined: Self = StObject.set(x, "DomainControllerIds", js.undefined)
    
    @scala.inline
    def setDomainControllerIdsVarargs(value: DomainControllerId*): Self = StObject.set(x, "DomainControllerIds", js.Array(value :_*))
    
    @scala.inline
    def setLimit(value: Limit): Self = StObject.set(x, "Limit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLimitUndefined: Self = StObject.set(x, "Limit", js.undefined)
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
