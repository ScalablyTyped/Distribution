package typings.awsSdk.shieldMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListAttacksResponse extends StObject {
  
  /**
    * The attack information for the specified time range.
    */
  var AttackSummaries: js.UndefOr[typings.awsSdk.shieldMod.AttackSummaries] = js.native
  
  /**
    * The token returned by a previous call to indicate that there is more data available. If not null, more results are available. Pass this value for the NextMarker parameter in a subsequent call to ListAttacks to retrieve the next set of items. Shield Advanced might return the list of AttackSummary objects in batches smaller than the number specified by MaxResults. If there are more attack summary objects to return, Shield Advanced will always also return a NextToken.
    */
  var NextToken: js.UndefOr[Token] = js.native
}
object ListAttacksResponse {
  
  @scala.inline
  def apply(): ListAttacksResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListAttacksResponse]
  }
  
  @scala.inline
  implicit class ListAttacksResponseMutableBuilder[Self <: ListAttacksResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAttackSummaries(value: AttackSummaries): Self = StObject.set(x, "AttackSummaries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttackSummariesUndefined: Self = StObject.set(x, "AttackSummaries", js.undefined)
    
    @scala.inline
    def setAttackSummariesVarargs(value: AttackSummary*): Self = StObject.set(x, "AttackSummaries", js.Array(value :_*))
    
    @scala.inline
    def setNextToken(value: Token): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
