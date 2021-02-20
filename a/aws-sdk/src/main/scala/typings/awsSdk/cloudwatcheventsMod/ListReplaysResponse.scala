package typings.awsSdk.cloudwatcheventsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListReplaysResponse extends StObject {
  
  /**
    * The token returned by a previous call to retrieve the next set of results.
    */
  var NextToken: js.UndefOr[typings.awsSdk.cloudwatcheventsMod.NextToken] = js.native
  
  /**
    * An array of Replay objects that contain information about the replay.
    */
  var Replays: js.UndefOr[ReplayList] = js.native
}
object ListReplaysResponse {
  
  @scala.inline
  def apply(): ListReplaysResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListReplaysResponse]
  }
  
  @scala.inline
  implicit class ListReplaysResponseMutableBuilder[Self <: ListReplaysResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    @scala.inline
    def setReplays(value: ReplayList): Self = StObject.set(x, "Replays", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReplaysUndefined: Self = StObject.set(x, "Replays", js.undefined)
    
    @scala.inline
    def setReplaysVarargs(value: Replay*): Self = StObject.set(x, "Replays", js.Array(value :_*))
  }
}
