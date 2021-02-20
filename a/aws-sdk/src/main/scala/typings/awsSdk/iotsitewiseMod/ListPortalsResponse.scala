package typings.awsSdk.iotsitewiseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListPortalsResponse extends StObject {
  
  /**
    * The token for the next set of results, or null if there are no additional results.
    */
  var nextToken: js.UndefOr[NextToken] = js.native
  
  /**
    * A list that summarizes each portal.
    */
  var portalSummaries: js.UndefOr[PortalSummaries] = js.native
}
object ListPortalsResponse {
  
  @scala.inline
  def apply(): ListPortalsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListPortalsResponse]
  }
  
  @scala.inline
  implicit class ListPortalsResponseMutableBuilder[Self <: ListPortalsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    @scala.inline
    def setPortalSummaries(value: PortalSummaries): Self = StObject.set(x, "portalSummaries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPortalSummariesUndefined: Self = StObject.set(x, "portalSummaries", js.undefined)
    
    @scala.inline
    def setPortalSummariesVarargs(value: PortalSummary*): Self = StObject.set(x, "portalSummaries", js.Array(value :_*))
  }
}
