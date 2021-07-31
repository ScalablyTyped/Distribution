package typings.awsSdk.iotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListScheduledAuditsResponse extends StObject {
  
  /**
    * A token that can be used to retrieve the next set of results, or null if there are no additional results.
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
  
  /**
    * The list of scheduled audits.
    */
  var scheduledAudits: js.UndefOr[ScheduledAuditMetadataList] = js.undefined
}
object ListScheduledAuditsResponse {
  
  @scala.inline
  def apply(): ListScheduledAuditsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListScheduledAuditsResponse]
  }
  
  @scala.inline
  implicit class ListScheduledAuditsResponseMutableBuilder[Self <: ListScheduledAuditsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    @scala.inline
    def setScheduledAudits(value: ScheduledAuditMetadataList): Self = StObject.set(x, "scheduledAudits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScheduledAuditsUndefined: Self = StObject.set(x, "scheduledAudits", js.undefined)
    
    @scala.inline
    def setScheduledAuditsVarargs(value: ScheduledAuditMetadata*): Self = StObject.set(x, "scheduledAudits", js.Array(value :_*))
  }
}
