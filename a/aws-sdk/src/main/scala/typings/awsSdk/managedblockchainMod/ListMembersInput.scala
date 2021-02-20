package typings.awsSdk.managedblockchainMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListMembersInput extends StObject {
  
  /**
    * An optional Boolean value. If provided, the request is limited either to members that the current AWS account owns (true) or that other AWS accounts own (false). If omitted, all members are listed.
    */
  var IsOwned: js.UndefOr[typings.awsSdk.managedblockchainMod.IsOwned] = js.native
  
  /**
    * The maximum number of members to return in the request.
    */
  var MaxResults: js.UndefOr[MemberListMaxResults] = js.native
  
  /**
    * The optional name of the member to list.
    */
  var Name: js.UndefOr[String] = js.native
  
  /**
    * The unique identifier of the network for which to list members.
    */
  var NetworkId: ResourceIdString = js.native
  
  /**
    * The pagination token that indicates the next set of results to retrieve.
    */
  var NextToken: js.UndefOr[PaginationToken] = js.native
  
  /**
    * An optional status specifier. If provided, only members currently in this status are listed.
    */
  var Status: js.UndefOr[MemberStatus] = js.native
}
object ListMembersInput {
  
  @scala.inline
  def apply(NetworkId: ResourceIdString): ListMembersInput = {
    val __obj = js.Dynamic.literal(NetworkId = NetworkId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListMembersInput]
  }
  
  @scala.inline
  implicit class ListMembersInputMutableBuilder[Self <: ListMembersInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIsOwned(value: IsOwned): Self = StObject.set(x, "IsOwned", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsOwnedUndefined: Self = StObject.set(x, "IsOwned", js.undefined)
    
    @scala.inline
    def setMaxResults(value: MemberListMaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    @scala.inline
    def setNetworkId(value: ResourceIdString): Self = StObject.set(x, "NetworkId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextToken(value: PaginationToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    @scala.inline
    def setStatus(value: MemberStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
  }
}
