package typings.awsSdk.servicecatalogMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListLaunchPathsOutput extends StObject {
  
  /**
    * Information about the launch path.
    */
  var LaunchPathSummaries: js.UndefOr[typings.awsSdk.servicecatalogMod.LaunchPathSummaries] = js.native
  
  /**
    * The page token to use to retrieve the next set of results. If there are no additional results, this value is null.
    */
  var NextPageToken: js.UndefOr[PageToken] = js.native
}
object ListLaunchPathsOutput {
  
  @scala.inline
  def apply(): ListLaunchPathsOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListLaunchPathsOutput]
  }
  
  @scala.inline
  implicit class ListLaunchPathsOutputMutableBuilder[Self <: ListLaunchPathsOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLaunchPathSummaries(value: LaunchPathSummaries): Self = StObject.set(x, "LaunchPathSummaries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLaunchPathSummariesUndefined: Self = StObject.set(x, "LaunchPathSummaries", js.undefined)
    
    @scala.inline
    def setLaunchPathSummariesVarargs(value: LaunchPathSummary*): Self = StObject.set(x, "LaunchPathSummaries", js.Array(value :_*))
    
    @scala.inline
    def setNextPageToken(value: PageToken): Self = StObject.set(x, "NextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "NextPageToken", js.undefined)
  }
}
