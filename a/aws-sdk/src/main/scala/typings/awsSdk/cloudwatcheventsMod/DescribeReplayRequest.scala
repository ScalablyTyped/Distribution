package typings.awsSdk.cloudwatcheventsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeReplayRequest extends StObject {
  
  /**
    * The name of the replay to retrieve.
    */
  var ReplayName: typings.awsSdk.cloudwatcheventsMod.ReplayName = js.native
}
object DescribeReplayRequest {
  
  @scala.inline
  def apply(ReplayName: ReplayName): DescribeReplayRequest = {
    val __obj = js.Dynamic.literal(ReplayName = ReplayName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeReplayRequest]
  }
  
  @scala.inline
  implicit class DescribeReplayRequestMutableBuilder[Self <: DescribeReplayRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setReplayName(value: ReplayName): Self = StObject.set(x, "ReplayName", value.asInstanceOf[js.Any])
  }
}
