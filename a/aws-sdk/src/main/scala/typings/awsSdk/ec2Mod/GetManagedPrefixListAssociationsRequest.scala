package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetManagedPrefixListAssociationsRequest extends StObject {
  
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The maximum number of results to return with a single call. To retrieve the remaining results, make another call with the returned nextToken value.
    */
  var MaxResults: js.UndefOr[GetManagedPrefixListAssociationsMaxResults] = js.undefined
  
  /**
    * The token for the next page of results.
    */
  var NextToken: js.UndefOr[typings.awsSdk.ec2Mod.NextToken] = js.undefined
  
  /**
    * The ID of the prefix list.
    */
  var PrefixListId: PrefixListResourceId
}
object GetManagedPrefixListAssociationsRequest {
  
  @scala.inline
  def apply(PrefixListId: PrefixListResourceId): GetManagedPrefixListAssociationsRequest = {
    val __obj = js.Dynamic.literal(PrefixListId = PrefixListId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetManagedPrefixListAssociationsRequest]
  }
  
  @scala.inline
  implicit class GetManagedPrefixListAssociationsRequestMutableBuilder[Self <: GetManagedPrefixListAssociationsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDryRun(value: Boolean): Self = StObject.set(x, "DryRun", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDryRunUndefined: Self = StObject.set(x, "DryRun", js.undefined)
    
    @scala.inline
    def setMaxResults(value: GetManagedPrefixListAssociationsMaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    @scala.inline
    def setPrefixListId(value: PrefixListResourceId): Self = StObject.set(x, "PrefixListId", value.asInstanceOf[js.Any])
  }
}
