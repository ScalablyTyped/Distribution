package typings.awsSdk.iotsitewiseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListPortalsResponse extends js.Object {
  
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
  implicit class ListPortalsResponseOps[Self <: ListPortalsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setNextToken(value: NextToken): Self = this.set("nextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextToken: Self = this.set("nextToken", js.undefined)
    
    @scala.inline
    def setPortalSummariesVarargs(value: PortalSummary*): Self = this.set("portalSummaries", js.Array(value :_*))
    
    @scala.inline
    def setPortalSummaries(value: PortalSummaries): Self = this.set("portalSummaries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePortalSummaries: Self = this.set("portalSummaries", js.undefined)
  }
}
