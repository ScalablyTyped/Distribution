package typings.awsSdk.guarddutyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListThreatIntelSetsResponse extends StObject {
  
  /**
    * The pagination parameter to be used on the next list operation to retrieve more items.
    */
  var NextToken: js.UndefOr[String] = js.undefined
  
  /**
    * The IDs of the ThreatIntelSet resources.
    */
  var ThreatIntelSetIds: typings.awsSdk.guarddutyMod.ThreatIntelSetIds
}
object ListThreatIntelSetsResponse {
  
  @scala.inline
  def apply(ThreatIntelSetIds: ThreatIntelSetIds): ListThreatIntelSetsResponse = {
    val __obj = js.Dynamic.literal(ThreatIntelSetIds = ThreatIntelSetIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListThreatIntelSetsResponse]
  }
  
  @scala.inline
  implicit class ListThreatIntelSetsResponseMutableBuilder[Self <: ListThreatIntelSetsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    @scala.inline
    def setThreatIntelSetIds(value: ThreatIntelSetIds): Self = StObject.set(x, "ThreatIntelSetIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThreatIntelSetIdsVarargs(value: String*): Self = StObject.set(x, "ThreatIntelSetIds", js.Array(value :_*))
  }
}
