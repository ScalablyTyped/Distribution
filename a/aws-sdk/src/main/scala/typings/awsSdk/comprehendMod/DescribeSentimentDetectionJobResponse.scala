package typings.awsSdk.comprehendMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeSentimentDetectionJobResponse extends StObject {
  
  /**
    * An object that contains the properties associated with a sentiment detection job.
    */
  var SentimentDetectionJobProperties: js.UndefOr[typings.awsSdk.comprehendMod.SentimentDetectionJobProperties] = js.native
}
object DescribeSentimentDetectionJobResponse {
  
  @scala.inline
  def apply(): DescribeSentimentDetectionJobResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeSentimentDetectionJobResponse]
  }
  
  @scala.inline
  implicit class DescribeSentimentDetectionJobResponseMutableBuilder[Self <: DescribeSentimentDetectionJobResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSentimentDetectionJobProperties(value: SentimentDetectionJobProperties): Self = StObject.set(x, "SentimentDetectionJobProperties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSentimentDetectionJobPropertiesUndefined: Self = StObject.set(x, "SentimentDetectionJobProperties", js.undefined)
  }
}
