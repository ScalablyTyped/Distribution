package typings.awsSdk.kinesisanalyticsv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListApplicationSnapshotsRequest extends StObject {
  
  /**
    * The name of an existing application.
    */
  var ApplicationName: typings.awsSdk.kinesisanalyticsv2Mod.ApplicationName
  
  /**
    * The maximum number of application snapshots to list.
    */
  var Limit: js.UndefOr[ListSnapshotsInputLimit] = js.undefined
  
  /**
    * Use this parameter if you receive a NextToken response in a previous request that indicates that there is more output available. Set it to the value of the previous call's NextToken response to indicate where the output should continue from. 
    */
  var NextToken: js.UndefOr[typings.awsSdk.kinesisanalyticsv2Mod.NextToken] = js.undefined
}
object ListApplicationSnapshotsRequest {
  
  @scala.inline
  def apply(ApplicationName: ApplicationName): ListApplicationSnapshotsRequest = {
    val __obj = js.Dynamic.literal(ApplicationName = ApplicationName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListApplicationSnapshotsRequest]
  }
  
  @scala.inline
  implicit class ListApplicationSnapshotsRequestMutableBuilder[Self <: ListApplicationSnapshotsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApplicationName(value: ApplicationName): Self = StObject.set(x, "ApplicationName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLimit(value: ListSnapshotsInputLimit): Self = StObject.set(x, "Limit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLimitUndefined: Self = StObject.set(x, "Limit", js.undefined)
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
