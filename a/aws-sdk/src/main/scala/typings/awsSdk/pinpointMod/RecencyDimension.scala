package typings.awsSdk.pinpointMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RecencyDimension extends StObject {
  
  /**
    * The duration to use when determining whether an endpoint is active or inactive.
    */
  var Duration: typings.awsSdk.pinpointMod.Duration
  
  /**
    * The type of recency dimension to use for the segment. Valid values are: ACTIVE, endpoints that were active within the specified duration are included in the segment; and, INACTIVE, endpoints that weren't active within the specified duration are included in the segment.
    */
  var RecencyType: typings.awsSdk.pinpointMod.RecencyType
}
object RecencyDimension {
  
  inline def apply(Duration: Duration, RecencyType: RecencyType): RecencyDimension = {
    val __obj = js.Dynamic.literal(Duration = Duration.asInstanceOf[js.Any], RecencyType = RecencyType.asInstanceOf[js.Any])
    __obj.asInstanceOf[RecencyDimension]
  }
  
  extension [Self <: RecencyDimension](x: Self) {
    
    inline def setDuration(value: Duration): Self = StObject.set(x, "Duration", value.asInstanceOf[js.Any])
    
    inline def setRecencyType(value: RecencyType): Self = StObject.set(x, "RecencyType", value.asInstanceOf[js.Any])
  }
}
