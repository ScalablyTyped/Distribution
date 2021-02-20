package typings.awsSdk.managedblockchainMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VoteSummary extends StObject {
  
  /**
    *  The unique identifier of the member that cast the vote. 
    */
  var MemberId: js.UndefOr[ResourceIdString] = js.native
  
  /**
    *  The name of the member that cast the vote. 
    */
  var MemberName: js.UndefOr[NetworkMemberNameString] = js.native
  
  /**
    *  The vote value, either YES or NO. 
    */
  var Vote: js.UndefOr[VoteValue] = js.native
}
object VoteSummary {
  
  @scala.inline
  def apply(): VoteSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VoteSummary]
  }
  
  @scala.inline
  implicit class VoteSummaryMutableBuilder[Self <: VoteSummary] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMemberId(value: ResourceIdString): Self = StObject.set(x, "MemberId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMemberIdUndefined: Self = StObject.set(x, "MemberId", js.undefined)
    
    @scala.inline
    def setMemberName(value: NetworkMemberNameString): Self = StObject.set(x, "MemberName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMemberNameUndefined: Self = StObject.set(x, "MemberName", js.undefined)
    
    @scala.inline
    def setVote(value: VoteValue): Self = StObject.set(x, "Vote", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVoteUndefined: Self = StObject.set(x, "Vote", js.undefined)
  }
}
