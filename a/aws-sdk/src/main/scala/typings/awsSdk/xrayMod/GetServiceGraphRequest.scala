package typings.awsSdk.xrayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetServiceGraphRequest extends StObject {
  
  /**
    * The end of the timeframe for which to generate a graph.
    */
  var EndTime: js.Date
  
  /**
    * The Amazon Resource Name (ARN) of a group based on which you want to generate a graph.
    */
  var GroupARN: js.UndefOr[typings.awsSdk.xrayMod.GroupARN] = js.undefined
  
  /**
    * The name of a group based on which you want to generate a graph.
    */
  var GroupName: js.UndefOr[typings.awsSdk.xrayMod.GroupName] = js.undefined
  
  /**
    * Pagination token.
    */
  var NextToken: js.UndefOr[String] = js.undefined
  
  /**
    * The start of the time frame for which to generate a graph.
    */
  var StartTime: js.Date
}
object GetServiceGraphRequest {
  
  inline def apply(EndTime: js.Date, StartTime: js.Date): GetServiceGraphRequest = {
    val __obj = js.Dynamic.literal(EndTime = EndTime.asInstanceOf[js.Any], StartTime = StartTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetServiceGraphRequest]
  }
  
  extension [Self <: GetServiceGraphRequest](x: Self) {
    
    inline def setEndTime(value: js.Date): Self = StObject.set(x, "EndTime", value.asInstanceOf[js.Any])
    
    inline def setGroupARN(value: GroupARN): Self = StObject.set(x, "GroupARN", value.asInstanceOf[js.Any])
    
    inline def setGroupARNUndefined: Self = StObject.set(x, "GroupARN", js.undefined)
    
    inline def setGroupName(value: GroupName): Self = StObject.set(x, "GroupName", value.asInstanceOf[js.Any])
    
    inline def setGroupNameUndefined: Self = StObject.set(x, "GroupName", js.undefined)
    
    inline def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setStartTime(value: js.Date): Self = StObject.set(x, "StartTime", value.asInstanceOf[js.Any])
  }
}
