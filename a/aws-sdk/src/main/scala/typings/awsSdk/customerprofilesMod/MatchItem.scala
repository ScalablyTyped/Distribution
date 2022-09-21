package typings.awsSdk.customerprofilesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MatchItem extends StObject {
  
  /**
    * A number between 0 and 1, where a higher score means higher similarity. Examining match confidence scores lets you distinguish between groups of similar records in which the system is highly confident (which you may decide to merge), groups of similar records about which the system is uncertain (which you may decide to have reviewed by a human), and groups of similar records that the system deems to be unlikely (which you may decide to reject). Given confidence scores vary as per the data input, it should not be used an absolute measure of matching quality.
    */
  var ConfidenceScore: js.UndefOr[Double] = js.undefined
  
  /**
    * The unique identifiers for this group of profiles that match.
    */
  var MatchId: js.UndefOr[string1To255] = js.undefined
  
  /**
    * A list of identifiers for profiles that match.
    */
  var ProfileIds: js.UndefOr[ProfileIdList] = js.undefined
}
object MatchItem {
  
  inline def apply(): MatchItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MatchItem]
  }
  
  extension [Self <: MatchItem](x: Self) {
    
    inline def setConfidenceScore(value: Double): Self = StObject.set(x, "ConfidenceScore", value.asInstanceOf[js.Any])
    
    inline def setConfidenceScoreUndefined: Self = StObject.set(x, "ConfidenceScore", js.undefined)
    
    inline def setMatchId(value: string1To255): Self = StObject.set(x, "MatchId", value.asInstanceOf[js.Any])
    
    inline def setMatchIdUndefined: Self = StObject.set(x, "MatchId", js.undefined)
    
    inline def setProfileIds(value: ProfileIdList): Self = StObject.set(x, "ProfileIds", value.asInstanceOf[js.Any])
    
    inline def setProfileIdsUndefined: Self = StObject.set(x, "ProfileIds", js.undefined)
    
    inline def setProfileIdsVarargs(value: uuid*): Self = StObject.set(x, "ProfileIds", js.Array(value*))
  }
}
