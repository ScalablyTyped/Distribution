package typings.awsSdk.shieldMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListAttacksResponse extends StObject {
  
  /**
    * The attack information for the specified time range.
    */
  var AttackSummaries: js.UndefOr[typings.awsSdk.shieldMod.AttackSummaries] = js.undefined
  
  /**
    * The token returned by a previous call to indicate that there is more data available. If not null, more results are available. Pass this value for the NextMarker parameter in a subsequent call to ListAttacks to retrieve the next set of items. Shield Advanced might return the list of AttackSummary objects in batches smaller than the number specified by MaxResults. If there are more attack summary objects to return, Shield Advanced will always also return a NextToken.
    */
  var NextToken: js.UndefOr[Token] = js.undefined
}
object ListAttacksResponse {
  
  inline def apply(): ListAttacksResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListAttacksResponse]
  }
  
  extension [Self <: ListAttacksResponse](x: Self) {
    
    inline def setAttackSummaries(value: AttackSummaries): Self = StObject.set(x, "AttackSummaries", value.asInstanceOf[js.Any])
    
    inline def setAttackSummariesUndefined: Self = StObject.set(x, "AttackSummaries", js.undefined)
    
    inline def setAttackSummariesVarargs(value: AttackSummary*): Self = StObject.set(x, "AttackSummaries", js.Array(value :_*))
    
    inline def setNextToken(value: Token): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
