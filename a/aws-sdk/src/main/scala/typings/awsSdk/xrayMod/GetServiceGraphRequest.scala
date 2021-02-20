package typings.awsSdk.xrayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetServiceGraphRequest extends StObject {
  
  /**
    * The end of the timeframe for which to generate a graph.
    */
  var EndTime: Timestamp = js.native
  
  /**
    * The Amazon Resource Name (ARN) of a group based on which you want to generate a graph.
    */
  var GroupARN: js.UndefOr[typings.awsSdk.xrayMod.GroupARN] = js.native
  
  /**
    * The name of a group based on which you want to generate a graph.
    */
  var GroupName: js.UndefOr[typings.awsSdk.xrayMod.GroupName] = js.native
  
  /**
    * Pagination token.
    */
  var NextToken: js.UndefOr[String] = js.native
  
  /**
    * The start of the time frame for which to generate a graph.
    */
  var StartTime: Timestamp = js.native
}
object GetServiceGraphRequest {
  
  @scala.inline
  def apply(EndTime: Timestamp, StartTime: Timestamp): GetServiceGraphRequest = {
    val __obj = js.Dynamic.literal(EndTime = EndTime.asInstanceOf[js.Any], StartTime = StartTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetServiceGraphRequest]
  }
  
  @scala.inline
  implicit class GetServiceGraphRequestMutableBuilder[Self <: GetServiceGraphRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEndTime(value: Timestamp): Self = StObject.set(x, "EndTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupARN(value: GroupARN): Self = StObject.set(x, "GroupARN", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupARNUndefined: Self = StObject.set(x, "GroupARN", js.undefined)
    
    @scala.inline
    def setGroupName(value: GroupName): Self = StObject.set(x, "GroupName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupNameUndefined: Self = StObject.set(x, "GroupName", js.undefined)
    
    @scala.inline
    def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    @scala.inline
    def setStartTime(value: Timestamp): Self = StObject.set(x, "StartTime", value.asInstanceOf[js.Any])
  }
}
