package typings.awsSdk.clientsWellarchitectedMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListShareInvitationsOutput extends StObject {
  
  var NextToken: js.UndefOr[typings.awsSdk.clientsWellarchitectedMod.NextToken] = js.undefined
  
  /**
    * List of share invitation summaries in a workload.
    */
  var ShareInvitationSummaries: js.UndefOr[typings.awsSdk.clientsWellarchitectedMod.ShareInvitationSummaries] = js.undefined
}
object ListShareInvitationsOutput {
  
  inline def apply(): ListShareInvitationsOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListShareInvitationsOutput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListShareInvitationsOutput] (val x: Self) extends AnyVal {
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setShareInvitationSummaries(value: ShareInvitationSummaries): Self = StObject.set(x, "ShareInvitationSummaries", value.asInstanceOf[js.Any])
    
    inline def setShareInvitationSummariesUndefined: Self = StObject.set(x, "ShareInvitationSummaries", js.undefined)
    
    inline def setShareInvitationSummariesVarargs(value: ShareInvitationSummary*): Self = StObject.set(x, "ShareInvitationSummaries", js.Array(value*))
  }
}
