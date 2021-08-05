package typings.awsSdk.managedblockchainMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VoteSummary extends StObject {
  
  /**
    *  The unique identifier of the member that cast the vote. 
    */
  var MemberId: js.UndefOr[ResourceIdString] = js.undefined
  
  /**
    *  The name of the member that cast the vote. 
    */
  var MemberName: js.UndefOr[NetworkMemberNameString] = js.undefined
  
  /**
    *  The vote value, either YES or NO. 
    */
  var Vote: js.UndefOr[VoteValue] = js.undefined
}
object VoteSummary {
  
  inline def apply(): VoteSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VoteSummary]
  }
  
  extension [Self <: VoteSummary](x: Self) {
    
    inline def setMemberId(value: ResourceIdString): Self = StObject.set(x, "MemberId", value.asInstanceOf[js.Any])
    
    inline def setMemberIdUndefined: Self = StObject.set(x, "MemberId", js.undefined)
    
    inline def setMemberName(value: NetworkMemberNameString): Self = StObject.set(x, "MemberName", value.asInstanceOf[js.Any])
    
    inline def setMemberNameUndefined: Self = StObject.set(x, "MemberName", js.undefined)
    
    inline def setVote(value: VoteValue): Self = StObject.set(x, "Vote", value.asInstanceOf[js.Any])
    
    inline def setVoteUndefined: Self = StObject.set(x, "Vote", js.undefined)
  }
}
