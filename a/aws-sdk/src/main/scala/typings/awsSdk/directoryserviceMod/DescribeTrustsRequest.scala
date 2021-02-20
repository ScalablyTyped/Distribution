package typings.awsSdk.directoryserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeTrustsRequest extends StObject {
  
  /**
    * The Directory ID of the AWS directory that is a part of the requested trust relationship.
    */
  var DirectoryId: js.UndefOr[typings.awsSdk.directoryserviceMod.DirectoryId] = js.native
  
  /**
    * The maximum number of objects to return.
    */
  var Limit: js.UndefOr[typings.awsSdk.directoryserviceMod.Limit] = js.native
  
  /**
    * The DescribeTrustsResult.NextToken value from a previous call to DescribeTrusts. Pass null if this is the first call.
    */
  var NextToken: js.UndefOr[typings.awsSdk.directoryserviceMod.NextToken] = js.native
  
  /**
    * A list of identifiers of the trust relationships for which to obtain the information. If this member is null, all trust relationships that belong to the current account are returned. An empty list results in an InvalidParameterException being thrown.
    */
  var TrustIds: js.UndefOr[typings.awsSdk.directoryserviceMod.TrustIds] = js.native
}
object DescribeTrustsRequest {
  
  @scala.inline
  def apply(): DescribeTrustsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeTrustsRequest]
  }
  
  @scala.inline
  implicit class DescribeTrustsRequestMutableBuilder[Self <: DescribeTrustsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDirectoryId(value: DirectoryId): Self = StObject.set(x, "DirectoryId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDirectoryIdUndefined: Self = StObject.set(x, "DirectoryId", js.undefined)
    
    @scala.inline
    def setLimit(value: Limit): Self = StObject.set(x, "Limit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLimitUndefined: Self = StObject.set(x, "Limit", js.undefined)
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    @scala.inline
    def setTrustIds(value: TrustIds): Self = StObject.set(x, "TrustIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrustIdsUndefined: Self = StObject.set(x, "TrustIds", js.undefined)
    
    @scala.inline
    def setTrustIdsVarargs(value: TrustId*): Self = StObject.set(x, "TrustIds", js.Array(value :_*))
  }
}
