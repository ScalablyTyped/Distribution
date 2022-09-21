package typings.awsSdk.comprehendMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeTargetedSentimentDetectionJobResponse extends StObject {
  
  /**
    * An object that contains the properties associated with a targeted sentiment detection job.
    */
  var TargetedSentimentDetectionJobProperties: js.UndefOr[typings.awsSdk.comprehendMod.TargetedSentimentDetectionJobProperties] = js.undefined
}
object DescribeTargetedSentimentDetectionJobResponse {
  
  inline def apply(): DescribeTargetedSentimentDetectionJobResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeTargetedSentimentDetectionJobResponse]
  }
  
  extension [Self <: DescribeTargetedSentimentDetectionJobResponse](x: Self) {
    
    inline def setTargetedSentimentDetectionJobProperties(value: TargetedSentimentDetectionJobProperties): Self = StObject.set(x, "TargetedSentimentDetectionJobProperties", value.asInstanceOf[js.Any])
    
    inline def setTargetedSentimentDetectionJobPropertiesUndefined: Self = StObject.set(x, "TargetedSentimentDetectionJobProperties", js.undefined)
  }
}
