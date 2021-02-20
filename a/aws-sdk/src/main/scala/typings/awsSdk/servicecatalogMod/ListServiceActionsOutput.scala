package typings.awsSdk.servicecatalogMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListServiceActionsOutput extends StObject {
  
  /**
    * The page token to use to retrieve the next set of results. If there are no additional results, this value is null.
    */
  var NextPageToken: js.UndefOr[PageToken] = js.native
  
  /**
    * An object containing information about the service actions associated with the provisioning artifact.
    */
  var ServiceActionSummaries: js.UndefOr[typings.awsSdk.servicecatalogMod.ServiceActionSummaries] = js.native
}
object ListServiceActionsOutput {
  
  @scala.inline
  def apply(): ListServiceActionsOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListServiceActionsOutput]
  }
  
  @scala.inline
  implicit class ListServiceActionsOutputMutableBuilder[Self <: ListServiceActionsOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextPageToken(value: PageToken): Self = StObject.set(x, "NextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "NextPageToken", js.undefined)
    
    @scala.inline
    def setServiceActionSummaries(value: ServiceActionSummaries): Self = StObject.set(x, "ServiceActionSummaries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServiceActionSummariesUndefined: Self = StObject.set(x, "ServiceActionSummaries", js.undefined)
    
    @scala.inline
    def setServiceActionSummariesVarargs(value: ServiceActionSummary*): Self = StObject.set(x, "ServiceActionSummaries", js.Array(value :_*))
  }
}
