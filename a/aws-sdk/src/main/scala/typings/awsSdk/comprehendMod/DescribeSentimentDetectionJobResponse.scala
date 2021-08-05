package typings.awsSdk.comprehendMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeSentimentDetectionJobResponse extends StObject {
  
  /**
    * An object that contains the properties associated with a sentiment detection job.
    */
  var SentimentDetectionJobProperties: js.UndefOr[typings.awsSdk.comprehendMod.SentimentDetectionJobProperties] = js.undefined
}
object DescribeSentimentDetectionJobResponse {
  
  inline def apply(): DescribeSentimentDetectionJobResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeSentimentDetectionJobResponse]
  }
  
  extension [Self <: DescribeSentimentDetectionJobResponse](x: Self) {
    
    inline def setSentimentDetectionJobProperties(value: SentimentDetectionJobProperties): Self = StObject.set(x, "SentimentDetectionJobProperties", value.asInstanceOf[js.Any])
    
    inline def setSentimentDetectionJobPropertiesUndefined: Self = StObject.set(x, "SentimentDetectionJobProperties", js.undefined)
  }
}
